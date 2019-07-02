/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.CustomImage;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.CustomImagePropertiesFromVm;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.CustomImagePropertiesCustom;
import org.joda.time.DateTime;

class CustomImageImpl extends CreatableUpdatableImpl<CustomImage, CustomImageInner, CustomImageImpl> implements CustomImage, CustomImage.Definition, CustomImage.Update {
    private final DevTestLabsManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;

    CustomImageImpl(String name, DevTestLabsManager manager) {
        super(name, new CustomImageInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    CustomImageImpl(CustomImageInner inner, DevTestLabsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "customimages");
        //
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CustomImage> createResourceAsync() {
        CustomImagesInner client = this.manager().inner().customImages();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CustomImage> updateResourceAsync() {
        CustomImagesInner client = this.manager().inner().customImages();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CustomImageInner> getInnerAsync() {
        CustomImagesInner client = this.manager().inner().customImages();
        return client.getAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String author() {
        return this.inner().author();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String managedImageId() {
        return this.inner().managedImageId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
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
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public CustomImagePropertiesCustom vhd() {
        return this.inner().vhd();
    }

    @Override
    public CustomImagePropertiesFromVm vm() {
        return this.inner().vm();
    }

    @Override
    public CustomImageImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public CustomImageImpl withAuthor(String author) {
        this.inner().withAuthor(author);
        return this;
    }

    @Override
    public CustomImageImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public CustomImageImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public CustomImageImpl withManagedImageId(String managedImageId) {
        this.inner().withManagedImageId(managedImageId);
        return this;
    }

    @Override
    public CustomImageImpl withProvisioningState(String provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public CustomImageImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

    @Override
    public CustomImageImpl withUniqueIdentifier(String uniqueIdentifier) {
        this.inner().withUniqueIdentifier(uniqueIdentifier);
        return this;
    }

    @Override
    public CustomImageImpl withVhd(CustomImagePropertiesCustom vhd) {
        this.inner().withVhd(vhd);
        return this;
    }

    @Override
    public CustomImageImpl withVm(CustomImagePropertiesFromVm vm) {
        this.inner().withVm(vm);
        return this;
    }

}
