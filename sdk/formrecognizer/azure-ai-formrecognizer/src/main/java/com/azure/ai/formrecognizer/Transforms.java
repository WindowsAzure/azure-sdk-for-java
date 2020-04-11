// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.implementation.models.AnalyzeResult;
import com.azure.ai.formrecognizer.implementation.models.DocumentResult;
import com.azure.ai.formrecognizer.implementation.models.FieldValue;
import com.azure.ai.formrecognizer.implementation.models.KeyValuePair;
import com.azure.ai.formrecognizer.implementation.models.PageResult;
import com.azure.ai.formrecognizer.implementation.models.ReadResult;
import com.azure.ai.formrecognizer.implementation.models.TextLine;
>>>>>>> aa9264e4ca... update form recognizer endpoint models
import com.azure.ai.formrecognizer.implementation.models.TextWord;
import com.azure.ai.formrecognizer.models.ArrayValue;
import com.azure.ai.formrecognizer.models.BoundingBox;
import com.azure.ai.formrecognizer.models.DimensionUnit;
import com.azure.ai.formrecognizer.models.FieldText;
import com.azure.ai.formrecognizer.models.FieldValue;
import com.azure.ai.formrecognizer.models.FloatValue;
import com.azure.ai.formrecognizer.models.FormContent;
import com.azure.ai.formrecognizer.models.FormField;
import com.azure.ai.formrecognizer.models.FormLine;
import com.azure.ai.formrecognizer.models.FormPage;
import com.azure.ai.formrecognizer.models.FormTable;
import com.azure.ai.formrecognizer.models.FormTableCell;
import com.azure.ai.formrecognizer.models.FormWord;
<<<<<<< HEAD
=======
import com.azure.ai.formrecognizer.models.IntegerValue;
<<<<<<< HEAD
import com.azure.ai.formrecognizer.models.LineElement;
import com.azure.ai.formrecognizer.models.ModelTrainingStatus;
import com.azure.ai.formrecognizer.models.PageMetadata;
=======
import com.azure.ai.formrecognizer.models.ObjectValue;
>>>>>>> 01efeece09... update to new design
>>>>>>> 8d5b01b07c... update to new design
import com.azure.ai.formrecognizer.models.PageRange;
import com.azure.ai.formrecognizer.models.Point;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.ai.formrecognizer.models.RecognizedReceipt;
<<<<<<< HEAD
import com.azure.core.util.CoreUtils;
=======
import com.azure.ai.formrecognizer.models.StringValue;
import com.azure.ai.formrecognizer.models.TimeValue;
<<<<<<< HEAD
<<<<<<< HEAD
import com.azure.ai.formrecognizer.models.USReceiptType;
>>>>>>> 8d5b01b07c... update to new design
=======
>>>>>>> 77d8b4487b... checkstyle
=======
import com.azure.core.util.CoreUtils;
>>>>>>> aa9264e4ca... update form recognizer endpoint models
import com.azure.core.util.IterableStream;
import com.azure.core.util.logging.ClientLogger;

import java.time.LocalDate;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
import java.util.Arrays;
import java.util.HashMap;
>>>>>>> 8576463b55... update model transforms for fieldMap
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
=======
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
<<<<<<< HEAD
>>>>>>> 8d5b01b07c... update to new design
=======
import java.util.stream.Collectors;
>>>>>>> aa9264e4ca... update form recognizer endpoint models

/**
 * Helper class to convert service level models to SDK exposed models.
 */
final class Transforms {
    private static final ClientLogger LOGGER = new ClientLogger(Transforms.class);
    // Pattern match to find all non-digits in the provided string.
    private static final Pattern NON_DIGIT_PATTERN = Pattern.compile("[^0-9]+");
    private static final float DEFAULT_CONFIDENCE_VALUE = 1.0f;

