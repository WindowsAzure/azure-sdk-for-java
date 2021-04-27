// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Compliance summary on a particular summary level. */
@Fluent
public final class SummaryResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SummaryResults.class);

    /*
     * HTTP POST URI for queryResults action on Microsoft.PolicyInsights to
     * retrieve raw results for the compliance summary. This property will not
     * be available by default in future API versions, but could be queried
     * explicitly.
     */
    @JsonProperty(value = "queryResultsUri")
    private String queryResultsUri;

    /*
     * Number of non-compliant resources.
     */
    @JsonProperty(value = "nonCompliantResources")
    private Integer nonCompliantResources;

    /*
     * Number of non-compliant policies.
     */
    @JsonProperty(value = "nonCompliantPolicies")
    private Integer nonCompliantPolicies;

    /*
     * The resources summary at this level.
     */
    @JsonProperty(value = "resourceDetails")
    private List<ComplianceDetail> resourceDetails;

    /*
     * The policy artifact summary at this level. For query scope level, it
     * represents policy assignment summary. For policy assignment level, it
     * represents policy definitions summary.
     */
    @JsonProperty(value = "policyDetails")
    private List<ComplianceDetail> policyDetails;

    /*
     * The policy definition group summary at this level.
     */
    @JsonProperty(value = "policyGroupDetails")
    private List<ComplianceDetail> policyGroupDetails;

    /**
     * Get the queryResultsUri property: HTTP POST URI for queryResults action on Microsoft.PolicyInsights to retrieve
     * raw results for the compliance summary. This property will not be available by default in future API versions,
     * but could be queried explicitly.
     *
     * @return the queryResultsUri value.
     */
    public String queryResultsUri() {
        return this.queryResultsUri;
    }

    /**
     * Set the queryResultsUri property: HTTP POST URI for queryResults action on Microsoft.PolicyInsights to retrieve
     * raw results for the compliance summary. This property will not be available by default in future API versions,
     * but could be queried explicitly.
     *
     * @param queryResultsUri the queryResultsUri value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withQueryResultsUri(String queryResultsUri) {
        this.queryResultsUri = queryResultsUri;
        return this;
    }

    /**
     * Get the nonCompliantResources property: Number of non-compliant resources.
     *
     * @return the nonCompliantResources value.
     */
    public Integer nonCompliantResources() {
        return this.nonCompliantResources;
    }

    /**
     * Set the nonCompliantResources property: Number of non-compliant resources.
     *
     * @param nonCompliantResources the nonCompliantResources value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withNonCompliantResources(Integer nonCompliantResources) {
        this.nonCompliantResources = nonCompliantResources;
        return this;
    }

    /**
     * Get the nonCompliantPolicies property: Number of non-compliant policies.
     *
     * @return the nonCompliantPolicies value.
     */
    public Integer nonCompliantPolicies() {
        return this.nonCompliantPolicies;
    }

    /**
     * Set the nonCompliantPolicies property: Number of non-compliant policies.
     *
     * @param nonCompliantPolicies the nonCompliantPolicies value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withNonCompliantPolicies(Integer nonCompliantPolicies) {
        this.nonCompliantPolicies = nonCompliantPolicies;
        return this;
    }

    /**
     * Get the resourceDetails property: The resources summary at this level.
     *
     * @return the resourceDetails value.
     */
    public List<ComplianceDetail> resourceDetails() {
        return this.resourceDetails;
    }

    /**
     * Set the resourceDetails property: The resources summary at this level.
     *
     * @param resourceDetails the resourceDetails value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withResourceDetails(List<ComplianceDetail> resourceDetails) {
        this.resourceDetails = resourceDetails;
        return this;
    }

    /**
     * Get the policyDetails property: The policy artifact summary at this level. For query scope level, it represents
     * policy assignment summary. For policy assignment level, it represents policy definitions summary.
     *
     * @return the policyDetails value.
     */
    public List<ComplianceDetail> policyDetails() {
        return this.policyDetails;
    }

    /**
     * Set the policyDetails property: The policy artifact summary at this level. For query scope level, it represents
     * policy assignment summary. For policy assignment level, it represents policy definitions summary.
     *
     * @param policyDetails the policyDetails value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withPolicyDetails(List<ComplianceDetail> policyDetails) {
        this.policyDetails = policyDetails;
        return this;
    }

    /**
     * Get the policyGroupDetails property: The policy definition group summary at this level.
     *
     * @return the policyGroupDetails value.
     */
    public List<ComplianceDetail> policyGroupDetails() {
        return this.policyGroupDetails;
    }

    /**
     * Set the policyGroupDetails property: The policy definition group summary at this level.
     *
     * @param policyGroupDetails the policyGroupDetails value to set.
     * @return the SummaryResults object itself.
     */
    public SummaryResults withPolicyGroupDetails(List<ComplianceDetail> policyGroupDetails) {
        this.policyGroupDetails = policyGroupDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceDetails() != null) {
            resourceDetails().forEach(e -> e.validate());
        }
        if (policyDetails() != null) {
            policyDetails().forEach(e -> e.validate());
        }
        if (policyGroupDetails() != null) {
            policyGroupDetails().forEach(e -> e.validate());
        }
    }
}
