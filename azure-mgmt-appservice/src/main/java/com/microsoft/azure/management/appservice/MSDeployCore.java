/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MSDeploy ARM PUT core information.
 */
public class MSDeployCore {
    /**
     * Package URI.
     */
    @JsonProperty(value = "packageUri")
    private String packageUri;

    /**
     * SQL Connection String.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /**
     * Database Type.
     */
    @JsonProperty(value = "dbType")
    private String dbType;

    /**
     * URI of MSDeploy Parameters file. Must not be set if SetParameters is
     * used.
     */
    @JsonProperty(value = "setParametersXmlFileUri")
    private String setParametersXmlFileUri;

    /**
     * MSDeploy Parameters. Must not be set if SetParametersXmlFileUri is used.
     */
    @JsonProperty(value = "setParameters")
    private List<MSDeployParameterEntry> setParameters;

    /**
     * Controls whether the MSDeploy operation skips the AppData directory. If
     * set to true, the existing AppData directory on the destination will not
     * be deleted and overwritten.
     */
    @JsonProperty(value = "skipAppData")
    private Boolean skipAppData;

    /**
     * Sets the AppOffline rule while the MSDeploy operation executes.
     */
    @JsonProperty(value = "appOffline")
    private Boolean appOffline;

    /**
     * Get the packageUri value.
     *
     * @return the packageUri value
     */
    public String packageUri() {
        return this.packageUri;
    }

    /**
     * Set the packageUri value.
     *
     * @param packageUri the packageUri value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withPackageUri(String packageUri) {
        this.packageUri = packageUri;
        return this;
    }

    /**
     * Get the connectionString value.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString value.
     *
     * @param connectionString the connectionString value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the dbType value.
     *
     * @return the dbType value
     */
    public String dbType() {
        return this.dbType;
    }

    /**
     * Set the dbType value.
     *
     * @param dbType the dbType value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * Get the setParametersXmlFileUri value.
     *
     * @return the setParametersXmlFileUri value
     */
    public String setParametersXmlFileUri() {
        return this.setParametersXmlFileUri;
    }

    /**
     * Set the setParametersXmlFileUri value.
     *
     * @param setParametersXmlFileUri the setParametersXmlFileUri value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withSetParametersXmlFileUri(String setParametersXmlFileUri) {
        this.setParametersXmlFileUri = setParametersXmlFileUri;
        return this;
    }

    /**
     * Get the setParameters value.
     *
     * @return the setParameters value
     */
    public List<MSDeployParameterEntry> setParameters() {
        return this.setParameters;
    }

    /**
     * Set the setParameters value.
     *
     * @param setParameters the setParameters value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withSetParameters(List<MSDeployParameterEntry> setParameters) {
        this.setParameters = setParameters;
        return this;
    }

    /**
     * Get the skipAppData value.
     *
     * @return the skipAppData value
     */
    public Boolean skipAppData() {
        return this.skipAppData;
    }

    /**
     * Set the skipAppData value.
     *
     * @param skipAppData the skipAppData value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withSkipAppData(Boolean skipAppData) {
        this.skipAppData = skipAppData;
        return this;
    }

    /**
     * Get the appOffline value.
     *
     * @return the appOffline value
     */
    public Boolean appOffline() {
        return this.appOffline;
    }

    /**
     * Set the appOffline value.
     *
     * @param appOffline the appOffline value to set
     * @return the MSDeployCore object itself.
     */
    public MSDeployCore withAppOffline(Boolean appOffline) {
        this.appOffline = appOffline;
        return this;
    }

}
