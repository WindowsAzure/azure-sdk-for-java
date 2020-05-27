package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TableResponseProperties model. */
@Fluent
public class TableResponseProperties {
    /*
     * The name of the table.
     */
    @JsonProperty(value = "TableName")
    private String tableName;

    /*
     * The odata type of the table.
     */
    @JsonProperty(value = "odata.type")
    private String odataType;

    /*
     * The id of the table.
     */
    @JsonProperty(value = "odata.id")
    private String odataId;

    /*
     * The edit link of the table.
     */
    @JsonProperty(value = "odata.editLink")
    private String odataEditLink;

    /**
     * Get the tableName property: The name of the table.
     *
     * @return the tableName value.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The name of the table.
     *
     * @param tableName the tableName value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the odataType property: The odata type of the table.
     *
     * @return the odataType value.
     */
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The odata type of the table.
     *
     * @param odataType the odataType value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the odataId property: The id of the table.
     *
     * @return the odataId value.
     */
    public String getOdataId() {
        return this.odataId;
    }

    /**
     * Set the odataId property: The id of the table.
     *
     * @param odataId the odataId value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataId(String odataId) {
        this.odataId = odataId;
        return this;
    }

    /**
     * Get the odataEditLink property: The edit link of the table.
     *
     * @return the odataEditLink value.
     */
    public String getOdataEditLink() {
        return this.odataEditLink;
    }

    /**
     * Set the odataEditLink property: The edit link of the table.
     *
     * @param odataEditLink the odataEditLink value to set.
     * @return the TableResponseProperties object itself.
     */
    public TableResponseProperties setOdataEditLink(String odataEditLink) {
        this.odataEditLink = odataEditLink;
        return this;
    }
}
