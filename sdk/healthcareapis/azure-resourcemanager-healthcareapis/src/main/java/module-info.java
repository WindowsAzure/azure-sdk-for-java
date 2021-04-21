// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.healthcareapis {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.healthcareapis;
    exports com.azure.resourcemanager.healthcareapis.fluent;
    exports com.azure.resourcemanager.healthcareapis.fluent.models;
    exports com.azure.resourcemanager.healthcareapis.models;

    opens com.azure.resourcemanager.healthcareapis.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.healthcareapis.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
