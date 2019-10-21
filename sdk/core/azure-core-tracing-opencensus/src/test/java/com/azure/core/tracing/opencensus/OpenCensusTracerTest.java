// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.tracing.opencensus;

import com.azure.core.util.Context;
import com.azure.core.util.tracing.ProcessKind;
import io.opencensus.implcore.trace.RecordEventsSpanImpl;
import io.opencensus.trace.AttributeValue;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.Tracer;
import io.opencensus.trace.Tracing;
import io.opencensus.trace.config.TraceConfig;
import io.opencensus.trace.config.TraceParams;
import io.opencensus.trace.samplers.Samplers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static com.azure.core.tracing.opencensus.OpenCensusTracer.COMPONENT;
import static com.azure.core.tracing.opencensus.OpenCensusTracer.MESSAGE_BUS_DESTINATION;
import static com.azure.core.tracing.opencensus.OpenCensusTracer.PEER_ENDPOINT;
import static com.azure.core.util.tracing.Tracer.DIAGNOSTIC_ID_KEY;
import static com.azure.core.util.tracing.Tracer.ENTITY_PATH_KEY;
import static com.azure.core.util.tracing.Tracer.HOST_NAME_KEY;
import static com.azure.core.util.tracing.Tracer.PARENT_SPAN_KEY;
import static com.azure.core.util.tracing.Tracer.SPAN_CONTEXT_KEY;

/**
 * Tests OpenCensus tracing package using opencensus-impl
 */
public class OpenCensusTracerTest {
    private static final String METHOD_NAME = "Azure.eventhubs.send";
    private static final String HOSTNAME_VALUE = "testEventDataNameSpace.servicebus.windows.net";
    private static final String ENTITY_PATH_VALUE = "test";
    private static final String COMPONENT_VALUE = "eventhubs";
    private OpenCensusTracer openCensusTracer;
    private Tracer tracer;
    private Context tracingContext;
    Span parentSpan;

    @Before
    public void setUp() {
        System.out.println("Running: setUp");
        openCensusTracer = new OpenCensusTracer();
        // Configure 100% sample rate, otherwise, few traces will be sampled.
        TraceConfig traceConfig = Tracing.getTraceConfig();
        TraceParams activeTraceParams = traceConfig.getActiveTraceParams();
        traceConfig.updateActiveTraceParams(activeTraceParams.toBuilder().setSampler(Samplers.alwaysSample()).build());
        // Get the global singleton Tracer object.
        tracer = Tracing.getTracer();
        // Start user parent span.
        tracer.spanBuilder(PARENT_SPAN_KEY).startScopedSpan();
        parentSpan = tracer.getCurrentSpan();
        // Add parent span to tracingContext
        tracingContext =  new Context(PARENT_SPAN_KEY, parentSpan);
    }

    @After
    public void tearDown() {
        System.out.println("Running: tearDown");
        // Clear out tracer and tracingContext objects
        tracer = null;
        tracingContext = null;
        Assert.assertNull(tracer);
        Assert.assertNull(tracingContext);
    }

    @Test(expected = NullPointerException.class)
    public void startSpanNullPointerException() {
        // Act
        openCensusTracer.start("", null);
    }

    @Test
    public void startSpanParentContextFlowTest() {
        // Arrange
        SpanId parentSpanId = parentSpan.getContext().getSpanId();

        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, tracingContext);

