/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.management.compute.v2019_11_01.GalleryImage;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.compute.v2019_11_01.GalleryImageUpdate;
import java.util.Map;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2019_11_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2019_11_01.OperatingSystemStateTypes;
import com.microsoft.azure.management.compute.v2019_11_01.HyperVGeneration;
import com.microsoft.azure.management.compute.v2019_11_01.GalleryImageIdentifier;
import com.microsoft.azure.management.compute.v2019_11_01.RecommendedMachineConfiguration;
import com.microsoft.azure.management.compute.v2019_11_01.Disallowed;
import com.microsoft.azure.management.compute.v2019_11_01.ImagePurchasePlan;
import rx.functions.Func1;

class GalleryImageImpl extends CreatableUpdatableImpl<GalleryImage, GalleryImageInner, GalleryImageImpl> implements GalleryImage, GalleryImage.Definition, GalleryImage.Update {
    private final ComputeManager manager;
    private String resourceGroupName;
    private String galleryName;
    private String galleryImageName;
    private GalleryImageUpdate updateParameter;

    GalleryImageImpl(String name, ComputeManager manager) {
        super(name, new GalleryImageInner());
        this.manager = manager;
        // Set resource name
        this.galleryImageName = name;
        //
        this.updateParameter = new GalleryImageUpdate();
    }

    GalleryImageImpl(GalleryImageInner inner, ComputeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.galleryImageName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.galleryName = IdParsingUtils.getValueFromIdByName(inner.id(), "galleries");
        this.galleryImageName = IdParsingUtils.getValueFromIdByName(inner.id(), "images");
        //
        this.updateParameter = new GalleryImageUpdate();
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GalleryImage> createResourceAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.createOrUpdateAsync(this.resourceGroupName, this.galleryName, this.galleryImageName, this.inner())
            .map(new Func1<GalleryImageInner, GalleryImageInner>() {
               @Override
               public GalleryImageInner call(GalleryImageInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GalleryImage> updateResourceAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.updateAsync(this.resourceGroupName, this.galleryName, this.galleryImageName, this.updateParameter)
            .map(new Func1<GalleryImageInner, GalleryImageInner>() {
               @Override
               public GalleryImageInner call(GalleryImageInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryImageInner> getInnerAsync() {
        GalleryImagesInner client = this.manager().inner().galleryImages();
        return client.getAsync(this.resourceGroupName, this.galleryName, this.galleryImageName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new GalleryImageUpdate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Disallowed disallowed() {
        return this.inner().disallowed();
    }

    @Override
    public DateTime endOfLifeDate() {
        return this.inner().endOfLifeDate();
    }

    @Override
    public String eula() {
        return this.inner().eula();
    }

    @Override
    public HyperVGeneration hyperVGeneration() {
        return this.inner().hyperVGeneration();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public GalleryImageIdentifier identifier() {
        return this.inner().identifier();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperatingSystemStateTypes osState() {
        return this.inner().osState();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String privacyStatementUri() {
        return this.inner().privacyStatementUri();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ImagePurchasePlan purchasePlan() {
        return this.inner().purchasePlan();
    }

    @Override
    public RecommendedMachineConfiguration recommended() {
        return this.inner().recommended();
    }

    @Override
    public String releaseNoteUri() {
        return this.inner().releaseNoteUri();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GalleryImageImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    @Override
    public GalleryImageImpl withIdentifier(GalleryImageIdentifier identifier) {
        this.inner().withIdentifier(identifier);
        return this;
    }

    @Override
    public GalleryImageImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public GalleryImageImpl withOsState(OperatingSystemStateTypes osState) {
        this.inner().withOsState(osState);
        return this;
    }

    @Override
    public GalleryImageImpl withOsType(OperatingSystemTypes osType) {
        this.inner().withOsType(osType);
        return this;
    }

    @Override
    public GalleryImageImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withDisallowed(Disallowed disallowed) {
        if (isInCreateMode()) {
            this.inner().withDisallowed(disallowed);
        } else {
            this.updateParameter.withDisallowed(disallowed);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withEndOfLifeDate(DateTime endOfLifeDate) {
        if (isInCreateMode()) {
            this.inner().withEndOfLifeDate(endOfLifeDate);
        } else {
            this.updateParameter.withEndOfLifeDate(endOfLifeDate);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withEula(String eula) {
        if (isInCreateMode()) {
            this.inner().withEula(eula);
        } else {
            this.updateParameter.withEula(eula);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (isInCreateMode()) {
            this.inner().withHyperVGeneration(hyperVGeneration);
        } else {
            this.updateParameter.withHyperVGeneration(hyperVGeneration);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withPrivacyStatementUri(String privacyStatementUri) {
        if (isInCreateMode()) {
            this.inner().withPrivacyStatementUri(privacyStatementUri);
        } else {
            this.updateParameter.withPrivacyStatementUri(privacyStatementUri);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withPurchasePlan(ImagePurchasePlan purchasePlan) {
        if (isInCreateMode()) {
            this.inner().withPurchasePlan(purchasePlan);
        } else {
            this.updateParameter.withPurchasePlan(purchasePlan);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withRecommended(RecommendedMachineConfiguration recommended) {
        if (isInCreateMode()) {
            this.inner().withRecommended(recommended);
        } else {
            this.updateParameter.withRecommended(recommended);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withReleaseNoteUri(String releaseNoteUri) {
        if (isInCreateMode()) {
            this.inner().withReleaseNoteUri(releaseNoteUri);
        } else {
            this.updateParameter.withReleaseNoteUri(releaseNoteUri);
        }
        return this;
    }

    @Override
    public GalleryImageImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
