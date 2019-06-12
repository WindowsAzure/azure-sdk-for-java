/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30.implementation;

import com.microsoft.azure.management.automation.v2018_06_30.RunbookDraft;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.automation.v2018_06_30.ContentLink;
import java.util.List;
import java.util.Map;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookParameter;

class RunbookDraftImpl extends WrapperImpl<RunbookDraftInner> implements RunbookDraft {
    private final AutomationManager manager;
    RunbookDraftImpl(RunbookDraftInner inner, AutomationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public ContentLink draftContentLink() {
        return this.inner().draftContentLink();
    }

    @Override
    public Boolean inEdit() {
        return this.inner().inEdit();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public List<String> outputTypes() {
        return this.inner().outputTypes();
    }

    @Override
    public Map<String, RunbookParameter> parameters() {
        return this.inner().parameters();
    }

}
