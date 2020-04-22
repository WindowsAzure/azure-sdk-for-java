// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.models.CustomFormModel;
import com.azure.ai.formrecognizer.models.ErrorResponseException;
import com.azure.ai.formrecognizer.models.FormContentType;
import com.azure.ai.formrecognizer.models.FormPage;
import com.azure.ai.formrecognizer.models.OperationResult;
import com.azure.ai.formrecognizer.models.RecognizedForm;
import com.azure.ai.formrecognizer.models.RecognizedReceipt;
import com.azure.core.util.IterableStream;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import java.time.Duration;

import static com.azure.ai.formrecognizer.TestUtils.CUSTOM_FORM_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.INVALID_SOURCE_URL_ERROR;
import static com.azure.ai.formrecognizer.TestUtils.INVALID_URL;
import static com.azure.ai.formrecognizer.TestUtils.LAYOUT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_FILE_LENGTH;
import static com.azure.ai.formrecognizer.TestUtils.RECEIPT_LOCAL_URL;
import static com.azure.ai.formrecognizer.TestUtils.getExpectedFormPages;
import static com.azure.ai.formrecognizer.TestUtils.getExpectedReceipts;
import static com.azure.ai.formrecognizer.TestUtils.getExpectedRecognizedForms;
import static com.azure.ai.formrecognizer.TestUtils.getExpectedRecognizedLabeledForms;
import static com.azure.ai.formrecognizer.TestUtils.getExpectedUSReceipt;
import static com.azure.ai.formrecognizer.TestUtils.getReplayableBufferData;
import static com.azure.ai.formrecognizer.implementation.Utility.toFluxByteBuffer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FormRecognizerAsyncClientTest extends FormRecognizerClientTestBase {

    private FormRecognizerAsyncClient client;

    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    @Override
    protected void beforeTest() {
        client = clientSetup(httpPipeline -> new FormRecognizerClientBuilder()
            .endpoint(getEndpoint())
            .pipeline(httpPipeline)
            .buildAsyncClient());
    }

    /**
     * Verifies receipt data for a document using source as file url.
     */
    @Test
    void recognizeReceiptSourceUrl() {
        receiptSourceUrlRunner((sourceUrl) -> {
            SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceiptsFromUrl(sourceUrl).getSyncPoller();
            syncPoller.waitForCompletion();
            validateReceiptResult(getExpectedReceipts(false), syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies receipt data for a document using source as file url and include content when includeTextDetails is
     * true.
     */
    @Test
    void recognizeReceiptSourceUrlTextDetails() {
        receiptSourceUrlRunnerTextDetails((sourceUrl, includeTextDetails) -> {
            SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceiptsFromUrl(sourceUrl, includeTextDetails, null).getSyncPoller();
            syncPoller.waitForCompletion();
            validateReceiptResult(getExpectedReceipts(includeTextDetails), syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies receipt data from a document using file data as source.
     */
    @Test
    void recognizeReceiptData() {
        receiptDataRunner((data) -> {
            SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller =
                client.beginRecognizeReceipts(toFluxByteBuffer(data), RECEIPT_FILE_LENGTH,
                    FormContentType.IMAGE_JPEG, false,
                    null).getSyncPoller();
            syncPoller.waitForCompletion();
            validateReceiptResult(getExpectedReceipts(false), syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies receipt data from a document using file data as source and including text content details.
     */
    @Test
    void recognizeReceiptDataTextDetails() {
        receiptDataRunnerTextDetails((data, includeTextDetails) -> {
            SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller
                = client.beginRecognizeReceipts(toFluxByteBuffer(data), RECEIPT_FILE_LENGTH,
                FormContentType.IMAGE_JPEG, includeTextDetails,
                null).getSyncPoller();
            syncPoller.waitForCompletion();
            validateReceiptResult(getExpectedReceipts(true),
                syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies that an exception is thrown for invalid source url.
     */
    @Test
    void recognizeReceiptInvalidSourceUrl() {
        invalidSourceUrlRunner((sourceUrl) -> assertThrows(ErrorResponseException.class, () ->
            client.beginRecognizeReceiptsFromUrl(sourceUrl).getSyncPoller()));
    }

    /**
     * Verifies receipt data is correctly transformed to USReceipt type.
     */
    @Test
    void recognizeReceiptAsUSReceipt() {
        receiptDataRunnerTextDetails((data, includeTextDetails) -> {
            SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller
                = client.beginRecognizeReceipts(toFluxByteBuffer(data), RECEIPT_FILE_LENGTH,
                FormContentType.IMAGE_JPEG, includeTextDetails,
                null).getSyncPoller();
            syncPoller.waitForCompletion();
            syncPoller.getFinalResult().forEach(recognizedReceipt -> validateUSReceipt(getExpectedUSReceipt(),
                ReceiptExtensions.asUSReceipt(recognizedReceipt), includeTextDetails));
        });
    }

    /**
     * Verifies receipt data from a document using file data as source.
     * And the content type is not given. The content will be auto detected.
     */
    @Test
    void recognizeReceiptDataWithContentTypeAutoDetection() {
        SyncPoller<OperationResult, IterableStream<RecognizedReceipt>> syncPoller =
            client.beginRecognizeReceipts(getReplayableBufferData(RECEIPT_LOCAL_URL), RECEIPT_FILE_LENGTH, null,
                false, null).getSyncPoller();
        syncPoller.waitForCompletion();
        validateReceiptResult(getExpectedReceipts(false), syncPoller.getFinalResult());
    }

    /**
     * Verifies layout data for a document using source as input stream data.
     */
    @Test
    void recognizeLayoutData() {
        layoutDataRunner((data) -> {
            SyncPoller<OperationResult, IterableStream<FormPage>> syncPoller
                = client.beginRecognizeContent(toFluxByteBuffer(data),
                FormContentType.IMAGE_JPEG, LAYOUT_FILE_LENGTH, null).getSyncPoller();
            syncPoller.waitForCompletion();
            validateLayoutResult(getExpectedFormPages(), syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies layout data for a document using source as input stream data.
     */
    @Test
    void recognizeLayoutSourceUrl() {
        layoutSourceUrlRunner(sourceUrl -> {
            SyncPoller<OperationResult, IterableStream<FormPage>> syncPoller
                = client.beginRecognizeContentFromUrl(sourceUrl).getSyncPoller();
            syncPoller.waitForCompletion();
            validateLayoutResult(getExpectedFormPages(), syncPoller.getFinalResult());
        });
    }

    /**
     * Verifies that an exception is thrown for invalid status model Id.
     */
    @Test
    void recognizeLayoutInvalidSourceUrl() {
        invalidSourceUrlRunner((invalidSourceUrl) -> assertThrows(ErrorResponseException.class, () ->
            client.beginRecognizeContentFromUrl(invalidSourceUrl).getSyncPoller()));
    }

    /**
     * Verifies that an exception is thrown for invalid status model Id.
     */
    @Test
    void recognizeCustomFormInvalidSourceUrl() {
        beginTrainingLabeledResultRunner((storageSASUrl, useLabelFile) -> {
            SyncPoller<OperationResult, CustomFormModel> syncPoller =
                client.getFormTrainingAsyncClient().beginTraining(storageSASUrl, useLabelFile).getSyncPoller();
            syncPoller.waitForCompletion();
            CustomFormModel createdModel = syncPoller.getFinalResult();
            StepVerifier.create(client.beginRecognizeCustomFormsFromUrl(INVALID_URL,
                createdModel.getModelId())).verifyErrorSatisfies(throwable -> assertEquals(throwable.getMessage(),
                INVALID_SOURCE_URL_ERROR));
        });
    }

    /**
     * Verifies custom form data for a document using source as input stream data and valid labeled model Id.
     */
    @Test
    void recognizeCustomFormLabeledData() {
        customFormLabeledDataRunner(data ->
            beginTrainingLabeledResultRunner((storageSASUrl, useLabelFile) -> {
                SyncPoller<OperationResult, CustomFormModel> syncPoller =
                    client.getFormTrainingAsyncClient().beginTraining(storageSASUrl, useLabelFile).getSyncPoller();
                syncPoller.waitForCompletion();

                SyncPoller<OperationResult, IterableStream<RecognizedForm>> syncPollers
                    = client.beginRecognizeCustomForms(toFluxByteBuffer(data),
                    syncPoller.getFinalResult().getModelId(),
                    CUSTOM_FORM_FILE_LENGTH, FormContentType.APPLICATION_PDF, true, null)
                    .getSyncPoller();
                syncPoller.waitForCompletion();
                validateRecognizedFormResult(getExpectedRecognizedLabeledForms(), syncPollers.getFinalResult());
            }));
    }

    /**
     * Verifies custom form data for a document using source as input stream data and valid labeled model Id.
     */
    @Test
    void recognizeCustomFormUnlabeledData() {
        customFormLabeledDataRunner(data ->
            beginTrainingUnlabeledResultRunner((storageSASUrl, useLabelFile) -> {
                SyncPoller<OperationResult, CustomFormModel> syncPoller =
                    client.getFormTrainingAsyncClient().beginTraining(storageSASUrl, useLabelFile).getSyncPoller();
                syncPoller.waitForCompletion();

                SyncPoller<OperationResult, IterableStream<RecognizedForm>> syncPollers
                    = client.beginRecognizeCustomForms(toFluxByteBuffer(data),
                    syncPoller.getFinalResult().getModelId(),
                    CUSTOM_FORM_FILE_LENGTH, FormContentType.APPLICATION_PDF, false, null)
                    .getSyncPoller();
                syncPoller.waitForCompletion();
                validateRecognizedFormResult(getExpectedRecognizedForms(), syncPollers.getFinalResult());
            }));
    }
}
