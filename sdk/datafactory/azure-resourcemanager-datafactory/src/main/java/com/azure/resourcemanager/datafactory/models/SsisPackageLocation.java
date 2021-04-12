// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SSIS package location. */
@JsonFlatten
@Fluent
public class SsisPackageLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisPackageLocation.class);

    /*
     * The SSIS package path. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "packagePath")
    private Object packagePath;

    /*
     * The type of SSIS package location.
     */
    @JsonProperty(value = "type")
    private SsisPackageLocationType type;

    /*
     * Password of the package.
     */
    @JsonProperty(value = "typeProperties.packagePassword")
    private SecretBase packagePassword;

    /*
     * The package access credential.
     */
    @JsonProperty(value = "typeProperties.accessCredential")
    private SsisAccessCredential accessCredential;

    /*
     * The configuration file of the package execution. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.configurationPath")
    private Object configurationPath;

    /*
     * The configuration file access credential.
     */
    @JsonProperty(value = "typeProperties.configurationAccessCredential")
    private SsisAccessCredential configurationAccessCredential;

    /*
     * The package name.
     */
    @JsonProperty(value = "typeProperties.packageName")
    private String packageName;

    /*
     * The embedded package content. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.packageContent")
    private Object packageContent;

    /*
     * The embedded package last modified date.
     */
    @JsonProperty(value = "typeProperties.packageLastModifiedDate")
    private String packageLastModifiedDate;

    /*
     * The embedded child package list.
     */
    @JsonProperty(value = "typeProperties.childPackages")
    private List<SsisChildPackage> childPackages;

    /**
     * Get the packagePath property: The SSIS package path. Type: string (or Expression with resultType string).
     *
     * @return the packagePath value.
     */
    public Object packagePath() {
        return this.packagePath;
    }

    /**
     * Set the packagePath property: The SSIS package path. Type: string (or Expression with resultType string).
     *
     * @param packagePath the packagePath value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get the type property: The type of SSIS package location.
     *
     * @return the type value.
     */
    public SsisPackageLocationType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of SSIS package location.
     *
     * @param type the type value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withType(SsisPackageLocationType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the packagePassword property: Password of the package.
     *
     * @return the packagePassword value.
     */
    public SecretBase packagePassword() {
        return this.packagePassword;
    }

    /**
     * Set the packagePassword property: Password of the package.
     *
     * @param packagePassword the packagePassword value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackagePassword(SecretBase packagePassword) {
        this.packagePassword = packagePassword;
        return this;
    }

    /**
     * Get the accessCredential property: The package access credential.
     *
     * @return the accessCredential value.
     */
    public SsisAccessCredential accessCredential() {
        return this.accessCredential;
    }

    /**
     * Set the accessCredential property: The package access credential.
     *
     * @param accessCredential the accessCredential value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withAccessCredential(SsisAccessCredential accessCredential) {
        this.accessCredential = accessCredential;
        return this;
    }

    /**
     * Get the configurationPath property: The configuration file of the package execution. Type: string (or Expression
     * with resultType string).
     *
     * @return the configurationPath value.
     */
    public Object configurationPath() {
        return this.configurationPath;
    }

    /**
     * Set the configurationPath property: The configuration file of the package execution. Type: string (or Expression
     * with resultType string).
     *
     * @param configurationPath the configurationPath value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withConfigurationPath(Object configurationPath) {
        this.configurationPath = configurationPath;
        return this;
    }

    /**
     * Get the configurationAccessCredential property: The configuration file access credential.
     *
     * @return the configurationAccessCredential value.
     */
    public SsisAccessCredential configurationAccessCredential() {
        return this.configurationAccessCredential;
    }

    /**
     * Set the configurationAccessCredential property: The configuration file access credential.
     *
     * @param configurationAccessCredential the configurationAccessCredential value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withConfigurationAccessCredential(SsisAccessCredential configurationAccessCredential) {
        this.configurationAccessCredential = configurationAccessCredential;
        return this;
    }

    /**
     * Get the packageName property: The package name.
     *
     * @return the packageName value.
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Set the packageName property: The package name.
     *
     * @param packageName the packageName value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get the packageContent property: The embedded package content. Type: string (or Expression with resultType
     * string).
     *
     * @return the packageContent value.
     */
    public Object packageContent() {
        return this.packageContent;
    }

    /**
     * Set the packageContent property: The embedded package content. Type: string (or Expression with resultType
     * string).
     *
     * @param packageContent the packageContent value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageContent(Object packageContent) {
        this.packageContent = packageContent;
        return this;
    }

    /**
     * Get the packageLastModifiedDate property: The embedded package last modified date.
     *
     * @return the packageLastModifiedDate value.
     */
    public String packageLastModifiedDate() {
        return this.packageLastModifiedDate;
    }

    /**
     * Set the packageLastModifiedDate property: The embedded package last modified date.
     *
     * @param packageLastModifiedDate the packageLastModifiedDate value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withPackageLastModifiedDate(String packageLastModifiedDate) {
        this.packageLastModifiedDate = packageLastModifiedDate;
        return this;
    }

    /**
     * Get the childPackages property: The embedded child package list.
     *
     * @return the childPackages value.
     */
    public List<SsisChildPackage> childPackages() {
        return this.childPackages;
    }

    /**
     * Set the childPackages property: The embedded child package list.
     *
     * @param childPackages the childPackages value to set.
     * @return the SsisPackageLocation object itself.
     */
    public SsisPackageLocation withChildPackages(List<SsisChildPackage> childPackages) {
        this.childPackages = childPackages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (packagePassword() != null) {
            packagePassword().validate();
        }
        if (accessCredential() != null) {
            accessCredential().validate();
        }
        if (configurationAccessCredential() != null) {
            configurationAccessCredential().validate();
        }
        if (childPackages() != null) {
            childPackages().forEach(e -> e.validate());
        }
    }
}
