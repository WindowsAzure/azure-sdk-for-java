package com.azure.spring.data.cosmos.core.generator;

import com.azure.cosmos.models.SqlQuerySpec;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;

public class NativeQueryGenerator {

    private SqlQuerySpec cloneWithQueryText(SqlQuerySpec querySpec, String queryText) {
        SqlQuerySpec clone = new SqlQuerySpec();
        clone.setQueryText(queryText);
        clone.setParameters(querySpec.getParameters());
        return clone;
    }

    public SqlQuerySpec generateSortedQuery(SqlQuerySpec querySpec, Sort sort) {
        if (sort == null || sort.isUnsorted()) {
            return querySpec;
        } else {
            String querySort = AbstractQueryGenerator.generateQuerySort(sort);
            String queryText = "select * from (" + querySpec.getQueryText() + ") r " + querySort;
            return cloneWithQueryText(querySpec, queryText);
        }
    }

    public SqlQuerySpec generateCountQuery(SqlQuerySpec querySpec) {
        String queryText = querySpec.getQueryText();
        int fromIndex = queryText.toLowerCase().indexOf(" from ");
        Assert.isTrue(fromIndex >= 0, "query missing from keyword, query=" + queryText);

        String countQueryText = "select value count(1) " + queryText.substring(fromIndex);
        return cloneWithQueryText(querySpec, countQueryText);
    }

}
