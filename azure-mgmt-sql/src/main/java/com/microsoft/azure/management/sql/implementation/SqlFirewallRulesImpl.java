/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByParent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByParent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.IndependentChildrenImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.sql.SqlFirewallRule;
import com.microsoft.azure.management.sql.SqlFirewallRules;
import rx.Observable;

/**
 * Implementation for SQLElasticPools and its parent interfaces.
 */
@LangDefinition
public class SqlFirewallRulesImpl extends IndependentChildrenImpl<
            SqlFirewallRule,
            SqlFirewallRuleImpl,
            ServerFirewallRuleInner,
            ServersInner,
            SqlServerManager>
        implements SqlFirewallRules,
        SupportsGettingByParent<SqlFirewallRule>,
        SupportsListingByParent<SqlFirewallRule>,
        SqlFirewallRules.SqlFirewallRulesCreatable,
        SqlFirewallRules.SqlFirewallRulesParentable {
    protected SqlFirewallRulesImpl(ServersInner innerCollection, SqlServerManager manager) {
        super(innerCollection, manager);
    }

    @Override
    protected SqlFirewallRuleImpl wrapModel(String name) {
        ServerFirewallRuleInner inner = new ServerFirewallRuleInner();

        return new SqlFirewallRuleImpl<SqlFirewallRule.DefinitionStages.Parentable>(
                name,
                inner,
                this.innerCollection);
    }

    @Override
    public SqlFirewallRule getByParent(String resourceGroup, String parentName, String name) {
        return wrapModel(this.innerCollection.getFirewallRule(resourceGroup, parentName, name));
    }

    @Override
    public PagedList<SqlFirewallRule> listByParent(String resourceGroupName, String parentName) {
        return wrapList(this.innerCollection.listFirewallRules(resourceGroupName, parentName));
    }

    @Override
    protected SqlFirewallRuleImpl wrapModel(ServerFirewallRuleInner inner) {
        if (inner == null) {
            return null;
        }
        return new SqlFirewallRuleImpl(inner.name(), inner, this.innerCollection);
    }

    @Override
    public SqlFirewallRule.DefinitionStages.Blank define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<Void> deleteByParentAsync(String groupName, String parentName, String name) {
        return this.innerCollection.deleteFirewallRuleAsync(groupName, parentName, name);
    }

    @Override
    public SqlFirewallRule getBySqlServer(String resourceGroup, String sqlServerName, String name) {
        return this.getByParent(resourceGroup, sqlServerName, name);
    }

    @Override
    public SqlFirewallRule getBySqlServer(GroupableResource sqlServer, String name) {
        return this.getByParent(sqlServer, name);
    }

    @Override
    public PagedList<SqlFirewallRule> listBySqlServer(String resourceGroupName, String sqlServerName) {
        return this.listByParent(resourceGroupName, sqlServerName);
    }

    @Override
    public PagedList<SqlFirewallRule> listBySqlServer(GroupableResource sqlServer) {
        return this.listByParent(sqlServer);
    }

    @Override
    public SqlFirewallRuleImpl definedWithSqlServer(String resourceGroupName, String sqlServerName, String firewallRuleName) {
        ServerFirewallRuleInner inner = new ServerFirewallRuleInner();

        return new SqlFirewallRuleImpl<SqlFirewallRule.DefinitionStages.WithCreate>(
                firewallRuleName,
                inner,
                this.innerCollection).withExistingParentResource(resourceGroupName, sqlServerName);
    }
}
