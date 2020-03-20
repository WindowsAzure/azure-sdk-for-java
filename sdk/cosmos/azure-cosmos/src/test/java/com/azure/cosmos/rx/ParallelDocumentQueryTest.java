// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.rx;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.ConnectionMode;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosBridgeInternal;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosClientException;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.util.CosmosPagedFlux;
import com.azure.cosmos.implementation.ItemOperations;
import com.azure.cosmos.implementation.CosmosItemProperties;
import com.azure.cosmos.models.FeedOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.Resource;
import com.azure.cosmos.implementation.FailureValidator;
import com.azure.cosmos.implementation.FeedResponseListValidator;
import com.azure.cosmos.implementation.FeedResponseValidator;
import com.azure.cosmos.implementation.QueryMetrics;
import com.azure.cosmos.implementation.TestUtils;
import com.azure.cosmos.implementation.Utils.ValueHolder;
import com.azure.cosmos.implementation.query.CompositeContinuationToken;
import com.azure.cosmos.implementation.routing.Range;
import com.fasterxml.jackson.databind.JsonNode;
import com.azure.cosmos.implementation.guava27.Strings;
import io.reactivex.subscribers.TestSubscriber;
import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.groups.Tuple;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.azure.cosmos.models.ModelBridgeInternal.partitionKeyRangeIdInternal;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.testng.Assert.fail;

public class ParallelDocumentQueryTest extends TestSuiteBase {
    private CosmosAsyncDatabase createdDatabase;
    private CosmosAsyncContainer createdCollection;
    private List<CosmosItemProperties> createdDocuments;

    private CosmosAsyncClient client;

    public String getCollectionLink() {
        return TestUtils.getCollectionNameLink(createdDatabase.getId(), createdCollection.getId());
    }

    @Factory(dataProvider = "clientBuildersWithDirect")
    public ParallelDocumentQueryTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @DataProvider(name = "queryMetricsArgProvider")
    public Object[][] queryMetricsArgProvider() {
        return new Object[][]{
            {true},
            {false},
        };
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT, dataProvider = "queryMetricsArgProvider")
    public void queryDocuments(boolean qmEnabled) {
        String query = "SELECT * from c where c.prop = 99";
        FeedOptions options = new FeedOptions();
        options.setMaxItemCount(5);

        options.setPopulateQueryMetrics(qmEnabled);
        options.setMaxDegreeOfParallelism(2);
        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        List<CosmosItemProperties> expectedDocs = createdDocuments.stream().filter(d -> 99 == ModelBridgeInternal.getIntFromJsonSerializable(d,"prop") ).collect(Collectors.toList());
        assertThat(expectedDocs).isNotEmpty();

        FeedResponseListValidator<CosmosItemProperties> validator = new FeedResponseListValidator.Builder<CosmosItemProperties>()
            .totalSize(expectedDocs.size())
            .exactlyContainsInAnyOrder(expectedDocs.stream().map(d -> d.getResourceId()).collect(Collectors.toList()))
            .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosItemProperties>()
                .requestChargeGreaterThanOrEqualTo(1.0).build())
            .hasValidQueryMetrics(qmEnabled)
            .build();

        validateQuerySuccess(queryObservable.byPage(), validator, TIMEOUT);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryMetricEquality() throws Exception {
        String query = "SELECT * from c where c.prop = 99";
        FeedOptions options = new FeedOptions();
        options.setMaxItemCount(5);

        options.setPopulateQueryMetrics(true);
        options.setMaxDegreeOfParallelism(0);

        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);
        List<FeedResponse<CosmosItemProperties>> resultList1 = queryObservable.byPage().collectList().block();

        options.setMaxDegreeOfParallelism(4);
        CosmosPagedFlux<CosmosItemProperties> threadedQueryObs = createdCollection.queryItems(query, options, CosmosItemProperties.class);
        List<FeedResponse<CosmosItemProperties>> resultList2 = threadedQueryObs.byPage().collectList().block();

