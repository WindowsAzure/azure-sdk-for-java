/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the provisioned Event Hub-compatible endpoint used by the
 * IoT hub.
 */
public class EventHubProperties {
    /**
     * The retention time for device-to-cloud messages in days. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     */
    @JsonProperty(value = "retentionTimeInDays")
    private Long retentionTimeInDays;

    /**
     * The number of partitions for receiving device-to-cloud messages in the
     * Event Hub-compatible endpoint. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     */
    @JsonProperty(value = "partitionCount")
    private Integer partitionCount;

    /**
     * The partition ids in the Event Hub-compatible endpoint.
     */
    @JsonProperty(value = "partitionIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> partitionIds;

    /**
     * The Event Hub-compatible name.
     */
    @JsonProperty(value = "path", access = JsonProperty.Access.WRITE_ONLY)
    private String path;

    /**
     * The Event Hub-compatible endpoint.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get the retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     *
     * @return the retentionTimeInDays value
     */
    public Long retentionTimeInDays() {
        return this.retentionTimeInDays;
    }

    /**
     * Set the retention time for device-to-cloud messages in days. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     *
     * @param retentionTimeInDays the retentionTimeInDays value to set
     * @return the EventHubProperties object itself.
     */
    public EventHubProperties withRetentionTimeInDays(Long retentionTimeInDays) {
        this.retentionTimeInDays = retentionTimeInDays;
        return this;
    }

    /**
     * Get the number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     *
     * @return the partitionCount value
     */
    public Integer partitionCount() {
        return this.partitionCount;
    }

    /**
     * Set the number of partitions for receiving device-to-cloud messages in the Event Hub-compatible endpoint. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#device-to-cloud-messages.
     *
     * @param partitionCount the partitionCount value to set
     * @return the EventHubProperties object itself.
     */
    public EventHubProperties withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * Get the partition ids in the Event Hub-compatible endpoint.
     *
     * @return the partitionIds value
     */
    public List<String> partitionIds() {
        return this.partitionIds;
    }

    /**
     * Get the Event Hub-compatible name.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Get the Event Hub-compatible endpoint.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

}
