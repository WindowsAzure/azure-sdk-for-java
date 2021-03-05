// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation

import com.azure.cosmos.CosmosClientBuilder
import com.azure.cosmos.implementation.routing.Range
import com.azure.cosmos.implementation.ImplementationBridgeHelpers.CosmosClientBuilderHelper
import com.azure.cosmos.implementation.changefeed.implementation.{ChangeFeedState, ChangeFeedStateV1}
import com.azure.cosmos.implementation.feedranges.{FeedRangeContinuation, FeedRangeEpkImpl, FeedRangeInternal}
import com.azure.cosmos.implementation.query.CompositeContinuationToken
import com.azure.cosmos.models.FeedRange
import com.azure.cosmos.spark.NormalizedRange

// scalastyle:off underscore.import
import scala.collection.JavaConverters._
// scalastyle:on underscore.import

private[cosmos] object SparkBridgeImplementationInternal {
  def setMetadataCacheSnapshot(cosmosClientBuilder: CosmosClientBuilder,
                               metadataCache: CosmosClientMetadataCachesSnapshot): Unit = {

    val clientBuilderAccessor = CosmosClientBuilderHelper.getCosmosClientBuilderAccessor
    clientBuilderAccessor.setCosmosClientMetadataCachesSnapshot(cosmosClientBuilder, metadataCache)
  }

  def extractLsnFromChangeFeedContinuation(continuation: String) : Long = {
    val lsnToken = ChangeFeedState
      .fromString(continuation)
      .getContinuation
      .getCurrentContinuationToken
      .getToken

    toLsn(lsnToken)
  }

  def mergeChangeFeedContinuations(continuationTokens: Iterable[String]): String = {
    var count = 0
    val states = continuationTokens.map(s => {
      count+=1
      ChangeFeedState.fromString(s)
    }).toArray

    ChangeFeedState.merge(states).toJson()
  }

  def createChangeFeedStateJson
  (
    startOffsetContinuationState: String,
    feedRangeToLsn: Array[(NormalizedRange, Long)]
  ): String = {

    val continuationTokens = feedRangeToLsn
      .map(rangeToLsn => new CompositeContinuationToken(
        toContinuationToken(rangeToLsn._2),
        toCosmosRange(rangeToLsn._1)))
    val startState = ChangeFeedState.fromString(startOffsetContinuationState)
    new ChangeFeedStateV1(
      startState.getContainerRid,
      startState.getFeedRange,
      startState.getMode,
      startState.getStartFromSettings,
      FeedRangeContinuation.create(
        startState.getContainerRid,
        startState.getFeedRange,
        continuationTokens.toList.asJava
      )
    ).toJson
  }

  def extractContinuationTokensFromChangeFeedStateJson(stateJson: String): Array[(NormalizedRange, Long)] = {
    assert(!Strings.isNullOrWhiteSpace(stateJson), s"Argument 'stateJson' must not be null or empty.")
    val state = ChangeFeedState.fromString(stateJson)
    state
      .extractContinuationTokens() // already sorted
      .asScala
      .map(t => Tuple2(toNormalizedRange(t.getRange), toLsn(t.getToken)))
      .toArray
  }

  def toFeedRange(range: NormalizedRange): String = {
    new FeedRangeEpkImpl(new Range[String](range.min, range.max, true, false)).toJson
  }

  def toNormalizedRange(feedRange: String): NormalizedRange = {
    val range = FeedRangeInternal
      .convert(FeedRange.fromString(feedRange))
      .asInstanceOf[FeedRangeEpkImpl]
      .getRange
    val normalizedRange = FeedRangeInternal.normalizeRange(range)
    NormalizedRange(normalizedRange.getMin, normalizedRange.getMax)
  }

  def doRangesOverlap(left: NormalizedRange, right: NormalizedRange): Boolean = {
    Range.checkOverlapping(toCosmosRange(left), toCosmosRange(right))
  }

  private[this] def toContinuationToken(lsn: Long): String = {
    raw""""${String.valueOf(lsn)}"""""
  }

  private[this] def toCosmosRange(range: NormalizedRange): Range[String] = {
    new Range[String](range.min, range.max, true, false)
  }

  private[this] def toLsn(lsnToken: String): Long = {
    // the continuation from the backend is encoded as '"<LSN>"' where LSN is a long integer
    // removing the first and last characters - which are the quotes
    lsnToken.substring(1, lsnToken.length - 1).toLong
  }

  private[this] def toNormalizedRange(range: Range[String]): NormalizedRange = {
    assert(range != null, "Argument 'range' must not be null.")
    assert(range.isMinInclusive, "Argument 'range' must be minInclusive")
    assert(!range.isMaxInclusive, "Argument 'range' must be maxExclusive")

    NormalizedRange(range.getMin, range.getMax)
  }
}
