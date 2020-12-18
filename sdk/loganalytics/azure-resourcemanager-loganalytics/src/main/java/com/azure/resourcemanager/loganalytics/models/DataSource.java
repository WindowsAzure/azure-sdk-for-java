// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner;
import java.util.Map;

/** An immutable client-side representation of DataSource. */
public interface DataSource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The data source properties in raw json format, each kind of data source have it's
     * own schema.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the etag property: The ETag of the data source.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the kind property: The kind of the DataSource.
     *
     * @return the kind value.
     */
    DataSourceKind kind();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.DataSourceInner object.
     *
     * @return the inner object.
     */
    DataSourceInner innerModel();

    /** The entirety of the DataSource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithKind,
            DefinitionStages.WithCreate {
    }
    /** The DataSource definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataSource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DataSource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the DataSource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The data source properties in raw json format, each kind of data
             * source have it's own schema..
             *
             * @param properties The data source properties in raw json format, each kind of data source have it's own
             *     schema.
             * @return the next definition stage.
             */
            WithKind withProperties(Object properties);
        }
        /** The stage of the DataSource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the DataSource..
             *
             * @param kind The kind of the DataSource.
             * @return the next definition stage.
             */
            WithCreate withKind(DataSourceKind kind);
        }
        /**
         * The stage of the DataSource definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataSource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataSource create(Context context);
        }
        /** The stage of the DataSource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DataSource definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the data source..
             *
             * @param etag The ETag of the data source.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }
    /**
     * Begins update for the DataSource resource.
     *
     * @return the stage of resource update.
     */
    DataSource.Update update();

    /** The template for DataSource update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithProperties, UpdateStages.WithEtag, UpdateStages.WithKind {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataSource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataSource apply(Context context);
    }
    /** The DataSource update stages. */
    interface UpdateStages {
        /** The stage of the DataSource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DataSource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The data source properties in raw json format, each kind of data
             * source have it's own schema..
             *
             * @param properties The data source properties in raw json format, each kind of data source have it's own
             *     schema.
             * @return the next definition stage.
             */
            Update withProperties(Object properties);
        }
        /** The stage of the DataSource update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the data source..
             *
             * @param etag The ETag of the data source.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the DataSource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the DataSource..
             *
             * @param kind The kind of the DataSource.
             * @return the next definition stage.
             */
            Update withKind(DataSourceKind kind);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DataSource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataSource refresh(Context context);
}
