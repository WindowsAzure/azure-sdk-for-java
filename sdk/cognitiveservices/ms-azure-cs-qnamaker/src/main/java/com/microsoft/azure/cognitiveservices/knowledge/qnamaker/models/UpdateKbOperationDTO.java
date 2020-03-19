/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains list of QnAs to be updated.
 */
public class UpdateKbOperationDTO {
    /**
     * An instance of CreateKbInputDTO for add operation.
     */
    @JsonProperty(value = "add")
    private UpdateKbOperationDTOAdd add;

    /**
     * An instance of DeleteKbContentsDTO for delete Operation.
     */
    @JsonProperty(value = "delete")
    private UpdateKbOperationDTODelete delete;

    /**
     * An instance of UpdateKbContentsDTO for Update Operation.
     */
    @JsonProperty(value = "update")
    private UpdateKbOperationDTOUpdate update;

    /**
     * Enable hierarchical extraction of Q-A from files and urls. The value set
     * during KB creation will be used if this field is not present.
     */
    @JsonProperty(value = "enableHierarchicalExtraction")
    private Boolean enableHierarchicalExtraction;

    /**
     * Text string to be used as the answer in any Q-A which has no extracted
     * answer from the document but has a hierarchy. Required when
     * EnableHierarchicalExtraction field is set to True.
     */
    @JsonProperty(value = "defaultAnswerUsedForExtraction")
    private String defaultAnswerUsedForExtraction;

    /**
     * Get the add value.
     *
     * @return the add value
     */
    public UpdateKbOperationDTOAdd add() {
        return this.add;
    }

    /**
     * Set the add value.
     *
     * @param add the add value to set
     * @return the UpdateKbOperationDTO object itself.
     */
    public UpdateKbOperationDTO withAdd(UpdateKbOperationDTOAdd add) {
        this.add = add;
        return this;
    }

    /**
     * Get the delete value.
     *
     * @return the delete value
     */
    public UpdateKbOperationDTODelete delete() {
        return this.delete;
    }

    /**
     * Set the delete value.
     *
     * @param delete the delete value to set
     * @return the UpdateKbOperationDTO object itself.
     */
    public UpdateKbOperationDTO withDelete(UpdateKbOperationDTODelete delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Get the update value.
     *
     * @return the update value
     */
    public UpdateKbOperationDTOUpdate update() {
        return this.update;
    }

    /**
     * Set the update value.
     *
     * @param update the update value to set
     * @return the UpdateKbOperationDTO object itself.
     */
    public UpdateKbOperationDTO withUpdate(UpdateKbOperationDTOUpdate update) {
        this.update = update;
        return this;
    }

    /**
     * Get the enableHierarchicalExtraction value.
     *
     * @return the enableHierarchicalExtraction value
     */
    public Boolean enableHierarchicalExtraction() {
        return this.enableHierarchicalExtraction;
    }

    /**
     * Set the enableHierarchicalExtraction value.
     *
     * @param enableHierarchicalExtraction the enableHierarchicalExtraction value to set
     * @return the UpdateKbOperationDTO object itself.
     */
    public UpdateKbOperationDTO withEnableHierarchicalExtraction(Boolean enableHierarchicalExtraction) {
        this.enableHierarchicalExtraction = enableHierarchicalExtraction;
        return this;
    }

    /**
     * Get the defaultAnswerUsedForExtraction value.
     *
     * @return the defaultAnswerUsedForExtraction value
     */
    public String defaultAnswerUsedForExtraction() {
        return this.defaultAnswerUsedForExtraction;
    }

    /**
     * Set the defaultAnswerUsedForExtraction value.
     *
     * @param defaultAnswerUsedForExtraction the defaultAnswerUsedForExtraction value to set
     * @return the UpdateKbOperationDTO object itself.
     */
    public UpdateKbOperationDTO withDefaultAnswerUsedForExtraction(String defaultAnswerUsedForExtraction) {
        this.defaultAnswerUsedForExtraction = defaultAnswerUsedForExtraction;
        return this;
    }

}
