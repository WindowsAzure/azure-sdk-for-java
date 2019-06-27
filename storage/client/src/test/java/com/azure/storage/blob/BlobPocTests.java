// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.ProxyOptions.Type;
import com.azure.storage.blob.implementation.AzureBlobStorageBuilder;
import com.azure.storage.blob.implementation.AzureBlobStorageImpl;
import com.azure.storage.blob.models.BlobsGetPropertiesResponse;
import com.azure.storage.blob.models.BlockLookupList;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.commons.codec.binary.Base64;
import reactor.core.publisher.Flux;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BlobPocTests {

    //@Test
    public void testCreateBlob() {
        AzureBlobStorageImpl client = new AzureBlobStorageBuilder().pipeline(HttpPipeline.builder().httpClient(HttpClient.createDefault().proxy(() -> new ProxyOptions(Type.HTTP, new InetSocketAddress("localhost", 8888)))).build()).url("https://" + System.getenv("AZURE_STORAGE_ACCOUNT_NAME") + ".blob.core.windows.net/mycontainer/random223" + System.getenv("AZURE_STORAGE_SAS_TOKEN")).build();
            /*,
            new HttpPipelinePolicy() {
                @Override
                public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                    String url = context.httpRequest().url().toString();
                    String sasToken = System.getenv("AZURE_STORAGE_SAS_TOKEN");
                    if (url.contains("?")) {
                        sasToken = sasToken.replaceFirst("\\?", "&");
                    }
                    url += sasToken;
                    try {
                        context.withHttpRequest(context.httpRequest().withUrl(new URL(url)));
                    } catch (MalformedURLException e) {
                        return Mono.error(e);
                    }
                    return next.process();
                }
        }*/;

        Random random = new Random();

        byte[] randomBytes = new byte[4096];
        random.nextBytes(randomBytes);
        ByteBuf bb = Unpooled.wrappedBuffer(randomBytes);
        String base64 = Base64.encodeBase64String("0001".getBytes(StandardCharsets.UTF_8));
        client.blockBlobs().stageBlockWithRestResponseAsync(null, null, base64, 4096, Flux.just(bb), null).block();
        client.blockBlobs().commitBlockListWithRestResponseAsync(null, null, new BlockLookupList().latest(Arrays.asList(base64)), null).block();

        client.blobs().setMetadataWithRestResponseAsync(null, null, null, Collections.singletonMap("foo", "bar"), null, null, null, null, null, null, null).block();
        BlobsGetPropertiesResponse res = client.blobs().getPropertiesWithRestResponseAsync(null, null, null).block();
        System.out.println(res.deserializedHeaders().metadata().size());
    }
}
