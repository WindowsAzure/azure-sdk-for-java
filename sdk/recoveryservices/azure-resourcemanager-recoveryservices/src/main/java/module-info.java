// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.recoveryservices {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.recoveryservices;
    exports com.azure.resourcemanager.recoveryservices.fluent;
    exports com.azure.resourcemanager.recoveryservices.fluent.models;
    exports com.azure.resourcemanager.recoveryservices.models;

    opens com.azure.resourcemanager.recoveryservices.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.recoveryservices.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
