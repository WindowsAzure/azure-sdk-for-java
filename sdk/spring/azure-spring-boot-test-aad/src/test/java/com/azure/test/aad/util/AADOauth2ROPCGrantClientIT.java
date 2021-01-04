// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.test.aad.util;

import com.azure.test.utils.aad.ropc.AADOauth2ROPCGrantClient;
import org.junit.Test;

import static com.azure.test.utils.aad.EnvironmentVariables.AAD_MULTI_TENANT_CLIENT_ID;
import static com.azure.test.utils.aad.EnvironmentVariables.AAD_MULTI_TENANT_CLIENT_SECRET;
import static com.azure.test.utils.aad.EnvironmentVariables.AAD_TENANT_ID_1;
import static com.azure.test.utils.aad.EnvironmentVariables.AAD_USER_NAME_1;
import static com.azure.test.utils.aad.EnvironmentVariables.AAD_USER_PASSWORD_1;
import static com.azure.test.utils.aad.EnvironmentVariables.MULTI_TENANT_SCOPE_GRAPH_READ;
import static org.junit.Assert.assertNotNull;

public class AADOauth2ROPCGrantClientIT {

    @Test
    public void getAccessTokenForTestAccountTest() {
        AADOauth2ROPCGrantClient.OAuth2ROPCResponse oAuth2ROPCResponse =
            AADOauth2ROPCGrantClient.getOAuth2ROPCResponseByROPCGrant(
            AAD_TENANT_ID_1,
            AAD_MULTI_TENANT_CLIENT_ID,
            AAD_MULTI_TENANT_CLIENT_SECRET,
            AAD_USER_NAME_1,
            AAD_USER_PASSWORD_1,
            MULTI_TENANT_SCOPE_GRAPH_READ);
        assertNotNull(oAuth2ROPCResponse);
    }
}
