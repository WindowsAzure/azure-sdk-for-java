// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.rx;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.implementation.CosmosItemProperties;
import com.azure.cosmos.implementation.Document;
import com.azure.cosmos.models.FeedOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.ModelBridgeInternal;
import com.azure.cosmos.util.CosmosPagedFlux;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupByQueryTests extends TestSuiteBase {
    private CosmosAsyncContainer createdCollection;
    private ArrayList<CosmosItemProperties> docs = new ArrayList<>();
    List<Person> personList;
    private CosmosAsyncClient client;

    @Factory(dataProvider = "clientBuilders")
    public GroupByQueryTests(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    private static String getRandomName(Random rand) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name_" + rand.nextInt(100));

        return stringBuilder.toString();
    }


    private static City getRandomCity(Random rand) {
        int index = rand.nextInt(3);
        switch (index) {
            case 0:
                return City.LOS_ANGELES;
            case 1:
                return City.NEW_YORK;
            case 2:
                return City.SEATTLE;
        }

        return City.LOS_ANGELES;
    }

    private static double getRandomIncome(Random rand) {
        return rand.nextDouble() * Double.MAX_VALUE;
    }

    private static int getRandomAge(Random rand) {
        return rand.nextInt(100);
    }

    @Test(groups = {"simple"}, timeOut = TIMEOUT)
    public void queryDocuments() {
        boolean qmEnabled = true;

        String query = "SELECT sum(c.age), c.city FROM c group by c.city";
        FeedOptions options = new FeedOptions();
        ModelBridgeInternal.setFeedOptionsMaxItemCount(options, 35);
        options.setPopulateQueryMetrics(qmEnabled);
        options.setMaxDegreeOfParallelism(2);
        CosmosPagedFlux<JsonNode> queryObservable = createdCollection.queryItems(query,
                                                                                 options,
                                                                                 JsonNode.class);
        Map<City, Integer> resultMap = personList.stream()
                                         .collect(Collectors.groupingBy(Person::getCity,
                                                                        Collectors.summingInt(Person::getAge)));

        List<Document> expectedDocumentsList = new ArrayList<>();
        resultMap.forEach((city, sum) ->
                          {
                              Document d = new Document();
                              d.set("$1", sum);
                              d.set("city", city);
                              expectedDocumentsList.add(d);
                          });


        List<FeedResponse<JsonNode>> queryResultPages = queryObservable.byPage().collectList().block();

        List<JsonNode> queryResults = new ArrayList<>();
        queryResultPages
            .forEach(feedResponse -> queryResults.addAll(feedResponse.getResults()));

        assertThat(expectedDocumentsList.size()).isEqualTo(queryResults.size());

        for (int i = 0; i < expectedDocumentsList.size(); i++) {
            assertThat(expectedDocumentsList.get(i).toString().equals(queryResults.get(i).toString()));
        }

    }

    public void bulkInsert() {
        generateTestData();
        voidBulkInsertBlocking(createdCollection, docs);
    }

    public void generateTestData() {
        personList = new ArrayList<>();
        Random rand = new Random();
        ObjectMapper mapper = new ObjectMapper();
        for (int i = 0; i < 40; i++) {
            Person person = getRandomPerson(rand);
            try {
                docs.add(new CosmosItemProperties(mapper.writeValueAsString(person)));
                personList.add(person);
            } catch (JsonProcessingException e) {
                logger.error(e.getMessage());
            }
        }
    }

    private Pet getRandomPet(Random rand) {
        String name = getRandomName(rand);
        int age = getRandomAge(rand);
        return new Pet(name, age);
    }

    public Person getRandomPerson(Random rand) {
        String name = getRandomName(rand);
        City city = getRandomCity(rand);
        double income = getRandomIncome(rand);
        List<Person> people = new ArrayList<Person>();
        if (rand.nextInt(10) % 10 == 0) {
            for (int i = 0; i < rand.nextInt(5); i++) {
                people.add(getRandomPerson(rand));
            }
        }

        int age = getRandomAge(rand);
        Pet pet = getRandomPet(rand);
        UUID guid = UUID.randomUUID();
        Person p = new Person(name, city, income, people, age, pet, guid);
        return p;
    }

    @AfterClass(groups = {"simple"}, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    @BeforeClass(groups = {"simple"}, timeOut = 3 * SETUP_TIMEOUT)
    public void beforeClass() throws Exception {
        client = this.getClientBuilder().buildAsyncClient();
        createdCollection = getSharedMultiPartitionCosmosContainer(client);
        truncateCollection(createdCollection);

        bulkInsert();

        waitIfNeededForReplicasToCatchUp(this.getClientBuilder());
    }

}
