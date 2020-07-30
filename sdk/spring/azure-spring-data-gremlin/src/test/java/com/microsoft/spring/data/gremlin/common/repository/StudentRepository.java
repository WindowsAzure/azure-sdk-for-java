// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.spring.data.gremlin.common.repository;

import com.microsoft.spring.data.gremlin.common.domain.Student;
import com.microsoft.spring.data.gremlin.repository.GremlinRepository;

import java.util.List;

public interface StudentRepository extends GremlinRepository<Student, Long> {

    List<Student> findByName(String name);
}
