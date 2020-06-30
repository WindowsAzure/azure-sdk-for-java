// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.implementation.models.AnalyzeOperationResult;
import com.azure.ai.formrecognizer.implementation.models.AnalyzeResult;
import com.azure.ai.formrecognizer.implementation.models.DataTable;
import com.azure.ai.formrecognizer.implementation.models.DataTableCell;
import com.azure.ai.formrecognizer.implementation.models.DocumentResult;
import com.azure.ai.formrecognizer.implementation.models.FieldValue;
import com.azure.ai.formrecognizer.implementation.models.KeyValuePair;
import com.azure.ai.formrecognizer.implementation.models.OperationStatus;
import com.azure.ai.formrecognizer.implementation.models.PageResult;
import com.azure.ai.formrecognizer.implementation.models.ReadResult;
import com.azure.ai.formrecognizer.implementation.models.TextLine;
import com.azure.ai.formrecognizer.implementation.models.TextWord;
import com.azure.ai.formrecognizer.models.BoundingBox;
import com.azure.ai.formrecognizer.models.FormContent;
import com.azure.ai.formrecognizer.models.FormField;
import com.azure.ai.formrecognizer.models.FormLine;
import com.azure.ai.formrecognizer.models.FormPage;
import com.azure.ai.formrecognizer.models.FormPageRange;
import com.azure.ai.formrecognizer.models.FormTable;
import com.azure.ai.formrecognizer.models.FormTableCell;
import com.azure.ai.formrecognizer.models.FormWord;
import com.azure.ai.formrecognizer.models.Point;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.ai.formrecognizer.models.RecognizedReceipt;
import com.azure.ai.formrecognizer.training.FormTrainingClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.test.models.NetworkCallRecord;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import static com.azure.ai.formrecognizer.FormRecognizerClientBuilder.DEFAULT_DURATION;
import static com.azure.ai.formrecognizer.FormTrainingClientTestBase.AZURE_FORM_RECOGNIZER_ENDPOINT;
import static com.azure.ai.formrecognizer.FormTrainingClientTestBase.FORM_RECOGNIZER_MULTIPAGE_TRAINING_BLOB_CONTAINER_SAS_URL;
import static com.azure.ai.formrecognizer.FormTrainingClientTestBase.FORM_RECOGNIZER_TESTING_BLOB_CONTAINER_SAS_URL;
import static com.azure.ai.formrecognizer.FormTrainingClientTestBase.FORM_RECOGNIZER_TRAINING_BLOB_CONTAINER_SAS_URL;
import static com.azure.ai.formrecognizer.FormTrainingClientTestBase.deserializeRawResponse;
import static com.azure.ai.formrecognizer.TestUtils.BLANK_FORM_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.BLANK_PDF;
import static com.azure.ai.formrecognizer.TestUtils.CUSTOM_FORM_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.FORM_1_JPG_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.FORM_JPG;
import static com.azure.ai.formrecognizer.TestUtils.INVALID_KEY;
import static com.azure.ai.formrecognizer.TestUtils.INVOICE_1_PDF;
import static com.azure.ai.formrecognizer.TestUtils.LAYOUT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.MULTIPAGE_INVOICE_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.getFileData;
import static com.azure.ai.formrecognizer.TestUtils.getSerializerAdapter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class FormRecognizerClientTestBase extends TestBase {
    private static final String RECEIPT_CONTOSO_JPG = "contoso-allinone.jpg";
    private static final String RECEIPT_CONTOSO_PNG = "contoso-receipt.png";
    private static final String INVOICE_PDF = "Invoice_6.pdf";
    private static final String MULTIPAGE_INVOICE_PDF = "multipage_invoice1.pdf";
    private static final Pattern NON_DIGIT_PATTERN = Pattern.compile("[^0-9]+");
    private static final String EXPECTED_MULTIPAGE_ADDRESS_VALUE = "123 Hobbit Lane 567 Main St. Redmond, WA Redmond, WA";
    private static final String EXPECTED_MULTIPAGE_PHONE_NUMBER_VALUE = "+15555555555";
    private static final String ITEMIZED_RECEIPT_VALUE = "Itemized";
    private static final String IS_PLAYBACK_MODE = "isPlaybackMode";
    static final String OCR_EXTRACTION_INVALID_URL_ERROR = "OCR extraction error: [Wrong response code: "
        + "InvalidImageURL. Message: Image URL is badly formatted..]";
    static final String EXPECTED_INVALID_URL_ERROR_CODE = "3014";
    static final String EXPECTED_INVALID_ANALYZE_EXCEPTION_MESSAGE =
        "Analyze operation failed, " + "errorCode: [" + EXPECTED_INVALID_URL_ERROR_CODE + "], "
            + "message: " + OCR_EXTRACTION_INVALID_URL_ERROR;
    static final String INVALID_ENDPOINT = "https://notreal.azure.com";
    static final String EXPECTED_HTTPS_EXCEPTION_MESSAGE =
        "Max retries 3 times exceeded. Error Details: Key credentials require HTTPS to prevent leaking the key.";
    static final String EXPECTED_INVALID_UUID_EXCEPTION_MESSAGE = "Invalid UUID string: ";
    static final String EXPECTED_MODEL_ID_IS_REQUIRED_EXCEPTION_MESSAGE = "'modelId' is required and cannot be null.";

    static Duration durationTestMode;

    /**
     * Use duration of nearly zero value for PLAYBACK test mode, otherwise, use default duration value for LIVE mode.
     */
    @Override
    protected void beforeTest() {
        if (interceptorManager.isPlaybackMode()) {
            durationTestMode = Duration.ofNanos(1);
        } else {
            durationTestMode = DEFAULT_DURATION;
        }
    }

    FormRecognizerClientBuilder getFormRecognizerClientBuilder(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        FormRecognizerClientBuilder builder = new FormRecognizerClientBuilder()
            .endpoint(getEndpoint())
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion)
            .addPolicy(interceptorManager.getRecordPolicy());

        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new AzureKeyCredential(INVALID_KEY));
        } else {
            builder.credential(new DefaultAzureCredentialBuilder().build());
        }
        return builder;
    }

    FormTrainingClientBuilder getFormTrainingClientBuilder(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        FormTrainingClientBuilder builder = new FormTrainingClientBuilder()
            .endpoint(getEndpoint())
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion)
            .addPolicy(interceptorManager.getRecordPolicy());

        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new AzureKeyCredential(INVALID_KEY));
        } else {
            builder.credential(new DefaultAzureCredentialBuilder().build());
        }
        return builder;
    }

    private static void validateReferenceElementsData(List<String> expectedElements,
        List<FormContent> actualFormContentList, List<ReadResult> readResults) {
        if (expectedElements != null && actualFormContentList != null) {
            assertEquals(expectedElements.size(), actualFormContentList.size());
            for (int i = 0; i < actualFormContentList.size(); i++) {
                String[] indices = NON_DIGIT_PATTERN.matcher(expectedElements.get(i)).replaceAll(" ").trim().split(" ");

                if (indices.length < 2) {
                    return;
                }

                int readResultIndex = Integer.parseInt(indices[0]);
                int lineIndex = Integer.parseInt(indices[1]);
                if (indices.length == 3) {
                    int wordIndex = Integer.parseInt(indices[2]);
                    TextWord expectedTextWord =
                        readResults.get(readResultIndex).getLines().get(lineIndex).getWords().get(wordIndex);
                    TextLine expectedTextLine = readResults.get(readResultIndex).getLines().get(lineIndex);

                    if (actualFormContentList.get(i) instanceof FormLine) {
                        FormLine actualFormLine = (FormLine) actualFormContentList.get(i);
                        validateFormWordData(expectedTextLine.getWords(), actualFormLine.getFormWords());
                    }
                    FormWord actualFormContent = (FormWord) actualFormContentList.get(i);
                    assertEquals(expectedTextWord.getText(), actualFormContent.getText());
                    if (expectedTextWord.getConfidence() != null) {
                        assertEquals(expectedTextWord.getConfidence(), actualFormContent.getConfidence());
                    } else {
                        assertEquals(1.0f, actualFormContent.getConfidence());
                    }
                    validateBoundingBoxData(expectedTextWord.getBoundingBox(), actualFormContent.getBoundingBox());
                }
            }
        }
    }

    private static void validateFormTableData(List<DataTable> expectedFormTables,
        List<FormTable> actualFormTable, List<ReadResult> readResults, boolean includeTextContent, int pageNumber) {
        assertEquals(expectedFormTables.size(), actualFormTable.size());
        for (int i = 0; i < actualFormTable.size(); i++) {
            DataTable expectedTable = expectedFormTables.get(i);
            FormTable actualTable = actualFormTable.get(i);
            assertEquals(pageNumber, actualTable.getPageNumber());
            assertEquals(expectedTable.getColumns(), actualTable.getColumnCount());
            validateCellData(expectedTable.getCells(), actualTable.getCells(), readResults, includeTextContent);
            assertEquals(expectedTable.getRows(), actualTable.getRowCount());
        }
    }

    private static void validateCellData(List<DataTableCell> expectedTableCells,
        List<FormTableCell> actualTableCellList, List<ReadResult> readResults, boolean includeTextContent) {
        assertEquals(expectedTableCells.size(), actualTableCellList.size());
        for (int i = 0; i < actualTableCellList.size(); i++) {
            DataTableCell expectedTableCell = expectedTableCells.get(i);
            FormTableCell actualTableCell = actualTableCellList.get(i);
            assertEquals(expectedTableCell.getColumnIndex(), actualTableCell.getColumnIndex());
            assertEquals(expectedTableCell.getColumnSpan(), actualTableCell.getColumnSpan());
            assertEquals(expectedTableCell.getRowIndex(), actualTableCell.getRowIndex());
            assertEquals(expectedTableCell.getRowSpan(), actualTableCell.getRowSpan());
            validateBoundingBoxData(expectedTableCell.getBoundingBox(), actualTableCell.getBoundingBox());
            if (includeTextContent) {
                validateReferenceElementsData(expectedTableCell.getElements(), actualTableCell.getTextContent(),
                    readResults);
            }
        }
    }

    private static void validateFormLineData(List<TextLine> expectedLines, List<FormLine> actualLineList) {
        assertEquals(expectedLines.size(), actualLineList.size());
        for (int i = 0; i < actualLineList.size(); i++) {
            TextLine expectedLine = expectedLines.get(i);
            FormLine actualLine = actualLineList.get(i);
            assertEquals(expectedLine.getText(), actualLine.getText());
            validateBoundingBoxData(expectedLine.getBoundingBox(), actualLine.getBoundingBox());
            validateFormWordData(expectedLine.getWords(), actualLine.getFormWords());
        }
    }

    private static void validateFormWordData(List<TextWord> expectedFormWords,
        List<FormWord> actualFormWordList) {
        assertEquals(expectedFormWords.size(), actualFormWordList.size());
        for (int i = 0; i < actualFormWordList.size(); i++) {

            TextWord expectedWord = expectedFormWords.get(i);
            FormWord actualWord = actualFormWordList.get(i);
            assertEquals(expectedWord.getText(), actualWord.getText());
            validateBoundingBoxData(expectedWord.getBoundingBox(), actualWord.getBoundingBox());
            if (expectedWord.getConfidence() != null) {
                assertEquals(expectedWord.getConfidence(), actualWord.getConfidence());
            } else {
                assertEquals(1.0f, actualWord.getConfidence());
            }
        }
    }

    private static void validateBoundingBoxData(List<Float> expectedBoundingBox, BoundingBox actualBoundingBox) {
        if (actualBoundingBox != null && actualBoundingBox.getPoints() != null) {
            int i = 0;
            for (Point point : actualBoundingBox.getPoints()) {
                assertEquals(expectedBoundingBox.get(i), point.getX());
                assertEquals(expectedBoundingBox.get(++i), point.getY());
                i++;
            }
        }
    }

    private static void validateFieldValueTransforms(FieldValue expectedFieldValue, FormField actualFormField,
        List<ReadResult> readResults, boolean includeTextContent) {
        if (expectedFieldValue != null) {
            if (expectedFieldValue.getBoundingBox() != null) {
                validateBoundingBoxData(expectedFieldValue.getBoundingBox(),
                    actualFormField.getValueText().getBoundingBox());
            }
            if (includeTextContent && expectedFieldValue.getElements() != null) {
                validateReferenceElementsData(expectedFieldValue.getElements(),
                    actualFormField.getValueText().getTextContent(), readResults);
            }
            switch (expectedFieldValue.getType()) {
                case NUMBER:
                    assertEquals(expectedFieldValue.getValueNumber(), actualFormField.getFieldValue().asFloat());
                    break;
                case DATE:
                    assertEquals(expectedFieldValue.getValueDate(), actualFormField.getFieldValue().asDate());
                    break;
                case TIME:
                    assertEquals(LocalTime.parse(expectedFieldValue.getValueTime(),
                        DateTimeFormatter.ofPattern("HH:mm:ss")), actualFormField.getFieldValue().asTime());
                    break;
                case STRING:
                    assertEquals(expectedFieldValue.getValueString(), actualFormField.getFieldValue().asString());
                    break;
                case INTEGER:
                    assertEquals(expectedFieldValue.getValueInteger(), actualFormField.getFieldValue().asInteger());
                    break;
                case PHONE_NUMBER:
                    assertEquals(expectedFieldValue.getValuePhoneNumber(), actualFormField.getFieldValue().asPhoneNumber());
                    break;
                case OBJECT:
                    expectedFieldValue.getValueObject().forEach((key, fieldValue) -> {
                        FormField actualFormFieldValue = actualFormField.getFieldValue().asMap().get(key);
                        validateFieldValueTransforms(fieldValue, actualFormFieldValue, readResults, includeTextContent);
                    });
                    break;
                case ARRAY:
                    assertEquals(expectedFieldValue.getValueArray().size(), actualFormField.getFieldValue().asList().size());
                    for (int i = 0; i < expectedFieldValue.getValueArray().size(); i++) {
                        FieldValue expectedReceiptItem = expectedFieldValue.getValueArray().get(i);
                        FormField actualReceiptItem = actualFormField.getFieldValue().asList().get(i);
                        validateFieldValueTransforms(expectedReceiptItem, actualReceiptItem, readResults, includeTextContent);
                    }
                    break;
                default:
                    assertFalse(false, "Field type not supported.");
            }
        }
    }

    private static void validatePageRangeData(int expectedPageInfo, FormPageRange actualPageInfo) {
        assertEquals(expectedPageInfo, actualPageInfo.getFirstPageNumber());
        assertEquals(expectedPageInfo, actualPageInfo.getLastPageNumber());
    }

    // Receipt recognition

    @Test
    abstract void recognizeReceiptData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptDataNullData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptDataWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptDataTextDetails(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptDataWithPngFile(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptDataWithBlankPdf(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptFromDataMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    // Receipt - URL

    @Test
    abstract void recognizeReceiptSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptInvalidSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptFromUrlTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptSourceUrlWithPngFile(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeReceiptFromUrlMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    // Content recognition

    // Content - non-URL

    @Test
    abstract void recognizeContent(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentResultWithNullData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentResultWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentResultWithBlankPdf(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentFromDataMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    // Content - URL

    @Test
    abstract void recognizeContentFromUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentFromUrlWithPdf(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentInvalidSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeContentFromUrlMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    // Custom form recognition

    // Custom form - non-URL - labeled data

    @Test
    abstract void recognizeCustomFormLabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithJpgContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithBlankPdfContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataExcludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithNullFormData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithNullModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithEmptyModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormInvalidStatus(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormLabeledDataWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormMultiPageLabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    // Custom form - non-URL - unlabeled data
    @Test
    abstract void recognizeCustomFormUnlabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUnlabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormMultiPageUnlabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUnlabeledDataWithJpgContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUnlabeledDataWithBlankPdfContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    // Custom form - URL - unlabeled data

    @Test
    abstract void recognizeCustomFormUrlUnlabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUrlUnlabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUrlMultiPageUnlabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    // Custom form - URL - labeled data

    @Test
    abstract void recognizeCustomFormInvalidSourceUrl(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormFromUrlLabeledDataWithNullModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormFromUrlLabeledDataWithEmptyModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUrlLabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUrlLabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    @Test
    abstract void recognizeCustomFormUrlMultiPageLabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion);

    // Receipt
    void validateReceiptDataFields(Map<String, FormField> actualRecognizedReceiptFields, boolean includeTextContent) {
        final AnalyzeResult analyzeResult = getAnalyzeRawResponse().getAnalyzeResult();
        List<ReadResult> readResults = analyzeResult.getReadResults();
        DocumentResult documentResult = analyzeResult.getDocumentResults().get(0);
        Map<String, FieldValue> expectedReceiptFields = documentResult.getFields();

        assertEquals(expectedReceiptFields.get("ReceiptType").getValueString(),
            actualRecognizedReceiptFields.get("ReceiptType").getFieldValue().asString());
        assertEquals(expectedReceiptFields.get("ReceiptType").getConfidence(),
            actualRecognizedReceiptFields.get("ReceiptType").getConfidence());
        validateFieldValueTransforms(expectedReceiptFields.get("MerchantName"),
            actualRecognizedReceiptFields.get("MerchantName"), readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("MerchantPhoneNumber"),
            actualRecognizedReceiptFields.get("MerchantPhoneNumber"), readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("MerchantAddress"),
            actualRecognizedReceiptFields.get("MerchantAddress"), readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("Total"), actualRecognizedReceiptFields.get("Total"),
            readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("Subtotal"), actualRecognizedReceiptFields.get("Subtotal"),
            readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("Tax"), actualRecognizedReceiptFields.get("Tax"), readResults,
            includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("TransactionDate"),
            actualRecognizedReceiptFields.get("TransactionDate"), readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("TransactionTime"),
            actualRecognizedReceiptFields.get("TransactionTime"), readResults, includeTextContent);
        validateFieldValueTransforms(expectedReceiptFields.get("Items"), actualRecognizedReceiptFields.get("Items"), readResults, includeTextContent);
    }

    void validateContentResultData(List<FormPage> actualFormPageList, boolean includeTextContent) {
        AnalyzeResult analyzeResult = getAnalyzeRawResponse().getAnalyzeResult();
        final List<PageResult> pageResults = analyzeResult.getPageResults();
        final List<ReadResult> readResults = analyzeResult.getReadResults();
        for (int i = 0; i < actualFormPageList.size(); i++) {
            FormPage actualFormPage = actualFormPageList.get(i);
            ReadResult readResult = readResults.get(i);
            assertEquals(readResult.getAngle(), actualFormPage.getTextAngle());
            assertEquals(readResult.getWidth(), actualFormPage.getWidth());
            assertEquals(readResult.getHeight(), actualFormPage.getHeight());
            assertEquals(readResult.getUnit().toString(), actualFormPage.getUnit().toString());
            assertEquals(readResult.getPage(), actualFormPage.getPageNumber());
            if (includeTextContent) {
                validateFormLineData(readResult.getLines(), actualFormPage.getLines());
            }
            if (pageResults != null) {
                validateFormTableData(pageResults.get(i).getTables(), actualFormPage.getTables(), readResults,
                    includeTextContent, pageResults.get(i).getPage());
            }
        }
    }

    void validateReceiptResultData(List<RecognizedReceipt> actualReceiptList, boolean includeTextContent) {
        final AnalyzeResult rawResponse = getAnalyzeRawResponse().getAnalyzeResult();
        for (int i = 0; i < actualReceiptList.size(); i++) {
            final RecognizedReceipt actualReceipt = actualReceiptList.get(i);
            validateLabeledData(actualReceipt.getRecognizedForm(), includeTextContent, rawResponse.getReadResults(),
                rawResponse.getDocumentResults().get(i));
            validateReceiptDataFields(actualReceipt.getRecognizedForm().getFields(), includeTextContent);
        }
    }

    void validateBlankPdfResultData(List<RecognizedReceipt> actualReceiptList) {
        assertEquals(1, actualReceiptList.size());
        final RecognizedReceipt actualReceipt = actualReceiptList.get(0);
        assertTrue(actualReceipt.getRecognizedForm().getFields().isEmpty());
    }

    void validateRecognizedResult(List<RecognizedForm> actualFormList, boolean includeTextContent,
        boolean isLabeled) {
        final AnalyzeResult rawResponse = getAnalyzeRawResponse().getAnalyzeResult();
        List<ReadResult> readResults = rawResponse.getReadResults();
        List<PageResult> pageResults = rawResponse.getPageResults();
        List<DocumentResult> documentResults = rawResponse.getDocumentResults();

        for (int i = 0; i < actualFormList.size(); i++) {
            validateContentResultData(actualFormList.get(i).getPages(), includeTextContent);
            if (isLabeled) {
                validateLabeledData(actualFormList.get(i), includeTextContent, readResults, documentResults.get(i));
            } else {
                validateUnLabeledResult(actualFormList.get(i), includeTextContent, readResults, pageResults.get(i));
            }
        }
    }

    void receiptSourceUrlRunner(Consumer<String> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(RECEIPT_CONTOSO_JPG));
    }

    void receiptSourceUrlRunnerTextDetails(BiConsumer<String, Boolean> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(RECEIPT_CONTOSO_JPG), true);
    }

    void receiptPngSourceUrlRunnerTextDetails(BiConsumer<String, Boolean> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(RECEIPT_CONTOSO_PNG), true);
    }

    void receiptDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream(IS_PLAYBACK_MODE.getBytes()), RECEIPT_FILE_LENGTH);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(RECEIPT_CONTOSO_JPG)), RECEIPT_FILE_LENGTH);
        }
    }

    void receiptDataRunnerTextDetails(BiConsumer<InputStream, Boolean> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream(IS_PLAYBACK_MODE.getBytes()), true);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(RECEIPT_CONTOSO_JPG)), true);
        }
    }

    void receiptPngDataRunnerTextDetails(BiConsumer<InputStream, Boolean> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream(IS_PLAYBACK_MODE.getBytes()), true);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(RECEIPT_CONTOSO_PNG)), true);
        }
    }

    void invalidSourceUrlRunner(Consumer<String> testRunner) {
        testRunner.accept(TestUtils.INVALID_RECEIPT_URL);
    }

    void contentFromDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream(IS_PLAYBACK_MODE.getBytes()), LAYOUT_FILE_LENGTH);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(FORM_JPG)), LAYOUT_FILE_LENGTH);
        }
    }

    void multipageFromDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream(IS_PLAYBACK_MODE.getBytes()), MULTIPAGE_INVOICE_FILE_LENGTH);
        } else {
            testRunner.accept(
                getFileData(getStorageTestingFileUrl(MULTIPAGE_INVOICE_PDF)), MULTIPAGE_INVOICE_FILE_LENGTH);
        }
    }

    void multipageFromUrlRunner(Consumer<String> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(MULTIPAGE_INVOICE_PDF));
    }

    void contentFromUrlRunner(Consumer<String> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(FORM_JPG));
    }

    void pdfContentFromUrlRunner(Consumer<String> testRunner) {
        testRunner.accept(getStorageTestingFileUrl(INVOICE_1_PDF));
    }

    void customFormDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream("testData.png".getBytes()), CUSTOM_FORM_FILE_LENGTH);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(INVOICE_PDF)), CUSTOM_FORM_FILE_LENGTH);
        }
    }

    void customFormJpgDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream("testData.png".getBytes()), FORM_1_JPG_FILE_LENGTH);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(FORM_JPG)), FORM_1_JPG_FILE_LENGTH);
        }
    }

    void urlRunner(Consumer<String> testRunner, String formData) {
        testRunner.accept(getStorageTestingFileUrl(formData));
    }

    void blankPdfDataRunner(BiConsumer<InputStream, Long> testRunner) {
        if (interceptorManager.isPlaybackMode()) {
            testRunner.accept(new ByteArrayInputStream("testData.png".getBytes()), BLANK_FORM_FILE_LENGTH);
        } else {
            testRunner.accept(getFileData(getStorageTestingFileUrl(BLANK_PDF)), BLANK_FORM_FILE_LENGTH);
        }
    }

    void beginTrainingUnlabeledRunner(BiConsumer<String, Boolean> testRunner) {
        testRunner.accept(getTrainingSasUri(), false);
    }

    void beginTrainingLabeledRunner(BiConsumer<String, Boolean> testRunner) {
        testRunner.accept(getTrainingSasUri(), true);
    }

    void beginTrainingMultipageRunner(Consumer<String> testRunner) {
        testRunner.accept(getMultipageTrainingSasUri());
    }

    private void validateUnLabeledResult(RecognizedForm actualForm, boolean includeTextContent,
        List<ReadResult> readResults, PageResult expectedPage) {
        validatePageRangeData(expectedPage.getPage(), actualForm.getFormPageRange());
        for (int i = 0; i < expectedPage.getKeyValuePairs().size(); i++) {
            final KeyValuePair expectedFormField = expectedPage.getKeyValuePairs().get(i);
            final FormField actualFormField = actualForm.getFields().get("field-" + i);
            assertEquals(expectedFormField.getConfidence(), actualFormField.getConfidence());
            assertEquals(expectedFormField.getKey().getText(), actualFormField.getLabelText().getText());
            validateBoundingBoxData(expectedFormField.getKey().getBoundingBox(),
                actualFormField.getLabelText().getBoundingBox());
            if (includeTextContent) {
                validateReferenceElementsData(expectedFormField.getKey().getElements(),
                    actualFormField.getLabelText().getTextContent(), readResults);
                validateReferenceElementsData(expectedFormField.getValue().getElements(),
                    actualFormField.getValueText().getTextContent(), readResults);
            }
            assertEquals(expectedFormField.getValue().getText(), actualFormField.getValueText().getText());
            validateBoundingBoxData(expectedFormField.getValue().getBoundingBox(),
                actualFormField.getValueText().getBoundingBox());
        }
    }

    private void validateLabeledData(RecognizedForm actualForm, boolean includeTextContent,
        List<ReadResult> readResults, DocumentResult documentResult) {

        assertEquals(documentResult.getPageRange().get(0), actualForm.getFormPageRange().getFirstPageNumber());
        assertEquals(documentResult.getPageRange().get(1), actualForm.getFormPageRange().getLastPageNumber());
        documentResult.getFields().forEach((label, expectedFieldValue) -> {
            final FormField actualFormField = actualForm.getFields().get(label);
            assertEquals(label, actualFormField.getName());
            if (expectedFieldValue != null) {
                if (expectedFieldValue.getConfidence() != null) {
                    assertEquals(expectedFieldValue.getConfidence(), actualFormField.getConfidence());
                } else {
                    assertEquals(1.0f, actualFormField.getConfidence());
                }
                validateFieldValueTransforms(expectedFieldValue, actualFormField, readResults, includeTextContent);
            }
        });
    }

    static void validateMultiPageDataLabeled(List<RecognizedForm> actualRecognizedFormsList) {
        actualRecognizedFormsList.forEach(recognizedForm -> {
            assertEquals("custom:form", recognizedForm.getFormType());
            assertEquals(1, recognizedForm.getFormPageRange().getFirstPageNumber());
            assertEquals(3, recognizedForm.getFormPageRange().getLastPageNumber());
            assertEquals(3, recognizedForm.getPages().size());
            recognizedForm.getFields().forEach((label, formField) -> {
                assertNotNull(formField.getName());
                assertNotNull(formField.getFieldValue());
                assertNotNull(formField.getValueText().getText());
                assertNotNull(formField.getLabelText().getText());
            });
        });
    }

    static void validateMultiPageDataUnlabeled(List<RecognizedForm> actualRecognizedFormsList) {
        actualRecognizedFormsList.forEach(recognizedForm -> {
            assertNotNull(recognizedForm.getFormType());
            assertEquals(1, recognizedForm.getPages().stream().count());
            recognizedForm.getFields().forEach((label, formField) -> {
                assertNotNull(formField.getName());
                assertNotNull(formField.getFieldValue());
                assertNotNull(formField.getValueText().getText());
                assertNotNull(formField.getLabelText().getText());
            });
        });
    }

    static void validateMultipageReceiptData(List<RecognizedReceipt> recognizedReceipts) {
        assertEquals(3, recognizedReceipts.size());
        RecognizedForm receiptPage1 = recognizedReceipts.get(0).getRecognizedForm();
        RecognizedForm receiptPage2 = recognizedReceipts.get(1).getRecognizedForm();
        RecognizedForm receiptPage3 = recognizedReceipts.get(2).getRecognizedForm();

        assertEquals(1, receiptPage1.getFormPageRange().getFirstPageNumber());
        assertEquals(1, receiptPage1.getFormPageRange().getLastPageNumber());
        Map<String, FormField> receiptPage1Fields = receiptPage1.getFields();
        assertEquals(EXPECTED_MULTIPAGE_ADDRESS_VALUE, receiptPage1Fields.get("MerchantAddress")
            .getFieldValue().asString());
        assertEquals("Bilbo Baggins", receiptPage1Fields.get("MerchantName")
            .getFieldValue().asString());
        assertEquals(EXPECTED_MULTIPAGE_PHONE_NUMBER_VALUE, receiptPage1Fields.get("MerchantPhoneNumber")
            .getFieldValue().asPhoneNumber());
        assertNotNull(receiptPage1Fields.get("Total").getFieldValue().asFloat());
        assertNotNull(receiptPage1.getPages());
        assertEquals(ITEMIZED_RECEIPT_VALUE, receiptPage1Fields.get("ReceiptType").getFieldValue().asString());

        // Assert no fields, tables and lines on second page
        assertEquals(0, receiptPage2.getFields().size());
        List<FormPage> receipt2Pages = receiptPage2.getPages();
        assertEquals(1, receipt2Pages.size());
        assertEquals(0, receipt2Pages.stream().findFirst().get().getTables().size());
        assertEquals(0, receipt2Pages.stream().findFirst().get().getLines().size());
        assertEquals(2, receiptPage2.getFormPageRange().getFirstPageNumber());
        assertEquals(2, receiptPage2.getFormPageRange().getLastPageNumber());

        assertEquals(3, receiptPage3.getFormPageRange().getFirstPageNumber());
        assertEquals(3, receiptPage3.getFormPageRange().getLastPageNumber());
        Map<String, FormField> receiptPage3Fields = receiptPage3.getFields();
        assertEquals(EXPECTED_MULTIPAGE_ADDRESS_VALUE, receiptPage3Fields.get("MerchantAddress")
            .getFieldValue().asString());
        assertEquals("Frodo Baggins", receiptPage3Fields.get("MerchantName")
            .getFieldValue().asString());
        assertEquals(EXPECTED_MULTIPAGE_PHONE_NUMBER_VALUE, receiptPage3Fields.get("MerchantPhoneNumber")
            .getFieldValue().asPhoneNumber());
        assertNotNull(receiptPage3Fields.get("Total").getFieldValue().asFloat());
        // why isn't tip returned by service?
        // total value 1000 returned by service but should be 4300, service bug
        assertEquals(3000.0f, receiptPage3Fields.get("Subtotal").getFieldValue().asFloat());
        assertEquals(ITEMIZED_RECEIPT_VALUE, receiptPage3Fields.get("ReceiptType").getFieldValue().asString());
    }

    protected String getEndpoint() {
        return interceptorManager.isPlaybackMode() ? "https://localhost:8080"
            : Configuration.getGlobalConfiguration().get(AZURE_FORM_RECOGNIZER_ENDPOINT);
    }

    /**
     * Get the training data set SAS Url value based on the test running mode.
     *
     * @return the training data set Url
     */
    private String getTrainingSasUri() {
        if (interceptorManager.isPlaybackMode()) {
            return "https://isPlaybackmode";
        } else {
            return Configuration.getGlobalConfiguration().get(FORM_RECOGNIZER_TRAINING_BLOB_CONTAINER_SAS_URL);
        }
    }

    /**
     * Get the training data set SAS Url value based on the test running mode.
     *
     * @return the training data set Url
     */
    private String getMultipageTrainingSasUri() {
        if (interceptorManager.isPlaybackMode()) {
            return "https://isPlaybackmode";
        } else {
            return Configuration.getGlobalConfiguration()
                .get(FORM_RECOGNIZER_MULTIPAGE_TRAINING_BLOB_CONTAINER_SAS_URL);
        }
    }

    /**
     * Get the testing data set SAS Url value based on the test running mode.
     *
     * @return the testing data set Url
     */
    private String getTestingSasUri() {
        if (interceptorManager.isPlaybackMode()) {
            return "https://isPlaybackmode?SASToken";
        } else {
            return Configuration.getGlobalConfiguration().get(FORM_RECOGNIZER_TESTING_BLOB_CONTAINER_SAS_URL);
        }
    }

    /**
     * Prepare the file url from the testing data set SAS Url value.
     *
     * @return the testing data specific file Url
     */
    private String getStorageTestingFileUrl(String fileName) {
        if (interceptorManager.isPlaybackMode()) {
            return "https://isPlaybackmode";
        } else {
            final String[] urlParts = getTestingSasUri().split("\\?");
            return urlParts[0] + "/" + fileName + "?" + urlParts[1];
        }
    }

    /**
     * Prepare the expected test data from service raw response.
     *
     * @return the {@code AnalyzeOperationResult} test data
     */
    private AnalyzeOperationResult getAnalyzeRawResponse() {
        final SerializerAdapter serializerAdapter = getSerializerAdapter();
        final NetworkCallRecord networkCallRecord =
            interceptorManager.getRecordedData().findFirstAndRemoveNetworkCall(record -> {
                AnalyzeOperationResult rawModelResponse = deserializeRawResponse(serializerAdapter, record,
                    AnalyzeOperationResult.class);
                return rawModelResponse != null && rawModelResponse.getStatus() == OperationStatus.SUCCEEDED;
            });
        interceptorManager.getRecordedData().addNetworkCall(networkCallRecord);
        return deserializeRawResponse(serializerAdapter, networkCallRecord, AnalyzeOperationResult.class);
    }
}
