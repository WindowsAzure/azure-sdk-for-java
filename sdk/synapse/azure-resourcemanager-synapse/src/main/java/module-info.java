// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.synapse {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.synapse;
    exports com.azure.resourcemanager.synapse.fluent;
    exports com.azure.resourcemanager.synapse.fluent.models;
    exports com.azure.resourcemanager.synapse.models;

    opens com.azure.resourcemanager.synapse.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.synapse.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
