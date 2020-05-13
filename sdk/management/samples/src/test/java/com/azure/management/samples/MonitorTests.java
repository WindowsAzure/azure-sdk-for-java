// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.samples;


import com.azure.management.monitor.samples.AutoscaleSettingsBasedOnPerformanceOrSchedule;
import com.azure.management.monitor.samples.QueryMetricsAndActivityLogs;
import com.azure.management.monitor.samples.SecurityBreachOrRiskActivityLogAlerts;
import com.azure.management.monitor.samples.WebAppPerformanceMonitoringAlerts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonitorTests extends SamplesTestBase {

    @Test
    public void testQueryMetricsAndActivityLogs() {
        // Skip test in "playback" mode due to HTTP calls made outside of the management plane which can not be recorded at this time
        if (!isPlaybackMode()) {
            Assertions.assertTrue(QueryMetricsAndActivityLogs.runSample(azure));
        }
    }

    @Test
    public void testSecurityBreachOrRiskActivityLogAlerts() {
        Assertions.assertTrue(SecurityBreachOrRiskActivityLogAlerts.runSample(azure));
    }

    @Test
    public void testWebAppPerformanceMonitoringAlerts() {
        Assertions.assertTrue(WebAppPerformanceMonitoringAlerts.runSample(azure));
    }

    @Test
    public void testAutoscaleSettingsBasedOnPerformanceOrSchedule() {
        // Skip test in "playback" mode due to HTTP calls made outside of the management plane which can not be recorded at this time
        if (!isPlaybackMode()) {
            Assertions.assertTrue(AutoscaleSettingsBasedOnPerformanceOrSchedule.runSample(azure));
        }
    }
}
