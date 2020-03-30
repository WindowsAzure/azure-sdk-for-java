/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ValidationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response contract for enable backup validation request.
 */
public class PreValidateEnableBackupResponseInner {
    /**
     * Validation Status. Possible values include: 'Invalid', 'Succeeded',
     * 'Failed'.
     */
    @JsonProperty(value = "status")
    private ValidationStatus status;

    /**
     * Response error code.
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /**
     * Response error message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Recommended action for user.
     */
    @JsonProperty(value = "recommendation")
    private String recommendation;

    /**
     * Specifies the product specific container name. E.g.
     * iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is required
     * for portal.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /**
     * Specifies the product specific ds name. E.g.
     * vm;iaasvmcontainer;rgname;vmname. This is required for portal.
     */
    @JsonProperty(value = "protectedItemName")
    private String protectedItemName;

    /**
     * Get validation Status. Possible values include: 'Invalid', 'Succeeded', 'Failed'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

    /**
     * Set validation Status. Possible values include: 'Invalid', 'Succeeded', 'Failed'.
     *
     * @param status the status value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withStatus(ValidationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get response error code.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set response error code.
     *
     * @param errorCode the errorCode value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get response error message.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set response error message.
     *
     * @param errorMessage the errorMessage value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get recommended action for user.
     *
     * @return the recommendation value
     */
    public String recommendation() {
        return this.recommendation;
    }

    /**
     * Set recommended action for user.
     *
     * @param recommendation the recommendation value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withRecommendation(String recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    /**
     * Get specifies the product specific container name. E.g. iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is required
     for portal.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set specifies the product specific container name. E.g. iaasvmcontainer;iaasvmcontainer;rgname;vmname. This is required
     for portal.
     *
     * @param containerName the containerName value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get specifies the product specific ds name. E.g. vm;iaasvmcontainer;rgname;vmname. This is required for portal.
     *
     * @return the protectedItemName value
     */
    public String protectedItemName() {
        return this.protectedItemName;
    }

    /**
     * Set specifies the product specific ds name. E.g. vm;iaasvmcontainer;rgname;vmname. This is required for portal.
     *
     * @param protectedItemName the protectedItemName value to set
     * @return the PreValidateEnableBackupResponseInner object itself.
     */
    public PreValidateEnableBackupResponseInner withProtectedItemName(String protectedItemName) {
        this.protectedItemName = protectedItemName;
        return this;
    }

}
