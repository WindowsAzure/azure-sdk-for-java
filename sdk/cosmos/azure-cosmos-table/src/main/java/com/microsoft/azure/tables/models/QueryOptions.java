package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The QueryOptions model. */
@Fluent
public final class QueryOptions {
    /*
     * Specifies the media type for the response.
     */
    @JsonProperty(value = "Format")
    private OdataMetadataFormat format;

    /*
     * Maximum number of records to return.
     */
    @JsonProperty(value = "Top")
    private Integer top;

    /*
     * Select expression using OData notation. Limits the columns on each
     * record to just those requested, e.g. "$select=PolicyAssignmentId,
     * ResourceId".
     */
    @JsonProperty(value = "Select")
    private String select;

    /*
     * OData filter expression.
     */
    @JsonProperty(value = "Filter")
    private String filter;

    /**
     * Get the format property: Specifies the media type for the response.
     *
     * @return the format value.
     */
    public OdataMetadataFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: Specifies the media type for the response.
     *
     * @param format the format value to set.
     * @return the QueryOptions object itself.
     */
    public QueryOptions setFormat(OdataMetadataFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the top property: Maximum number of records to return.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: Maximum number of records to return.
     *
     * @param top the top value to set.
     * @return the QueryOptions object itself.
     */
    public QueryOptions setTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the select property: Select expression using OData notation. Limits the columns on each record to just those
     * requested, e.g. "$select=PolicyAssignmentId, ResourceId".
     *
     * @return the select value.
     */
    public String getSelect() {
        return this.select;
    }

    /**
     * Set the select property: Select expression using OData notation. Limits the columns on each record to just those
     * requested, e.g. "$select=PolicyAssignmentId, ResourceId".
     *
     * @param select the select value to set.
     * @return the QueryOptions object itself.
     */
    public QueryOptions setSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get the filter property: OData filter expression.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: OData filter expression.
     *
     * @param filter the filter value to set.
     * @return the QueryOptions object itself.
     */
    public QueryOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }
}
