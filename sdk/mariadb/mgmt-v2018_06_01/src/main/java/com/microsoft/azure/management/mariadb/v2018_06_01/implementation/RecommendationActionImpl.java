/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.management.mariadb.v2018_06_01.RecommendationAction;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.Map;

class RecommendationActionImpl extends IndexableRefreshableWrapperImpl<RecommendationAction, RecommendationActionInner> implements RecommendationAction {
    private final MariaDBManager manager;
    private String resourceGroupName;
    private String serverName;
    private String advisorName;
    private String recommendedActionName;

    RecommendationActionImpl(RecommendationActionInner inner,  MariaDBManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.advisorName = IdParsingUtils.getValueFromIdByName(inner.id(), "advisors");
        this.recommendedActionName = IdParsingUtils.getValueFromIdByName(inner.id(), "recommendedActions");
    }

    @Override
    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RecommendationActionInner> getInnerAsync() {
        RecommendedActionsInner client = this.manager().inner().recommendedActions();
        return client.getAsync(this.resourceGroupName, this.serverName, this.advisorName, this.recommendedActionName);
    }



    @Override
    public Integer actionId() {
        return this.inner().actionId();
    }

    @Override
    public String advisorName() {
        return this.inner().advisorName();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public Map<String, String> details() {
        return this.inner().details();
    }

    @Override
    public DateTime expirationTime() {
        return this.inner().expirationTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String reason() {
        return this.inner().reason();
    }

    @Override
    public String recommendationType() {
        return this.inner().recommendationType();
    }

    @Override
    public String sessionId() {
        return this.inner().sessionId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
