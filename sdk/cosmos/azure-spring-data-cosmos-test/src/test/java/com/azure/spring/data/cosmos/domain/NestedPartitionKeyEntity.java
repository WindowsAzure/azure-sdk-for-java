// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.domain;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Container(containerName = "nested-partition-key", partitionKeyPath = "/nestedEntity/nestedPartitionKey")
public class NestedPartitionKeyEntity {

    @Id
    @GeneratedValue
    private String id;

    private NestedEntity nestedEntity;

    public NestedPartitionKeyEntity(String id, NestedEntity nestedEntity) {
        this.id = id;
        this.nestedEntity = nestedEntity;
    }

    public NestedPartitionKeyEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NestedEntity getNestedEntity() {
        return nestedEntity;
    }

    public void setNestedEntity(NestedEntity nestedEntity) {
        this.nestedEntity = nestedEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedPartitionKeyEntity that = (NestedPartitionKeyEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nestedEntity, that.nestedEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nestedEntity);
    }

    @Override
    public String toString() {
        return "NestedPartitionKeyEntity{"
            + "id='" + id + '\''
            + ", nestedEntity=" + nestedEntity
            + '}';
    }
}
