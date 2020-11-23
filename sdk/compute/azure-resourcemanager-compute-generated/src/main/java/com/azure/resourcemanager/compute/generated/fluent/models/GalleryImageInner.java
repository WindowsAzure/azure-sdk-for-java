// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.GalleryImagePropertiesProvisioningState;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Specifies information about the gallery image definition that you want to create or update. */
@JsonFlatten
@Fluent
public class GalleryImageInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageInner.class);

    /*
     * The description of this gallery image definition resource. This property
     * is updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The Eula agreement for the gallery image definition.
     */
    @JsonProperty(value = "properties.eula")
    private String eula;

    /*
     * The privacy statement uri.
     */
    @JsonProperty(value = "properties.privacyStatementUri")
    private String privacyStatementUri;

    /*
     * The release note uri.
     */
    @JsonProperty(value = "properties.releaseNoteUri")
    private String releaseNoteUri;

    /*
     * This property allows you to specify the type of the OS that is included
     * in the disk when creating a VM from a managed image. <br><br> Possible
     * values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * This property allows the user to specify whether the virtual machines
     * created under this image are 'Generalized' or 'Specialized'.
     */
    @JsonProperty(value = "properties.osState")
    private OperatingSystemStateTypes osState;

    /*
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     */
    @JsonProperty(value = "properties.hyperVGeneration")
    private HyperVGeneration hyperVGeneration;

    /*
     * A list of gallery image features.
     */
    @JsonProperty(value = "properties.features")
    private List<GalleryImageFeature> features;

    /*
     * The end of life date of the gallery image definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     */
    @JsonProperty(value = "properties.endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /*
     * This is the gallery image definition identifier.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryImageIdentifier identifier;

    /*
     * The properties describe the recommended machine configuration for this
     * Image Definition. These properties are updatable.
     */
    @JsonProperty(value = "properties.recommended")
    private RecommendedMachineConfiguration recommended;

    /*
     * Describes the disallowed disk types.
     */
    @JsonProperty(value = "properties.disallowed")
    private Disallowed disallowed;

    /*
     * Describes the gallery image definition purchase plan. This is used by
     * marketplace images.
     */
    @JsonProperty(value = "properties.purchasePlan")
    private ImagePurchasePlan purchasePlan;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryImagePropertiesProvisioningState provisioningState;

    /**
     * Get the description property: The description of this gallery image definition resource. This property is
     * updatable.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this gallery image definition resource. This property is
     * updatable.
     *
     * @param description the description value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the eula property: The Eula agreement for the gallery image definition.
     *
     * @return the eula value.
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula property: The Eula agreement for the gallery image definition.
     *
     * @param eula the eula value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the privacyStatementUri property: The privacy statement uri.
     *
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacyStatementUri property: The privacy statement uri.
     *
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Get the releaseNoteUri property: The release note uri.
     *
     * @return the releaseNoteUri value.
     */
    public String releaseNoteUri() {
        return this.releaseNoteUri;
    }

    /**
     * Set the releaseNoteUri property: The release note uri.
     *
     * @param releaseNoteUri the releaseNoteUri value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withReleaseNoteUri(String releaseNoteUri) {
        this.releaseNoteUri = releaseNoteUri;
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @param osState the osState value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        this.hyperVGeneration = hyperVGeneration;
        return this;
    }

    /**
     * Get the features property: A list of gallery image features.
     *
     * @return the features value.
     */
    public List<GalleryImageFeature> features() {
        return this.features;
    }

    /**
     * Set the features property: A list of gallery image features.
     *
     * @param features the features value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withFeatures(List<GalleryImageFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the identifier property: This is the gallery image definition identifier.
     *
     * @return the identifier value.
     */
    public GalleryImageIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: This is the gallery image definition identifier.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIdentifier(GalleryImageIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @return the recommended value.
     */
    public RecommendedMachineConfiguration recommended() {
        return this.recommended;
    }

    /**
     * Set the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @param recommended the recommended value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withRecommended(RecommendedMachineConfiguration recommended) {
        this.recommended = recommended;
        return this;
    }

    /**
     * Get the disallowed property: Describes the disallowed disk types.
     *
     * @return the disallowed value.
     */
    public Disallowed disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed property: Describes the disallowed disk types.
     *
     * @param disallowed the disallowed value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDisallowed(Disallowed disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @return the purchasePlan value.
     */
    public ImagePurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryImagePropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (features() != null) {
            features().forEach(e -> e.validate());
        }
        if (identifier() != null) {
            identifier().validate();
        }
        if (recommended() != null) {
            recommended().validate();
        }
        if (disallowed() != null) {
            disallowed().validate();
        }
        if (purchasePlan() != null) {
            purchasePlan().validate();
        }
    }
}
