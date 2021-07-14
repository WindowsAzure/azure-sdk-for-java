// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.providerhub {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.providerhub;
    exports com.azure.resourcemanager.providerhub.fluent;
    exports com.azure.resourcemanager.providerhub.fluent.models;
    exports com.azure.resourcemanager.providerhub.models;

    opens com.azure.resourcemanager.providerhub.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.providerhub.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
