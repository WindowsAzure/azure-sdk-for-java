/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

/**
 * The optional parameters class for "createVideoReviews" method.
 */
public class CreateVideoReviewsOptionalParameter {
    /**
    * SubTeam of your team, you want to assign the created review to.
    */
    private String subTeam;

    /**
    * Get the subTeam value.
    *
    * @return the subTeam value
    */
    public String subTeam() {
        return this.subTeam;
    }

    /**
    * Set the subTeam value.
    * <p>
    * SubTeam of your team, you want to assign the created review to.
    *
    * @param subTeam the subTeam value to set
    * @return the createVideoReviewsOptionalParameter object itself.
    */
    public CreateVideoReviewsOptionalParameter withSubTeam(String subTeam) {
        this.subTeam = subTeam;
        return this;
    }

    }
