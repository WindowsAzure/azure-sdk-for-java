// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.servicebus.primitives;

import java.util.Locale;

public class SenderErrorContext extends ErrorContext {
    private static final long serialVersionUID = -8426189357575601244L;
    final String sendPath;
    final String referenceId;
    final Integer currentLinkCredit;

    SenderErrorContext(
            final String namespaceName,
            final String sendPath,
            final String referenceId,
            final Integer currentLinkCredit) {
        super(namespaceName);

        this.sendPath = sendPath;
        this.referenceId = referenceId;
        this.currentLinkCredit = currentLinkCredit;
    }

    @Override
    public String toString() {
        final String superString = super.toString();
        StringBuilder toString = new StringBuilder();

        if (!StringUtil.isNullOrEmpty(superString)) {
            toString.append(superString);
            toString.append(", ");
        }

        if (this.sendPath != null) {
            toString.append(String.format(Locale.US, "PATH: %s", this.sendPath));
            toString.append(", ");
        }

        if (this.referenceId != null) {
            toString.append(String.format(Locale.US, "REFERENCE_ID: %s", this.referenceId));
            toString.append(", ");
        }

        if (this.currentLinkCredit != null) {
            toString.append(String.format(Locale.US, "LINK_CREDIT: %s", this.currentLinkCredit));
            toString.append(", ");
        }

        if (toString.length() > 2) {
            toString.setLength(toString.length() - 2);
        }

        return toString.toString();
    }
}
