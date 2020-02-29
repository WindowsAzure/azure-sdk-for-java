/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolState;
import com.microsoft.azure.management.sql.v2014_04_01.ElasticPoolEdition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents a database elastic pool.
 */
@JsonFlatten
public class ElasticPoolInner extends Resource {
    /**
     * The creation date of the elastic pool (ISO8601 format).
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The state of the elastic pool. Possible values include: 'Creating',
     * 'Ready', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolState state;

    /**
     * The edition of the elastic pool. Possible values include: 'Basic',
     * 'Standard', 'Premium', 'GeneralPurpose', 'BusinessCritical'.
     */
    @JsonProperty(value = "properties.edition")
    private ElasticPoolEdition edition;

    /**
     * The total shared DTU for the database elastic pool.
     */
    @JsonProperty(value = "properties.dtu")
    private Integer dtu;

    /**
     * The maximum DTU any one database can consume.
     */
    @JsonProperty(value = "properties.databaseDtuMax")
    private Integer databaseDtuMax;

    /**
     * The minimum DTU all databases are guaranteed.
     */
    @JsonProperty(value = "properties.databaseDtuMin")
    private Integer databaseDtuMin;

    /**
     * Gets storage limit for the database elastic pool in MB.
     */
    @JsonProperty(value = "properties.storageMB")
    private Integer storageMB;

    /**
     * Whether or not this database elastic pool is zone redundant, which means
     * the replicas of this database will be spread across multiple
     * availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /**
     * Kind of elastic pool.  This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /**
     * Get the creation date of the elastic pool (ISO8601 format).
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the state of the elastic pool. Possible values include: 'Creating', 'Ready', 'Disabled'.
     *
     * @return the state value
     */
    public ElasticPoolState state() {
        return this.state;
    }

    /**
     * Get the edition of the elastic pool. Possible values include: 'Basic', 'Standard', 'Premium', 'GeneralPurpose', 'BusinessCritical'.
     *
     * @return the edition value
     */
    public ElasticPoolEdition edition() {
        return this.edition;
    }

    /**
     * Set the edition of the elastic pool. Possible values include: 'Basic', 'Standard', 'Premium', 'GeneralPurpose', 'BusinessCritical'.
     *
     * @param edition the edition value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withEdition(ElasticPoolEdition edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the total shared DTU for the database elastic pool.
     *
     * @return the dtu value
     */
    public Integer dtu() {
        return this.dtu;
    }

    /**
     * Set the total shared DTU for the database elastic pool.
     *
     * @param dtu the dtu value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withDtu(Integer dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the maximum DTU any one database can consume.
     *
     * @return the databaseDtuMax value
     */
    public Integer databaseDtuMax() {
        return this.databaseDtuMax;
    }

    /**
     * Set the maximum DTU any one database can consume.
     *
     * @param databaseDtuMax the databaseDtuMax value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withDatabaseDtuMax(Integer databaseDtuMax) {
        this.databaseDtuMax = databaseDtuMax;
        return this;
    }

    /**
     * Get the minimum DTU all databases are guaranteed.
     *
     * @return the databaseDtuMin value
     */
    public Integer databaseDtuMin() {
        return this.databaseDtuMin;
    }

    /**
     * Set the minimum DTU all databases are guaranteed.
     *
     * @param databaseDtuMin the databaseDtuMin value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withDatabaseDtuMin(Integer databaseDtuMin) {
        this.databaseDtuMin = databaseDtuMin;
        return this;
    }

    /**
     * Get gets storage limit for the database elastic pool in MB.
     *
     * @return the storageMB value
     */
    public Integer storageMB() {
        return this.storageMB;
    }

    /**
     * Set gets storage limit for the database elastic pool in MB.
     *
     * @param storageMB the storageMB value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withStorageMB(Integer storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get whether or not this database elastic pool is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     *
     * @return the zoneRedundant value
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set whether or not this database elastic pool is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get kind of elastic pool.  This is metadata used for the Azure portal experience.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

}
