/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * Used for getting PHP error logging flag.
 */
@JsonFlatten
public class SitePhpErrorLogFlagInner extends ProxyOnlyResource {
    /**
     * Local log_errors setting.
     */
    @JsonProperty(value = "properties.localLogErrors")
    private String localLogErrors;

    /**
     * Master log_errors setting.
     */
    @JsonProperty(value = "properties.masterLogErrors")
    private String masterLogErrors;

    /**
     * Local log_errors_max_len setting.
     */
    @JsonProperty(value = "properties.localLogErrorsMaxLength")
    private String localLogErrorsMaxLength;

    /**
     * Master log_errors_max_len setting.
     */
    @JsonProperty(value = "properties.masterLogErrorsMaxLength")
    private String masterLogErrorsMaxLength;

    /**
     * Get the localLogErrors value.
     *
     * @return the localLogErrors value
     */
    public String localLogErrors() {
        return this.localLogErrors;
    }

    /**
     * Set the localLogErrors value.
     *
     * @param localLogErrors the localLogErrors value to set
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrors(String localLogErrors) {
        this.localLogErrors = localLogErrors;
        return this;
    }

    /**
     * Get the masterLogErrors value.
     *
     * @return the masterLogErrors value
     */
    public String masterLogErrors() {
        return this.masterLogErrors;
    }

    /**
     * Set the masterLogErrors value.
     *
     * @param masterLogErrors the masterLogErrors value to set
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrors(String masterLogErrors) {
        this.masterLogErrors = masterLogErrors;
        return this;
    }

    /**
     * Get the localLogErrorsMaxLength value.
     *
     * @return the localLogErrorsMaxLength value
     */
    public String localLogErrorsMaxLength() {
        return this.localLogErrorsMaxLength;
    }

    /**
     * Set the localLogErrorsMaxLength value.
     *
     * @param localLogErrorsMaxLength the localLogErrorsMaxLength value to set
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withLocalLogErrorsMaxLength(String localLogErrorsMaxLength) {
        this.localLogErrorsMaxLength = localLogErrorsMaxLength;
        return this;
    }

    /**
     * Get the masterLogErrorsMaxLength value.
     *
     * @return the masterLogErrorsMaxLength value
     */
    public String masterLogErrorsMaxLength() {
        return this.masterLogErrorsMaxLength;
    }

    /**
     * Set the masterLogErrorsMaxLength value.
     *
     * @param masterLogErrorsMaxLength the masterLogErrorsMaxLength value to set
     * @return the SitePhpErrorLogFlagInner object itself.
     */
    public SitePhpErrorLogFlagInner withMasterLogErrorsMaxLength(String masterLogErrorsMaxLength) {
        this.masterLogErrorsMaxLength = masterLogErrorsMaxLength;
        return this;
    }

}
