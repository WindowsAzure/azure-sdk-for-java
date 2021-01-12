// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.windowsiot {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.windowsiot;
    exports com.azure.resourcemanager.windowsiot.fluent;
    exports com.azure.resourcemanager.windowsiot.fluent.models;
    exports com.azure.resourcemanager.windowsiot.models;

    opens com.azure.resourcemanager.windowsiot.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.windowsiot.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
