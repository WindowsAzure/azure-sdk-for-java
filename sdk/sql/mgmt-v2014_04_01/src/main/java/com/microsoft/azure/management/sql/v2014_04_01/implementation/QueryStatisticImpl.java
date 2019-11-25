/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.QueryStatistic;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.QueryInterval;

class QueryStatisticImpl extends WrapperImpl<QueryStatisticInner> implements QueryStatistic {
    private final SqlManager manager;

    QueryStatisticImpl(QueryStatisticInner inner,  SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }



    @Override
    public List<QueryInterval> intervals() {
        return this.inner().intervals();
    }

    @Override
    public String queryId() {
        return this.inner().queryId();
    }

}