        // Assert
        assertSpanWithExplicitParent(updatedContext, parentSpanId);
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertNull(recordEventsSpan.getKind());
    }

    @Test
    public void startSpanTestNoUserParent() {
        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, Context.NONE);

        // Assert
        Assert.assertNotNull(updatedContext.getData(PARENT_SPAN_KEY));

        //verify still get a valid span implementation
        Assert.assertTrue(updatedContext.getData(PARENT_SPAN_KEY).get() instanceof RecordEventsSpanImpl);
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();

        Assert.assertEquals(METHOD_NAME, recordEventsSpan.getName());
        Assert.assertFalse(recordEventsSpan.toSpanData().getHasRemoteParent());
        Assert.assertNotNull(recordEventsSpan.toSpanData().getParentSpanId());
    }

    @Test
    public void startSpanProcessKindSend() {
        // Arrange
        tracer.spanBuilder(PARENT_SPAN_KEY).startScopedSpan();
        SpanId parentSpanId = parentSpan.getContext().getSpanId();
        // Add additional metadata to spans for SEND
        Context traceContext = tracingContext.addData(ENTITY_PATH_KEY, ENTITY_PATH_VALUE).addData(HOST_NAME_KEY, HOSTNAME_VALUE);

        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, traceContext, ProcessKind.SEND);

        // Assert
        // verify span created with explicit parent when for Process Kind SEND
        assertSpanWithExplicitParent(updatedContext, parentSpanId);
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertEquals(Span.Kind.CLIENT, recordEventsSpan.getKind());

        // verify span attributes
        Map<String, AttributeValue> attributeMap = recordEventsSpan.toSpanData().getAttributes().getAttributeMap();
        Assert.assertEquals(attributeMap.get(COMPONENT), AttributeValue.stringAttributeValue(COMPONENT_VALUE));
        Assert.assertEquals(attributeMap.get(MESSAGE_BUS_DESTINATION), AttributeValue.stringAttributeValue(ENTITY_PATH_VALUE));
        Assert.assertEquals(attributeMap.get(PEER_ENDPOINT), AttributeValue.stringAttributeValue(HOSTNAME_VALUE));
    }

    @Test
    public void startSpanProcessKindReceive() {
        // Arrange
        tracer.spanBuilder(PARENT_SPAN_KEY).startScopedSpan();
        SpanId parentSpanId = parentSpan.getContext().getSpanId();

        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, tracingContext, ProcessKind.RECEIVE);

        // Assert
        // verify span created with explicit parent when no span context in the sending Context object
        assertSpanWithExplicitParent(updatedContext, parentSpanId);
        // verify no kind set on Span for receive
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertNull(recordEventsSpan.getKind());
        // verify diagnostic id and span context returned
        Assert.assertNotNull(updatedContext.getData(SPAN_CONTEXT_KEY).get());
        Assert.assertNotNull(updatedContext.getData(DIAGNOSTIC_ID_KEY).get());
    }

    @Test
    public void startSpanProcessKindProcess() {
        // Arrange
        tracer.spanBuilder(PARENT_SPAN_KEY).startScopedSpan();
        SpanId parentSpanId = parentSpan.getContext().getSpanId();

        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, tracingContext, ProcessKind.PROCESS);

        // verify no parent span passed
        Assert.assertTrue("When no parent span passed in context information",
            !tracingContext.getData(SPAN_CONTEXT_KEY).isPresent());
        // verify span created with explicit parent
        assertSpanWithExplicitParent(updatedContext, parentSpanId);
        // verify scope returned
        Assert.assertNotNull(updatedContext.getData("scope").get());
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertEquals(Span.Kind.SERVER, recordEventsSpan.getKind());
    }

    @Test
    public void startProcessSpanWithRemoteParent() {
        // Arrange
        Span testSpan = tracer.spanBuilder("child-span").startSpan();
        SpanId testSpanId = testSpan.getContext().getSpanId();
        Context traceContext = tracingContext.addData(SPAN_CONTEXT_KEY, testSpan.getContext());

        // Act
        final Context updatedContext = openCensusTracer.start(METHOD_NAME, traceContext, ProcessKind.PROCESS);

        // Assert
        Assert.assertNotNull(updatedContext.getData("scope").get());
        // Assert new span created with remote parent context
        assertSpanWithRemoteParent(updatedContext, testSpanId);
    }

    @Test(expected = NullPointerException.class)
    public void startSpanOverloadNullPointerException() {
        // Act
        openCensusTracer.start("", Context.NONE, null);
    }

    //add tests for number of child spans created and how parent span relation

    @Test
    public void addLinkTest() {
        // Arrange
        // Create a child-parent link between multiple spans
        RecordEventsSpanImpl testSpan = (RecordEventsSpanImpl) tracer.spanBuilder("new-test-span").startSpan();
        Context traceContext = tracingContext.addData(SPAN_CONTEXT_KEY, testSpan.getContext());
        RecordEventsSpanImpl parentSpanImpl = (RecordEventsSpanImpl) parentSpan;

        // Act
        openCensusTracer.addLink(traceContext);

        //Assert
        // TODO: existing -> parentSpanImpl comes after after add Link, confirm this behavior?
        Assert.assertEquals(parentSpanImpl.getPrev(), testSpan);
        // verify both spans share the same link traceId
        Assert.assertEquals(parentSpanImpl.toSpanData().getContext().getTraceId(), testSpan.toSpanData().getContext().getTraceId());
    }

    @Test
    public void endSpanNoSuccessErrorMessageTest() {
        // Arrange
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) tracer.getCurrentSpan();
        final String expectedStatus = "UNKNOWN";

        // Act
        openCensusTracer.end(null, null, tracingContext);

        // Assert
        Assert.assertEquals(expectedStatus, recordEventsSpan.getStatus().getCanonicalCode().toString());
    }

    @Test
    public void endSpanErrorMessageTest() {
        // Arrange
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) tracer.getCurrentSpan();
        final String throwableMessage = "custom error message";
        final String expectedStatus = "UNKNOWN";

        // Act
        openCensusTracer.end(null, new Throwable(throwableMessage), tracingContext);

        // Assert
        Assert.assertEquals(expectedStatus, recordEventsSpan.getStatus().getCanonicalCode().toString());
        Assert.assertEquals(throwableMessage, recordEventsSpan.getStatus().getDescription());
    }

    @Test
    public void endSpanTestThrowableResponseCode() {
        // Arrange
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) tracer.getCurrentSpan();
        final String throwableMessage = "Resource not found";
        final String expectedStatus = "NOT_FOUND";

        // Act
        openCensusTracer.end(404, new Throwable(throwableMessage), tracingContext);

        // Assert
        Assert.assertEquals(expectedStatus, recordEventsSpan.getStatus().getCanonicalCode().toString());
        Assert.assertEquals(throwableMessage, recordEventsSpan.getStatus().getDescription());

    }

    private void assertSpanWithExplicitParent(Context updatedContext, SpanId parentSpanId) {
        Assert.assertNotNull(updatedContext.getData(PARENT_SPAN_KEY));

        // verify instance created of openCensus-impl (test impl), span implementation
        Assert.assertTrue(updatedContext.getData(PARENT_SPAN_KEY).get() instanceof RecordEventsSpanImpl);

        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertEquals(METHOD_NAME, recordEventsSpan.getName());

        // verify span started with explicit parent
        Assert.assertFalse(recordEventsSpan.toSpanData().getHasRemoteParent());
        Assert.assertEquals(parentSpanId, recordEventsSpan.toSpanData().getParentSpanId());
    }

    private void assertSpanWithRemoteParent(Context updatedContext, SpanId parentSpanId) {
        Assert.assertNotNull(updatedContext.getData(PARENT_SPAN_KEY));

        // verify instance created of openCensus-impl (test impl), span implementation
        Assert.assertTrue(updatedContext.getData(PARENT_SPAN_KEY).get() instanceof RecordEventsSpanImpl);

        // verify span created with provided name and kind server
        RecordEventsSpanImpl recordEventsSpan = (RecordEventsSpanImpl) updatedContext.getData(PARENT_SPAN_KEY).get();
        Assert.assertEquals(METHOD_NAME, recordEventsSpan.getName());
        Assert.assertEquals(Span.Kind.SERVER, recordEventsSpan.getKind());

        // verify span started with remote parent
        Assert.assertTrue(recordEventsSpan.toSpanData().getHasRemoteParent());
        Assert.assertEquals(parentSpanId, recordEventsSpan.toSpanData().getParentSpanId());
    }
}
