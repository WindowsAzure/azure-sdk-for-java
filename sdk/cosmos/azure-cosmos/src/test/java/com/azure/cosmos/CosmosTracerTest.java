// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.core.util.Context;
import com.azure.core.util.tracing.Tracer;
import com.azure.cosmos.implementation.InternalObjectNode;
import com.azure.cosmos.implementation.LifeCycleUtils;
import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.implementation.TracerProvider;
import com.azure.cosmos.implementation.directconnectivity.ReflectionUtils;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.CosmosStoredProcedureProperties;
import com.azure.cosmos.models.CosmosTriggerProperties;
import com.azure.cosmos.models.CosmosUserDefinedFunctionProperties;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.TriggerOperation;
import com.azure.cosmos.models.TriggerType;
import com.azure.cosmos.rx.TestSuiteBase;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CosmosTracerTest extends TestSuiteBase {
    private static final String ITEM_ID = "tracerDoc";
    CosmosAsyncClient client;
    CosmosAsyncDatabase cosmosAsyncDatabase;
    CosmosAsyncContainer cosmosAsyncContainer;

    @BeforeClass(groups = {"emulator"}, timeOut = SETUP_TIMEOUT)
    public void beforeClass() {
        client = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .directMode(DirectConnectionConfig.getDefaultConfig())
            .buildAsyncClient();
        cosmosAsyncDatabase = getSharedCosmosDatabase(client);
        cosmosAsyncContainer = getSharedMultiPartitionCosmosContainer(client);

    }

    @Test(groups = {"emulator"}, timeOut = TIMEOUT)
    public void cosmosAsyncClient() {
        Tracer mockTracer = Mockito.mock(Tracer.class);
        TracerProvider tracerProvider = Mockito.spy(new TracerProvider(getMockTracer(mockTracer)));
        ReflectionUtils.setTracerProvider(client, tracerProvider);

        TracerProviderCapture tracerProviderCapture = new TracerProviderCapture();
        Mockito.doAnswer(tracerProviderCapture).when(tracerProvider).startSpan(Matchers.anyString(),
            Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        client.createDatabaseIfNotExists(cosmosAsyncDatabase.getId()).block();
        Context context = tracerProviderCapture.getResult();
        Mockito.verify(tracerProvider, Mockito.times(1)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createDatabaseIfNotExists." + cosmosAsyncDatabase.getId(), context,
            cosmosAsyncDatabase.getId(), 1);

        client.readAllDatabases(new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(2)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllDatabases", context, null, 2);


        String query = "select * from c where c.id = '" + cosmosAsyncDatabase.getId() + "'";
        client.queryDatabases(query, new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(3)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "queryDatabases", context, null, 3);
    }

    @Test(groups = {"emulator"}, timeOut = TIMEOUT)
    public void cosmosAsyncDatabase() {
        Tracer mockTracer = Mockito.mock(Tracer.class);
        TracerProvider tracerProvider = Mockito.spy(new TracerProvider(getMockTracer(mockTracer)));
        ReflectionUtils.setTracerProvider(client, tracerProvider);
        TracerProviderCapture tracerProviderCapture = new TracerProviderCapture();
        Mockito.doAnswer(tracerProviderCapture).when(tracerProvider).startSpan(Matchers.anyString(),
            Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        cosmosAsyncDatabase.createContainerIfNotExists(cosmosAsyncContainer.getId(),
            "/pk", 5000).block();
        Context context = tracerProviderCapture.getResult();
        Mockito.verify(tracerProvider, Mockito.times(1)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createContainerIfNotExists." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 1);

        try {
            cosmosAsyncDatabase.readThroughput().block();
        } catch (CosmosException ex) {
            //do nothing
        }

        Mockito.verify(tracerProvider, Mockito.times(2)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readThroughput." + cosmosAsyncDatabase.getId(), context,
            cosmosAsyncDatabase.getId(), 2);

        cosmosAsyncDatabase.readAllUsers().byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(3)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllUsers." + cosmosAsyncDatabase.getId(), context,
            cosmosAsyncDatabase.getId(), 3);

        cosmosAsyncDatabase.readAllContainers().byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(4)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllContainers." + cosmosAsyncDatabase.getId(), context,
            cosmosAsyncDatabase.getId(), 4);
    }

    @Test(groups = {"emulator"}, timeOut = TIMEOUT)
    public void cosmosAsyncContainer() {
        Tracer mockTracer = Mockito.mock(Tracer.class);
        TracerProvider tracerProvider = Mockito.spy(new TracerProvider(getMockTracer(mockTracer)));
        ReflectionUtils.setTracerProvider(client, tracerProvider);
        TracerProviderCapture tracerProviderCapture = new TracerProviderCapture();
        Mockito.doAnswer(tracerProviderCapture).when(tracerProvider).startSpan(Matchers.anyString(),
            Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        cosmosAsyncContainer.read().block();
        Context context = tracerProviderCapture.getResult();
        Mockito.verify(tracerProvider, Mockito.times(1)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readContainer." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 1);

        try {
            cosmosAsyncContainer.readThroughput().block();
        } catch (CosmosException ex) {
            //do nothing
        }
        Mockito.verify(tracerProvider, Mockito.times(2)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readThroughput." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 2);

        InternalObjectNode item = new InternalObjectNode();
        item.setId(ITEM_ID);
        cosmosAsyncContainer.createItem(item).block();
        Mockito.verify(tracerProvider, Mockito.times(3)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createItem." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 3);

        cosmosAsyncContainer.upsertItem(item,
            new CosmosItemRequestOptions()).block();
        Mockito.verify(tracerProvider, Mockito.times(4)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "upsertItem." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 4);

        cosmosAsyncContainer.readItem(ITEM_ID, PartitionKey.NONE,
            InternalObjectNode.class).block();
        Mockito.verify(tracerProvider, Mockito.times(5)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readItem." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 5);

        cosmosAsyncContainer.deleteItem(ITEM_ID, PartitionKey.NONE).block();
        Mockito.verify(tracerProvider, Mockito.times(6)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "deleteItem." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 6);

        cosmosAsyncContainer.readAllItems(new CosmosQueryRequestOptions(), CosmosItemRequestOptions.class).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(7)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllItems." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 7);

        String query = "select * from c where c.id = '" + ITEM_ID + "'";
        cosmosAsyncContainer.queryItems(query, new CosmosQueryRequestOptions(), CosmosItemRequestOptions.class).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(8)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "queryItems." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 8);
    }

    @Test(groups = {"emulator"}, timeOut = TIMEOUT)
    public void cosmosAsyncScripts() {
        Tracer mockTracer = Mockito.mock(Tracer.class);
        TracerProvider tracerProvider = Mockito.spy(new TracerProvider(getMockTracer(mockTracer)));
        ReflectionUtils.setTracerProvider(client, tracerProvider);
        TracerProviderCapture tracerProviderCapture = new TracerProviderCapture();
        Mockito.doAnswer(tracerProviderCapture).when(tracerProvider).startSpan(Matchers.anyString(),
            Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        cosmosAsyncContainer.getScripts().readAllStoredProcedures(new CosmosQueryRequestOptions()).byPage().single().block();
        Context context = tracerProviderCapture.getResult();

        Mockito.verify(tracerProvider, Mockito.times(1)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllStoredProcedures." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 1);

        cosmosAsyncContainer.getScripts().readAllTriggers(new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(2)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllTriggers." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 2);

        cosmosAsyncContainer.getScripts().readAllUserDefinedFunctions(new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(3)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readAllUserDefinedFunctions." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 3);

        CosmosUserDefinedFunctionProperties cosmosUserDefinedFunctionProperties =
            getCosmosUserDefinedFunctionProperties();
        CosmosUserDefinedFunctionProperties resultUdf =
            cosmosAsyncContainer.getScripts().createUserDefinedFunction(cosmosUserDefinedFunctionProperties).block().getProperties();
        Mockito.verify(tracerProvider, Mockito.times(4)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createUserDefinedFunction." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 4);

        cosmosAsyncContainer.getScripts().getUserDefinedFunction(cosmosUserDefinedFunctionProperties.getId()).read().block();
        Mockito.verify(tracerProvider, Mockito.times(5)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readUDF." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 5);

        cosmosUserDefinedFunctionProperties.setBody("function() {var x = 15;}");
        cosmosAsyncContainer.getScripts().getUserDefinedFunction(resultUdf.getId()).replace(resultUdf).block();
        Mockito.verify(tracerProvider, Mockito.times(6)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "replaceUDF." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 6);

        cosmosAsyncContainer.getScripts().readAllUserDefinedFunctions(new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(7)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        cosmosAsyncContainer.getScripts().getUserDefinedFunction(cosmosUserDefinedFunctionProperties.getId()).delete().block();
        Mockito.verify(tracerProvider, Mockito.times(8)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "deleteUDF." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 8);

        CosmosTriggerProperties cosmosTriggerProperties = getCosmosTriggerProperties();
        CosmosTriggerProperties resultTrigger =
            cosmosAsyncContainer.getScripts().createTrigger(cosmosTriggerProperties).block().getProperties();
        Mockito.verify(tracerProvider, Mockito.times(9)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createTrigger." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 9);

        cosmosAsyncContainer.getScripts().getTrigger(cosmosTriggerProperties.getId()).read().block();
        Mockito.verify(tracerProvider, Mockito.times(10)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readTrigger." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 10);

        cosmosAsyncContainer.getScripts().getTrigger(cosmosTriggerProperties.getId()).replace(resultTrigger).block();
        Mockito.verify(tracerProvider, Mockito.times(11)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "replaceTrigger." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 11);

        cosmosAsyncContainer.getScripts().readAllTriggers(new CosmosQueryRequestOptions()).byPage().single().block();
        Mockito.verify(tracerProvider, Mockito.times(12)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));

        cosmosAsyncContainer.getScripts().getTrigger(cosmosTriggerProperties.getId()).delete().block();
        Mockito.verify(tracerProvider, Mockito.times(13)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "deleteTrigger." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 13);

        CosmosStoredProcedureProperties procedureProperties = getCosmosStoredProcedureProperties();
        CosmosStoredProcedureProperties resultSproc =
            cosmosAsyncContainer.getScripts().createStoredProcedure(procedureProperties).block().getProperties();
        Mockito.verify(tracerProvider, Mockito.times(14)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "createStoredProcedure." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 14);

        cosmosAsyncContainer.getScripts().getStoredProcedure(procedureProperties.getId()).read().block();
        Mockito.verify(tracerProvider, Mockito.times(15)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "readStoredProcedure." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 15);


        cosmosAsyncContainer.getScripts().getStoredProcedure(procedureProperties.getId()).replace(resultSproc).block();
        Mockito.verify(tracerProvider, Mockito.times(16)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "replaceStoredProcedure." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 16);

        cosmosAsyncContainer.getScripts().readAllStoredProcedures(new CosmosQueryRequestOptions()).byPage().single().block();

        cosmosAsyncContainer.getScripts().getStoredProcedure(procedureProperties.getId()).delete().block();
        Mockito.verify(tracerProvider, Mockito.times(18)).startSpan(Matchers.anyString(), Matchers.anyString(),
            Matchers.anyString(), Matchers.any(Context.class));
        verifyTracerAttributes(mockTracer, "deleteStoredProcedure." + cosmosAsyncContainer.getId(), context,
            cosmosAsyncDatabase.getId(), 18);
    }

    @AfterClass(groups = {"emulator"}, timeOut = SETUP_TIMEOUT)
    public void afterClass() {
        LifeCycleUtils.closeQuietly(client);
    }

    private static CosmosUserDefinedFunctionProperties getCosmosUserDefinedFunctionProperties() {
        CosmosUserDefinedFunctionProperties udf =
            new CosmosUserDefinedFunctionProperties(UUID.randomUUID().toString(), "function() {var x = 10;}");
        return udf;
    }

    private static CosmosTriggerProperties getCosmosTriggerProperties() {
        CosmosTriggerProperties trigger = new CosmosTriggerProperties(UUID.randomUUID().toString(), "function() {var " +
            "x = 10;}");
        trigger.setTriggerOperation(TriggerOperation.CREATE);
        trigger.setTriggerType(TriggerType.PRE);
        return trigger;
    }

    private static CosmosStoredProcedureProperties getCosmosStoredProcedureProperties() {
        CosmosStoredProcedureProperties storedProcedureDef =
            new CosmosStoredProcedureProperties(UUID.randomUUID().toString(), "function() {var x = 10;}");
        return storedProcedureDef;
    }

    private List<Tracer> getMockTracer(Tracer tracer) {
        List<Tracer> tracerList = new ArrayList<>();
        tracerList.add(tracer);
        Mockito.when(tracer.start(Matchers.anyString(), Matchers.any(Context.class))).thenReturn(Context.NONE);
        return tracerList;
    }

    private void verifyTracerAttributes(Tracer mockTracer, String methodName, Context context, String databaseName,
                                        int numberOfTimesCalledWithinTest) {
        if (databaseName != null) {
            Mockito.verify(mockTracer, Mockito.times(numberOfTimesCalledWithinTest)).setAttribute(TracerProvider.DB_INSTANCE,
                databaseName, context);
        }
        Mockito.verify(mockTracer, Mockito.times(numberOfTimesCalledWithinTest)).setAttribute(TracerProvider.DB_TYPE,
            TracerProvider.DB_TYPE_VALUE, context);
        Mockito.verify(mockTracer, Mockito.times(numberOfTimesCalledWithinTest)).setAttribute(TracerProvider.DB_URL,
            TestConfigurations.HOST,
            context);
        Mockito.verify(mockTracer, Mockito.times(1)).setAttribute(TracerProvider.DB_STATEMENT, methodName, context);

    }

    private class TracerProviderCapture implements Answer<Context> {
        private Context result = null;

        public Context getResult() {
            return result;
        }

        @Override
        public Context answer(InvocationOnMock invocationOnMock) throws Throwable {
            result = (Context) invocationOnMock.callRealMethod();
            return result;
        }
    }
}
