// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.mixedreality {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.mixedreality;
    exports com.azure.resourcemanager.mixedreality.fluent;
    exports com.azure.resourcemanager.mixedreality.fluent.models;
    exports com.azure.resourcemanager.mixedreality.models;

    opens com.azure.resourcemanager.mixedreality.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.mixedreality.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
