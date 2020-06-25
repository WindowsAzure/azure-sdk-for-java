/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DocumentType.
 */
public final class DocumentType extends ExpandableStringEnum<DocumentType> {
    /** Static value Invoice for DocumentType. */
    public static final DocumentType INVOICE = fromString("Invoice");

    /** Static value VoidNote for DocumentType. */
    public static final DocumentType VOID_NOTE = fromString("VoidNote");

    /** Static value TaxReceipt for DocumentType. */
    public static final DocumentType TAX_RECEIPT = fromString("TaxReceipt");

    /** Static value CreditNote for DocumentType. */
    public static final DocumentType CREDIT_NOTE = fromString("CreditNote");

    /**
     * Creates or finds a DocumentType from its string representation.
     * @param name a name to look for
     * @return the corresponding DocumentType
     */
    @JsonCreator
    public static DocumentType fromString(String name) {
        return fromString(name, DocumentType.class);
    }

    /**
     * @return known DocumentType values
     */
    public static Collection<DocumentType> values() {
        return values(DocumentType.class);
    }
}
