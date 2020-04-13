// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Immutable;

import java.util.List;

/**
 * The FormTableCell model.
 */
@Immutable
public final class FormTableCell extends FormContent {

    /*
     * Row index of the cell.
     */
    private final Integer rowIndex;

    /*
     * Column index of the cell.
     */
    private final Integer columnIndex;

    /*
     * Number of rows spanned by this cell.
     */
    private final Integer rowSpan;

    /*
     * Number of columns spanned by this cell.
     */
    private final Integer columnSpan;

    /*
     * Confidence value.
     */
    private final Float confidence;

    /*
     * When includeTextDetails is set to true, a list of references to the text
     * elements constituting this table cell.
     */
    private final List<FormContent> elements;

    /*
     * Is the current cell a header cell?
     */
    private final Boolean isHeader;

    /*
     * Is the current cell a footer cell?
     */
    private final Boolean isFooter;

    /**
     * Constructs a FormTableCell object.
     *
     * @param rowIndex Row index of the cell.
     * @param columnIndex Column index of the cell.
     * @param rowSpan Number of rows spanned by this cell.
     * @param columnSpan Number of columns spanned by this cell.
     * @param text The recognized text value.
     * @param boundingBox The bounding box properties of the cell.
     * @param confidence Confidence value of the recognized text.
     * @param elements a list of references to the text elements constituting this table cell.
     * @param isHeader Is the current cell a header cell?
     * @param isFooter Is the current cell a footer cell?
     * @param pageNumber The 1 based page number of the cell
     */
    public FormTableCell(final int rowIndex, final int columnIndex, final Integer rowSpan,
        final Integer columnSpan, final String text, final BoundingBox boundingBox,
        final float confidence, final List<FormContent> elements, final boolean isHeader,
        final boolean isFooter, final int pageNumber) {
        super(text, boundingBox, pageNumber, null);
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.rowSpan = rowSpan;
        this.columnSpan = columnSpan;
        this.confidence = confidence;
        this.elements = elements;
        this.isHeader = isHeader;
        this.isFooter = isFooter;
    }

    /**
     * Get the confidence property: Confidence of the text of the cell.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    @Override
    public Integer getPageNumber() {
        return super.getPageNumber();
    }

    @Override
    public BoundingBox getBoundingBox() {
        return super.getBoundingBox();
    }

    @Override
    public String getText() {
        return super.getText();
    }

    /**
     * Get the rowIndex property: Row index of the cell.
     *
     * @return the rowIndex value.
     */
    public Integer getRowIndex() {
        return this.rowIndex;
    }

    /**
     * Get the columnIndex property: Column index of the cell.
     *
     * @return the columnIndex value.
     */
    public Integer getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * Get the rowSpan property: Number of rows spanned by this cell.
     *
     * @return the rowSpan value.
     */
    public Integer getRowSpan() {
        return this.rowSpan;
    }


    /**
     * Get the columnSpan property: Number of columns spanned by this cell.
     *
     * @return the columnSpan value.
     */
    public Integer getColumnSpan() {
        return this.columnSpan;
    }

    /**
     * Get the elements property: When includeTextDetails is set to true, a
     * list of references to the text elements constituting this table cell.
     *
     * @return the elements value.
     */
    public List<FormContent> getElements() {
        return this.elements;
    }

    /**
     * Get the isHeader property: Is the current cell a header cell?.
     *
     * @return the isHeader value.
     */
    public boolean isHeader() {
        return this.isHeader;
    }

    /**
     * Get the isFooter property: Is the current cell a footer cell?.
     *
     * @return the isFooter value.
     */
    public boolean isFooter() {
        return this.isFooter;
    }
}
