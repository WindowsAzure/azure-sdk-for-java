// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.quickquery.models;

/**
 * Defines the input or output delimited (CSV) serialization for a blob quick query request.
 */
public class BlobQuickQueryDelimitedSerialization extends
    BlobQuickQuerySerialization<BlobQuickQueryDelimitedSerialization> {

    private char columnSeparator;
    private char fieldQuote;
    private char escapeChar;
    private boolean headersPresent;

    /**
     * Gets the column separator.
     * @return the column separator.
     */
    public char getColumnSeparator() {
        return columnSeparator;
    }

    /**
     * Sets the column separator.
     * @param columnSeparator the column separator.
     * @return the updated BlobQuickQueryDelimitedSerialization object.
     */
    public BlobQuickQueryDelimitedSerialization setColumnSeparator(char columnSeparator) {
        this.columnSeparator = columnSeparator;
        return this;
    }

    /**
     * Gets the field quote.
     * @return the field quote.
     */
    public char getFieldQuote() {
        return fieldQuote;
    }

    /**
     * Sets the field quote.
     * @param fieldQuote the field quote.
     * @return the updated BlobQuickQueryDelimitedSerialization object.
     */
    public BlobQuickQueryDelimitedSerialization setFieldQuote(char fieldQuote) {
        this.fieldQuote = fieldQuote;
        return this;
    }

    /**
     * Gets the escape character.
     * @return the escape character.
     */
    public char getEscapeChar() {
        return escapeChar;
    }

    /**
     * Sets the escape character.
     * @param escapeChar the escape character.
     * @return the updated BlobQuickQueryDelimitedSerialization object.
     */
    public BlobQuickQueryDelimitedSerialization setEscapeChar(char escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * Gets whether or not headers are present.
     * @return Whether or not headers are present.
     */
    public boolean isHeadersPresent() {
        return headersPresent;
    }

    /**
     * Sets whether or not headers are present.
     * @param headersPresent Whether or not headers are present.
     * @return the updated BlobQuickQueryDelimitedSerialization object.
     */
    public BlobQuickQueryDelimitedSerialization setHeadersPresent(boolean headersPresent) {
        this.headersPresent = headersPresent;
        return this;
    }
}
