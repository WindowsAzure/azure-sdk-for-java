// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.lro;

import com.azure.ai.textanalytics.TextAnalyticsAsyncClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.AnalyzeActionsOperationDetail;
import com.azure.ai.textanalytics.models.AnalyzeActionsOptions;
import com.azure.ai.textanalytics.models.AnalyzeActionsResult;
import com.azure.ai.textanalytics.models.CustomEntity;
import com.azure.ai.textanalytics.models.RecognizeCustomEntitiesAction;
import com.azure.ai.textanalytics.models.RecognizeCustomEntitiesActionResult;
import com.azure.ai.textanalytics.models.RecognizeCustomEntitiesResult;
import com.azure.ai.textanalytics.models.TextAnalyticsActions;
import com.azure.ai.textanalytics.models.TextDocumentInput;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.rest.PagedResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnalyzeCustomEntitiesActionAsync {
    /**
     * Main method to invoke this demo about how to analyze a batch of tasks.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        TextAnalyticsAsyncClient client = new TextAnalyticsClientBuilder()
                                              .credential(new AzureKeyCredential("{key}"))
                                              .endpoint("{endpoint}")
                                              .buildAsyncClient();

        List<TextDocumentInput> documents = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            documents.add(new TextDocumentInput(Integer.toString(i),
                "The government of British Prime Minster Theresa May has been plunged into turmoil with "
                    + "the resignation of two senior Cabinet ministers in a deep split over her Brexit strategy."
                    + "The Foreign Secretary Boris Johnson, quit on Monday, hours after the resignation late on"
                    + "Sunday night of the minister in charge of Brexit negotiations, David Davis.  Their"
                    + "decision to leave the government came three days after May appeared to have agreed a"
                    + "deal with her fractured Cabinet on the UK's post-Brexit relationship with the EU."
                    + "That plan is now in tatters and her political future appears uncertain."
                    + "May appeared in Parliament on Monday afternoon to defend her plan, minutes after"
                    + "Downing Street confirmed the departure of Johnson. May acknowledged the splits in"
                    + "her statement to MPs, saying of the ministers who quit: \"We do not agree about the"
                    + "best way of delivering our shared commitment to honoring the result of the referendum.\""
                    + "The Prime Minister's latest plitical drama began late on Sunday night when Davis quit,"
                    + "declaring he could not support May's Brexit plan.  He said it involved too close a "
                    + "relationship with the EU and gave only an illusion of control being returned to the UK"
                    + "after it left the EU. \"It seems to me we're giving too much away, too easily, and"
                    + "that's a dangerous strategy at this time,\" Davis said in a BBC radio interview Monday"
                    + "morning. Johnson's resignation came Monday afternoon local time, just before the Prime"
                    + " Minister was due to make a scheduled statement in Parliament. \"This afternoon, the Prime"
                    + "Minister accepted the resignation of Boris Johnson as Foreign Secretary,\" a"
                    + "statement from Downing Street said."
            ));
        }

        client.beginAnalyzeActions(documents,
            new TextAnalyticsActions()
                .setDisplayName("{tasks_display_name}")
                .setRecognizeCustomEntitiesActions(
                    new RecognizeCustomEntitiesAction()
                        .setProjectName("myFirstBlackBox")
                        .setModelName("model1")),
            new AnalyzeActionsOptions().setIncludeStatistics(false))
            .flatMap(result -> {
                AnalyzeActionsOperationDetail operationDetail = result.getValue();
                System.out.printf("Action display name: %s, Successfully completed actions: %d, in-process actions: %d,"
                                      + " failed actions: %d, total actions: %d%n",
                    operationDetail.getDisplayName(), operationDetail.getSucceededCount(),
                    operationDetail.getInProgressCount(), operationDetail.getFailedCount(),
                    operationDetail.getTotalCount());
                return result.getFinalResult();
            })
            .flatMap(analyzeActionsResultPagedFlux -> analyzeActionsResultPagedFlux.byPage())
            .subscribe(
                perPage -> processAnalyzeActionsResult(perPage),
                ex -> System.out.println("Error listing pages: " + ex.getMessage()),
                () -> System.out.println("Successfully listed all pages"));

        // The .subscribe() creation and assignment is not a blocking call. For the purpose of this example, we sleep
        // the thread so the program does not end before the send operation is complete. Using .block() instead of
        // .subscribe() will turn this into a synchronous call.
        try {
            TimeUnit.MINUTES.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void processAnalyzeActionsResult(PagedResponse<AnalyzeActionsResult> perPage) {
        System.out.printf("Response code: %d, Continuation Token: %s.%n",
            perPage.getStatusCode(), perPage.getContinuationToken());

        for (AnalyzeActionsResult actionsResult : perPage.getElements()) {
            System.out.println("Custom entities recognition action results:");
            for (RecognizeCustomEntitiesActionResult actionResult : actionsResult.getRecognizeCustomEntitiesResults()) {
                if (!actionResult.isError()) {
                    System.out.printf("Project Name: %s, model name: %s.%n",
                        actionResult.getProjectName(), actionResult.getModelName());

                    for (RecognizeCustomEntitiesResult documentResult : actionResult.getDocumentsResults()) {
                        if (!documentResult.isError()) {
                            for (CustomEntity entity : documentResult.getEntities()) {
                                System.out.printf(
                                    "\tText: %s, category: %s, confidence score: %f.%n",
                                    entity.getText(), entity.getCategory(), entity.getConfidenceScore());
                            }
                        } else {
                            System.out.printf("\tCannot recognize custom entities. Error: %s%n",
                                documentResult.getError().getMessage());
                        }
                    }
                } else {
                    System.out.printf("\tCannot execute Custom Entities Recognition action. Error: %s%n",
                        actionResult.getError().getMessage());
                }
            }
        }
    }
}
