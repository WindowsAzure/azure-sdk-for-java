/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service level objectives for performance tier.
 */
public class PerformanceTierServiceLevelObjectives {
    /**
     * ID for the service level objective.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Edition of the performance tier.
     */
    @JsonProperty(value = "edition")
    private String edition;

    /**
     * vCore associated with the service level objective.
     */
    @JsonProperty(value = "vCore")
    private Integer vCore;

    /**
     * Hardware generation associated with the service level objective.
     */
    @JsonProperty(value = "hardwareGeneration")
    private String hardwareGeneration;

    /**
     * Maximum Backup retention in days for the performance tier edition.
     */
    @JsonProperty(value = "maxBackupRetentionDays")
    private Integer maxBackupRetentionDays;

    /**
     * Minimum Backup retention in days for the performance tier edition.
     */
    @JsonProperty(value = "minBackupRetentionDays")
    private Integer minBackupRetentionDays;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "maxStorageMB")
    private Integer maxStorageMB;

    /**
     * Max storage allowed for a server.
     */
    @JsonProperty(value = "minStorageMB")
    private Integer minStorageMB;

    /**
     * Get iD for the service level objective.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set iD for the service level objective.
     *
     * @param id the id value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get edition of the performance tier.
     *
     * @return the edition value
     */
    public String edition() {
        return this.edition;
    }

    /**
     * Set edition of the performance tier.
     *
     * @param edition the edition value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withEdition(String edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get vCore associated with the service level objective.
     *
     * @return the vCore value
     */
    public Integer vCore() {
        return this.vCore;
    }

    /**
     * Set vCore associated with the service level objective.
     *
     * @param vCore the vCore value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withVCore(Integer vCore) {
        this.vCore = vCore;
        return this;
    }

    /**
     * Get hardware generation associated with the service level objective.
     *
     * @return the hardwareGeneration value
     */
    public String hardwareGeneration() {
        return this.hardwareGeneration;
    }

    /**
     * Set hardware generation associated with the service level objective.
     *
     * @param hardwareGeneration the hardwareGeneration value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withHardwareGeneration(String hardwareGeneration) {
        this.hardwareGeneration = hardwareGeneration;
        return this;
    }

    /**
     * Get maximum Backup retention in days for the performance tier edition.
     *
     * @return the maxBackupRetentionDays value
     */
    public Integer maxBackupRetentionDays() {
        return this.maxBackupRetentionDays;
    }

    /**
     * Set maximum Backup retention in days for the performance tier edition.
     *
     * @param maxBackupRetentionDays the maxBackupRetentionDays value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withMaxBackupRetentionDays(Integer maxBackupRetentionDays) {
        this.maxBackupRetentionDays = maxBackupRetentionDays;
        return this;
    }

    /**
     * Get minimum Backup retention in days for the performance tier edition.
     *
     * @return the minBackupRetentionDays value
     */
    public Integer minBackupRetentionDays() {
        return this.minBackupRetentionDays;
    }

    /**
     * Set minimum Backup retention in days for the performance tier edition.
     *
     * @param minBackupRetentionDays the minBackupRetentionDays value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withMinBackupRetentionDays(Integer minBackupRetentionDays) {
        this.minBackupRetentionDays = minBackupRetentionDays;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the maxStorageMB value
     */
    public Integer maxStorageMB() {
        return this.maxStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param maxStorageMB the maxStorageMB value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withMaxStorageMB(Integer maxStorageMB) {
        this.maxStorageMB = maxStorageMB;
        return this;
    }

    /**
     * Get max storage allowed for a server.
     *
     * @return the minStorageMB value
     */
    public Integer minStorageMB() {
        return this.minStorageMB;
    }

    /**
     * Set max storage allowed for a server.
     *
     * @param minStorageMB the minStorageMB value to set
     * @return the PerformanceTierServiceLevelObjectives object itself.
     */
    public PerformanceTierServiceLevelObjectives withMinStorageMB(Integer minStorageMB) {
        this.minStorageMB = minStorageMB;
        return this;
    }

}
