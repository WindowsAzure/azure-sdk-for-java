/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceNamer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SqlServerOperationsTests extends SqlServerTestBase {
    private static final String RG_NAME = ResourceNamer.randomResourceName("javasqlserver", 20);
    private static final String SQL_SERVER_NAME = RG_NAME;
    private static final String SQL_DATABASE_NAME = "myTestDatabase2";
    private static final String COLLATION = "SQL_Latin1_General_CP1_CI_AS";
    private static final String SQL_ELASTIC_POOL_NAME = "testElasticPool";
    private static final String SQL_FIREWALLRULE_NAME = "firewallrule1";
    private static final String START_IPADDRESS = "10.102.1.10";
    private static final String END_IPADDRESS = "10.102.1.12";


    @BeforeClass
    public static void setup() throws Exception {
        createClients();
    }

    @AfterClass
    public static void cleanup() throws Exception {
        resourceManager.resourceGroups().deleteByName(RG_NAME);
    }

    @Test
    public void canListRecommendedElasticPools() throws Exception {
        SqlServer sqlServer = sqlServerManager.sqlServers().getByGroup("ans", "ans-secondary");
        sqlServer.databases().list().get(0).listServiceTierAdvisors().values().iterator().next().serviceLevelObjectiveUsageMetrics();
        Map<String, RecommendedElasticPool> recommendedElasticPools = sqlServer.listRecommendedElasticPools();
        Assert.assertNotNull(recommendedElasticPools);
        Assert.assertNotNull(sqlServer.databases().list().get(0).getUpgradeHint());
    }


    @Test
    public void canCRUDSqlServer() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        validateSqlServer(sqlServer);

        List<ServiceObjective> serviceObjectives = sqlServer.listServiceObjectives();

        Assert.assertNotEquals(serviceObjectives.size(), 0);
        Assert.assertNotNull(serviceObjectives.get(0).refresh());
        Assert.assertNotNull(sqlServer.getServiceObjective("d1737d22-a8ea-4de7-9bd0-33395d2a7419"));

        sqlServer.update().withAdministratorPassword("P@ssword~2").apply();

        // List
        List<SqlServer> sqlServers = sqlServerManager.sqlServers().listByGroup(RG_NAME);
        boolean found = false;
        for (SqlServer server : sqlServers) {
            if (server.name().equals(SQL_SERVER_NAME)) {
                found = true;
            }
        }
        Assert.assertTrue(found);
        // Get
        sqlServer = sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        Assert.assertNotNull(sqlServer);

        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canUseCoolShortcutsForResourceCreation() throws Exception {
        String database2Name = "database2";
        String database1InEPName = "database1InEP";
        String database2InEPName = "database2InEP";
        String elasticPool2Name = "elasticPool2";
        String elasticPool3Name = "elasticPool3";
        String elasticPool1Name = SQL_ELASTIC_POOL_NAME;

        // Create
        SqlServer sqlServer = sqlServerManager.sqlServers().define(SQL_SERVER_NAME)
                .withRegion(Region.US_CENTRAL)
                .withNewResourceGroup(RG_NAME)
                .withAdministratorLogin("userName")
                .withAdministratorPassword("Password~1")
                .withNewDatabase(SQL_DATABASE_NAME)
                .withNewDatabase(database2Name)
                .withNewElasticPool(elasticPool1Name, ElasticPoolEditions.STANDARD)
                .withNewElasticPool(elasticPool2Name, ElasticPoolEditions.PREMIUM, database1InEPName, database2InEPName)
                .withNewElasticPool(elasticPool3Name, ElasticPoolEditions.STANDARD)
                .withNewFirewallRule(START_IPADDRESS, END_IPADDRESS, SQL_FIREWALLRULE_NAME)
                .withNewFirewallRule(START_IPADDRESS, END_IPADDRESS)
                .withNewFirewallRule(START_IPADDRESS)
                .create();

        validateMultiCreation(database2Name, database1InEPName, database2InEPName, elasticPool1Name, elasticPool2Name, elasticPool3Name, sqlServer);
        elasticPool1Name = SQL_ELASTIC_POOL_NAME + " U";
        database2Name = "database2U";
        database1InEPName = "database1InEPU";
        database2InEPName = "database2InEPU";
        elasticPool2Name = "elasticPool2U";
        elasticPool3Name = "elasticPool3U";

        // Update
        sqlServer = sqlServer.update()
                .withNewDatabase(SQL_DATABASE_NAME).withNewDatabase(database2Name)
                .withNewElasticPool(elasticPool1Name, ElasticPoolEditions.STANDARD)
                .withNewElasticPool(elasticPool2Name, ElasticPoolEditions.PREMIUM, database1InEPName, database2InEPName)
                .withNewElasticPool(elasticPool3Name, ElasticPoolEditions.STANDARD)
                .withNewFirewallRule(START_IPADDRESS, END_IPADDRESS, SQL_FIREWALLRULE_NAME)
                .withNewFirewallRule(START_IPADDRESS, END_IPADDRESS)
                .withNewFirewallRule(START_IPADDRESS)
                .apply();

        validateMultiCreation(database2Name, database1InEPName, database2InEPName, elasticPool1Name, elasticPool2Name, elasticPool3Name, sqlServer);

        // List
        List<SqlServer> sqlServers = sqlServerManager.sqlServers().listByGroup(RG_NAME);
        boolean found = false;
        for (SqlServer server : sqlServers) {
            if (server.name().equals(SQL_SERVER_NAME)) {
                found = true;
            }
        }

        Assert.assertTrue(found);
        // Get
        sqlServer = sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        Assert.assertNotNull(sqlServer);

        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    private static void validateMultiCreation(
            String database2Name,
            String database1InEPName,
            String database2InEPName,
            String elasticPool1Name,
            String elasticPool2Name,
            String elasticPool3Name,
            SqlServer sqlServer) {
        validateSqlServer(sqlServer);
        validateSqlServer(sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME));
        validateSqlDatabase(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);
        validateSqlFirewallRule(sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME), SQL_FIREWALLRULE_NAME);

        List<SqlFirewallRule> firewalls = sqlServer.firewallRules().list();
        Assert.assertEquals(3, firewalls.size());

        int startIpAddress = 0;
        int endIpAddress = 0;

        for (SqlFirewallRule firewall: firewalls) {
            if (!firewall.name().equalsIgnoreCase(SQL_FIREWALLRULE_NAME)) {
                Assert.assertEquals(firewall.startIpAddress(), START_IPADDRESS);
                if (firewall.endIpAddress().equalsIgnoreCase(START_IPADDRESS)) {
                    startIpAddress++;
                }
                else if (firewall.endIpAddress().equalsIgnoreCase(END_IPADDRESS)) {
                    endIpAddress++;
                }
            }
        }

        Assert.assertEquals(startIpAddress, 1);
        Assert.assertEquals(endIpAddress, 1);

        Assert.assertNotNull(sqlServer.databases().get(database2Name));
        Assert.assertNotNull(sqlServer.databases().get(database1InEPName));
        Assert.assertNotNull(sqlServer.databases().get(database2InEPName));

        SqlElasticPool ep1 = sqlServer.elasticPools().get(elasticPool1Name);
        validateSqlElasticPool(ep1, elasticPool1Name);
        SqlElasticPool ep2 = sqlServer.elasticPools().get(elasticPool2Name);

        Assert.assertNotNull(ep2);
        Assert.assertEquals(ep2.edition(), ElasticPoolEditions.PREMIUM);
        Assert.assertEquals(ep2.listDatabases().size(), 2);
        Assert.assertNotNull(ep2.getDatabase(database1InEPName));
        Assert.assertNotNull(ep2.getDatabase(database2InEPName));

        SqlElasticPool ep3 = sqlServer.elasticPools().get(elasticPool3Name);

        Assert.assertNotNull(ep3);
        Assert.assertEquals(ep3.edition(), ElasticPoolEditions.STANDARD);

        sqlServer.databases().delete(database2Name);
        sqlServer.databases().delete(database1InEPName);
        sqlServer.databases().delete(database2InEPName);
        sqlServer.databases().delete(SQL_DATABASE_NAME);

        Assert.assertEquals(ep1.listDatabases().size(), 0);
        Assert.assertEquals(ep2.listDatabases().size(), 0);
        Assert.assertEquals(ep3.listDatabases().size(), 0);

        sqlServer.elasticPools().delete(elasticPool1Name);
        sqlServer.elasticPools().delete(elasticPool2Name);
        sqlServer.elasticPools().delete(elasticPool3Name);

        Assert.assertEquals(sqlServer.elasticPools().list().size(), 0);
        // Only master database is remaining in the SQLServer.
        Assert.assertEquals(sqlServer.databases().list().size(), 1);
        for (SqlFirewallRule firewallRule :firewalls) {
            firewallRule.delete();
        }
    }


    @Test
    public void canCRUDSqlDatabase() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        SqlDatabase sqlDatabase = sqlServer.databases()
                .define(SQL_DATABASE_NAME)
                .withoutElasticPool()
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.STANDARD)
                .createAsync().toBlocking().first();

        validateSqlDatabase(sqlDatabase, SQL_DATABASE_NAME);

        // Test transparent data encryption settings.
        TransparentDataEncryption transparentDataEncryption = sqlDatabase.getTransparentDataEncryption();
        Assert.assertNotNull(transparentDataEncryption.status());

        List<TransparentDataEncryptionActivity> transparentDataEncryptionActivities = transparentDataEncryption.listActivity();
        Assert.assertNotNull(transparentDataEncryptionActivities);

        transparentDataEncryption = transparentDataEncryption.updateStatus(TransparentDataEncryptionStates.ENABLED);
        Assert.assertNotNull(transparentDataEncryption);
        Assert.assertEquals(transparentDataEncryption.status(), TransparentDataEncryptionStates.ENABLED);

        transparentDataEncryptionActivities = transparentDataEncryption.listActivity();
        Assert.assertNotNull(transparentDataEncryptionActivities);

        Thread.sleep(10000);
        transparentDataEncryption = sqlDatabase.getTransparentDataEncryption().updateStatus(TransparentDataEncryptionStates.DISABLED);
        Assert.assertNotNull(transparentDataEncryption);
        Assert.assertEquals(transparentDataEncryption.status(), TransparentDataEncryptionStates.DISABLED);
        Assert.assertEquals(transparentDataEncryption.sqlServerName(), SQL_SERVER_NAME);
        Assert.assertEquals(transparentDataEncryption.databaseName(), SQL_DATABASE_NAME);
        Assert.assertNotNull(transparentDataEncryption.name());
        Assert.assertNotNull(transparentDataEncryption.id());
        // Done testing with encryption settings.

        Assert.assertNotNull(sqlDatabase.getUpgradeHint());

        // Test Service tier advisors.
        Map<String, ServiceTierAdvisor> serviceTierAdvisors = sqlDatabase.listServiceTierAdvisors();
        Assert.assertNotNull(serviceTierAdvisors);
        Assert.assertNotNull(serviceTierAdvisors.values().iterator().next().serviceLevelObjectiveUsageMetrics());
        Assert.assertNotEquals(serviceTierAdvisors.size(), 0);

        Assert.assertNotNull(serviceTierAdvisors.values().iterator().next().refresh());
        Assert.assertNotNull(serviceTierAdvisors.values().iterator().next().serviceLevelObjectiveUsageMetrics());
        // End of testing service tier advisors.

        sqlServer =  sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        validateSqlServer(sqlServer);

        // Create another database with above created database as source database.
        Creatable<SqlElasticPool> sqlElasticPoolCreatable = sqlServer.elasticPools()
                .define(SQL_ELASTIC_POOL_NAME)
                .withEdition(ElasticPoolEditions.STANDARD);
        String anotherDatabaseName = "anotherDatabase";
        SqlDatabase anotherDatabase = sqlServer.databases()
                .define(anotherDatabaseName)
                .withNewElasticPool(sqlElasticPoolCreatable)
                .withSourceDatabase(sqlDatabase.id())
                .withMode(CreateMode.COPY)
                .create();

        validateSqlDatabaseWithElasticPool(anotherDatabase, anotherDatabaseName);
        sqlServer.databases().delete(anotherDatabase.name());

        // Get
        validateSqlDatabase(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);

        // List
        validateListSqlDatabase(sqlServer.databases().list());

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        validateSqlDatabaseNotFound(SQL_DATABASE_NAME);

        // Add another database to the server
        sqlDatabase = sqlServer.databases()
                .define("newDatabase")
                .withoutElasticPool()
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.STANDARD)
                .createAsync().toBlocking().first();
        sqlServer.databases().delete(sqlDatabase.name());

        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canManageReplicationLinks() throws Exception {
        // Create
        String anotherSqlServerName = SQL_SERVER_NAME + "another";
        SqlServer sqlServer1 = createSqlServer();
        SqlServer sqlServer2 = createSqlServer(anotherSqlServerName);

        SqlDatabase databaseInServer1 = sqlServer1.databases()
                .define(SQL_DATABASE_NAME)
                .withoutElasticPool()
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.STANDARD)
                .createAsync().toBlocking().first();

        validateSqlDatabase(databaseInServer1, SQL_DATABASE_NAME);
        SqlDatabase databaseInServer2 = sqlServer2.databases()
                .define(SQL_DATABASE_NAME)
                .withoutElasticPool()
                .withSourceDatabase(databaseInServer1.id())
                .withMode(CreateMode.ONLINE_SECONDARY)
                .create();
        Thread.sleep(2000);
        List<ReplicationLink> replicationLinksInDb1 = new ArrayList<>(databaseInServer1.listReplicationLinks().values());

        Assert.assertEquals(replicationLinksInDb1.size() , 1);
        Assert.assertEquals(replicationLinksInDb1.get(0).partnerDatabase(), databaseInServer2.name());
        Assert.assertEquals(replicationLinksInDb1.get(0).partnerServer(), databaseInServer2.sqlServerName());

        List<ReplicationLink> replicationLinksInDb2 = new ArrayList<>(databaseInServer2.listReplicationLinks().values());

        Assert.assertEquals(replicationLinksInDb2.size() , 1);
        Assert.assertEquals(replicationLinksInDb2.get(0).partnerDatabase(), databaseInServer1.name());
        Assert.assertEquals(replicationLinksInDb2.get(0).partnerServer(), databaseInServer1.sqlServerName());

        Assert.assertNotNull(replicationLinksInDb1.get(0).refresh());

        replicationLinksInDb1.get(0).delete();

        Assert.assertEquals(databaseInServer2.listReplicationLinks().size(), 0);

        Thread.sleep(5000);
        Assert.assertEquals(databaseInServer1.listReplicationLinks().size(), 0);

        sqlServer1.databases().delete(databaseInServer1.name());
        sqlServer2.databases().delete(databaseInServer2.name());

        sqlServerManager.sqlServers().deleteByGroup(sqlServer2.resourceGroupName(), sqlServer2.name());
        validateSqlServerNotFound(sqlServer2);
        sqlServerManager.sqlServers().deleteByGroup(sqlServer1.resourceGroupName(), sqlServer1.name());
        validateSqlServerNotFound(sqlServer1);
    }

    @Test
    public void canDoOperationsOnDataWarehouse() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        validateSqlServer(sqlServer);

        // List usages for the server.
        Assert.assertNotNull(sqlServer.listUsages());

        SqlDatabase dataWarehouse = sqlServer.databases()
                .define(SQL_DATABASE_NAME)
                .withoutElasticPool()
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.DATA_WAREHOUSE)
                .createAsync().toBlocking().first();

        // Get
        dataWarehouse = sqlServer.databases().get(SQL_DATABASE_NAME);

        Assert.assertNotNull(dataWarehouse);
        Assert.assertEquals(dataWarehouse.name(), SQL_DATABASE_NAME);
        Assert.assertEquals(dataWarehouse.edition(), DatabaseEditions.DATA_WAREHOUSE);

        // List Restore points.
        dataWarehouse.resumeDataWarehouse();
        Assert.assertNotNull(dataWarehouse.listRestorePoints());
        // Get usages.
        Assert.assertNotNull(dataWarehouse.listUsages());

        // Pause warehouse
        dataWarehouse.pauseDataWarehouse();

        // Resume warehouse

        sqlServer.databases().delete(SQL_DATABASE_NAME);

        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlDatabaseWithElasticPool() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        Creatable<SqlElasticPool> sqlElasticPoolCreatable = sqlServer.elasticPools()
                .define(SQL_ELASTIC_POOL_NAME)
                .withEdition(ElasticPoolEditions.STANDARD);

        SqlDatabase sqlDatabase = sqlServer.databases()
                .define(SQL_DATABASE_NAME)
                .withNewElasticPool(sqlElasticPoolCreatable)
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.STANDARD)
                .withServiceObjective(ServiceObjectiveName.S1)
                .createAsync().toBlocking().first();

        validateSqlDatabase(sqlDatabase, SQL_DATABASE_NAME);

        sqlServer =  sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        validateSqlServer(sqlServer);

        // Get Elastic pool
        SqlElasticPool elasticPool = sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME);
        validateSqlElasticPool(elasticPool);

        // Get
        validateSqlDatabaseWithElasticPool(sqlServer.databases().get(SQL_DATABASE_NAME), SQL_DATABASE_NAME);

        // List
        validateListSqlDatabase(sqlServer.databases().list());

        // Remove database from elastic pools.
        sqlDatabase.update()
                .withoutElasticPool()
                .withEdition(DatabaseEditions.STANDARD)
                .withServiceObjective(ServiceObjectiveName.S3)
            .apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assert.assertNull(sqlDatabase.elasticPoolName());

        // Update edition of the SQL database
        sqlDatabase.update()
                .withEdition(DatabaseEditions.PREMIUM)
                .withServiceObjective(ServiceObjectiveName.P1)
                .apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assert.assertEquals(sqlDatabase.edition(), DatabaseEditions.PREMIUM);
        Assert.assertEquals(sqlDatabase.serviceLevelObjective(), ServiceObjectiveName.P1);

        // Update just the service level objective for database.
        sqlDatabase.update().withServiceObjective(ServiceObjectiveName.P2).apply();
        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assert.assertEquals(sqlDatabase.serviceLevelObjective(), ServiceObjectiveName.P2);
        Assert.assertEquals(sqlDatabase.requestedServiceObjectiveName(), ServiceObjectiveName.P2);

        // Update max size bytes of the database.
        sqlDatabase.update()
                .withMaxSizeBytes(268435456000L)
                .apply();

        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assert.assertEquals(sqlDatabase.maxSizeBytes(), 268435456000L);

        // Put the database back in elastic pool.
        sqlDatabase.update()
                .withExistingElasticPool(SQL_ELASTIC_POOL_NAME)
                .apply();

        sqlDatabase = sqlServer.databases().get(SQL_DATABASE_NAME);
        Assert.assertEquals(sqlDatabase.elasticPoolName(), SQL_ELASTIC_POOL_NAME);

        // List Activity in elastic pool
        Assert.assertNotNull(elasticPool.listActivities());

        // List Database activity in elastic pool.
        Assert.assertNotNull(elasticPool.listDatabaseActivities());

        // List databases in elastic pool.
        List<SqlDatabase> databasesInElasticPool = elasticPool.listDatabases();
        Assert.assertNotNull(databasesInElasticPool);
        Assert.assertEquals(databasesInElasticPool.size(), 1);

        // Get a particular database in elastic pool.
        SqlDatabase databaseInElasticPool = elasticPool.getDatabase(SQL_DATABASE_NAME);
        validateSqlDatabase(databaseInElasticPool, SQL_DATABASE_NAME);

        // Refresh works on the database got from elastic pool.
        databaseInElasticPool.refresh();

        // Validate that trying to get an invalid database from elastic pool returns null.
        try {
            elasticPool.getDatabase("does_not_exist");
            Assert.assertNotNull(null);
        }
        catch(Exception ex) {
        }

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        validateSqlDatabaseNotFound(SQL_DATABASE_NAME);

        SqlElasticPool sqlElasticPool = sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME);

        // Add another database to the server and pool.
        sqlDatabase = sqlServer.databases()
                .define("newDatabase")
                .withExistingElasticPool(sqlElasticPool)
                .withoutSourceDatabaseId()
                .withCollation(COLLATION)
                .withEdition(DatabaseEditions.STANDARD)
                .createAsync().toBlocking().first();
        sqlServer.databases().delete(sqlDatabase.name());
        validateSqlDatabaseNotFound("newDatabase");

        sqlServer.elasticPools().delete(SQL_ELASTIC_POOL_NAME);
        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlElasticPool() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        sqlServer =  sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        validateSqlServer(sqlServer);

        SqlElasticPool sqlElasticPool = sqlServer.elasticPools()
                .define(SQL_ELASTIC_POOL_NAME)
                .withEdition(ElasticPoolEditions.STANDARD)
                .createAsync().toBlocking().first();
        validateSqlElasticPool(sqlElasticPool);
        Assert.assertEquals(sqlElasticPool.listDatabases().size(), 0);

        sqlElasticPool = sqlElasticPool.update()
                .withDtu(100)
                .withDatabaseDtuMax(20)
                .withDatabaseDtuMin(10)
                .withStorageCapacity(102400)
                .withNewDatabase(SQL_DATABASE_NAME)
                .apply();

        validateSqlElasticPool(sqlElasticPool);
        Assert.assertEquals(sqlElasticPool.listDatabases().size(), 1);

        // Get
        validateSqlElasticPool(sqlServer.elasticPools().get(SQL_ELASTIC_POOL_NAME));

        // List
        validateListSqlElasticPool(sqlServer.elasticPools().list());

        // Delete
        sqlServer.databases().delete(SQL_DATABASE_NAME);
        sqlServer.elasticPools().delete(SQL_ELASTIC_POOL_NAME);
        validateSqlElasticPoolNotFound(sqlServer, SQL_ELASTIC_POOL_NAME);

        // Add another database to the server
        sqlElasticPool = sqlServer.elasticPools()
                .define("newElasticPool")
                .withEdition(ElasticPoolEditions.STANDARD)
                .createAsync().toBlocking().first();

        sqlServer.elasticPools().delete(sqlElasticPool.name());
        validateSqlElasticPoolNotFound(sqlServer, "newElasticPool");

        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    @Test
    public void canCRUDSqlFirewallRule() throws Exception {
        // Create
        SqlServer sqlServer = createSqlServer();

        sqlServer =  sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME);
        validateSqlServer(sqlServer);

        SqlFirewallRule sqlFirewallRule = sqlServer.firewallRules()
                .define(SQL_FIREWALLRULE_NAME)
                .withIpAddressRange(START_IPADDRESS, END_IPADDRESS)
                .createAsync().toBlocking().first();

        validateSqlFirewallRule(sqlFirewallRule, SQL_FIREWALLRULE_NAME);
        validateSqlFirewallRule(sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME), SQL_FIREWALLRULE_NAME);


        String secondFirewallRuleName = "secondFireWallRule";
        SqlFirewallRule secondFirewallRule = sqlServer.firewallRules()
                .define(secondFirewallRuleName)
                .withIpAddress(START_IPADDRESS)
                .create();

        secondFirewallRule = sqlServer.firewallRules().get(secondFirewallRuleName);

        Assert.assertNotNull(secondFirewallRule);
        Assert.assertEquals(END_IPADDRESS, secondFirewallRule.endIpAddress());

        secondFirewallRule = secondFirewallRule.update().withEndIpAddress(END_IPADDRESS).apply();

        validateSqlFirewallRule(secondFirewallRule, secondFirewallRuleName);
        sqlServer.firewallRules().delete(secondFirewallRuleName);
        Assert.assertNull(sqlServer.firewallRules().get(secondFirewallRuleName));

        // Get
        sqlFirewallRule = sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME);
        validateSqlFirewallRule(sqlFirewallRule, SQL_FIREWALLRULE_NAME);

        // Update
        // Making start and end IP address same.
        sqlFirewallRule.update().withEndIpAddress(START_IPADDRESS).apply();
        sqlFirewallRule = sqlServer.firewallRules().get(SQL_FIREWALLRULE_NAME);
        Assert.assertEquals(sqlFirewallRule.endIpAddress(), START_IPADDRESS);

        // List
        validateListSqlFirewallRule(sqlServer.firewallRules().list());

        // Delete
        sqlServer.firewallRules().delete(sqlFirewallRule.name());
        validateSqlFirewallRuleNotFound();

        // Delete server
        sqlServerManager.sqlServers().deleteByGroup(sqlServer.resourceGroupName(), sqlServer.name());
        validateSqlServerNotFound(sqlServer);
    }

    private static void validateSqlFirewallRuleNotFound() {
        Assert.assertNull(sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME).firewallRules().get(SQL_FIREWALLRULE_NAME));
    }

    private static void validateSqlElasticPoolNotFound(SqlServer sqlServer, String elasticPoolName) {
        Assert.assertNull(sqlServer.elasticPools().get(elasticPoolName));
    }

    private static void validateSqlDatabaseNotFound(String newDatabase) {
        Assert.assertNull(sqlServerManager.sqlServers().getByGroup(RG_NAME, SQL_SERVER_NAME).databases().get(newDatabase));
    }


    private static void validateSqlServerNotFound(SqlServer sqlServer) {
        Assert.assertNull(sqlServerManager.sqlServers().getById(sqlServer.id()));
    }

    private static SqlServer createSqlServer() {
        return createSqlServer(SQL_SERVER_NAME);
    }

    private static SqlServer createSqlServer(String SQL_SERVER_NAME) {
        return sqlServerManager.sqlServers()
                .define(SQL_SERVER_NAME)
                .withRegion(Region.US_CENTRAL)
                .withNewResourceGroup(RG_NAME)
                .withAdministratorLogin("userName")
                .withAdministratorPassword("P@ssword~1")
                .withVersion(ServerVersion.ONE_TWO_FULL_STOP_ZERO)
                .create();
    }

    private static void validateListSqlFirewallRule(List<SqlFirewallRule> sqlFirewallRules) {
        boolean found = false;
        for (SqlFirewallRule firewallRule: sqlFirewallRules) {
            if (firewallRule.name().equals(SQL_FIREWALLRULE_NAME)) {
                found = true;
            }
        }
        Assert.assertTrue(found);
    }

    private static void validateSqlFirewallRule(SqlFirewallRule sqlFirewallRule, String firewallName) {
        Assert.assertNotNull(sqlFirewallRule);
        Assert.assertEquals(firewallName, sqlFirewallRule.name());
        Assert.assertEquals(SQL_SERVER_NAME, sqlFirewallRule.sqlServerName());
        Assert.assertEquals(START_IPADDRESS, sqlFirewallRule.startIpAddress());
        Assert.assertEquals(END_IPADDRESS, sqlFirewallRule.endIpAddress());
        Assert.assertEquals(RG_NAME, sqlFirewallRule.resourceGroupName());
        Assert.assertEquals(SQL_SERVER_NAME, sqlFirewallRule.sqlServerName());
        Assert.assertEquals(Region.US_CENTRAL, sqlFirewallRule.region());
    }

    private static void validateListSqlElasticPool(List<SqlElasticPool> sqlElasticPools) {
        boolean found = false;
        for (SqlElasticPool elasticPool : sqlElasticPools) {
            if (elasticPool.name().equals(SQL_ELASTIC_POOL_NAME)) {
                found = true;
            }
        }
        Assert.assertTrue(found);
    }

    private static void validateSqlElasticPool(SqlElasticPool sqlElasticPool) {
        validateSqlElasticPool(sqlElasticPool, SQL_ELASTIC_POOL_NAME);
    }

    private static void validateSqlElasticPool(SqlElasticPool sqlElasticPool, String elasticPoolName) {
        Assert.assertNotNull(sqlElasticPool);
        Assert.assertEquals(RG_NAME, sqlElasticPool.resourceGroupName());
        Assert.assertEquals(elasticPoolName, sqlElasticPool.name());
        Assert.assertEquals(SQL_SERVER_NAME, sqlElasticPool.sqlServerName());
        Assert.assertEquals(ElasticPoolEditions.STANDARD, sqlElasticPool.edition());
        Assert.assertNotNull(sqlElasticPool.creationDate());
        Assert.assertNotEquals(0, sqlElasticPool.databaseDtuMax());
        Assert.assertNotEquals(0, sqlElasticPool.dtu());
    }

    private static void validateListSqlDatabase(List<SqlDatabase> sqlDatabases) {
        boolean found = false;
        for (SqlDatabase database : sqlDatabases) {
            if (database.name().equals(SQL_DATABASE_NAME)) {
                found = true;
            }
        }
        Assert.assertTrue(found);
    }

    private static void validateSqlServer(SqlServer sqlServer) {
        Assert.assertNotNull(sqlServer);
        Assert.assertEquals(RG_NAME, sqlServer.resourceGroupName());
        Assert.assertNotNull(sqlServer.fullyQualifiedDomainName());
        Assert.assertEquals(ServerVersion.ONE_TWO_FULL_STOP_ZERO, sqlServer.version());
        Assert.assertEquals("userName", sqlServer.administratorLogin());
    }

    private static void validateSqlDatabase(SqlDatabase sqlDatabase, String databaseName) {
        Assert.assertNotNull(sqlDatabase);
        Assert.assertEquals(sqlDatabase.name(), databaseName);
        Assert.assertEquals(SQL_SERVER_NAME, sqlDatabase.sqlServerName());
        Assert.assertEquals(sqlDatabase.collation(), COLLATION);
        Assert.assertEquals(sqlDatabase.edition(), DatabaseEditions.STANDARD);
    }


    private static void validateSqlDatabaseWithElasticPool(SqlDatabase sqlDatabase, String databaseName) {
        validateSqlDatabase(sqlDatabase, databaseName);
        Assert.assertEquals(SQL_ELASTIC_POOL_NAME, sqlDatabase.elasticPoolName());
    }
}
