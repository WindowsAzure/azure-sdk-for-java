/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;
import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.azure.management.keyvault.v2016_10_01.implementation.KeyVaultManager;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.arm.utils.SdkContext;
import org.junit.Test;
import org.junit.Assert;
import com.microsoft.azure.arm.resources.Region;
import com.microsoft.azure.management.resources.ResourceGroup;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class  KeyVaultTest extends TestBase {
    protected static ResourceManager resourceManager;
    protected static KeyVaultManager keyVaultManager;
    private static String rgName;
    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        resourceManager = ResourceManager
                .authenticate(restClient)
                .withSubscription(defaultSubscription);
        keyVaultManager = KeyVaultManager
                .authenticate(restClient, defaultSubscription);

        this.domain = domain;
    }
    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().deleteByName(rgName);
    }
    @Test
    public void basicTest() {
        rgName = SdkContext.randomResourceName("rg", 20);
        ResourceGroup group = resourceManager.resourceGroups()
            .define(rgName)
            .withRegion(Region.US_WEST.toString())
            .create();
        Assert.assertNotNull(group);

        String tenantId = domain;
        String vaultName = SdkContext.randomResourceName("kv", 10);
        try {
            AccessPolicyEntry accessPolicy = new AccessPolicyEntry()
                .withTenantId(UUID.fromString(tenantId))
                .withObjectId(PRINCIPAL_ID)
                .withPermissions(new Permissions().withKeys(Arrays.asList(KeyPermissions.GET, KeyPermissions.CREATE, KeyPermissions.UPDATE)));

            Vault vault = keyVaultManager.vaults()
                .define(vaultName)
                .withRegion(Region.US_WEST)
                .withExistingResourceGroup(rgName)
                .withProperties(
                    new VaultProperties()
                        .withTenantId(UUID.fromString(tenantId))
                        .withSku(new Sku().withName(SkuName.STANDARD))
                        .withEnabledForDeployment(true)
                        .withAccessPolicies(Arrays.asList(accessPolicy))
                )
                .create();

            Assert.assertNotNull(vault);
            String vaultId = vault.id();

            List<Vault> vaults = keyVaultManager.vaults().listByResourceGroup(rgName);
            Assert.assertEquals(1, vaults.size());
            vault = vaults.iterator().next();
            Assert.assertEquals(vaultName, vault.name());
            Assert.assertEquals(vaultId, vault.id());
            Assert.assertEquals(SkuName.STANDARD, vault.properties().sku().name());
            Assert.assertTrue(vault.properties().enabledForDeployment());

            keyVaultManager.vaults().deleteByIds(vaultId);
            vaults = keyVaultManager.vaults().listByResourceGroup(rgName);
            Assert.assertEquals(0, vaults.size());
        } finally {
            resourceManager.resourceGroups().beginDeleteByName(rgName);
        }
    }

    protected String domain;
    private static String PRINCIPAL_ID = "00000000-0000-0000-0000-000000000000";    // one option is to use your userId or clientId in AZURE_AUTH_LOCATION
}
