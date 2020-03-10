/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Partner Registration update.
 */
public class PartnerRegistrationUpdateParameters {
    /**
     * Name of the partner topic type.
     */
    @JsonProperty(value = "partnerTopicTypeName")
    private String partnerTopicTypeName;

    /**
     * Display name of the partner topic type.
     */
    @JsonProperty(value = "partnerTopicTypeDisplayName")
    private String partnerTopicTypeDisplayName;

    /**
     * Description of the partner topic type.
     */
    @JsonProperty(value = "partnerTopicTypeDescription")
    private String partnerTopicTypeDescription;

    /**
     * URI of the partner website that can be used by Azure customers to setup
     * Event Grid
     * integration on an event source.
     */
    @JsonProperty(value = "setupUri")
    private String setupUri;

    /**
     * URI of the partner logo.
     */
    @JsonProperty(value = "logoUri")
    private String logoUri;

    /**
     * List of IDs of Azure AD applications that are authorized to create a
     * partner namespace
     * associated with this partner registration. This is an optional property.
     * Creating
     * partner namespaces is always permitted under the same Azure subscription
     * as the one used
     * for creating the partner registration.
     */
    @JsonProperty(value = "authorizedAzureSubscriptionIds")
    private List<String> authorizedAzureSubscriptionIds;

    /**
     * Get name of the partner topic type.
     *
     * @return the partnerTopicTypeName value
     */
    public String partnerTopicTypeName() {
        return this.partnerTopicTypeName;
    }

    /**
     * Set name of the partner topic type.
     *
     * @param partnerTopicTypeName the partnerTopicTypeName value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withPartnerTopicTypeName(String partnerTopicTypeName) {
        this.partnerTopicTypeName = partnerTopicTypeName;
        return this;
    }

    /**
     * Get display name of the partner topic type.
     *
     * @return the partnerTopicTypeDisplayName value
     */
    public String partnerTopicTypeDisplayName() {
        return this.partnerTopicTypeDisplayName;
    }

    /**
     * Set display name of the partner topic type.
     *
     * @param partnerTopicTypeDisplayName the partnerTopicTypeDisplayName value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withPartnerTopicTypeDisplayName(String partnerTopicTypeDisplayName) {
        this.partnerTopicTypeDisplayName = partnerTopicTypeDisplayName;
        return this;
    }

    /**
     * Get description of the partner topic type.
     *
     * @return the partnerTopicTypeDescription value
     */
    public String partnerTopicTypeDescription() {
        return this.partnerTopicTypeDescription;
    }

    /**
     * Set description of the partner topic type.
     *
     * @param partnerTopicTypeDescription the partnerTopicTypeDescription value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withPartnerTopicTypeDescription(String partnerTopicTypeDescription) {
        this.partnerTopicTypeDescription = partnerTopicTypeDescription;
        return this;
    }

    /**
     * Get uRI of the partner website that can be used by Azure customers to setup Event Grid
     integration on an event source.
     *
     * @return the setupUri value
     */
    public String setupUri() {
        return this.setupUri;
    }

    /**
     * Set uRI of the partner website that can be used by Azure customers to setup Event Grid
     integration on an event source.
     *
     * @param setupUri the setupUri value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withSetupUri(String setupUri) {
        this.setupUri = setupUri;
        return this;
    }

    /**
     * Get uRI of the partner logo.
     *
     * @return the logoUri value
     */
    public String logoUri() {
        return this.logoUri;
    }

    /**
     * Set uRI of the partner logo.
     *
     * @param logoUri the logoUri value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withLogoUri(String logoUri) {
        this.logoUri = logoUri;
        return this;
    }

    /**
     * Get list of IDs of Azure AD applications that are authorized to create a partner namespace
     associated with this partner registration. This is an optional property. Creating
     partner namespaces is always permitted under the same Azure subscription as the one used
     for creating the partner registration.
     *
     * @return the authorizedAzureSubscriptionIds value
     */
    public List<String> authorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds;
    }

    /**
     * Set list of IDs of Azure AD applications that are authorized to create a partner namespace
     associated with this partner registration. This is an optional property. Creating
     partner namespaces is always permitted under the same Azure subscription as the one used
     for creating the partner registration.
     *
     * @param authorizedAzureSubscriptionIds the authorizedAzureSubscriptionIds value to set
     * @return the PartnerRegistrationUpdateParameters object itself.
     */
    public PartnerRegistrationUpdateParameters withAuthorizedAzureSubscriptionIds(List<String> authorizedAzureSubscriptionIds) {
        this.authorizedAzureSubscriptionIds = authorizedAzureSubscriptionIds;
        return this;
    }

}
