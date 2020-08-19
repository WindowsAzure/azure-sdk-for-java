// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.options;

import com.azure.core.annotation.Fluent;

/**
 * Extended options that may be passed when getting access policy from a share.
 */
@Fluent
public class ShareGetAccessPolicyOptions {

    private String leaseId;

    /**
     * @return The lease id that the share must match.
     */
    public String getLeaseId() {
        return leaseId;
    }

    /**
     * @param leaseId The lease id that the share must match.
     * @return The updated options.
     */
    public ShareGetAccessPolicyOptions setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
}
