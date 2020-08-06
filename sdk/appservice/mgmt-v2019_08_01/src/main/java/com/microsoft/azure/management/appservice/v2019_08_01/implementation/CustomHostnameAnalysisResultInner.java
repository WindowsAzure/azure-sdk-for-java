/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.management.appservice.v2019_08_01.DnsVerificationTestResult;
import com.microsoft.azure.management.appservice.v2019_08_01.ErrorEntity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Custom domain analysis.
 */
@JsonFlatten
public class CustomHostnameAnalysisResultInner extends ProxyOnlyResource {
    /**
     * &lt;code&gt;true&lt;/code&gt; if hostname is already verified;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.isHostnameAlreadyVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isHostnameAlreadyVerified;

    /**
     * DNS verification test result. Possible values include: 'Passed',
     * 'Failed', 'Skipped'.
     */
    @JsonProperty(value = "properties.customDomainVerificationTest", access = JsonProperty.Access.WRITE_ONLY)
    private DnsVerificationTestResult customDomainVerificationTest;

    /**
     * Raw failure information if DNS verification fails.
     */
    @JsonProperty(value = "properties.customDomainVerificationFailureInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorEntity customDomainVerificationFailureInfo;

    /**
     * &lt;code&gt;true&lt;/code&gt; if there is a conflict on a scale unit;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.hasConflictOnScaleUnit", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasConflictOnScaleUnit;

    /**
     * &lt;code&gt;true&lt;/code&gt; if there is a conflict across
     * subscriptions; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.hasConflictAcrossSubscription", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasConflictAcrossSubscription;

    /**
     * Name of the conflicting app on scale unit if it's within the same
     * subscription.
     */
    @JsonProperty(value = "properties.conflictingAppResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String conflictingAppResourceId;

    /**
     * CName records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.cNameRecords")
    private List<String> cNameRecords;

    /**
     * TXT records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.txtRecords")
    private List<String> txtRecords;

    /**
     * A records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.aRecords")
    private List<String> aRecords;

    /**
     * Alternate CName records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.alternateCNameRecords")
    private List<String> alternateCNameRecords;

    /**
     * Alternate TXT records controller can see for this hostname.
     */
    @JsonProperty(value = "properties.alternateTxtRecords")
    private List<String> alternateTxtRecords;

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if hostname is already verified; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isHostnameAlreadyVerified value
     */
    public Boolean isHostnameAlreadyVerified() {
        return this.isHostnameAlreadyVerified;
    }

    /**
     * Get dNS verification test result. Possible values include: 'Passed', 'Failed', 'Skipped'.
     *
     * @return the customDomainVerificationTest value
     */
    public DnsVerificationTestResult customDomainVerificationTest() {
        return this.customDomainVerificationTest;
    }

    /**
     * Get raw failure information if DNS verification fails.
     *
     * @return the customDomainVerificationFailureInfo value
     */
    public ErrorEntity customDomainVerificationFailureInfo() {
        return this.customDomainVerificationFailureInfo;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if there is a conflict on a scale unit; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the hasConflictOnScaleUnit value
     */
    public Boolean hasConflictOnScaleUnit() {
        return this.hasConflictOnScaleUnit;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if there is a conflict across subscriptions; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the hasConflictAcrossSubscription value
     */
    public Boolean hasConflictAcrossSubscription() {
        return this.hasConflictAcrossSubscription;
    }

    /**
     * Get name of the conflicting app on scale unit if it's within the same subscription.
     *
     * @return the conflictingAppResourceId value
     */
    public String conflictingAppResourceId() {
        return this.conflictingAppResourceId;
    }

    /**
     * Get cName records controller can see for this hostname.
     *
     * @return the cNameRecords value
     */
    public List<String> cNameRecords() {
        return this.cNameRecords;
    }

    /**
     * Set cName records controller can see for this hostname.
     *
     * @param cNameRecords the cNameRecords value to set
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withCNameRecords(List<String> cNameRecords) {
        this.cNameRecords = cNameRecords;
        return this;
    }

    /**
     * Get tXT records controller can see for this hostname.
     *
     * @return the txtRecords value
     */
    public List<String> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set tXT records controller can see for this hostname.
     *
     * @param txtRecords the txtRecords value to set
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withTxtRecords(List<String> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

    /**
     * Get a records controller can see for this hostname.
     *
     * @return the aRecords value
     */
    public List<String> aRecords() {
        return this.aRecords;
    }

    /**
     * Set a records controller can see for this hostname.
     *
     * @param aRecords the aRecords value to set
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withARecords(List<String> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get alternate CName records controller can see for this hostname.
     *
     * @return the alternateCNameRecords value
     */
    public List<String> alternateCNameRecords() {
        return this.alternateCNameRecords;
    }

    /**
     * Set alternate CName records controller can see for this hostname.
     *
     * @param alternateCNameRecords the alternateCNameRecords value to set
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateCNameRecords(List<String> alternateCNameRecords) {
        this.alternateCNameRecords = alternateCNameRecords;
        return this;
    }

    /**
     * Get alternate TXT records controller can see for this hostname.
     *
     * @return the alternateTxtRecords value
     */
    public List<String> alternateTxtRecords() {
        return this.alternateTxtRecords;
    }

    /**
     * Set alternate TXT records controller can see for this hostname.
     *
     * @param alternateTxtRecords the alternateTxtRecords value to set
     * @return the CustomHostnameAnalysisResultInner object itself.
     */
    public CustomHostnameAnalysisResultInner withAlternateTxtRecords(List<String> alternateTxtRecords) {
        this.alternateTxtRecords = alternateTxtRecords;
        return this;
    }

}
