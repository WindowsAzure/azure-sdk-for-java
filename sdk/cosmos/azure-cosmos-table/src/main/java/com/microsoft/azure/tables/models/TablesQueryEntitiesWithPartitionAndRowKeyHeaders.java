package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The TablesQueryEntitiesWithPartitionAndRowKeyHeaders model. */
@Fluent
public final class TablesQueryEntitiesWithPartitionAndRowKeyHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-continuation-NextPartitionKey property.
     */
    @JsonProperty(value = "x-ms-continuation-NextPartitionKey")
    private String xMsContinuationNextPartitionKey;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-continuation-NextRowKey property.
     */
    @JsonProperty(value = "x-ms-continuation-NextRowKey")
    private String xMsContinuationNextRowKey;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsContinuationNextPartitionKey property: The x-ms-continuation-NextPartitionKey property.
     *
     * @return the xMsContinuationNextPartitionKey value.
     */
    public String getXMsContinuationNextPartitionKey() {
        return this.xMsContinuationNextPartitionKey;
    }

    /**
     * Set the xMsContinuationNextPartitionKey property: The x-ms-continuation-NextPartitionKey property.
     *
     * @param xMsContinuationNextPartitionKey the xMsContinuationNextPartitionKey value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setXMsContinuationNextPartitionKey(
            String xMsContinuationNextPartitionKey) {
        this.xMsContinuationNextPartitionKey = xMsContinuationNextPartitionKey;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsContinuationNextRowKey property: The x-ms-continuation-NextRowKey property.
     *
     * @return the xMsContinuationNextRowKey value.
     */
    public String getXMsContinuationNextRowKey() {
        return this.xMsContinuationNextRowKey;
    }

    /**
     * Set the xMsContinuationNextRowKey property: The x-ms-continuation-NextRowKey property.
     *
     * @param xMsContinuationNextRowKey the xMsContinuationNextRowKey value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setXMsContinuationNextRowKey(
            String xMsContinuationNextRowKey) {
        this.xMsContinuationNextRowKey = xMsContinuationNextRowKey;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the TablesQueryEntitiesWithPartitionAndRowKeyHeaders object itself.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
