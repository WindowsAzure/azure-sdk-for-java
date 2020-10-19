// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.clientTelemetry;

import com.azure.cosmos.ConnectionMode;
import com.azure.cosmos.implementation.Configs;
import com.azure.cosmos.implementation.GlobalEndpointManager;
import com.azure.cosmos.implementation.cpu.CpuMemoryMonitor;
import com.azure.cosmos.implementation.http.HttpClient;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.HdrHistogram.DoubleHistogram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTelemetry {
    public final static int TELEMETRY_SCHEDULING_IN_SEC = 600;
    public final static int REQUEST_LATENCY_MAX = 300000000;
    public final static int REQUEST_LATENCY_SUCCESS_PRECISION = 4;
    public final static int REQUEST_LATENCY_FAILURE_PRECISION = 4;
    public final static String REQUEST_LATENCY_NAME = "RequestLatency";
    public final static String REQUEST_LATENCY_UNIT = "MicroSec";

    public final static int REQUEST_CHARGE_MAX = 10000;
    public final static int REQUEST_CHARGE_PRECISION = 2;
    public final static String REQUEST_CHARGE_NAME = "RequestCharge";
    public final static String REQUEST_CHARGE_UNIT = "RU";

    public final static int CPU_MAX = 100;
    public final static int CPU_PRECISION = 2;
    private final static String CPU_NAME = "CPU";
    private final static String CPU_UNIT = "Percentage";

    public final static int MEMORY_MAX = 102400;
    public final static int MEMORY_PRECISION = 2;
    private final static String MEMORY_NAME = "MemoryRemaining";
    private final static String MEMORY_UNIT = "MB";

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private ClientTelemetryInfo clientTelemetryInfo;
    private HttpClient httpClient;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Scheduler scheduler = Schedulers.fromExecutor(executor);
    private static final Logger logger = LoggerFactory.getLogger(GlobalEndpointManager.class);
    private volatile boolean isClosed;
    private volatile boolean isClientTelemetryEnabled;

    private static final double PERCENTILE_50 = 50.0;
    private static final double PERCENTILE_90 = 90.0;
    private static final double PERCENTILE_95 = 95.0;
    private static final double PERCENTILE_99 = 99.0;
    private static final double PERCENTILE_999 = 99.9;

    public ClientTelemetry(Boolean acceleratedNetworking,
                           String clientId,
                           String processId,
                           String userAgent,
                           ConnectionMode connectionMode,
                           String globalDatabaseAccountName,
                           String applicationRegion,
                           String hostEnvInfo,
                           HttpClient httpClient,
                           boolean isClientTelemetryEnabled
    ) {
        clientTelemetryInfo = new ClientTelemetryInfo(clientId, processId, userAgent, connectionMode,
            globalDatabaseAccountName, applicationRegion, hostEnvInfo, acceleratedNetworking);
        ReportPayload cpuReportPayload = new ReportPayload(CPU_NAME, CPU_UNIT);
        clientTelemetryInfo.getSystemInfoMap().put(cpuReportPayload, CpuMemoryMonitor.getCpuLoadForClientTelemetry());

        ReportPayload memoryReportPayload = new ReportPayload(MEMORY_NAME, MEMORY_UNIT);
        clientTelemetryInfo.getSystemInfoMap().put(memoryReportPayload, CpuMemoryMonitor.getRemainingForClientTelemetry());
        this.isClosed = false;

        this.isClientTelemetryEnabled = isClientTelemetryEnabled;
    }

    public ClientTelemetryInfo getClientTelemetryInfo() {
        return clientTelemetryInfo;
    }

    public static void RecordValue(DoubleHistogram doubleHistogram, long value) {
        try {
            doubleHistogram.recordValue(value);
        } catch (Exception ex) {
            logger.warn("Error while recording value for client telemetry", ex.getMessage());
        }
    }

    public static void RecordValue(DoubleHistogram doubleHistogram, double value) {
        try {
            doubleHistogram.recordValue(value);
        } catch (Exception ex) {
            logger.warn("Error while recording value for client telemetry", ex.getMessage());
        }
    }

    public void init() {
        System.out.println("ClientTelemetry.init");
        sendClientTelemetry().subscribe();
    }

    public void close() {
        this.isClosed = true;
        this.executor.shutdown();
        logger.debug("GlobalEndpointManager closed.");
    }

    private Mono<Void> sendClientTelemetry() {
        return Mono.delay(Duration.ofSeconds(TELEMETRY_SCHEDULING_IN_SEC))
            .flatMap(t -> {
                if (this.isClosed) {
                    logger.warn("client already closed");
                    return Mono.empty();
                }

                if(!Configs.isClientTelemetryEnabled(this.isClientTelemetryEnabled)) {
                    logger.trace("client telemetry not enabled");
                    return Mono.empty();
                }

                readHistogram();
                try {
                    logger.info("ClientTelemetry {}", OBJECT_MAPPER.writeValueAsString(this.clientTelemetryInfo));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                clearDataForNextRun();
                return this.sendClientTelemetry();
            }).onErrorResume(ex -> {
                logger.error("sendClientTelemetry() - Unable to send client telemetry" +
                    ". Exception: {}", ex.toString(), ex);
                clearDataForNextRun();
                return this.sendClientTelemetry();
            }).subscribeOn(scheduler);
    }

    private void clearDataForNextRun() {
        this.clientTelemetryInfo.getOperationInfoMap().clear();
        this.clientTelemetryInfo.getCacheRefreshInfoMap().clear();
        for (DoubleHistogram histogram : this.clientTelemetryInfo.getSystemInfoMap().values()) {
            histogram.reset();
        }
    }

    private void readHistogram() {
        this.clientTelemetryInfo.setTimeStamp(Instant.now().toString());
        for (Map.Entry<ReportPayload, DoubleHistogram> entry : this.clientTelemetryInfo.getSystemInfoMap().entrySet()) {
            fillMetricsInfo(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<ReportPayload, DoubleHistogram> entry :
            this.clientTelemetryInfo.getCacheRefreshInfoMap().entrySet()) {
            fillMetricsInfo(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<ReportPayload, DoubleHistogram> entry : this.clientTelemetryInfo.getOperationInfoMap().entrySet()) {
            fillMetricsInfo(entry.getKey(), entry.getValue());
        }

        this.clientTelemetryInfo.setSystemInfo(this.clientTelemetryInfo.getSystemInfoMap().keySet());
        this.clientTelemetryInfo.setCacheRefreshInfo(this.clientTelemetryInfo.getCacheRefreshInfoMap().keySet());
        this.clientTelemetryInfo.setOperationInfo(this.clientTelemetryInfo.getOperationInfoMap().keySet());
    }

    private void fillMetricsInfo(ReportPayload payload, DoubleHistogram histogram) {
        payload.getMetricInfo().setCount(histogram.getTotalCount());
        payload.getMetricInfo().setMax(histogram.getMaxValue());
        payload.getMetricInfo().setMin(histogram.getMinValue());
        payload.getMetricInfo().setMean(histogram.getMean());
        Map<Double, Double> percentile = new HashMap<>();
        percentile.put(PERCENTILE_50, histogram.getValueAtPercentile(PERCENTILE_50));
        percentile.put(PERCENTILE_90, histogram.getValueAtPercentile(PERCENTILE_90));
        percentile.put(PERCENTILE_95, histogram.getValueAtPercentile(PERCENTILE_95));
        percentile.put(PERCENTILE_99, histogram.getValueAtPercentile(PERCENTILE_99));
        percentile.put(PERCENTILE_999, histogram.getValueAtPercentile(PERCENTILE_999));
        payload.getMetricInfo().setPercentiles(percentile);
    }
}
