package com.azure.storage.blob.quickquery;

import com.azure.core.util.Context;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.blob.models.BlobRequestConditions;
import com.azure.storage.blob.quickquery.models.BlobQuickQueryDelimitedSerialization;
import com.azure.storage.blob.quickquery.models.BlobQuickQueryJsonSerialization;
import com.azure.storage.blob.quickquery.models.BlobQuickQuerySerialization;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.time.Duration;

public class BlobQuickQueryAsyncClientJavaDocCodeSnippets {

    private BlobQuickQueryAsyncClient client = new BlobQuickQueryClientBuilder(new BlobClientBuilder().buildAsyncClient())
        .buildAsyncClient();

    private Duration timeout = Duration.ofSeconds(30);
    private String key = "key";
    private String value = "value";

    /**
     * Code snippet for {@link BlobQuickQueryAsyncClient#query(String)}
     */
    public void query() {
        // BEGIN: com.azure.storage.blob.quickquery.BlobQuickQueryAsyncClient.query#String
        ByteArrayOutputStream queryData = new ByteArrayOutputStream();
        String expression = "SELECT c1,c2 from blob1 WHERE c1 > 20 LIMIT 100;";
        client.query(expression).subscribe(piece -> {
            try {
                queryData.write(piece.array());
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        });
        // END: com.azure.storage.blob.quickquery.BlobQuickQueryAsyncClient.query#String
    }

    /**
     * Code snippet for {@link BlobQuickQueryAsyncClient#queryWithResponse(String, BlobQuickQuerySerialization, BlobQuickQuerySerialization, BlobRequestConditions)}
     */
    public void queryWithResponse() {
        // BEGIN: com.azure.storage.blob.quickquery.BlobQuickQueryAsyncClient.queryWithResponse#String-BlobQuickQuerySerialization-BlobQuickQuerySerialization-BlobRequestConditions
        String expression = "SELECT c1,c2 from blob1 WHERE c1 > 20 LIMIT 100;";
        BlobQuickQueryJsonSerialization input = new BlobQuickQueryJsonSerialization()
            .setRecordSeparator('\n');
        BlobQuickQueryDelimitedSerialization output = new BlobQuickQueryDelimitedSerialization()
            .setEscapeChar('\0')
            .setColumnSeparator(',')
            .setRecordSeparator('\n')
            .setFieldQuote('\'')
            .setHeadersPresent(true);

        client.queryWithResponse(expression, input, output, null).subscribe(response -> {
            ByteArrayOutputStream queryData = new ByteArrayOutputStream();
            response.getValue().subscribe(piece -> {
                try {
                    queryData.write(piece.array());
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            });
        });
        // END: com.azure.storage.blob.quickquery.BlobQuickQueryAsyncClient.queryWithResponse#String-BlobQuickQuerySerialization-BlobQuickQuerySerialization-BlobRequestConditions
    }
}
