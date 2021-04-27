// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;

/** The details of the AZURE ML environment. */
@Immutable
public final class EnvironmentImageResponseEnvironment extends ModelEnvironmentDefinitionResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentImageResponseEnvironment.class);

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withPython(ModelEnvironmentDefinitionResponsePython python) {
        super.withPython(python);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withEnvironmentVariables(Map<String, String> environmentVariables) {
        super.withEnvironmentVariables(environmentVariables);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withDocker(ModelEnvironmentDefinitionResponseDocker docker) {
        super.withDocker(docker);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withSpark(ModelEnvironmentDefinitionResponseSpark spark) {
        super.withSpark(spark);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withR(ModelEnvironmentDefinitionResponseR r) {
        super.withR(r);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironment withInferencingStackVersion(String inferencingStackVersion) {
        super.withInferencingStackVersion(inferencingStackVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
