// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.datadog {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.datadog;
    exports com.azure.resourcemanager.datadog.fluent;
    exports com.azure.resourcemanager.datadog.fluent.models;
    exports com.azure.resourcemanager.datadog.models;

    opens com.azure.resourcemanager.datadog.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.datadog.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
