// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SqlScriptsImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SqlScriptResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class SqlScriptClient {
    private final SqlScriptsImpl serviceClient;

    /** Initializes an instance of SqlScripts client. */
    SqlScriptClient(SqlScriptsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists sql scripts.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlScriptResource> getSqlScriptsByWorkspace() {
        return this.serviceClient.getSqlScriptsByWorkspace();
    }

    /**
     * Lists sql scripts.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SqlScriptResource> getSqlScriptsByWorkspace(Context context) {
        return this.serviceClient.getSqlScriptsByWorkspace(context);
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlScriptResource createOrUpdateSqlScript(
            String sqlScriptName, SqlScriptResource sqlScript, String ifMatch) {
        return this.serviceClient.createOrUpdateSqlScript(sqlScriptName, sqlScript, ifMatch);
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlScriptResource createOrUpdateSqlScript(String sqlScriptName, SqlScriptResource sqlScript) {
        return this.serviceClient.createOrUpdateSqlScript(sqlScriptName, sqlScript);
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource type.
     * @param ifMatch ETag of the SQL script entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlScriptResource> createOrUpdateSqlScriptWithResponse(
            String sqlScriptName, SqlScriptResource sqlScript, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateSqlScriptWithResponse(sqlScriptName, sqlScript, ifMatch, context);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlScriptResource getSqlScript(String sqlScriptName, String ifNoneMatch) {
        return this.serviceClient.getSqlScript(sqlScriptName, ifNoneMatch);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SqlScriptResource getSqlScript(String sqlScriptName) {
        return this.serviceClient.getSqlScript(sqlScriptName);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SqlScriptResource> getSqlScriptWithResponse(
            String sqlScriptName, String ifNoneMatch, Context context) {
        return this.serviceClient.getSqlScriptWithResponse(sqlScriptName, ifNoneMatch, context);
    }

    /**
     * Deletes a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteSqlScript(String sqlScriptName) {
        this.serviceClient.deleteSqlScript(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteSqlScriptWithResponse(String sqlScriptName, Context context) {
        return this.serviceClient.deleteSqlScriptWithResponse(sqlScriptName, context);
    }
}
