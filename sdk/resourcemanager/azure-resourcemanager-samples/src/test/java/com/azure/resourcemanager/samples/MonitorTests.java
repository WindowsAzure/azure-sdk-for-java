// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.samples;


import com.azure.resourcemanager.monitor.samples.AutoscaleSettingsBasedOnPerformanceOrSchedule;
import com.azure.resourcemanager.monitor.samples.QueryMetricsAndActivityLogs;
import com.azure.resourcemanager.monitor.samples.SecurityBreachOrRiskActivityLogAlerts;
import com.azure.resourcemanager.monitor.samples.WebAppPerformanceMonitoringAlerts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonitorTests extends SamplesTestBase {

    @Test
    public void testQueryMetricsAndActivityLogs() throws Exception {
        // Skip test in "playback" mode due to HTTP calls made outside of the management plane which can not be recorded at this time
        if (!isPlaybackMode()) {
            Assertions.assertTrue(QueryMetricsAndActivityLogs.runSample(azure));
        }
    }

    @Test
    public void testSecurityBreachOrRiskActivityLogAlerts() throws Exception {
        Assertions.assertTrue(SecurityBreachOrRiskActivityLogAlerts.runSample(azure));
    }

    @Test
    public void testWebAppPerformanceMonitoringAlerts() throws Exception {
        Assertions.assertTrue(WebAppPerformanceMonitoringAlerts.runSample(azure));
    }

    @Test
    public void testAutoscaleSettingsBasedOnPerformanceOrSchedule() throws Exception {
        // Skip test in "playback" mode due to HTTP calls made outside of the management plane which can not be recorded at this time
        if (!isPlaybackMode()) {
            Assertions.assertTrue(AutoscaleSettingsBasedOnPerformanceOrSchedule.runSample(azure));
        }
    }
}
