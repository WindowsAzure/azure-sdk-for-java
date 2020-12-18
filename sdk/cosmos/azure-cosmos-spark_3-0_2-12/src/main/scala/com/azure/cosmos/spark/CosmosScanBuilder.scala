// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.spark

import com.azure.cosmos.implementation.CosmosClientMetadataCachesSnapshot
import org.apache.spark.broadcast.Broadcast
import org.apache.spark.sql.connector.read.{Scan, ScanBuilder, SupportsPushDownFilters, SupportsPushDownRequiredColumns}
import org.apache.spark.sql.sources.Filter
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.util.CaseInsensitiveStringMap

// scalastyle:off underscore.import
import scala.collection.JavaConverters._
// scalastyle:on underscore.import

case class CosmosScanBuilder(config: CaseInsensitiveStringMap, inputSchema: StructType, cosmosClientStateHandle: Broadcast[CosmosClientMetadataCachesSnapshot])
  extends ScanBuilder
    with SupportsPushDownFilters
    with SupportsPushDownRequiredColumns
    with CosmosLoggingTrait {
  logInfo(s"Instantiated ${this.getClass.getSimpleName}")

  var processedPredicates : Option[AnalyzedFilters] = Option.empty

  /**
    * Pushes down filters, and returns filters that need to be evaluated after scanning.
    * @param filters pushed down filters.
    * @return the filters that spark need to evaluate
    */
  override def pushFilters(filters: Array[Filter]): Array[Filter] = {
    processedPredicates = Option.apply(FilterAnalyzer().analyze(filters))

    // return the filters that spark need to evaluate
    this.processedPredicates.get.filtersNotSupportedByCosmos
  }

  /**
    * Returns the filters that are pushed to Cosmos as query predicates
    * @return filters to be pushed to cosmos db.
    */
  override def pushedFilters: Array[Filter] = {
    if (this.processedPredicates.isDefined) {
      this.processedPredicates.get.filtersToBePushedDownToCosmos
    } else {
      Array[Filter]()
    }
  }

  override def build(): Scan = {
    assert(this.processedPredicates.isDefined)

    // TODO moderakh when inferring schema we should consolidate the schema from pruneColumns
    CosmosScan(inputSchema, config.asScala.toMap, this.processedPredicates.get.cosmosParametrizedQuery, cosmosClientStateHandle)
  }

  /**
    * Applies column pruning w.r.t. the given requiredSchema.
    *
    * Implementation should try its best to prune the unnecessary columns or nested fields, but it's
    * also OK to do the pruning partially, e.g., a data source may not be able to prune nested
    * fields, and only prune top-level columns.
    *
    * Note that, {@link Scan# readSchema ( )} implementation should take care of the column
    * pruning applied here.
    */
  override def pruneColumns(requiredSchema: StructType): Unit = {
    // TODO moderakh: we need to decide whether do a push down or not on the projection
    // spark will do column pruning on the returned data.
    // pushing down projection to cosmos has tradeoffs:
    //   - it increases consumed RU in cosmos query engine
    //   - it decrease the networking layer latency
  }
}
