// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.iot.modelsrepository.implementation;

import com.azure.core.util.Context;
import com.azure.iot.modelsrepository.DtmiConventions;
import com.azure.iot.modelsrepository.ModelsDependencyResolution;
import com.azure.iot.modelsrepository.implementation.models.FetchResult;
import com.azure.iot.modelsrepository.implementation.models.ModelMetadata;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.*;

public final class RepositoryHandler {

    private final URI repositoryUri;
    private final ModelFetcher modelFetcher;

    public RepositoryHandler(URI repositoryUri, ModelsRepositoryAPIImpl protocolLayer) {
        this.repositoryUri = repositoryUri;

        if (this.repositoryUri.getScheme().toLowerCase().startsWith("file")) {
            this.modelFetcher = new FileModelFetcher();
        } else {
            this.modelFetcher = new HttpModelFetcher(protocolLayer);
        }
    }

    public Mono<Map<String, String>> processAsync(String dtmi, ModelsDependencyResolution resolutionOptions, Context context) {
        return processAsync(Collections.singletonList(dtmi), resolutionOptions, context);
    }

    // This doesn't work as it throws it into an infinite loop
    public Mono<Map<String, String>> processAsync(Iterable<String> dtmis, ModelsDependencyResolution
        resolutionOptions, Context context) {

        Map<String, String> processedModels = new HashMap<>();
        Queue<String> modelsToProcess = prepareWork(dtmis);

        return processAsync(modelsToProcess, resolutionOptions, context, processedModels)
            .last()
            .map(TempCustomType::getMap);
    }

    private Flux<TempCustomType> processAsync(
        Queue<String> remainingWork,
        ModelsDependencyResolution resolutionOption,
        Context context,
        Map<String, String> currentResults) {

        if (remainingWork.isEmpty()) {
            return Flux.empty();
        }

        String targetDtmi = remainingWork.poll();
        return modelFetcher.fetchAsync(targetDtmi, repositoryUri, resolutionOption, context)
            .map(result -> new TempCustomType(result, currentResults))
            .expand(customType -> {
                Map<String, String> results = customType.getMap();
                FetchResult response = customType.getFetchResult();

                if (response.isFromExpanded()) {
                    try {
                        Map<String, String> expanded = new ModelsQuery(response.getDefinition()).listToMap();
                        for (Map.Entry<String, String> item : expanded.entrySet()) {
                            if (!results.containsKey(item.getKey())) {
                                results.put(item.getKey(), item.getValue());
                            }
                        }

                        return processAsync(remainingWork, resolutionOption, context, results);
                    } catch (Exception e) {
                        return Mono.error(e);
                    }
                } else {
                    try {
                        ModelMetadata metadata = new ModelsQuery(response.getDefinition()).parseModel();

                        if (resolutionOption == ModelsDependencyResolution.ENABLED || resolutionOption == ModelsDependencyResolution.TRY_FROM_EXPANDED) {
                            List<String> dependencies = metadata.getDependencies();

                            remainingWork.addAll(dependencies);
                        }

                        results.put(targetDtmi, response.getDefinition());
                        return processAsync(remainingWork, resolutionOption, context, results);

                    } catch (Exception e) {
                        return Mono.error(e);
                    }
                }
            });
    }

    private Queue<String> prepareWork(Iterable<String> dtmis) {
        Queue<String> modelsToProcess = new LinkedList<>();
        for (String dtmi : dtmis) {
            if (!DtmiConventions.isValidDtmi(dtmi)) {
                throw new IllegalArgumentException(String.format(ErrorMessageConstants.InvalidDtmiFormat, dtmi));
            }

            modelsToProcess.add(dtmi);
        }

        return modelsToProcess;
    }
}
