// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.implementation;

import com.azure.storage.file.models.SignedIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

/**
 * A wrapper around List&lt;SignedIdentifier&gt; which provides top-level metadata for serialization.
 */
@JacksonXmlRootElement(localName = "SignedIdentifiers")
public final class SignedIdentifiersWrapper {
    @JacksonXmlProperty(localName = "SignedIdentifier")
    private final List<SignedIdentifier> signedIdentifiers;

    /**
     * Creates an instance of SignedIdentifiersWrapper.
     *
     * @param signedIdentifiers the list.
     */
    @JsonCreator
    public SignedIdentifiersWrapper(@JsonProperty("SignedIdentifier") List<SignedIdentifier> signedIdentifiers) {
        this.signedIdentifiers = signedIdentifiers;
    }

    /**
     * Get the List&lt;SignedIdentifier&gt; contained in this wrapper.
     *
     * @return the List&lt;SignedIdentifier&gt;.
     */
    public List<SignedIdentifier> items() {
        return signedIdentifiers;
    }
}
