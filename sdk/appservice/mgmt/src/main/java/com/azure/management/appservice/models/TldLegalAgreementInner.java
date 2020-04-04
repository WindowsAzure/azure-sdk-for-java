// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TldLegalAgreement model.
 */
@Fluent
public final class TldLegalAgreementInner {
    /*
     * Unique identifier for the agreement.
     */
    @JsonProperty(value = "agreementKey", required = true)
    private String agreementKey;

    /*
     * Agreement title.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /*
     * Agreement details.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * URL where a copy of the agreement details is hosted.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the agreementKey property: Unique identifier for the agreement.
     * 
     * @return the agreementKey value.
     */
    public String agreementKey() {
        return this.agreementKey;
    }

    /**
     * Set the agreementKey property: Unique identifier for the agreement.
     * 
     * @param agreementKey the agreementKey value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withAgreementKey(String agreementKey) {
        this.agreementKey = agreementKey;
        return this;
    }

    /**
     * Get the title property: Agreement title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Agreement title.
     * 
     * @param title the title value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: Agreement details.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: Agreement details.
     * 
     * @param content the content value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the url property: URL where a copy of the agreement details is
     * hosted.
     * 
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: URL where a copy of the agreement details is
     * hosted.
     * 
     * @param url the url value to set.
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withUrl(String url) {
        this.url = url;
        return this;
    }
}
