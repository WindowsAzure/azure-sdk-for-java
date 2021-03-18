// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.iot.modelsrepository;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.Context;

import java.util.Map;

/**
 * This class provides a client for interacting synchronously with a ModelsRepository instance.
 * This client is instantiated through {@link ModelsRepositoryClientBuilder}.
 */
@ServiceClient(builder = ModelsRepositoryClientBuilder.class)
public final class ModelsRepositoryClient {
    private final ModelsRepositoryAsyncClient modelsRepositoryAsyncClient;

    ModelsRepositoryClient(ModelsRepositoryAsyncClient modelsRepositoryAsyncClient) {
        this.modelsRepositoryAsyncClient = modelsRepositoryAsyncClient;
    }

    /**
     * Gets the Azure Models Repository service API version that this client is configured to use for all service requests.
     * Unless configured while building this client through {@link ModelsRepositoryClientBuilder#serviceVersion(ModelsRepositoryServiceVersion)},
     * this value will be equal to the latest service API version supported by this client.
     *
     * @return The Azure Models Repository service API version.
     */
    public ModelsRepositoryServiceVersion getServiceVersion() {
        return this.modelsRepositoryAsyncClient.getServiceVersion();
    }

    /**
     * Gets a collection of model definitions.
     *
     * @param dtmi A well-formed DTDL model Id. See <a href="https://github.com/Azure/opendigitaltwins-dtdl/blob/master/DTDL/v2/dtdlv2.md">DTDL specs</a>. For example 'dtmi:com:example:Thermostat;1'.
     * @return A Map containing the model definition(s) where the key is the dtmi
     * and the value is the raw model definition string.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, String> getModels(String dtmi) {
        return modelsRepositoryAsyncClient.getModels(dtmi).block();
    }

    /**
     * Gets a collection of model definitions.
     *
     * @param dtmi                       A well-formed DTDL model Id. See <a href="https://github.com/Azure/opendigitaltwins-dtdl/blob/master/DTDL/v2/dtdlv2.md">DTDL specs</a>. For example 'dtmi:com:example:Thermostat;1'.
     * @param dependencyResolutionOption A ModelDependencyResolution value to force model resolution behavior.
     * @return A Map containing the model definition(s) where the key is the dtmi
     * and the value is the raw model definition string.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, String> getModels(String dtmi, ModelsDependencyResolution dependencyResolutionOption, Context context) {
        return modelsRepositoryAsyncClient.getModels(dtmi, dependencyResolutionOption, context).block();
    }

    /**
     * Gets a collection of model definitions.
     *
     * @param dtmis Collection of well-formed DTDL model Ids
     * @return A Map containing the model definition(s) where the key is the dtmi
     * and the value is the raw model definition string.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, String> getModels(Iterable<String> dtmis) {
        return modelsRepositoryAsyncClient.getModels(dtmis).block();
    }

    /**
     * Gets a collection of model definitions.
     *
     * @param dtmis                      An Iterable of well-formed DTDL model Ids. See <a href="https://github.com/Azure/opendigitaltwins-dtdl/blob/master/DTDL/v2/dtdlv2.md">DTDL specs</a>. For example 'dtmi:com:example:Thermostat;1'.
     * @param dependencyResolutionOption A DependencyResolutionOption value to force model resolution behavior.
     * @return A Map containing the model definition(s) where the key is the dtmi
     * and the value is the raw model definition string.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Map<String, String> getModels(Iterable<String> dtmis, ModelsDependencyResolution dependencyResolutionOption, Context context) {
        return modelsRepositoryAsyncClient.getModels(dtmis, dependencyResolutionOption, context).block();
    }
}
