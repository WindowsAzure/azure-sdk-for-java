// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.ApiError;
import com.azure.resourcemanager.compute.generated.models.PatchInstallationDetail;
import com.azure.resourcemanager.compute.generated.models.PatchOperationStatus;
import com.azure.resourcemanager.compute.generated.models.VMGuestPatchRebootStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The result summary of an installation operation. */
@Immutable
public final class VirtualMachineInstallPatchesResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineInstallPatchesResultInner.class);

    /*
     * The overall success or failure status of the operation. It remains
     * "InProgress" until the operation completes. At that point it will become
     * "Failed", "Succeeded", "Unknown" or "CompletedWithWarnings."
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PatchOperationStatus status;

    /*
     * The activity ID of the operation that produced this result. It is used
     * to correlate across CRP and extension logs.
     */
    @JsonProperty(value = "installationActivityId", access = JsonProperty.Access.WRITE_ONLY)
    private String installationActivityId;

    /*
     * The reboot state of the VM following completion of the operation.
     */
    @JsonProperty(value = "rebootStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VMGuestPatchRebootStatus rebootStatus;

    /*
     * Whether the operation ran out of time before it completed all its
     * intended actions.
     */
    @JsonProperty(value = "maintenanceWindowExceeded", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean maintenanceWindowExceeded;

    /*
     * The number of patches that were not installed due to the user blocking
     * their installation.
     */
    @JsonProperty(value = "excludedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer excludedPatchCount;

    /*
     * The number of patches that were detected as available for install, but
     * did not meet the operation's criteria.
     */
    @JsonProperty(value = "notSelectedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer notSelectedPatchCount;

    /*
     * The number of patches that were identified as meeting the installation
     * criteria, but were not able to be installed. Typically this happens when
     * maintenanceWindowExceeded == true.
     */
    @JsonProperty(value = "pendingPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer pendingPatchCount;

    /*
     * The number of patches successfully installed.
     */
    @JsonProperty(value = "installedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer installedPatchCount;

    /*
     * The number of patches that could not be installed due to some issue. See
     * errors for details.
     */
    @JsonProperty(value = "failedPatchCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedPatchCount;

    /*
     * The patches that were installed during the operation.
     */
    @JsonProperty(value = "patches", access = JsonProperty.Access.WRITE_ONLY)
    private List<PatchInstallationDetail> patches;

    /*
     * The UTC timestamp when the operation began.
     */
    @JsonProperty(value = "startDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDateTime;

    /*
     * The errors that were encountered during execution of the operation. The
     * details array contains the list of them.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ApiError error;

    /**
     * Get the status property: The overall success or failure status of the operation. It remains "InProgress" until
     * the operation completes. At that point it will become "Failed", "Succeeded", "Unknown" or
     * "CompletedWithWarnings.".
     *
     * @return the status value.
     */
    public PatchOperationStatus status() {
        return this.status;
    }

    /**
     * Get the installationActivityId property: The activity ID of the operation that produced this result. It is used
     * to correlate across CRP and extension logs.
     *
     * @return the installationActivityId value.
     */
    public String installationActivityId() {
        return this.installationActivityId;
    }

    /**
     * Get the rebootStatus property: The reboot state of the VM following completion of the operation.
     *
     * @return the rebootStatus value.
     */
    public VMGuestPatchRebootStatus rebootStatus() {
        return this.rebootStatus;
    }

    /**
     * Get the maintenanceWindowExceeded property: Whether the operation ran out of time before it completed all its
     * intended actions.
     *
     * @return the maintenanceWindowExceeded value.
     */
    public Boolean maintenanceWindowExceeded() {
        return this.maintenanceWindowExceeded;
    }

    /**
     * Get the excludedPatchCount property: The number of patches that were not installed due to the user blocking their
     * installation.
     *
     * @return the excludedPatchCount value.
     */
    public Integer excludedPatchCount() {
        return this.excludedPatchCount;
    }

    /**
     * Get the notSelectedPatchCount property: The number of patches that were detected as available for install, but
     * did not meet the operation's criteria.
     *
     * @return the notSelectedPatchCount value.
     */
    public Integer notSelectedPatchCount() {
        return this.notSelectedPatchCount;
    }

    /**
     * Get the pendingPatchCount property: The number of patches that were identified as meeting the installation
     * criteria, but were not able to be installed. Typically this happens when maintenanceWindowExceeded == true.
     *
     * @return the pendingPatchCount value.
     */
    public Integer pendingPatchCount() {
        return this.pendingPatchCount;
    }

    /**
     * Get the installedPatchCount property: The number of patches successfully installed.
     *
     * @return the installedPatchCount value.
     */
    public Integer installedPatchCount() {
        return this.installedPatchCount;
    }

    /**
     * Get the failedPatchCount property: The number of patches that could not be installed due to some issue. See
     * errors for details.
     *
     * @return the failedPatchCount value.
     */
    public Integer failedPatchCount() {
        return this.failedPatchCount;
    }

    /**
     * Get the patches property: The patches that were installed during the operation.
     *
     * @return the patches value.
     */
    public List<PatchInstallationDetail> patches() {
        return this.patches;
    }

    /**
     * Get the startDateTime property: The UTC timestamp when the operation began.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the error property: The errors that were encountered during execution of the operation. The details array
     * contains the list of them.
     *
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (patches() != null) {
            patches().forEach(e -> e.validate());
        }
        if (error() != null) {
            error().validate();
        }
    }
}
