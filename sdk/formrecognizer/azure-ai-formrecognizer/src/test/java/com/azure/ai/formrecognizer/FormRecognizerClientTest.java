// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.CustomFormModel;
import com.azure.ai.formrecognizer.models.ErrorInformation;
import com.azure.ai.formrecognizer.models.ErrorResponseException;
import com.azure.ai.formrecognizer.models.FormContentType;
import com.azure.ai.formrecognizer.models.FormPage;
import com.azure.ai.formrecognizer.models.FormRecognizerException;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizeCustomFormsOptions;
import com.azure.ai.formrecognizer.models.RecognizeOptions;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.ai.formrecognizer.models.RecognizedReceipt;
import com.azure.ai.formrecognizer.training.FormTrainingClient;
import com.azure.core.http.HttpClient;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.InputStream;
import java.util.List;

import static com.azure.ai.formrecognizer.TestUtils.BLANK_FORM_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.BLANK_FORM_LOCAL_URL;
import static com.azure.ai.formrecognizer.TestUtils.CUSTOM_FORM_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.ai.formrecognizer.TestUtils.FORM_JPG;
import static com.azure.ai.formrecognizer.TestUtils.FORM_LOCAL_URL;
import static com.azure.ai.formrecognizer.TestUtils.INVALID_SOURCE_URL_ERROR;
import static com.azure.ai.formrecognizer.TestUtils.INVALID_URL;
import static com.azure.ai.formrecognizer.TestUtils.LAYOUT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.LAYOUT_LOCAL_URL;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_LOCAL_URL;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_PNG_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.getContentDetectionFileData;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FormRecognizerClientTest extends FormRecognizerClientTestBase {

    private FormRecognizerClient client;

    private FormRecognizerClient getFormRecognizerClient(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        return getFormRecognizerClientBuilder(httpClient, serviceVersion).buildClient();
    }

    private FormTrainingClient getFormTrainingClient(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        return getFormTrainingClientBuilder(httpClient, serviceVersion).buildClient();
    }

    // Receipt recognition

    // Receipt - non-URL

    /**
     * Verifies receipt data for a document using source as input stream data.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        receiptDataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceipts(data, dataLength, FormContentType.IMAGE_JPEG);
            syncPoller.waitForCompletion();
            validateReceiptResultData(syncPoller.getFinalResult(), false);
        });
    }

    /**
     * Verifies an exception thrown for a document using null data value.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptDataNullData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        assertThrows(RuntimeException.class, () ->
            client.beginRecognizeReceipts(null, RECEIPT_FILE_LENGTH, FormContentType.IMAGE_JPEG));
    }

    /**
     * Verifies content type will be auto detected when using receipt API with input stream data overload.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptDataWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
            client.beginRecognizeReceipts(getContentDetectionFileData(RECEIPT_LOCAL_URL), RECEIPT_FILE_LENGTH,
                null);
        syncPoller.waitForCompletion();
        validateReceiptResultData(syncPoller.getFinalResult(), false);
    }

    /**
     * Verifies receipt data for a document using source as as input stream data and text content when
     * includeTextDetails is true.
     */
    // Turn off the tests as there is service regression on the media type.
    // Issue link: https://github.com/Azure/azure-sdk-for-java/issues/11036
//    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
//    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
//     public void recognizeReceiptDataTextDetails(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
//        client = getFormRecognizerClient(httpClient, serviceVersion);
//        receiptDataRunnerTextDetails((data, includeTextDetails) -> {
//            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
//                client.beginRecognizeReceipts(data, RECEIPT_FILE_LENGTH, FormContentType.IMAGE_PNG,
//                    includeTextDetails, null);
//            syncPoller.waitForCompletion();
//            validateReceiptResultData(syncPoller.getFinalResult(), true);
//        });
//    }

    /**
     * Verifies receipt data from a document using PNG file data as source and including text content details.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptDataWithPngFile(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        receiptPngDataRunnerTextDetails((data, includeTextDetails) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceipts(new RecognizeOptions(data, RECEIPT_PNG_FILE_LENGTH).setFormContentType(
                    FormContentType.IMAGE_PNG).setIncludeTextContent(includeTextDetails));
            syncPoller.waitForCompletion();
            validateReceiptResultData(syncPoller.getFinalResult(), true);
        });
    }

    /**
     * Verifies receipt data from a document using blank PDF.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptDataWithBlankPdf(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        blankPdfDataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller = client.beginRecognizeReceipts(
                new RecognizeOptions(data, dataLength).setFormContentType(FormContentType.APPLICATION_PDF)
                    .setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateBlankPdfResultData(syncPoller.getFinalResult());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptFromDataMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromDataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceipts(data, dataLength, FormContentType.APPLICATION_PDF);
            syncPoller.waitForCompletion();
            validateMultipageReceiptData(syncPoller.getFinalResult());
        });
    }

    // Receipt - URL

    /**
     * Verifies receipt data for a document using source as file url.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        receiptSourceUrlRunner((sourceUrl) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceiptsFromUrl(sourceUrl);
            syncPoller.waitForCompletion();
            validateReceiptResultData(syncPoller.getFinalResult(), false);
        });
    }

    /**
     * Verifies that an exception is thrown for invalid source url.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptInvalidSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        invalidSourceUrlRunner((sourceUrl) -> assertThrows(ErrorResponseException.class,
            () -> client.beginRecognizeReceiptsFromUrl(sourceUrl)));
    }

    /**
     * Verifies receipt data for a document using source as file url and include content when includeTextDetails is
     * true.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptFromUrlTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        receiptSourceUrlRunnerTextDetails((sourceUrl, includeTextDetails) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller = client.beginRecognizeReceipts(
                new RecognizeOptions(sourceUrl).setIncludeTextContent(includeTextDetails));
            syncPoller.waitForCompletion();
            validateReceiptResultData(syncPoller.getFinalResult(), true);
        });
    }

    /**
     * Verifies receipt data for a document using source as PNG file url and include content when includeTextDetails is
     * true.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptSourceUrlWithPngFile(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        receiptPngSourceUrlRunnerTextDetails((sourceUrl, includeTextDetails) -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller = client.beginRecognizeReceipts(
                new RecognizeOptions(sourceUrl).setIncludeTextContent(includeTextDetails));
            syncPoller.waitForCompletion();
            validateReceiptResultData(syncPoller.getFinalResult(), true);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeReceiptFromUrlMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner(fileUrl -> {
            SyncPoller<OperationResult, List<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceiptsFromUrl(fileUrl);
            syncPoller.waitForCompletion();
            validateMultipageReceiptData(syncPoller.getFinalResult());
        });
    }

    // Content Recognition

    // Content - non-URL

    /**
     * Verifies layout/content data for a document using source as input stream data.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContent(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        contentFromDataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, List<FormPage>> syncPoller =
                client.beginRecognizeContent(data, dataLength, FormContentType.IMAGE_PNG);
            syncPoller.waitForCompletion();
            validateContentResultData(syncPoller.getFinalResult(), false);
        });
    }

    /**
     * Verifies an exception thrown for a document using null data value.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentResultWithNullData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        assertThrows(RuntimeException.class, () ->
            client.beginRecognizeContent(null, LAYOUT_FILE_LENGTH, FormContentType.IMAGE_JPEG));
    }

    /**
     * Verifies content type will be auto detected when using content/layout API with input stream data overload.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentResultWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        SyncPoller<OperationResult, List<FormPage>> syncPoller =
            client.beginRecognizeContent(getContentDetectionFileData(LAYOUT_LOCAL_URL), LAYOUT_FILE_LENGTH, null);
        syncPoller.waitForCompletion();
        validateContentResultData(syncPoller.getFinalResult(), false);
    }

    /**
     * Verifies blank form file is still a valid file to process
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentResultWithBlankPdf(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        // TODO: no matter which FormContentType is used, the test still passed.
        client = getFormRecognizerClient(httpClient, serviceVersion);
        SyncPoller<OperationResult, List<FormPage>> syncPoller =
            client.beginRecognizeContent(getContentDetectionFileData(BLANK_FORM_LOCAL_URL), BLANK_FORM_FILE_LENGTH,
                FormContentType.APPLICATION_PDF);
        syncPoller.waitForCompletion();
        validateContentResultData(syncPoller.getFinalResult(), false);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentFromDataMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromDataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, List<FormPage>> syncPoller =
                client.beginRecognizeContent(data, dataLength, FormContentType.APPLICATION_PDF);
            syncPoller.waitForCompletion();
            validateContentResultData(syncPoller.getFinalResult(), false);
        });
    }

    // Content - URL

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentFromUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        contentFromUrlRunner(sourceUrl -> {
            SyncPoller<OperationResult, List<FormPage>> syncPoller
                = client.beginRecognizeContentFromUrl(sourceUrl);
            syncPoller.waitForCompletion();
            validateContentResultData(syncPoller.getFinalResult(), false);
        });
    }

    /**
     * Verifies layout data for a pdf url
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentFromUrlWithPdf(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        pdfContentFromUrlRunner(sourceUrl -> {
            SyncPoller<OperationResult, List<FormPage>> syncPoller =
                client.beginRecognizeContentFromUrl(sourceUrl);
            syncPoller.waitForCompletion();
            validateContentResultData(syncPoller.getFinalResult(), false);
        });
    }

    /**
     * Verifies that an exception is thrown for invalid source url for recognizing content information.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentInvalidSourceUrl(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        invalidSourceUrlRunner((invalidSourceUrl) -> assertThrows(ErrorResponseException.class, () ->
            client.beginRecognizeContentFromUrl(invalidSourceUrl)));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeContentFromUrlMultiPage(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner((fileUrl) -> {
            SyncPoller<OperationResult, List<FormPage>> syncPoller =
                client.beginRecognizeContentFromUrl(fileUrl);
            syncPoller.waitForCompletion();
            validateContentResultData(syncPoller.getFinalResult(), false);
        });
    }

    // Custom form recognition

    // Custom form - non-URL - labeled data

    /**
     * Verifies custom form data for a document using source as input stream data and valid labeled model Id.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormDataRunner((data, dataLength) ->
            beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
                SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                    getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                        useTrainingLabels);
                trainingPoller.waitForCompletion();

                SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                    new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                        .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(true));
                syncPoller.waitForCompletion();
                validateRecognizedResult(syncPoller.getFinalResult(), true, true);
            }));
    }

    /**
     * Verifies custom form data for a JPG content type with labeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithJpgContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormJpgDataRunner((data, dataLength) ->
            beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
                SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                    getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, useTrainingLabels);
                trainingPoller.waitForCompletion();

                SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                    new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                        .setFormContentType(FormContentType.IMAGE_JPEG).setIncludeTextContent(false));
                syncPoller.waitForCompletion();
                validateRecognizedResult(syncPoller.getFinalResult(), false, true);
        }));
    }

    /**
     * Verifies custom form data for a blank PDF content type with labeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithBlankPdfContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        blankPdfDataRunner((data, dataLength) -> beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(data, dataLength,
                    trainingPoller.getFinalResult().getModelId())
                    .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, true);
        }));
    }

    /**
     * Verifies custom form data for a document using source as input stream data and valid labeled model Id,
     * excluding text content.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataExcludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormDataRunner((data, dataLength) -> beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                    new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                        .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, true);
        }));
    }

    /**
     * Verifies an exception thrown for a document using null form data value.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithNullFormData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormDataRunner((data, dataLength) ->
            beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
                SyncPoller<OperationResult, CustomFormModel> syncPoller =
                    getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                        useTrainingLabels);
                syncPoller.waitForCompletion();

                assertThrows(RuntimeException.class, () -> client.beginRecognizeCustomForms(
                    new RecognizeCustomFormsOptions((InputStream) null, dataLength,
                        syncPoller.getFinalResult().getModelId())
                        .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(true)));
            })
        );
    }

    /**
     * Verifies an exception thrown for a document using null model id.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithNullModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormDataRunner((data, dataLength) -> {
            Exception ex = assertThrows(RuntimeException.class, () -> client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(data, dataLength, null)
                    .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(true)));
            assertEquals(EXPECTED_MODEL_ID_IS_REQUIRED_EXCEPTION_MESSAGE, ex.getMessage());
        });
    }

    /**
     * Verifies an exception thrown for an empty model id.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithEmptyModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);

        customFormDataRunner((data, dataLength) -> {
            Exception ex = assertThrows(RuntimeException.class, () -> client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(data, dataLength, "")
                    .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(true)));
            assertEquals(EXPECTED_INVALID_UUID_EXCEPTION_MESSAGE, ex.getMessage());
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormInvalidStatus(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        invalidSourceUrlRunner((invalidSourceUrl) -> {
            beginTrainingLabeledRunner((training, useTrainingLabels) -> {
                SyncPoller<OperationResult, CustomFormModel> syncPoller =
                    getFormTrainingClient(httpClient, serviceVersion).beginTraining(training, useTrainingLabels);
                syncPoller.waitForCompletion();
                CustomFormModel createdModel = syncPoller.getFinalResult();
                FormRecognizerException formRecognizerException = assertThrows(FormRecognizerException.class,
                    () -> client.beginRecognizeCustomFormsFromUrl(invalidSourceUrl, createdModel.getModelId())
                        .getFinalResult());
                ErrorInformation errorInformation = formRecognizerException.getErrorInformation().get(0);
                // TODO: Service bug https://github.com/Azure/azure-sdk-for-java/issues/12046
                // assertEquals(EXPECTED_INVALID_URL_ERROR_CODE, errorInformation.getCode());
                // assertEquals(OCR_EXTRACTION_INVALID_URL_ERROR, errorInformation.getMessage());
                // assertEquals(EXPECTED_INVALID_ANALYZE_EXCEPTION_MESSAGE, formRecognizerException.getMessage());
            });
        });
    }

    /**
     * Verifies content type will be auto detected when using custom form API with input stream data overload.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormLabeledDataWithContentTypeAutoDetection(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller
                = client.beginRecognizeCustomForms(new RecognizeCustomFormsOptions(
                getContentDetectionFileData(FORM_LOCAL_URL),
                CUSTOM_FORM_FILE_LENGTH, trainingPoller.getFinalResult().getModelId()).setIncludeTextContent(true));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), true, true);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormMultiPageLabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromDataRunner((data, dataLength) -> beginTrainingMultipageRunner((trainingFilesUrl) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, true);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                    .setFormContentType(FormContentType.APPLICATION_PDF));
            syncPoller.waitForCompletion();
            validateMultiPageDataLabeled(syncPoller.getFinalResult());
        }));
    }

    // Custom form - non-URL - unlabeled data

    /**
     * Verifies custom form data for a document using source as input stream data and valid labeled model Id.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUnlabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormDataRunner((data, dataLength) ->
            beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
                SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                    getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                        useTrainingLabels);
                trainingPoller.waitForCompletion();

                SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                    data, dataLength, trainingPoller.getFinalResult().getModelId(), FormContentType.APPLICATION_PDF);
                syncPoller.waitForCompletion();
                validateRecognizedResult(syncPoller.getFinalResult(), false, false);
            }));
    }

    /**
     * Verifies custom form data for a document using source as input stream data and valid include text content
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUnlabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);

        customFormDataRunner((data, dataLength) -> beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                    new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                        .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(true));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), true, false);
        }));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormMultiPageUnlabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromDataRunner((data, dataLength) -> beginTrainingMultipageRunner((trainingFilesUrl) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, false);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                data, dataLength, trainingPoller.getFinalResult().getModelId(),
                FormContentType.APPLICATION_PDF);
            syncPoller.waitForCompletion();
            validateMultiPageDataUnlabeled(syncPoller.getFinalResult());
        }));
    }

    /**
     * Verifies custom form data for a JPG content type with unlabeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUnlabeledDataWithJpgContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        customFormJpgDataRunner((data, dataLength) ->
            beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller =
                client.beginRecognizeCustomForms(new RecognizeCustomFormsOptions(data, dataLength,
                    trainingPoller.getFinalResult().getModelId())
                    .setFormContentType(FormContentType.IMAGE_JPEG).setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, false);
        }));
    }

    /**
     * Verifies custom form data for a blank PDF content type with unlabeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUnlabeledDataWithBlankPdfContentType(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        blankPdfDataRunner((data, dataLength) -> beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(data, dataLength, trainingPoller.getFinalResult().getModelId())
                    .setFormContentType(FormContentType.APPLICATION_PDF).setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, false);
        }));
    }

    // Custom form - URL - unlabeled data

    /**
     * Verifies custom form data for an URL document data without labeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlUnlabeledData(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        urlDataRunner(fileUrl -> beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(fileUrl, trainingPoller.getFinalResult().getModelId())
                    .setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, false);
        }), FORM_JPG);
    }

    /**
     * Verifies custom form data for an URL document data without labeled data and include text content
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlUnlabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        urlDataRunner(fileUrl -> beginTrainingUnlabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(fileUrl, trainingPoller.getFinalResult().getModelId())
                    .setIncludeTextContent(true));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), true, false);
        }), FORM_JPG);
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlMultiPageUnlabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner(fileUrl -> beginTrainingMultipageRunner((trainingFilesUrl) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, false);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller =
                client.beginRecognizeCustomFormsFromUrl(fileUrl, trainingPoller.getFinalResult().getModelId());
            syncPoller.waitForCompletion();
            validateMultiPageDataUnlabeled(syncPoller.getFinalResult());
        }));
    }

    // Custom form - URL - labeled data

    /**
     * Verifies that an exception is thrown for invalid training data source.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormInvalidSourceUrl(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> syncPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, useTrainingLabels);
            syncPoller.waitForCompletion();
            CustomFormModel createdModel = syncPoller.getFinalResult();

            ErrorResponseException httpResponseException = assertThrows(
                ErrorResponseException.class,
                () -> client.beginRecognizeCustomFormsFromUrl(INVALID_URL, createdModel.getModelId()).getFinalResult());

            assertEquals(httpResponseException.getMessage(), (INVALID_SOURCE_URL_ERROR));
        });
    }

    /**
     * Verifies an exception thrown for a null model id when recognizing custom form from URL.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormFromUrlLabeledDataWithNullModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner(fileUrl -> {
            Exception ex = assertThrows(RuntimeException.class, () ->
                client.beginRecognizeCustomFormsFromUrl(fileUrl, null));
            assertEquals(EXPECTED_MODEL_ID_IS_REQUIRED_EXCEPTION_MESSAGE, ex.getMessage());
        });
    }

    /**
     * Verifies an exception thrown for an empty model id for recognizing custom forms from URL.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormFromUrlLabeledDataWithEmptyModelId(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner(fileUrl -> beginTrainingMultipageRunner((trainingFilesUrl) -> {
            Exception ex = assertThrows(RuntimeException.class, () ->
                client.beginRecognizeCustomFormsFromUrl(fileUrl, ""));
            assertEquals(EXPECTED_INVALID_UUID_EXCEPTION_MESSAGE, ex.getMessage());
        }));
    }

    /**
     * Verifies custom form data for an URL document data with labeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlLabeledData(HttpClient httpClient, FormRecognizerServiceVersion serviceVersion) {
        urlDataRunner(fileUrl -> beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            client = getFormRecognizerClient(httpClient, serviceVersion);

            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(fileUrl, trainingPoller.getFinalResult().getModelId())
                    .setIncludeTextContent(false));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), false, true);
        }), FORM_JPG);
    }

    /**
     * Verifies custom form data for an URL document data with labeled data and include text content
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlLabeledDataIncludeTextContent(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);

        urlDataRunner(fileUrl -> beginTrainingLabeledRunner((trainingFilesUrl, useTrainingLabels) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl,
                    useTrainingLabels);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller = client.beginRecognizeCustomForms(
                new RecognizeCustomFormsOptions(fileUrl, trainingPoller.getFinalResult().getModelId())
                    .setIncludeTextContent(true));
            syncPoller.waitForCompletion();
            validateRecognizedResult(syncPoller.getFinalResult(), true, true);
        }), FORM_JPG);
    }

    /**
     * Verify custom form for an URL of multi-page labeled data
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.TestUtils#getTestParameters")
    public void recognizeCustomFormUrlMultiPageLabeled(HttpClient httpClient,
        FormRecognizerServiceVersion serviceVersion) {
        client = getFormRecognizerClient(httpClient, serviceVersion);
        multipageFromUrlRunner(fileUrl -> beginTrainingMultipageRunner((trainingFilesUrl) -> {
            SyncPoller<OperationResult, CustomFormModel> trainingPoller =
                getFormTrainingClient(httpClient, serviceVersion).beginTraining(trainingFilesUrl, true);
            trainingPoller.waitForCompletion();

            SyncPoller<OperationResult, List<RecognizedForm>> syncPoller =
                client.beginRecognizeCustomFormsFromUrl(fileUrl, trainingPoller.getFinalResult().getModelId());
            syncPoller.waitForCompletion();
            validateMultiPageDataLabeled(syncPoller.getFinalResult());
        }));
    }
}
