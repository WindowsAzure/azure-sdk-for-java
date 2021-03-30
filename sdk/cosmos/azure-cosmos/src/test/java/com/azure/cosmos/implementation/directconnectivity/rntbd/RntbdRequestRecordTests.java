// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity.rntbd;

import com.azure.cosmos.implementation.GoneException;
import com.azure.cosmos.implementation.OperationType;
import com.azure.cosmos.implementation.RequestTimeoutException;
import com.azure.cosmos.implementation.ResourceType;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

import static com.azure.cosmos.implementation.TestUtils.mockDiagnosticsClientContext;
import static org.assertj.core.api.Assertions.assertThat;

public class RntbdRequestRecordTests {

    @DataProvider
    public static Object[][] rntbdRequestArgs() {
        return new Object[][]{
            { OperationType.Read, GoneException.class },
            { OperationType.Create, RequestTimeoutException.class },
        };
    }

    @Test(groups = { "unit" }, dataProvider = "rntbdRequestArgs")
    public void expireRecord(OperationType operationType, Class exceptionType) throws URISyntaxException {

        RntbdRequestArgs requestArgs = new RntbdRequestArgs(
            RxDocumentServiceRequest.create(mockDiagnosticsClientContext(), operationType, ResourceType.Document),
            new URI("http://localhost/replica-path")
        );

        RntbdRequestTimer requestTimer = new RntbdRequestTimer(5000, 5000);
        RntbdRequestRecord record = new AsyncRntbdRequestRecord(requestArgs, requestTimer);
        record.expire();

        try{
            record.get();
            Assert.fail("RntbdRequestRecord should complete with exception");
        } catch (ExecutionException e) {
            Throwable innerException = e.getCause();
            assertThat(innerException).isInstanceOf(exceptionType);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
