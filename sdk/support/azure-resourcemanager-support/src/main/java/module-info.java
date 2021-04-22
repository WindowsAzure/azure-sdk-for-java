// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.support {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.support;
    exports com.azure.resourcemanager.support.fluent;
    exports com.azure.resourcemanager.support.fluent.models;
    exports com.azure.resourcemanager.support.models;

    opens com.azure.resourcemanager.support.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.support.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}