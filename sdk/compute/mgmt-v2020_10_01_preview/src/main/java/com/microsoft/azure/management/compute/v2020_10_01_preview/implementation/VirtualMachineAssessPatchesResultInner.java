/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.PatchOperationStatus;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineSoftwarePatchProperties;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ApiError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of an AssessPatches result.
 */
public class VirtualMachineAssessPatchesResultInner {
    /**
     * The overall success or failure status of the operation. It remains
     * "InProgress" until the operation completes. At that point it will become
     * "Failed", "Succeeded", or "CompletedWithWarnings.". Possible values
     * include: 'InProgress', 'Failed', 'Succeeded', 'CompletedWithWarnings'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PatchOperationStatus status;

    /**
     * The activity ID of the operation that produced this result. It is used
     * to correlate across CRP and extension logs.
     */
    @JsonProperty(value = "assessmentActivityId", access = JsonProperty.Access.WRITE_ONLY)
    private String assessmentActivityId;

    /**
     * The overall reboot status of the VM. It will be true when partially
     * installed patches require a reboot to complete installation but the
     * reboot has not yet occurred.
     */
    @JsonProperty(value = "rebootPending", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean rebootPending;

    /**
     * The number of critical or security patches that have been detected as
     * available and not yet installed.
     */
    @JsonProperty(value = "criticalAndSecurityPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer criticalAndSecurityPatchCount;

    /**
     * The number of all available patches excluding critical and security.
     */
    @JsonProperty(value = "otherPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer otherPatchCount;

    /**
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "startDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startDateTime;

    /**
     * The list of patches that have been detected as available for
     * installation.
     */
    @JsonProperty(value = "patches", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineSoftwarePatchProperties> patches;

    /**
     * The errors that were encountered during execution of the operation. The
     * details array contains the list of them.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Failed", "Succeeded", or "CompletedWithWarnings.". Possible values include: 'InProgress', 'Failed', 'Succeeded', 'CompletedWithWarnings'.
     *
     * @return the status value
     */
    public PatchOperationStatus status() {
        return this.status;
    }

    /**
     * Get the activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     *
     * @return the assessmentActivityId value
     */
    public String assessmentActivityId() {
        return this.assessmentActivityId;
    }

    /**
     * Get the overall reboot status of the VM. It will be true when partially installed patches require a reboot to complete installation but the reboot has not yet occurred.
     *
     * @return the rebootPending value
     */
    public Boolean rebootPending() {
        return this.rebootPending;
    }

    /**
     * Get the number of critical or security patches that have been detected as available and not yet installed.
     *
     * @return the criticalAndSecurityPatchCount value
     */
    public Integer criticalAndSecurityPatchCount() {
        return this.criticalAndSecurityPatchCount;
    }

    /**
     * Get the number of all available patches excluding critical and security.
     *
     * @return the otherPatchCount value
     */
    public Integer otherPatchCount() {
        return this.otherPatchCount;
    }

    /**
     * Get the UTC timestamp when the operation began.
     *
     * @return the startDateTime value
     */
    public DateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the list of patches that have been detected as available for installation.
     *
     * @return the patches value
     */
    public List<VirtualMachineSoftwarePatchProperties> patches() {
        return this.patches;
    }

    /**
     * Get the errors that were encountered during execution of the operation. The details array contains the list of them.
     *
     * @return the error value
     */
    public ApiError error() {
        return this.error;
    }

}
