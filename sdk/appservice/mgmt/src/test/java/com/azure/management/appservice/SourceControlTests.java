// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.appservice;

import com.azure.core.http.rest.Response;
import com.azure.management.RestClient;
import com.azure.management.resources.fluentcore.arm.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SourceControlTests extends AppServiceTest {
    private String webappName = "";

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        webappName = generateRandomResourceName("java-webapp-", 20);

        super.initializeClients(restClient, defaultSubscription, domain);
    }

    @Test
    public void canDeploySourceControl() throws Exception {
        // Create web app
        WebApp webApp =
            appServiceManager
                .webApps()
                .define(webappName)
                .withRegion(Region.US_WEST)
                .withNewResourceGroup(rgName)
                .withNewWindowsPlan(PricingTier.STANDARD_S1)
                .defineSourceControl()
                .withPublicGitRepository("https://github.com/jianghaolu/azure-site-test")
                .withBranch("master")
                .attach()
                .create();
        Assertions.assertNotNull(webApp);
        if (!isPlaybackMode()) {
            Response<String> response = curl("http://" + webappName + "." + "azurewebsites.net");
            Assertions.assertEquals(200, response.getStatusCode());
            String body = response.getValue();
            Assertions.assertNotNull(body);
            Assertions.assertTrue(body.contains("Hello world from linux 4"));
        }
    }
}
