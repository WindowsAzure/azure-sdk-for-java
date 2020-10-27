// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.data.gremlin.web.service.repository;

import com.azure.spring.data.gremlin.repository.GremlinRepository;
import com.azure.spring.sample.data.gremlin.web.service.domain.MicroService;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroServiceRepository extends GremlinRepository<MicroService, String> {
}