    private Transforms() {
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    /**
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link RecognizedForm}.
     *
     * @param analyzeResult The service returned result for analyze custom forms.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     *
     * @return The IterableStream of {@code RecognizedForm}.
     */
    static List<RecognizedForm> toRecognizedForm(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<DocumentResult> documentResults = analyzeResult.getDocumentResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        List<RecognizedForm> extractedFormList = null;

        List<FormPage> formPages = toRecognizedLayout(analyzeResult, includeTextDetails);

        // unlabeled
        if (!CoreUtils.isNullOrEmpty(documentResults)) {
            extractedFormList = new ArrayList<>();
            for (DocumentResult documentResultItem : documentResults) {
                PageRange pageRange;
                List<Integer> documentPageRange = documentResultItem.getPageRange();
                if (documentPageRange.size() == 2) {
                    pageRange = new PageRange(documentPageRange.get(0), documentPageRange.get(1));
                } else {
                    pageRange = new PageRange(1, 1);
                }

                Map<String, FormField<?>> extractedFieldMap = getUnlabeledFieldMap(documentResultItem, readResults,
                    includeTextDetails);
                extractedFormList.add(new RecognizedForm(
                    extractedFieldMap,
                    documentResultItem.getDocType(),
                    pageRange,
                    new IterableStream<>(formPages.subList(pageRange.getStartPageNumber() - 1,
                        pageRange.getEndPageNumber()))));
            }
        } else if (!CoreUtils.isNullOrEmpty(pageResults)) {
            // labeled
            extractedFormList = new ArrayList<>();
            for (PageResult pageResultItem : pageResults) {
                StringBuffer formType = new StringBuffer("form-");
                int pageNumber = pageResultItem.getPage();
                Integer clusterId = pageResultItem.getClusterId();
                if (clusterId != null) {
                    formType.append(clusterId);
                }
                Map<String, FormField<?>> extractedFieldMap = getLabeledFieldMap(includeTextDetails, readResults,
                    pageResultItem, pageNumber);

                extractedFormList.add(new RecognizedForm(
                    extractedFieldMap,
                    formType.toString(),
                    new PageRange(pageNumber, pageNumber),
                    new IterableStream<>(Collections.singletonList(formPages.get(pageNumber - 1)))));
            }
=======
    static IterableStream<RecognizedForm> toRecognizedForm(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<DocumentResult> documentResults = analyzeResult.getDocumentResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        List<RecognizedForm> extractedFormList = new ArrayList<>();
        List<FormPage> formPages = new ArrayList<>();
        List<Map<String, FieldValue<?>>> extractedFieldMapList = new ArrayList<>();
        List<PageRange> pageRangeList = new ArrayList<>();
        String formType = null;

        if (documentResults != null) {
            for (DocumentResult documentResultItem : documentResults) {
                formType = documentResultItem.getDocType();
                Map<String, FieldValue<?>> extractedFieldMap = new HashMap<>();
                documentResultItem.getFields().forEach((key, fieldValue) -> {
                    if (fieldValue != null) {
                        extractedFieldMap.put(key, setFieldValue(fieldValue, readResults, includeTextDetails));
                    }
                });
                PageRange pageRange = getPageRange(documentResultItem);
                // getDocumentResults(includeTextDetails, readResults, documentResultItem, extractedFieldMap);
                extractedFieldMapList.add(extractedFieldMap);
                pageRangeList.add(pageRange);
            }
        }

        for (int i = 0; i < readResults.size(); i++) {
            ReadResult readResultItem = readResults.get(i);
            PageResult pageResultItem;
            int pageNumber = readResultItem.getPage();
            List<FormTable> extractedTablesList = new ArrayList<>();

            if (pageResults != null) {
                pageResultItem = pageResults.get(i);
                extractedTablesList = getPageTables(pageResultItem, pageNumber);

                if (documentResults == null) {
                    System.out.println("Need to update");
                    // pageResultItem.getKeyValuePairs().forEach(keyValuePair -> {
                    //     pageExtractedFields.put(keyValuePair.get, setFieldValue(keyValuePair.getValue(), readResults, includeTextDetails));
                    // });
                    // TODO: Add extracted field form page result.
                }
            }

            // add form lines
            List<FormLine> formLines = new ArrayList<>();
            if (readResultItem.getLines() != null) {
                formLines = getReadResultFormLines(readResultItem);
            }

            // get form tables
            FormPage formPage = new FormPage(readResultItem.getHeight(), formLines,
                extractedTablesList, readResultItem.getAngle(),
                DimensionUnit.fromString(readResultItem.getUnit().toString()), readResultItem.getWidth());
            formPages.add(formPage);

            // TODO: update document result to be paged?
            RecognizedForm recognizedForm = new RecognizedForm(extractedFieldMapList.size() == 0 ? null : extractedFieldMapList.get(0), formType, pageRangeList.size() == 0 ? null : pageRangeList.get(0), formPages);

            extractedFormList.add(recognizedForm);
        }
        return new IterableStream<>(extractedFormList);
    }

=======
>>>>>>> aa9264e4ca... update form recognizer endpoint models
=======
    /**
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link FormPage}.
     *
     * @param analyzeResult The service returned result for analyze layouts.
     *
     * @return The IterableStream of {@code FormPage}.
     */
>>>>>>> 8576463b55... update model transforms for fieldMap
    static IterableStream<FormPage> toRecognizedLayout(AnalyzeResult analyzeResult) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        List<FormPage> formPages = new ArrayList<>();

        for (int i = 0; i < readResults.size(); i++) {
            ReadResult readResultItem = readResults.get(i);
            PageResult pageResultItem;
            List<FormTable> extractedTablesList = new ArrayList<>();

            if (!CoreUtils.isNullOrEmpty(pageResults)) {
                pageResultItem = pageResults.get(i);
                extractedTablesList = getPageTables(pageResultItem, pageResultItem.getPage());
            }

            // add form lines
            List<FormLine> formLines = new ArrayList<>();
            if (!CoreUtils.isNullOrEmpty(readResultItem.getLines())) {
                formLines = getReadResultFormLines(readResultItem);
            }

            // get form tables
            formPages.add(getFormPage(readResultItem, extractedTablesList, formLines));
        }
        return new IterableStream<>(formPages);
    }

    /**
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link RecognizedReceipt}.
     *
     * @param analyzeResult The service returned result for analyze receipts.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     *
     * @return The IterableStream of {@code RecognizedReceipt}.
     */
    static IterableStream<RecognizedReceipt> toReceipt(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<DocumentResult> documentResult = analyzeResult.getDocumentResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        List<RecognizedReceipt> extractedReceiptList = new ArrayList<>();
        List<FormPage> formPages = new ArrayList<>();
        String formType = null;
        PageRange pageRange = null;
        Map<String, FormField> extractedFieldMap = new HashMap<>();
        if (!CoreUtils.isNullOrEmpty(documentResult)) {
            for (int i = 0; i < documentResult.size(); i++) {

                DocumentResult documentResultItem = documentResult.get(i);
                List<Integer> receiptPageRange = documentResultItem.getPageRange();
                if (receiptPageRange.size() == 2) {
                    pageRange = new PageRange(receiptPageRange.get(0), receiptPageRange.get(1));
                }

                formType = documentResultItem.getDocType();
                // add receipt fields
                documentResultItem.getFields().forEach((key, fieldValue) -> {
                    IterableStream<FormContent> formContentList = null;
                    Integer pageNumber = fieldValue.getPage();
                    if (includeTextDetails && fieldValue.getElements() != null) {
                        formContentList = setReferenceElements(fieldValue.getElements(), readResults, pageNumber);
                    }
                    // TODO (savaity): what bounding box for valueText?
                    FieldText valueText = new FieldText(fieldValue.getText(), null, pageNumber, formContentList);
                    FormField formField = new FormField(fieldValue.getConfidence(), null, key, setFieldValue(fieldValue), valueText, pageNumber);
                    extractedFieldMap.put(key, formField);
                });
            }

            for (int i = 0; i < readResults.size(); i++) {
                ReadResult readResultItem = readResults.get(i);
                PageResult pageResultItem;
                List<FormTable> extractedTablesList = null;

                if (pageResults != null) {
                    pageResultItem = pageResults.get(i);
                    extractedTablesList = getPageTables(pageResultItem, pageResultItem.getPage());
                }

                // add form lines
                List<FormLine> formLines = null;
                if (!CoreUtils.isNullOrEmpty(readResultItem.getLines()) && includeTextDetails) {
                    formLines = getReadResultFormLines(readResultItem);
                }

                // get form tables
                formPages.add(getFormPage(readResultItem, extractedTablesList, formLines));
            }

            RecognizedForm recognizedForm = new RecognizedForm(extractedFieldMap, formType, pageRange, formPages);
            RecognizedReceipt extractedReceiptItem = new RecognizedReceipt("en-US", recognizedForm);

            extractedReceiptList.add(extractedReceiptItem);
>>>>>>> 8d5b01b07c... update to new design
        }
        return extractedFormList;
    }

    /**
     * Helper method to convert the page results to {@code FormPage form pages}.
     *
     * @param readResultItem The per page text extraction item result returned by the service.
     * @param extractedTablesList The per page tables list.
     * @param formLines The per page form lines.
     *
     * @return The per page {@code FormPage}.
     */
    private static FormPage getFormPage(ReadResult readResultItem, List<FormTable> extractedTablesList, List<FormLine> formLines) {
        return new FormPage(readResultItem.getHeight(), formLines,
            extractedTablesList, readResultItem.getAngle(),
            DimensionUnit.fromString(readResultItem.getUnit().toString()), readResultItem.getWidth());
    }

    /**
     * Helper method to get per-page table information.
     *
     * @param pageResultItem The extracted page level information returned by the service.
     * @param pageNumber The 1 based page number on which these fields exist.
     *
     * @return The list of per page {@code FormTable}.
     */
    private static List<FormTable> getPageTables(PageResult pageResultItem, Integer pageNumber) {
        List<FormTable> extractedTablesList = new ArrayList<>();
        pageResultItem.getTables().forEach(dataTable -> {
            List<FormTableCell> tableCellList = new ArrayList<>();
            dataTable.getCells().forEach(dataTableCell -> {
                FormTableCell tableCell = new FormTableCell(dataTableCell.getRowIndex(), dataTableCell.getColumnIndex(),
                    dataTableCell.getRowSpan(), dataTableCell.getColumnSpan(),
                    dataTableCell.getText(), toBoundingBox(dataTableCell.getBoundingBox()),
                    dataTableCell.getConfidence(), null,
                    dataTableCell.isHeader() == null ? false : dataTableCell.isHeader(),
                    dataTableCell.isFooter() == null ? false : dataTableCell.isHeader(),
                    pageNumber);
                tableCellList.add(tableCell);
            });
            FormTable extractedTable = new FormTable(dataTable.getRows(), dataTable.getColumns(), tableCellList);
            extractedTablesList.add(extractedTable);
        });
        return extractedTablesList;
    }

    /**
     * Helper method to convert the per page {@link ReadResult} item to {@link FormLine}.
     *
     * @param readResultItem The per page text extraction item result returned by the service.
     *
     * @return The list of {@code FormLine}.
     */
    private static List<FormLine> getReadResultFormLines(ReadResult readResultItem) {
        List<FormLine> formLines = new ArrayList<>();
        readResultItem.getLines().forEach(textLine -> {
            FormLine formLine = new FormLine(textLine.getText(), toBoundingBox(textLine.getBoundingBox()),
                readResultItem.getPage(), new IterableStream<>(toWords(textLine.getWords(), readResultItem.getPage())));
            formLines.add(formLine);
        });
        return formLines;
    }

    /**
<<<<<<< HEAD
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link RecognizedReceipt}.
=======
     * Helper method that converts the incoming service field value to one of the strongly typed SDK level
     * {@link FieldValue} with reference elements set when {@code includeTextDetails} is set to true.
>>>>>>> 8576463b55... update model transforms for fieldMap
     *
<<<<<<< HEAD
     * @param analyzeResult The service returned result for analyze receipts.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
=======
     * @param fieldValue The named field values returned by the service.
>>>>>>> aa9264e4ca... update form recognizer endpoint models
     *
     * @return The IterableStream of {@code RecognizedReceipt}.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    static IterableStream<RecognizedReceipt> toReceipt(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        return new IterableStream<>(
            toRecognizedForm(analyzeResult, includeTextDetails).stream()
                .map(recognizedForm ->
                    new RecognizedReceipt("en-US", recognizedForm))
                .collect(Collectors.toList()));
    }

    /**
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link FormPage}.
     *
     * @param analyzeResult The service returned result for analyze layouts.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     *
     * @return The IterableStream of {@code FormPage}.
     */
    static List<FormPage> toRecognizedLayout(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        List<FormPage> formPages = new ArrayList<>();
        boolean pageResultsIsNullOrEmpty = CoreUtils.isNullOrEmpty(pageResults);

        forEachWithIndex(readResults, ((index, readResultItem) -> {
            List<FormTable> perPageTableList = new ArrayList<>();

            if (!pageResultsIsNullOrEmpty) {
                PageResult pageResultItem = pageResults.get(index);
                perPageTableList = getPageTables(pageResultItem, readResults, pageResultItem.getPage());
            }

            // add form lines
            List<FormLine> perPageFormLineList = new ArrayList<>();
            if (includeTextDetails && !CoreUtils.isNullOrEmpty(readResultItem.getLines())) {
                perPageFormLineList = getReadResultFormLines(readResultItem);
            }

            // get form tables
            formPages.add(getFormPage(readResultItem, perPageTableList, perPageFormLineList));
        }));

        return formPages;
    }

    /**
     * Given an iterable will apply the indexing function to it and return the index and each item of the iterable.
     *
     * @param iterable the list to apply the mapping function to.
     * @param biConsumer the function which accepts the index and the each value of the iterable.
     * @param <T> the type of items being returned.
     */
    static <T> void forEachWithIndex(Iterable<T> iterable, BiConsumer<Integer, T> biConsumer) {
        int[] index = new int[]{0};
        iterable.forEach(element -> biConsumer.accept(index[0]++, element));
    }

    /**
     * Helper method to get per-page table information.
     *
     * @param pageResultItem The extracted page level information returned by the service.
     * @param readResults The text extraction result returned by the service.
     * @param pageNumber The 1 based page number on which these fields exist.
     *
     * @return The list of per page {@code FormTable}.
     */
    static List<FormTable> getPageTables(PageResult pageResultItem, List<ReadResult> readResults, Integer pageNumber) {
        return pageResultItem.getTables().stream()
            .map(dataTable ->
                new FormTable(dataTable.getRows(), dataTable.getColumns(),
                    new IterableStream<>(dataTable.getCells().stream()
                        .map(dataTableCell -> new FormTableCell(
                            dataTableCell.getRowIndex(), dataTableCell.getColumnIndex(),
                            dataTableCell.getRowSpan(), dataTableCell.getColumnSpan(),
                            dataTableCell.getText(), toBoundingBox(dataTableCell.getBoundingBox()),
                            dataTableCell.getConfidence(),
                            dataTableCell.isHeader() == null ? false : dataTableCell.isHeader(),
                            dataTableCell.isFooter() == null ? false : dataTableCell.isFooter(),
                            pageNumber, setReferenceElements(dataTableCell.getElements(), readResults, pageNumber)))
                        .collect(Collectors.toList()))))
            .collect(Collectors.toList());
    }

    /**
     * Helper method to convert the per page {@link ReadResult} item to {@link FormLine}.
=======
    private static FieldValue<?> setFieldValue(com.azure.ai.formrecognizer.implementation.models.FieldValue fieldValue,
                                               List<ReadResult> readResults, boolean includeTextDetails) {
=======
    private static FieldValue<?> setFieldValue(com.azure.ai.formrecognizer.implementation.models.FieldValue fieldValue) {
>>>>>>> aa9264e4ca... update form recognizer endpoint models
        FieldValue<?> value;
        switch (fieldValue.getType()) {
            case PHONE_NUMBER:
                value = toFieldValuePhoneNumber(fieldValue);
                break;
            case STRING:
                value = toFieldValueString(fieldValue);
                break;
            case TIME:
                value = toFieldValueTime(fieldValue);
                break;
            case DATE:
                value = toFieldValueDate(fieldValue);
                break;
            case INTEGER:
                value = toFieldValueInteger(fieldValue);
                break;
            case NUMBER:
                value = toFieldValueNumber(fieldValue);
                break;
            case ARRAY:
                value = toFieldValueArray(fieldValue);
                break;
            case OBJECT:
                value = toFieldValueObject(fieldValue);
                break;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("FieldValue Type not supported"));
        }
        return value;
    }

    /**
     * Helper method to set the {@link RecognizedForm#getFields() fields} from unlabeled result returned from the service.
     *
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     * @param readResults The text extraction result returned by the service.
     * @param pageResultItem The extracted page level information returned by the service.
     * @param pageNumber The 1 based page number on which these fields exist.
     *
     * @return The fields populated on {@link RecognizedForm#getFields() fields}.
     */
    private static Map<String, FormField> getUnlabeledFieldMap(boolean includeTextDetails, List<ReadResult> readResults,
        PageResult pageResultItem, Integer pageNumber) {
        Map<String, FormField> formFieldMap = new HashMap<>();
        pageResultItem.getKeyValuePairs().forEach(keyValuePair -> {
            IterableStream<FormContent> formContentList = null;
            if (includeTextDetails && !CoreUtils.isNullOrEmpty(keyValuePair.getValue().getElements())) {
                formContentList = setReferenceElements(keyValuePair.getValue().getElements(), readResults, pageNumber);
            }
            FieldText labelFieldText = new FieldText(keyValuePair.getLabel(), null, pageNumber, null);
            // TODO (savaity): what about keyText?
            // FieldText keyText = new FieldText(keyValuePair.getKey().getText(), toBoundingBox(keyValuePair.getKey().getBoundingBox()), pageNumber, setReferenceElementsF(keyValuePair.getKey().getElements()));
            FieldText valueText = new FieldText(keyValuePair.getValue().getText(), toBoundingBox(keyValuePair.getValue().getBoundingBox()), pageNumber, formContentList);
            FieldValue<?> fieldValue = new StringValue(keyValuePair.getValue().getText());
            FormField formField = new FormField(keyValuePair.getConfidence(), labelFieldText, keyValuePair.getLabel(), fieldValue, valueText, pageNumber);
            formFieldMap.put(keyValuePair.getLabel(), formField);
        });
        return formFieldMap;
    }

    /**
     * Helper method to transform the service returned {@link AnalyzeResult} to SDK model {@link RecognizedForm}.
     *
     * @param analyzeResult The service returned result for analyze custom forms.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     *
     * @return The IterableStream of {@code RecognizedForm}.
     */
    static IterableStream<RecognizedForm> toRecognizedForm(AnalyzeResult analyzeResult, boolean includeTextDetails) {
        List<ReadResult> readResults = analyzeResult.getReadResults();
        List<DocumentResult> documentResults = analyzeResult.getDocumentResults();
        List<PageResult> pageResults = analyzeResult.getPageResults();
        AtomicReference<PageRange> pageRange = new AtomicReference<>();
        List<RecognizedForm> extractedFormList = new ArrayList<>();
        List<FormPage> formPages = new ArrayList<>();
        Map<String, FormField> extractedFieldMap = new HashMap<>();

        AtomicReference<String> formType = new AtomicReference<>("form-");
        if (!CoreUtils.isNullOrEmpty(documentResults)) {
            Map<String, FormField> finalExtractedFieldMap = extractedFieldMap;
            documentResults.forEach(documentResultItem -> {
                formType.set(documentResultItem.getDocType());
                pageRange.set(new PageRange(documentResultItem.getPageRange().get(0), documentResultItem.getPageRange().get(1)));
                documentResultItem.getFields().forEach((key, fieldValue) -> {
                    IterableStream<FormContent> formContentList = null;
                    Integer pageNumber = fieldValue.getPage();
                    if (includeTextDetails && !CoreUtils.isNullOrEmpty(fieldValue.getElements())) {
                        formContentList = setReferenceElements(fieldValue.getElements(), readResults, pageNumber);
                    }
                    // TODO (savaity): what bounding box for valueText?
                    FieldText valueText = new FieldText(fieldValue.getText(), null, fieldValue.getPage(), formContentList);
                    FormField formField = new FormField(fieldValue.getConfidence(), null, key, setFieldValue(fieldValue), valueText, pageNumber);
                    // TODO (savaity): does this still keep the updated value this way?
                    finalExtractedFieldMap.put(key, formField);
                });
            });
        }

        for (int i = 0; i < readResults.size(); i++) {

            ReadResult readResultItem = readResults.get(i);
            PageResult pageResultItem = null;
            Integer pageNumber = readResultItem.getPage();
            List<FormTable> extractedTablesList = new ArrayList<>();

            // get Tables
            if (!CoreUtils.isNullOrEmpty(pageResults)) {
                pageResultItem = pageResults.get(i);
                pageNumber = pageResultItem.getPage();
                extractedTablesList = getPageTables(pageResultItem, pageNumber);
                if (documentResults == null) {
                    Integer clusterId = pageResultItem.getClusterId();
                    if (clusterId != null) {
                        formType.set(formType.get() + clusterId);
                    }
                    extractedFieldMap = getUnlabeledFieldMap(includeTextDetails, readResults, pageResultItem, pageNumber);
                }
            }

            // add form lines
            List<FormLine> formLines = new ArrayList<>();
            if (!CoreUtils.isNullOrEmpty(readResultItem.getLines()) && includeTextDetails) {
                formLines = getReadResultFormLines(readResultItem);
            }

            // get form tables
            formPages.add(getFormPage(readResultItem, extractedTablesList, formLines));

            RecognizedForm recognizedForm = new RecognizedForm(extractedFieldMap, formType.get(),
                pageRange.get() == null ? new PageRange(pageNumber, pageNumber) : pageRange.get(), formPages);

            extractedFormList.add(recognizedForm);
        }
        return new IterableStream<>(extractedFormList);
    }

    /**
     * Helper method to set the text reference elements on FieldValue/fields when {@code includeTextDetails} set to true.
     *
     * @return The updated {@link FieldValue} object with list if referenced elements.
     */
    private static IterableStream<FormContent> setReferenceElements(List<String> elements, List<ReadResult> readResults, Integer pageNumber) {
        List<FormContent> formContentList = new ArrayList<>();
        elements.forEach(elementString -> {
            String[] indices = COMPILE.matcher(elementString).replaceAll(" ").trim().split(" ");
            int readResultIndex, lineIndex;
            if (indices.length >= 1) {
                readResultIndex = Integer.parseInt(indices[0]);
                lineIndex = Integer.parseInt(indices[1]);
            } else {
                throw LOGGER.logExceptionAsError(new RuntimeException("Reference Elements not found"));
            }
            if (indices.length == 3) {
                int wordIndex = Integer.parseInt(indices[2]);
                TextWord textWord = readResults.get(readResultIndex).getLines().get(lineIndex).getWords()
                    .get(wordIndex);
                FormWord wordElement = new FormWord(textWord.getText(), toBoundingBox(textWord.getBoundingBox()), pageNumber, textWord.getConfidence());
                formContentList.add(wordElement);
            } else {
                TextLine textLine = readResults.get(readResultIndex).getLines().get(lineIndex);
                FormLine lineElement = new FormLine(textLine.getText(), toBoundingBox(textLine.getBoundingBox()), pageNumber, toWords(textLine.getWords(), pageNumber));
                formContentList.add(lineElement);
            }
        });
        return new IterableStream<>(formContentList);

    }

    /**
     * Helper method to convert the service level {@link TextWord}  to list of SDK level model {@link FormWord}.
     *
     * @param words A list of word reference elements returned by the service.
     * @param pageNumber The 1 based page number on which this word element exists.
     *
     * @return The list of {@code FormWord words}.
     */
    static IterableStream<FormWord> toWords(List<TextWord> words, Integer pageNumber) {
        List<FormWord> extractedWordList = words.stream()
            .map(textWord -> new FormWord(textWord.getText(), toBoundingBox(textWord.getBoundingBox()), pageNumber,
                textWord.getConfidence())).collect(Collectors.toList());
        return new IterableStream<FormWord>(extractedWordList);
    }

    /**
     * Helper method to convert the service level modeled eight numbers representing the four points to SDK level
     * {@link BoundingBox}.
>>>>>>> 8d5b01b07c... update to new design
     *
<<<<<<< HEAD
     * @param readResultItem The per page text extraction item result returned by the service.
=======
     * @param serviceBoundingBox A list of eight numbers representing the four points of a box.
>>>>>>> 8576463b55... update model transforms for fieldMap
     *
     * @return The list of {@code FormLine}.
     */
<<<<<<< HEAD
    static List<FormLine> getReadResultFormLines(ReadResult readResultItem) {
        return readResultItem.getLines().stream()
            .map(textLine -> new FormLine(
                textLine.getText(),
                toBoundingBox(textLine.getBoundingBox()),
                readResultItem.getPage(),
                toWords(textLine.getWords(), readResultItem.getPage())))
            .collect(Collectors.toList());
    }

<<<<<<< HEAD
    /**
<<<<<<< HEAD
     * The field map returned on analyze with an unlabeled model id.
     *
     * @param documentResultItem The extracted document level information.
     * @param readResults The text extraction result returned by the service.
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     *
     * @return The {@code RecognizedForm#getFields}.
     */
    private static Map<String, FormField<?>> getUnlabeledFieldMap(DocumentResult documentResultItem,
        List<ReadResult> readResults, boolean includeTextDetails) {
        Map<String, FormField<?>> extractedFieldMap = new TreeMap<>();
        // add receipt fields
        documentResultItem.getFields().forEach((key, fieldValue) -> {
            FieldText labelText = new FieldText(key, null, fieldValue.getPage(), null);
            Integer pageNumber = fieldValue.getPage();
            IterableStream<FormContent> formContentList = null;
            if (includeTextDetails) {
                formContentList = setReferenceElements(fieldValue.getElements(), readResults, pageNumber);
            }
            FieldText valueText = new FieldText(fieldValue.getText(), toBoundingBox(fieldValue.getBoundingBox()),
                pageNumber, formContentList);
            extractedFieldMap.put(key, setFormField(labelText, key, fieldValue, valueText, pageNumber, readResults));
        });
        return extractedFieldMap;
=======
     * Helper method to set the text reference elements on FieldValue/fields when {@code includeTextDetails} set to true.
     *
     * @param readResults The ReadResult containing the resolved references for text elements.
     * elements constituting this field value.
     *
     * @return The updated {@link FieldValue} object with list if referenced elements.
     */
    // private static List<FormContent> setReferenceElements(List<ReadResult> readResults, List<String> elements) {
    //     List<FormContent> elementList = new ArrayList<>();
    //     elements.forEach(elementString -> {
    //         String[] indices = COMPILE.matcher(elementString).replaceAll(" ").trim().split(" ");
    //         int readResultIndex, lineIndex;
    //         if (indices.length >= 1) {
    //             readResultIndex = Integer.parseInt(indices[0]);
    //             lineIndex = Integer.parseInt(indices[1]);
    //         } else {
    //             throw LOGGER.logExceptionAsError(new RuntimeException("Reference Elements not found"));
    //         }
    //         if (indices.length == 3) {
    //             int wordIndex = Integer.parseInt(indices[2]);
    //             TextWord textWord = readResults.get(readResultIndex).getLines().get(lineIndex).getWords()
    //                 .get(wordIndex);
    //             FormWord wordElement = new FormWord(textWord.getText(), toBoundingBox(textWord.getBoundingBox()), readResultIndex +1, textWord.getConfidence());
    //             elementList.add(wordElement);
    //         } else {
    //             TextLine textLine = readResults.get(readResultIndex).getLines().get(lineIndex);
    //             FormLine lineElement = new FormLine(textLine.getText(), toBoundingBox(textLine.getBoundingBox()), readResultIndex +1, toWords());
    //             elementList.add(lineElement);
    //         }
    //     });
    //     return elementList;
    // }

    private static ArrayValue toFieldValueArray(
        com.azure.ai.formrecognizer.implementation.models.FieldValue fieldValueItems, List<ReadResult> readResults, boolean includeTextDetails) {
        List<FieldValue<?>> receiptItemList = new ArrayList<>();
        int pageNumber = 0;
        List<FormContent> elements = new ArrayList<>();
        for (com.azure.ai.formrecognizer.implementation.models.FieldValue eachFieldValue : fieldValueItems.getValueArray()) {
            FieldValue<?> receiptItem = setFieldValue(eachFieldValue, readResults, includeTextDetails);
            pageNumber = receiptItem.getPageNumber();
            receiptItemList.add(receiptItem);
        }
<<<<<<< HEAD
        return new ArrayValue(null, null, receiptItemList, pageNumber);
>>>>>>> 8d5b01b07c... update to new design
=======
        return new ArrayValue(null, null, receiptItemList, pageNumber, elements);
>>>>>>> 77d8b4487b... checkstyle
=======

=======
    private static BoundingBox toBoundingBox(List<Float> serviceBoundingBox) {
        Point topLeft = new Point(serviceBoundingBox.get(0), serviceBoundingBox.get(1));
        Point topRight = new Point(serviceBoundingBox.get(2), serviceBoundingBox.get(3));
        Point bottomLeft = new Point(serviceBoundingBox.get(4), serviceBoundingBox.get(5));
        Point bottomRight = new Point(serviceBoundingBox.get(6), serviceBoundingBox.get(7));
        return new BoundingBox(Arrays.asList(topLeft, topRight, bottomLeft, bottomRight));
    }

    /**
     * Helper method to convert the service returned {@link com.azure.ai.formrecognizer.implementation.models.FieldValue#getValueArray()} ()}
     * to a SDK level {@link ArrayValue}
     *
     * @param fieldValueItems The array of field values returned by the service in
     * {@link com.azure.ai.formrecognizer.implementation.models.FieldValue#getValueArray()}.
     *
     * @return The {@link ArrayValue}.
     */
>>>>>>> 8576463b55... update model transforms for fieldMap
    private static FieldValue<List<FieldValue<?>>> toFieldValueArray(
        com.azure.ai.formrecognizer.implementation.models.FieldValue fieldValueItems) {
        List<FieldValue<?>> receiptItemList = fieldValueItems.getValueArray().stream()
            .map(eachFieldValue -> setFieldValue(eachFieldValue))
            .collect(Collectors.toList());
        return new ArrayValue(receiptItemList);
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method that converts the incoming service field value to one of the strongly typed SDK level
     * {@link FormField} with reference elements set when {@code includeTextDetails} is set to true.
     *
     * @param labelText The label text of the field.
     * @param key The name of the field.
     * @param fieldValue The named field values returned by the service.
     * @param valueText The value text of the field.
     * @param pageNumber The 1-based page number.
     * @param readResults The text extraction result returned by the service.
     *
     * @return The strongly typed {@link FormField} for the field input.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static FormField<?> setFormField(FieldText labelText, String key, FieldValue fieldValue,
        FieldText valueText, Integer pageNumber, List<ReadResult> readResults) {
        FormField<?> value;
        switch (fieldValue.getType()) {
            case PHONE_NUMBER:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValuePhoneNumber(), valueText, pageNumber);
                break;
            case STRING:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValueString(), valueText, pageNumber);
                break;
            case TIME:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValueTime(), valueText, pageNumber);
                break;
            case DATE:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValueDate(), valueText, pageNumber);
                break;
            case INTEGER:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValueInteger(), valueText, pageNumber);
                break;
            case NUMBER:
                value = new FormField<Number>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, fieldValue.getValueNumber(), valueText, pageNumber);
                break;
            case ARRAY:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), null, key,
                    toFormFieldArray(fieldValue.getValueArray(), readResults), null, pageNumber);
                break;
            case OBJECT:
                value = new FormField<>(setDefaultConfidenceValue(fieldValue.getConfidence()), labelText,
                    key, toFormFieldObject(fieldValue.getValueObject(), pageNumber, readResults), valueText,
                    pageNumber);
                break;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("FieldValue Type not supported"));
        }
        return value;