        assertThat(resultList1.size()).isEqualTo(resultList2.size());
        for(int i = 0; i < resultList1.size(); i++){
            compareQueryMetrics(BridgeInternal.queryMetricsFromFeedResponse(resultList1.get(i)),
                BridgeInternal.queryMetricsFromFeedResponse(resultList2.get(i)));
        }
    }

    private void compareQueryMetrics(Map<String, QueryMetrics> qm1, Map<String, QueryMetrics> qm2) {
        assertThat(qm1.keySet().size()).isEqualTo(qm2.keySet().size());
        QueryMetrics queryMetrics1 = BridgeInternal.createQueryMetricsFromCollection(qm1.values());
        QueryMetrics queryMetrics2 = BridgeInternal.createQueryMetricsFromCollection(qm2.values());
        assertThat(queryMetrics1.getRetrievedDocumentSize()).isEqualTo(queryMetrics2.getRetrievedDocumentSize());
        assertThat(queryMetrics1.getRetrievedDocumentCount()).isEqualTo(queryMetrics2.getRetrievedDocumentCount());
        assertThat(queryMetrics1.getIndexHitDocumentCount()).isEqualTo(queryMetrics2.getIndexHitDocumentCount());
        assertThat(queryMetrics1.getOutputDocumentCount()).isEqualTo(queryMetrics2.getOutputDocumentCount());
        assertThat(queryMetrics1.getOutputDocumentSize()).isEqualTo(queryMetrics2.getOutputDocumentSize());
        assertThat(BridgeInternal.getClientSideMetrics(queryMetrics1).getRequestCharge())
            .isEqualTo(BridgeInternal.getClientSideMetrics(queryMetrics1).getRequestCharge());
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryDocuments_NoResults() {
        String query = "SELECT * from root r where r.id = '2'";
        FeedOptions options = new FeedOptions();

        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        FeedResponseListValidator<CosmosItemProperties> validator = new FeedResponseListValidator.Builder<CosmosItemProperties>()
            .containsExactly(new ArrayList<>())
            .numberOfPagesIsGreaterThanOrEqualTo(1)
            .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosItemProperties>()
                .pageSizeIsLessThanOrEqualTo(0)
                .requestChargeGreaterThanOrEqualTo(1.0).build())
            .build();
        validateQuerySuccess(queryObservable.byPage(), validator);
    }

    @Test(groups = { "simple" }, timeOut = 2 * TIMEOUT)
    public void queryDocumentsWithPageSize() {
        String query = "SELECT * from root";
        FeedOptions options = new FeedOptions();
        int pageSize = 3;
        options.setMaxItemCount(pageSize);
        options.setMaxDegreeOfParallelism(-1);

        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        List<CosmosItemProperties> expectedDocs = createdDocuments;
        assertThat(expectedDocs).isNotEmpty();

        FeedResponseListValidator<CosmosItemProperties> validator = new FeedResponseListValidator
            .Builder<CosmosItemProperties>()
            .exactlyContainsInAnyOrder(expectedDocs
                .stream()
                .map(d -> d.getResourceId())
                .collect(Collectors.toList()))
            .numberOfPagesIsGreaterThanOrEqualTo((expectedDocs.size() + 1) / 3)
            .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosItemProperties>()
                .requestChargeGreaterThanOrEqualTo(1.0)
                .pageSizeIsLessThanOrEqualTo(pageSize)
                .build())
            .build();
        validateQuerySuccess(queryObservable.byPage(), validator, 2 * subscriberValidationTimeout);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void invalidQuerySyntax() {
        String query = "I am an invalid query";
        FeedOptions options = new FeedOptions();

        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        FailureValidator validator = new FailureValidator.Builder()
            .instanceOf(CosmosClientException.class)
            .statusCode(400)
            .notNullActivityId()
            .build();
        validateQueryFailure(queryObservable.byPage(), validator);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void crossPartitionQueryNotEnabled() {
        String query = "SELECT * from root";
        FeedOptions options = new FeedOptions();
        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        List<CosmosItemProperties> expectedDocs = createdDocuments;
        FeedResponseListValidator<CosmosItemProperties> validator =
            new FeedResponseListValidator.Builder<CosmosItemProperties>()
                .totalSize(expectedDocs.size())
                .exactlyContainsInAnyOrder(expectedDocs.stream().map(Resource::getResourceId).collect(Collectors.toList()))
                .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosItemProperties>()
                    .requestChargeGreaterThanOrEqualTo(1.0)
                    .build())
                .build();
        validateQuerySuccess(queryObservable.byPage(), validator);
    }

    @Test(groups = { "simple" }, timeOut = 2 * TIMEOUT)
    public void partitionKeyRangeId() {
        int sum = 0;

        for (String partitionKeyRangeId :
            CosmosBridgeInternal.getAsyncDocumentClient(client).readPartitionKeyRanges(getCollectionLink(), null)
                .flatMap(p -> Flux.fromIterable(p.getResults()))
                .map(Resource::getId).collectList().single().block()) {
            String query = "SELECT * from root";
            FeedOptions options = new FeedOptions();
            partitionKeyRangeIdInternal(options, partitionKeyRangeId);
            int queryResultCount = createdCollection.queryItems(query, options, CosmosItemProperties.class)
                .byPage()
                .flatMap(p -> Flux.fromIterable(p.getResults()))
                .collectList().block().size();

            sum += queryResultCount;
        }

        assertThat(sum).isEqualTo(createdDocuments.size());
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void compositeContinuationTokenRoundTrip() throws Exception {
        {
            // Positive
            CompositeContinuationToken compositeContinuationToken = new CompositeContinuationToken("asdf",
                new Range<String>("A", "D", false, true));
            String serialized = compositeContinuationToken.toString();
            ValueHolder<CompositeContinuationToken> outCompositeContinuationToken = new ValueHolder<CompositeContinuationToken>();
            boolean succeeed = CompositeContinuationToken.tryParse(serialized, outCompositeContinuationToken);
            assertThat(succeeed).isTrue();
            CompositeContinuationToken deserialized = outCompositeContinuationToken.v;
            String token = deserialized.getToken();
            Range<String> range = deserialized.getRange();
            assertThat(token).isEqualTo("asdf");
            assertThat(range.getMin()).isEqualTo("A");
            assertThat(range.getMax()).isEqualTo("D");
            assertThat(range.isMinInclusive()).isEqualTo(false);
            assertThat(range.isMaxInclusive()).isEqualTo(true);
        }

        {
            // Negative
            ValueHolder<CompositeContinuationToken> outCompositeContinuationToken = new ValueHolder<CompositeContinuationToken>();
            boolean succeeed = CompositeContinuationToken.tryParse("{\"property\" : \"not a valid composite continuation token\"}", outCompositeContinuationToken);
            assertThat(succeeed).isFalse();
        }

        {
            // Negative - GATEWAY composite continuation token
            ValueHolder<CompositeContinuationToken> outCompositeContinuationToken = new ValueHolder<CompositeContinuationToken>();
            boolean succeeed = CompositeContinuationToken.tryParse("{\"token\":\"-RID:tZFQAImzNLQLAAAAAAAAAA==#RT:1#TRC:10\",\"range\":{\"min\":\"\",\"max\":\"FF\"}}", outCompositeContinuationToken);
            assertThat(succeeed).isFalse();
        }
    }

    @Test(groups = { "non-emulator" }, timeOut = TIMEOUT * 10)
    public void queryDocumentsWithCompositeContinuationTokens() throws Exception {
        String query = "SELECT * FROM c";

        // Get Expected
        List<CosmosItemProperties> expectedDocs = new ArrayList<>(createdDocuments);
        assertThat(expectedDocs).isNotEmpty();

        this.queryWithContinuationTokensAndPageSizes(query, new int[] {1, 10, 100}, expectedDocs);
    }

    @Test(groups = { "simple" })
    public void queryDocumentsStringValue(){
        FeedOptions options = new FeedOptions();

        options.setMaxDegreeOfParallelism(2);

        List<String> expectedValues = createdDocuments.stream().map(d -> d.getId()).collect(Collectors.toList());

        String query = "Select value c.id from c";

        CosmosPagedFlux<String> queryObservable = createdCollection.queryItems(query, options, String.class);

        List<String> fetchedResults = new ArrayList<>();
        queryObservable.byPage().map(stringFeedResponse -> fetchedResults.addAll(stringFeedResponse.getResults())).blockLast();

        assertThat(fetchedResults).containsAll(expectedValues);
    }

    @Test(groups = { "simple" })
    @SuppressWarnings("rawtypes")
    public void queryDocumentsArrayValue(){
        FeedOptions options = new FeedOptions();

        options.setMaxDegreeOfParallelism(2);

        Collection<List<List<Integer>>> expectedValues = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        a1.add(6519456);
        a1.add(1471916863);
        a2.add(2498434);
        a2.add(1455671440);
        lists.add(a1);
        lists.add(a2);

        expectedValues.add(lists);
        expectedValues.add(lists);

        expectedValues.add(lists);
        expectedValues.add(lists);

        String query = "Select top 2 value c.sgmts from c";

        CosmosPagedFlux<List> queryObservable = createdCollection.queryItems(query, options, List.class);

        List<List> fetchedResults = new ArrayList<>();
        queryObservable.byPage().map(feedResponse -> fetchedResults.addAll(feedResponse.getResults())).blockLast();
        assertThat(fetchedResults).containsAll(expectedValues);
    }

    @Test(groups = { "simple" })
    public void queryDocumentsIntegerValue(){
        FeedOptions options = new FeedOptions();

        options.setMaxDegreeOfParallelism(2);

        List<Integer> expectedValues = createdDocuments.stream().map(d -> ModelBridgeInternal.getIntFromJsonSerializable(d,"prop")).collect(Collectors.toList());

        String query = "Select value c.prop from c";

        CosmosPagedFlux<Integer> queryObservable = createdCollection.queryItems(query, options, Integer.class);

        List<Integer> fetchedResults = new ArrayList<>();
        queryObservable.byPage().map(feedResponse -> fetchedResults.addAll(feedResponse.getResults())).blockLast();

        assertThat(fetchedResults).containsAll(expectedValues);
    }

    @Test(groups = { "simple" })
    public void queryDocumentsPojo(){
        FeedOptions options = new FeedOptions();

        options.setMaxDegreeOfParallelism(2);
        String query = "Select * from c";
        CosmosPagedFlux<TestObject> queryObservable = createdCollection.queryItems(query, options, TestObject.class);
        List<TestObject> fetchedResults = new ArrayList<>();
        queryObservable.byPage().map(feedResponse -> fetchedResults.addAll(feedResponse.getResults())).blockLast();

        List<Tuple> assertTuples = createdDocuments.stream()
            .map(cosmosItemProperties -> tuple(cosmosItemProperties.getId(),
                ModelBridgeInternal.getObjectFromJsonSerializable(cosmosItemProperties, "mypk"),
                ModelBridgeInternal.getObjectFromJsonSerializable(cosmosItemProperties, "prop"),
                ModelBridgeInternal.getObjectFromJsonSerializable(cosmosItemProperties, "boolProp")))
            .collect(Collectors.toList());

        assertThat(fetchedResults).extracting(TestObject::getId,
            TestObject::getMypk,
            TestObject::getProp,
            TestObject::getBoolProp)
            .containsAll(assertTuples);

    }

    // TODO (DANOBLE) ParallelDocumentQueryTest initialization intermittently fails in CI environments
    //  see https://github.com/Azure/azure-sdk-for-java/issues/6398
    @BeforeClass(groups = { "simple", "non-emulator" }, timeOut = 4 * SETUP_TIMEOUT)
    public void before_ParallelDocumentQueryTest() {
        client = getClientBuilder().buildAsyncClient();
        createdDatabase = getSharedCosmosDatabase(client);

        createdCollection = getSharedMultiPartitionCosmosContainer(client);
        createdDocuments = prepareCosmosContainer(createdCollection);
    }

    private List<CosmosItemProperties> prepareCosmosContainer(CosmosAsyncContainer cosmosContainer) {
        try {
            truncateCollection(cosmosContainer);
        } catch (Throwable firstChanceException) {
            try {
                truncateCollection(cosmosContainer);
            } catch (Throwable lastChanceException) {
                String message = Strings.lenientFormat("container %s truncation failed due to first chance %s followed by last chance %s",
                    cosmosContainer,
                    firstChanceException,
                    lastChanceException);
                logger.error(message);
                fail(message, lastChanceException);
            }
        }

        List<CosmosItemProperties> docDefList = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            docDefList.add(getDocumentDefinition(i));
        }

        for (int i = 0; i < 21; i++) {
            docDefList.add(getDocumentDefinition(99));
        }

        List<CosmosItemProperties> items = bulkInsertBlocking(cosmosContainer, docDefList);
        waitIfNeededForReplicasToCatchUp(getClientBuilder());
        return items;
    }

    @AfterClass(groups = { "simple", "non-emulator" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    private static CosmosItemProperties getDocumentDefinition(int cnt) {
        String uuid = UUID.randomUUID().toString();
        boolean boolVal = cnt % 2 == 0;
        CosmosItemProperties doc = new CosmosItemProperties(String.format("{ "
                + "\"id\": \"%s\", "
                + "\"prop\" : %d, "
                + "\"boolProp\" : %b, "
                + "\"mypk\": \"%s\", "
                + "\"sgmts\": [[6519456, 1471916863], [2498434, 1455671440]]"
                + "}"
            , uuid, cnt, boolVal, uuid));
        return doc;
    }

    static class TestObject{
        String id;
        int prop;
        Boolean boolProp;
        String mypk;
        List<List<Integer>> sgmts;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getProp() {
            return prop;
        }

        public void setProp(Integer prop) {
            this.prop = prop;
        }

        public Boolean getBoolProp() {
            return boolProp;
        }

        public void setBoolProp(Boolean boolProp) {
            this.boolProp = boolProp;
        }

        public String getMypk() {
            return mypk;
        }

        public void setMypk(String mypk) {
            this.mypk = mypk;
        }

        public List<List<Integer>> getSgmts() {
            return sgmts;
        }

        public void setSgmts(List<List<Integer>> sgmts) {
            this.sgmts = sgmts;
        }

    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT, enabled = false)
    public void invalidQuerySytax() throws Exception {

        String query = "I am an invalid query";
        FeedOptions options = new FeedOptions();

        CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

        FailureValidator validator = new FailureValidator.Builder().instanceOf(CosmosClientException.class)
            .statusCode(400).notNullActivityId().build();
        validateQueryFailure(queryObservable.byPage(), validator);
    }

    public CosmosItemProperties createDocument(CosmosAsyncContainer cosmosContainer, int cnt) throws CosmosClientException {

        CosmosItemProperties docDefinition = getDocumentDefinition(cnt);

        return BridgeInternal.getProperties(cosmosContainer.createItem(docDefinition).block());
    }

    private void queryWithContinuationTokensAndPageSizes(String query, int[] pageSizes, List<CosmosItemProperties> expectedDocs) {
        for (int pageSize : pageSizes) {
            List<CosmosItemProperties> receivedDocuments = this.queryWithContinuationTokens(query, pageSize);
            List<String> actualIds = new ArrayList<String>();
            for (CosmosItemProperties document : receivedDocuments) {
                actualIds.add(document.getResourceId());
            }

            List<String> expectedIds = new ArrayList<String>();
            for (CosmosItemProperties document : expectedDocs) {
                expectedIds.add(document.getResourceId());
            }

            assertThat(actualIds).containsOnlyElementsOf(expectedIds);
        }
    }

    private List<CosmosItemProperties> queryWithContinuationTokens(String query, int pageSize) {
        String requestContinuation = null;
        List<String> continuationTokens = new ArrayList<String>();
        List<CosmosItemProperties> receivedDocuments = new ArrayList<CosmosItemProperties>();
        do {
            FeedOptions options = new FeedOptions();
            options.setMaxItemCount(pageSize);

            options.setMaxDegreeOfParallelism(2);
            options.setRequestContinuation(requestContinuation);
            CosmosPagedFlux<CosmosItemProperties> queryObservable = createdCollection.queryItems(query, options, CosmosItemProperties.class);

            TestSubscriber<FeedResponse<CosmosItemProperties>> testSubscriber = new TestSubscriber<>();
            queryObservable.byPage().subscribe(testSubscriber);
            testSubscriber.awaitTerminalEvent(TIMEOUT, TimeUnit.MILLISECONDS);
            testSubscriber.assertNoErrors();
            testSubscriber.assertComplete();

            @SuppressWarnings("unchecked")
            FeedResponse<CosmosItemProperties> firstPage = (FeedResponse<CosmosItemProperties>) testSubscriber.getEvents().get(0).get(0);
            requestContinuation = firstPage.getContinuationToken();
            receivedDocuments.addAll(firstPage.getResults());
            continuationTokens.add(requestContinuation);
        } while (requestContinuation != null);

        return receivedDocuments;
    }

    //TODO: Fix the test for GW mode
    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void readMany() throws Exception {
        if (this.getConnectionPolicy().getConnectionMode() == ConnectionMode.GATEWAY) {
            throw new SkipException("Skipping gateway mode. This needs to be fixed");
        }

        List<Pair<String, PartitionKey>> pairList = new ArrayList<>();
        for (int i = 0; i < createdDocuments.size(); i = i + 3) {
            pairList.add(Pair.of(createdDocuments.get(i).getId(),
                new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(createdDocuments.get(i), "mypk"))));
        }
        FeedResponse<JsonNode> documentFeedResponse =
            ItemOperations.readManyAsync(createdCollection, pairList, JsonNode.class).block();
        assertThat(documentFeedResponse.getResults().size()).isEqualTo(pairList.size());
        assertThat(documentFeedResponse.getResults().stream().map(jsonNode -> jsonNode.get("id").textValue()).collect(Collectors.toList()))
            .containsAll(pairList.stream().map(p -> p.getLeft()).collect(Collectors.toList()));
    }

    //TODO: Fix the test for GW mode
    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void readManyIdSameAsPartitionKey() throws Exception {
        if (this.getConnectionPolicy().getConnectionMode() == ConnectionMode.GATEWAY) {
            throw new SkipException("Skipping gateway mode. This needs to be fixed");
        }

        CosmosAsyncContainer containerWithIdAsPartitionKey = getSharedMultiPartitionCosmosContainerWithIdAsPartitionKey(client);
        List<CosmosItemProperties> newItems = prepareCosmosContainer(containerWithIdAsPartitionKey);
        List<Pair<String, PartitionKey>> pairList = new ArrayList<>();
        for (int i = 0; i < newItems.size(); i = i + 3) {
            pairList.add(Pair.of(newItems.get(i).getId(),
                new PartitionKey(ModelBridgeInternal.getObjectFromJsonSerializable(newItems.get(i), "id"))));
        }
        FeedResponse<JsonNode> documentFeedResponse =
            ItemOperations.readManyAsync(containerWithIdAsPartitionKey, pairList, JsonNode.class).block();
        assertThat(documentFeedResponse.getResults().size()).isEqualTo(pairList.size());
        assertThat(documentFeedResponse.getResults().stream().map(jsonNode -> jsonNode.get("id").textValue()).collect(Collectors.toList()))
            .containsAll(pairList.stream().map(p -> p.getLeft()).collect(Collectors.toList()));
    }
}
