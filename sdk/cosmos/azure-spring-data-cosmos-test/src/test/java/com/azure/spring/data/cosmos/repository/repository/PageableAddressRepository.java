// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.repository.repository;

import com.azure.spring.data.cosmos.domain.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageableAddressRepository extends PagingAndSortingRepository<Address, String> {
    Page<Address> findByStreet(String street, Pageable pageable);

    Page<Address> findByCity(String city, Pageable pageable);
}
