package com.azure.cosmos;

import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.implementation.directconnectivity.ReflectionUtils;
import com.azure.cosmos.implementation.directconnectivity.RntbdTransportClient;
import com.azure.cosmos.implementation.directconnectivity.rntbd.RntbdEndpoint;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import static org.assertj.core.api.Assertions.assertThat;

public class CosmosClientWarmupTest {

    private CosmosAsyncClient cosmosAsyncClient;

    @BeforeClass(groups = {"simple"})
    public void beforeClass() {

    }
    @AfterClass(groups = {"simple"},  alwaysRun = true)
    public void afterClass() {
        if (this.cosmosAsyncClient != null) {
            this.cosmosAsyncClient.close();
        }
    }
    @Test(groups = {"simple"})
    public void buildAsyncClientAndInitializeContainers() {

        GatewayConnectionConfig gatewayConnectionConfig = new GatewayConnectionConfig();
       // gatewayConnectionConfig.setProxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888)));

        CosmosClientBuilder cosmosClientBuilder = new CosmosClientBuilder();
        cosmosClientBuilder.key(TestConfigurations.MASTER_KEY);
        cosmosClientBuilder.endpoint(TestConfigurations.HOST);
        cosmosClientBuilder.directMode(DirectConnectionConfig.getDefaultConfig(), gatewayConnectionConfig);

        CosmosAsyncClient asyncClient = cosmosClientBuilder.buildAsyncClient();
        RntbdTransportClient rntbdTransportClient = (RntbdTransportClient)ReflectionUtils.getTransportClient(asyncClient);
        RntbdEndpoint.Provider provider = ReflectionUtils.getRntbdEndpointProvider(rntbdTransportClient);


        CosmosAsyncContainer cosmosAsyncContainer1 = asyncClient.getDatabase("TestDB").getContainer("TestCol3");
        assertThat(provider.count()).isEqualTo(0);
        cosmosAsyncContainer1.initializeContainerAsync().block();
        assertThat(provider.count()).isGreaterThan(0);
        System.out.println("CosmosClientWarmupTest.buildAsyncClientAndInitializeContainers "+provider.count());
    }
}