=======
    private static IntegerValue toFieldValueInteger(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                        serviceIntegerValue) {
        List<FormContent> elements = new ArrayList<>();

        if (serviceIntegerValue.getValueNumber() != null) {
            // TODO: Do not need this check, service team bug
            return new IntegerValue(serviceIntegerValue.getText(), toBoundingBox(serviceIntegerValue.getBoundingBox()),
                serviceIntegerValue.getValueInteger(), serviceIntegerValue.getPage(), elements);
        }

        return new IntegerValue(serviceIntegerValue.getText(), toBoundingBox(serviceIntegerValue.getBoundingBox()), null, serviceIntegerValue.getPage(), elements);
>>>>>>> 77d8b4487b... checkstyle
=======
    private static FieldValue<Integer> toFieldValueInteger(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceIntegerValue) {
        return new IntegerValue(serviceIntegerValue.getValueInteger());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method to set default confidence value if confidence returned by service is null.
     *
     * @param confidence the confidence returned by service.
     *
     * @return the field confidence value.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static float setDefaultConfidenceValue(Float confidence) {
        return confidence == null ? DEFAULT_CONFIDENCE_VALUE : confidence;
=======
    private static StringValue toFieldValueString(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                      serviceStringValue) {
        List<FormContent> elements = new ArrayList<>();

        return new StringValue(serviceStringValue.getText(), toBoundingBox(serviceStringValue.getBoundingBox()),
            serviceStringValue.getValueString(), serviceStringValue.getPage(), elements);
>>>>>>> 77d8b4487b... checkstyle
=======
    private static FieldValue<String> toFieldValueString(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceStringValue) {
        return new StringValue(serviceStringValue.getValueString());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method to convert the service returned
     * {@link com.azure.ai.formrecognizer.implementation.models.FieldValue#getValueObject()}
     * to a SDK level map of {@link FormField}.
     *
     * @param valueObject The array of field values returned by the service in
     * {@link FieldValue#getValueObject()} .
     *
     * @return The Map of {@link FormField}.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static Map<String, FormField<?>> toFormFieldObject(Map<String, FieldValue> valueObject,
        Integer pageNumber, List<ReadResult> readResults) {
        Map<String, FormField<?>> fieldValueObjectMap = new TreeMap<>();
        valueObject.forEach((key, fieldValue) ->
            fieldValueObjectMap.put(key, setFormField(null, key, fieldValue,
                new FieldText(fieldValue.getText(),
                    toBoundingBox(fieldValue.getBoundingBox()),
                    fieldValue.getPage(),
                    setReferenceElements(fieldValue.getElements(), readResults, pageNumber)
                ), fieldValue.getPage(), readResults)));
        return fieldValueObjectMap;
=======
    private static FloatValue toFieldValueNumber(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                     serviceFloatValue) {
        List<FormContent> elements = new ArrayList<>();

        if (serviceFloatValue.getValueNumber() != null) {
            // TODO: Do not need this check, service team bug
            return new FloatValue(serviceFloatValue.getText(), toBoundingBox(serviceFloatValue.getBoundingBox()),
                serviceFloatValue.getValueNumber(), serviceFloatValue.getPage(), elements);
        }

        return new FloatValue(serviceFloatValue.getText(), toBoundingBox(serviceFloatValue.getBoundingBox()), null, serviceFloatValue.getPage(), elements);
>>>>>>> 77d8b4487b... checkstyle
=======
    private static FieldValue<Float> toFieldValueNumber(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceFloatValue) {
        return new FloatValue(serviceFloatValue.getValueNumber());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method to convert the service returned
     * {@link com.azure.ai.formrecognizer.implementation.models.FieldValue#getValueArray()}
     * to a SDK level List of {@link FormField}.
     *
     * @param valueArray The array of field values returned by the service in
     * {@link FieldValue#getValueArray()}.
     * @param readResults The text extraction result returned by the service.
     *
     * @return The List of {@link FormField}.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static List<FormField<?>> toFormFieldArray(List<FieldValue> valueArray, List<ReadResult> readResults) {
        return valueArray.stream()
            .map(fieldValue -> setFormField(null, null, fieldValue, null, fieldValue.getPage(), readResults))
            .collect(Collectors.toList());
=======
    private static StringValue toFieldValuePhoneNumber(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                           serviceDateValue) {
        List<FormContent> elements = new ArrayList<>();
        return new StringValue(serviceDateValue.getText(), toBoundingBox(serviceDateValue.getBoundingBox()),
<<<<<<< HEAD
            serviceDateValue.getValuePhoneNumber(), serviceDateValue.getPage());
>>>>>>> 8d5b01b07c... update to new design
=======
            serviceDateValue.getValuePhoneNumber(), serviceDateValue.getPage(), elements);
>>>>>>> 77d8b4487b... checkstyle
=======
    private static FieldValue<String> toFieldValuePhoneNumber(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceDateValue) {
        return new StringValue(serviceDateValue.getValuePhoneNumber());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method to convert the page results to {@code FormPage form pages}.
     *
     * @param readResultItem The per page text extraction item result returned by the service.
     * @param perPageTableList The per page tables list.
     * @param perPageLineList The per page form lines.
     *
     * @return The per page {@code FormPage}.
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static FormPage getFormPage(ReadResult readResultItem, List<FormTable> perPageTableList,
        List<FormLine> perPageLineList) {
        return new FormPage(
            readResultItem.getHeight(),
            readResultItem.getAngle(),
            DimensionUnit.fromString(readResultItem.getUnit().toString()),
            readResultItem.getWidth(),
            new IterableStream<FormLine>(perPageLineList),
            new IterableStream<FormTable>(perPageTableList)
        );
=======
    private static DateValue toFieldValueDate(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                  serviceDateValue) {
        List<FormContent> elements = new ArrayList<>();

        return new DateValue(serviceDateValue.getText(), toBoundingBox(serviceDateValue.getBoundingBox()),
<<<<<<< HEAD
            serviceDateValue.getValueDate(), serviceDateValue.getPage());
>>>>>>> 8d5b01b07c... update to new design
=======
            serviceDateValue.getValueDate(), serviceDateValue.getPage(), elements);
>>>>>>> 77d8b4487b... checkstyle
=======
    private static FieldValue<LocalDate> toFieldValueDate(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceDateValue) {
        return new DateValue(serviceDateValue.getValueDate());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
    }

    /**
     * Helper method to set the {@link RecognizedForm#getFields() fields} from unlabeled result returned from the
     * service.
     *
<<<<<<< HEAD
     * @param includeTextDetails Boolean to indicate if to set reference elements data on fields.
     * @param readResults The text extraction result returned by the service.
     * @param pageResultItem The extracted page level information returned by the service.
     * @param pageNumber The 1 based page number on which these fields exist.
     *
     * @return The fields populated on {@link RecognizedForm#getFields() fields}.
=======
     * @return The {@link TimeValue}.
>>>>>>> 8d5b01b07c... update to new design
     */
<<<<<<< HEAD
<<<<<<< HEAD
    private static Map<String, FormField<?>> getLabeledFieldMap(boolean includeTextDetails,
        List<ReadResult> readResults,
        PageResult pageResultItem, Integer pageNumber) {
        Map<String, FormField<?>> formFieldMap = new TreeMap<>();
        List<KeyValuePair> keyValuePairs = pageResultItem.getKeyValuePairs();
        forEachWithIndex(keyValuePairs, ((index, keyValuePair) -> {
            IterableStream<FormContent> formKeyContentList = null;
            IterableStream<FormContent> formValueContentList = null;
            if (includeTextDetails) {
                formKeyContentList = setReferenceElements(keyValuePair.getKey().getElements(), readResults, pageNumber);
                formValueContentList = setReferenceElements(keyValuePair.getValue().getElements(), readResults,
                    pageNumber);
            }
            FieldText labelFieldText = new FieldText(keyValuePair.getKey().getText(),
                toBoundingBox(keyValuePair.getKey().getBoundingBox()), pageNumber, formKeyContentList);
            FieldText valueText = new FieldText(keyValuePair.getValue().getText(),
                toBoundingBox(keyValuePair.getValue().getBoundingBox()), pageNumber, formValueContentList);

            String fieldName = "field-" + index;
            FormField<String> formField = new FormField<>(setDefaultConfidenceValue(keyValuePair.getConfidence()),
                labelFieldText, fieldName, keyValuePair.getValue().getText(), valueText, pageNumber);
            formFieldMap.put(fieldName, formField);
        }));
        return formFieldMap;
=======
    private static TimeValue toFieldValueTime(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                  serviceDateValue) {
        List<FormContent> elements = new ArrayList<>();

        return new TimeValue(serviceDateValue.getText(), toBoundingBox(serviceDateValue.getBoundingBox()),
            serviceDateValue.getValueTime(), serviceDateValue.getPage(), elements);
=======
    private static FieldValue<String> toFieldValueTime(com.azure.ai.formrecognizer.implementation.models.FieldValue
        serviceDateValue) {
        return new TimeValue(serviceDateValue.getValueTime());
>>>>>>> aa9264e4ca... update form recognizer endpoint models
        // TODO: currently returning a string, waiting on swagger update.
>>>>>>> 77d8b4487b... checkstyle
    }

<<<<<<< HEAD
    /**
     * Helper method to set the text reference elements on FieldValue/fields when {@code includeTextDetails} set to
     * true.
     *
     * @return The list if referenced elements.
     */
    private static IterableStream<FormContent> setReferenceElements(List<String> elements,
        List<ReadResult> readResults, Integer pageNumber) {
        if (CoreUtils.isNullOrEmpty(elements)) {
            return IterableStream.of(null);
        }
        List<FormContent> formContentList = new ArrayList<>();
        elements.forEach(elementString -> {
            String[] indices = NON_DIGIT_PATTERN.matcher(elementString).replaceAll(" ").trim().split(" ");

            if (indices.length < 2) {
                throw LOGGER.logExceptionAsError(new RuntimeException("Cannot find corresponding reference elements "
                    + "for the field value."));
            }

            int readResultIndex = Integer.parseInt(indices[0]);
            int lineIndex = Integer.parseInt(indices[1]);

            if (indices.length == 3) {
                int wordIndex = Integer.parseInt(indices[2]);
                TextWord textWord =
                    readResults.get(readResultIndex).getLines().get(lineIndex).getWords().get(wordIndex);
                FormWord wordElement = new FormWord(textWord.getText(), toBoundingBox(textWord.getBoundingBox()),
                    pageNumber,
                    setDefaultConfidenceValue(textWord.getConfidence()));
                formContentList.add(wordElement);
            } else {
                TextLine textLine = readResults.get(readResultIndex).getLines().get(lineIndex);
                FormLine lineElement = new FormLine(textLine.getText(), toBoundingBox(textLine.getBoundingBox()),
                    pageNumber, toWords(textLine.getWords(), pageNumber));
                formContentList.add(lineElement);
            }
        });
        return new IterableStream<>(formContentList);
    }

    /**
     * Helper method to convert the service level {@link TextWord}  to list of SDK level model {@link FormWord}.
     *
     * @param words A list of word reference elements returned by the service.
     * @param pageNumber The 1 based page number on which this word element exists.
     *
     * @return The list of {@code FormWord words}.
     */
    private static IterableStream<FormWord> toWords(List<TextWord> words, Integer pageNumber) {
        return new IterableStream<>(words.stream()
            .map(textWord -> new FormWord(
                textWord.getText(),
                toBoundingBox(textWord.getBoundingBox()),
                pageNumber,
                setDefaultConfidenceValue(textWord.getConfidence()))
            ).collect(Collectors.toList()));
    }

    /**
     * Helper method to convert the service level modeled eight numbers representing the four points to SDK level
     * {@link BoundingBox}.
     *
     * @param serviceBoundingBox A list of eight numbers representing the four points of a box.
     *
     * @return A {@link BoundingBox}.
     */
    private static BoundingBox toBoundingBox(List<Float> serviceBoundingBox) {
        if (CoreUtils.isNullOrEmpty(serviceBoundingBox) || (serviceBoundingBox.size() % 2) != 0) {
            return null;
        }
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < serviceBoundingBox.size(); i++) {
            pointList.add(new Point(serviceBoundingBox.get(i), serviceBoundingBox.get(++i)));
        }
        return new BoundingBox(pointList);
    }
    
    private static ObjectValue toFieldValueObject(com.azure.ai.formrecognizer.implementation.models.FieldValue
                                                      serviceFieldValue, List<ReadResult> readResults, boolean includeTextDetails) {
=======
    private static FieldValue<Map<String, FieldValue<?>>> toFieldValueObject(com.azure.ai.formrecognizer.implementation.models.FieldValue
<<<<<<< HEAD
                                                                                 serviceFieldValue) {
>>>>>>> aa9264e4ca... update form recognizer endpoint models
=======
        serviceFieldValue) {
>>>>>>> 8576463b55... update model transforms for fieldMap
        Map<String, FieldValue<?>> stringFieldValueMap = new HashMap<>();
        AtomicInteger pageNumber = new AtomicInteger();
        serviceFieldValue.getValueObject().forEach((key, fieldValue) -> {
            pageNumber.set(fieldValue.getPage());
            stringFieldValueMap.put(key, setFieldValue(fieldValue));
        });
        return new ObjectValue(stringFieldValueMap);
    }
}
