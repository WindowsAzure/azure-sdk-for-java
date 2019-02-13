/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.DomainTopic;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class DomainTopicImpl extends IndexableRefreshableWrapperImpl<DomainTopic, DomainTopicInner> implements DomainTopic {
    private final EventGridManager manager;
    private String resourceGroupName;
    private String domainName;
    private String topicName;

    DomainTopicImpl(DomainTopicInner inner,  EventGridManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.domainName = IdParsingUtils.getValueFromIdByName(inner.id(), "domains");
        this.topicName = IdParsingUtils.getValueFromIdByName(inner.id(), "topics");
    }

    @Override
    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<DomainTopicInner> getInnerAsync() {
        DomainTopicsInner client = this.manager().inner().domainTopics();
        return client.getAsync(this.resourceGroupName, this.domainName, this.topicName);
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
    public String type() {
        return this.inner().type();
    }

}
