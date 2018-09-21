/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A video analyzer preset that extracts insights (rich metadata) from both
 * audio and video, and outputs a JSON format file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.VideoAnalyzerPreset")
public class VideoAnalyzerPreset extends AudioAnalyzerPreset {
    /**
     * The type of insights to be extracted. If not set then based on the
     * content the type will selected.  If the content is audi only then only
     * audio insights are extraced and if it is video only. Possible values
     * include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     */
    @JsonProperty(value = "insightsToExtract")
    private InsightsType insightsToExtract;

    /**
     * Get the type of insights to be extracted. If not set then based on the content the type will selected.  If the content is audi only then only audio insights are extraced and if it is video only. Possible values include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     *
     * @return the insightsToExtract value
     */
    public InsightsType insightsToExtract() {
        return this.insightsToExtract;
    }

    /**
     * Set the type of insights to be extracted. If not set then based on the content the type will selected.  If the content is audi only then only audio insights are extraced and if it is video only. Possible values include: 'AudioInsightsOnly', 'VideoInsightsOnly', 'AllInsights'.
     *
     * @param insightsToExtract the insightsToExtract value to set
     * @return the VideoAnalyzerPreset object itself.
     */
    public VideoAnalyzerPreset withInsightsToExtract(InsightsType insightsToExtract) {
        this.insightsToExtract = insightsToExtract;
        return this;
    }

}
