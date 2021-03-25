// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.kubernetesconfiguration {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.kubernetesconfiguration;
    exports com.azure.resourcemanager.kubernetesconfiguration.fluent;
    exports com.azure.resourcemanager.kubernetesconfiguration.fluent.models;
    exports com.azure.resourcemanager.kubernetesconfiguration.models;

    opens com.azure.resourcemanager.kubernetesconfiguration.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.kubernetesconfiguration.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
