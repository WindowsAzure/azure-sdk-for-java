/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input to create KB.
 */
public class CreateKbInputDTO {
    /**
     * list of QNA to be added to the index. Ids are generated by the service
     * and should be omitted.
     */
    @JsonProperty(value = "qnaList")
    private List<QnADTO> qnaList;

    /**
     * List of URLs to be added to knowledgebase.
     */
    @JsonProperty(value = "urls")
    private List<String> urls;

    /**
     * List of files to be added to knowledgebase.
     */
    @JsonProperty(value = "files")
    private List<FileDTO> files;

    /**
     * Get list of QNA to be added to the index. Ids are generated by the service and should be omitted.
     *
     * @return the qnaList value
     */
    public List<QnADTO> qnaList() {
        return this.qnaList;
    }

    /**
     * Set list of QNA to be added to the index. Ids are generated by the service and should be omitted.
     *
     * @param qnaList the qnaList value to set
     * @return the CreateKbInputDTO object itself.
     */
    public CreateKbInputDTO withQnaList(List<QnADTO> qnaList) {
        this.qnaList = qnaList;
        return this;
    }

    /**
     * Get list of URLs to be added to knowledgebase.
     *
     * @return the urls value
     */
    public List<String> urls() {
        return this.urls;
    }

    /**
     * Set list of URLs to be added to knowledgebase.
     *
     * @param urls the urls value to set
     * @return the CreateKbInputDTO object itself.
     */
    public CreateKbInputDTO withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    /**
     * Get list of files to be added to knowledgebase.
     *
     * @return the files value
     */
    public List<FileDTO> files() {
        return this.files;
    }

    /**
     * Set list of files to be added to knowledgebase.
     *
     * @param files the files value to set
     * @return the CreateKbInputDTO object itself.
     */
    public CreateKbInputDTO withFiles(List<FileDTO> files) {
        this.files = files;
        return this;
    }

}
