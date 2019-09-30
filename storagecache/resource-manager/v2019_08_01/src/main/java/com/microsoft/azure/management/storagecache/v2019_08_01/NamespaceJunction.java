/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A namespace junction.
 */
public class NamespaceJunction {
    /**
     * Namespace path on a cache for a storage target.
     */
    @JsonProperty(value = "namespacePath")
    private String namespacePath;

    /**
     * Path in storage target to which namespacePath points.
     */
    @JsonProperty(value = "targetPath")
    private String targetPath;

    /**
     * NFS export where targetPath exists.
     */
    @JsonProperty(value = "nfsExport")
    private String nfsExport;

    /**
     * Get namespace path on a cache for a storage target.
     *
     * @return the namespacePath value
     */
    public String namespacePath() {
        return this.namespacePath;
    }

    /**
     * Set namespace path on a cache for a storage target.
     *
     * @param namespacePath the namespacePath value to set
     * @return the NamespaceJunction object itself.
     */
    public NamespaceJunction withNamespacePath(String namespacePath) {
        this.namespacePath = namespacePath;
        return this;
    }

    /**
     * Get path in storage target to which namespacePath points.
     *
     * @return the targetPath value
     */
    public String targetPath() {
        return this.targetPath;
    }

    /**
     * Set path in storage target to which namespacePath points.
     *
     * @param targetPath the targetPath value to set
     * @return the NamespaceJunction object itself.
     */
    public NamespaceJunction withTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }

    /**
     * Get nFS export where targetPath exists.
     *
     * @return the nfsExport value
     */
    public String nfsExport() {
        return this.nfsExport;
    }

    /**
     * Set nFS export where targetPath exists.
     *
     * @param nfsExport the nfsExport value to set
     * @return the NamespaceJunction object itself.
     */
    public NamespaceJunction withNfsExport(String nfsExport) {
        this.nfsExport = nfsExport;
        return this;
    }

}
