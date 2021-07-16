// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The data controller properties. */
@Fluent
public final class DataControllerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataControllerProperties.class);

    /*
     * The infrastructure the data controller is running on.
     */
    @JsonProperty(value = "infrastructure")
    private Infrastructure infrastructure;

    /*
     * Properties from the Kubernetes data controller
     */
    @JsonProperty(value = "onPremiseProperty")
    private OnPremiseProperty onPremiseProperty;

    /*
     * The raw kubernetes information
     */
    @JsonProperty(value = "k8sRaw")
    private Object k8SRaw;

    /*
     * Properties on upload watermark.  Mostly timestamp for each upload data
     * type
     */
    @JsonProperty(value = "uploadWatermark")
    private UploadWatermark uploadWatermark;

    /*
     * Last uploaded date from Kubernetes cluster. Defaults to current date
     * time
     */
    @JsonProperty(value = "lastUploadedDate")
    private OffsetDateTime lastUploadedDate;

    /*
     * Username and password for basic login authentication.
     */
    @JsonProperty(value = "basicLoginInformation")
    private BasicLoginInformation basicLoginInformation;

    /*
     * Log analytics workspace id and primary key
     */
    @JsonProperty(value = "logAnalyticsWorkspaceConfig")
    private LogAnalyticsWorkspaceConfig logAnalyticsWorkspaceConfig;

    /*
     * Service principal for uploading billing, metrics and logs.
     */
    @JsonProperty(value = "uploadServicePrincipal")
    private UploadServicePrincipal uploadServicePrincipal;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * If a CustomLocation is provided, this contains the ARM id of the
     * connected cluster the custom location belongs to.
     */
    @JsonProperty(value = "clusterId")
    private String clusterId;

    /*
     * If a CustomLocation is provided, this contains the ARM id of the
     * extension the custom location belongs to.
     */
    @JsonProperty(value = "extensionId")
    private String extensionId;

    /**
     * Get the infrastructure property: The infrastructure the data controller is running on.
     *
     * @return the infrastructure value.
     */
    public Infrastructure infrastructure() {
        return this.infrastructure;
    }

    /**
     * Set the infrastructure property: The infrastructure the data controller is running on.
     *
     * @param infrastructure the infrastructure value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withInfrastructure(Infrastructure infrastructure) {
        this.infrastructure = infrastructure;
        return this;
    }

    /**
     * Get the onPremiseProperty property: Properties from the Kubernetes data controller.
     *
     * @return the onPremiseProperty value.
     */
    public OnPremiseProperty onPremiseProperty() {
        return this.onPremiseProperty;
    }

    /**
     * Set the onPremiseProperty property: Properties from the Kubernetes data controller.
     *
     * @param onPremiseProperty the onPremiseProperty value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withOnPremiseProperty(OnPremiseProperty onPremiseProperty) {
        this.onPremiseProperty = onPremiseProperty;
        return this;
    }

    /**
     * Get the k8SRaw property: The raw kubernetes information.
     *
     * @return the k8SRaw value.
     */
    public Object k8SRaw() {
        return this.k8SRaw;
    }

    /**
     * Set the k8SRaw property: The raw kubernetes information.
     *
     * @param k8SRaw the k8SRaw value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withK8SRaw(Object k8SRaw) {
        this.k8SRaw = k8SRaw;
        return this;
    }

    /**
     * Get the uploadWatermark property: Properties on upload watermark. Mostly timestamp for each upload data type.
     *
     * @return the uploadWatermark value.
     */
    public UploadWatermark uploadWatermark() {
        return this.uploadWatermark;
    }

    /**
     * Set the uploadWatermark property: Properties on upload watermark. Mostly timestamp for each upload data type.
     *
     * @param uploadWatermark the uploadWatermark value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withUploadWatermark(UploadWatermark uploadWatermark) {
        this.uploadWatermark = uploadWatermark;
        return this;
    }

    /**
     * Get the lastUploadedDate property: Last uploaded date from Kubernetes cluster. Defaults to current date time.
     *
     * @return the lastUploadedDate value.
     */
    public OffsetDateTime lastUploadedDate() {
        return this.lastUploadedDate;
    }

    /**
     * Set the lastUploadedDate property: Last uploaded date from Kubernetes cluster. Defaults to current date time.
     *
     * @param lastUploadedDate the lastUploadedDate value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withLastUploadedDate(OffsetDateTime lastUploadedDate) {
        this.lastUploadedDate = lastUploadedDate;
        return this;
    }

    /**
     * Get the basicLoginInformation property: Username and password for basic login authentication.
     *
     * @return the basicLoginInformation value.
     */
    public BasicLoginInformation basicLoginInformation() {
        return this.basicLoginInformation;
    }

    /**
     * Set the basicLoginInformation property: Username and password for basic login authentication.
     *
     * @param basicLoginInformation the basicLoginInformation value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withBasicLoginInformation(BasicLoginInformation basicLoginInformation) {
        this.basicLoginInformation = basicLoginInformation;
        return this;
    }

    /**
     * Get the logAnalyticsWorkspaceConfig property: Log analytics workspace id and primary key.
     *
     * @return the logAnalyticsWorkspaceConfig value.
     */
    public LogAnalyticsWorkspaceConfig logAnalyticsWorkspaceConfig() {
        return this.logAnalyticsWorkspaceConfig;
    }

    /**
     * Set the logAnalyticsWorkspaceConfig property: Log analytics workspace id and primary key.
     *
     * @param logAnalyticsWorkspaceConfig the logAnalyticsWorkspaceConfig value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withLogAnalyticsWorkspaceConfig(
        LogAnalyticsWorkspaceConfig logAnalyticsWorkspaceConfig) {
        this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
        return this;
    }

    /**
     * Get the uploadServicePrincipal property: Service principal for uploading billing, metrics and logs.
     *
     * @return the uploadServicePrincipal value.
     */
    public UploadServicePrincipal uploadServicePrincipal() {
        return this.uploadServicePrincipal;
    }

    /**
     * Set the uploadServicePrincipal property: Service principal for uploading billing, metrics and logs.
     *
     * @param uploadServicePrincipal the uploadServicePrincipal value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withUploadServicePrincipal(UploadServicePrincipal uploadServicePrincipal) {
        this.uploadServicePrincipal = uploadServicePrincipal;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the clusterId property: If a CustomLocation is provided, this contains the ARM id of the connected cluster
     * the custom location belongs to.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: If a CustomLocation is provided, this contains the ARM id of the connected cluster
     * the custom location belongs to.
     *
     * @param clusterId the clusterId value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the extensionId property: If a CustomLocation is provided, this contains the ARM id of the extension the
     * custom location belongs to.
     *
     * @return the extensionId value.
     */
    public String extensionId() {
        return this.extensionId;
    }

    /**
     * Set the extensionId property: If a CustomLocation is provided, this contains the ARM id of the extension the
     * custom location belongs to.
     *
     * @param extensionId the extensionId value to set.
     * @return the DataControllerProperties object itself.
     */
    public DataControllerProperties withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (onPremiseProperty() != null) {
            onPremiseProperty().validate();
        }
        if (uploadWatermark() != null) {
            uploadWatermark().validate();
        }
        if (basicLoginInformation() != null) {
            basicLoginInformation().validate();
        }
        if (logAnalyticsWorkspaceConfig() != null) {
            logAnalyticsWorkspaceConfig().validate();
        }
        if (uploadServicePrincipal() != null) {
            uploadServicePrincipal().validate();
        }
    }
}
