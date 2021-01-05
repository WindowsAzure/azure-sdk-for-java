// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineAssessPatchesResultInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of VirtualMachineAssessPatchesResult. */
public interface VirtualMachineAssessPatchesResult {
    /**
     * Gets the status property: The overall success or failure status of the operation. It remains "InProgress" until
     * the operation completes. At that point it will become "Failed", "Succeeded", or "CompletedWithWarnings.".
     *
     * @return the status value.
     */
    PatchOperationStatus status();

    /**
     * Gets the assessmentActivityId property: The activity ID of the operation that produced this result. It is used to
     * correlate across CRP and extension logs.
     *
     * @return the assessmentActivityId value.
     */
    String assessmentActivityId();

    /**
     * Gets the rebootPending property: The overall reboot status of the VM. It will be true when partially installed
     * patches require a reboot to complete installation but the reboot has not yet occurred.
     *
     * @return the rebootPending value.
     */
    Boolean rebootPending();

    /**
     * Gets the criticalAndSecurityPatchCount property: The number of critical or security patches that have been
     * detected as available and not yet installed.
     *
     * @return the criticalAndSecurityPatchCount value.
     */
    Integer criticalAndSecurityPatchCount();

    /**
     * Gets the otherPatchCount property: The number of all available patches excluding critical and security.
     *
     * @return the otherPatchCount value.
     */
    Integer otherPatchCount();

    /**
     * Gets the startDateTime property: The UTC timestamp when the operation began.
     *
     * @return the startDateTime value.
     */
    OffsetDateTime startDateTime();

    /**
     * Gets the patches property: The list of patches that have been detected as available for installation.
     *
     * @return the patches value.
     */
    List<VirtualMachineSoftwarePatchProperties> patches();

    /**
     * Gets the error property: The errors that were encountered during execution of the operation. The details array
     * contains the list of them.
     *
     * @return the error value.
     */
    ApiError error();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineAssessPatchesResultInner
     * object.
     *
     * @return the inner object.
     */
    VirtualMachineAssessPatchesResultInner innerModel();
}
