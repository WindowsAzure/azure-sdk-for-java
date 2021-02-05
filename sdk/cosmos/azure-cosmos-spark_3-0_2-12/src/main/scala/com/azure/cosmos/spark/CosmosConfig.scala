// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.spark

import com.azure.cosmos.spark.ItemWriteStrategy.ItemWriteStrategy
import com.azure.cosmos.spark.ChangeFeedModes.ChangeFeedMode

import java.net.URL
import java.util.Locale
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

// scalastyle:off underscore.import
import scala.collection.JavaConverters._
// scalastyle:on underscore.import

// each config category will be a case class:
// TODO moderakh more configs
//case class ClientConfig()
//case class CosmosBatchWriteConfig()

object CosmosConfig {

  def getEffectiveConfig(sparkConf: SparkConf, // spark application config
                         userProvidedOptions: Map[String, String] // user provided config
                        ) : Map[String, String] = {
    val conf = sparkConf.clone()
    conf.setAll(userProvidedOptions).getAll.toMap
  }

  @throws[IllegalStateException] // if there is no active spark session
  def getEffectiveConfig(userProvidedOptions: Map[String, String] = Map().empty) : Map[String, String] = {
    val session = SparkSession.active

    // TODO: moderakh we should investigate how spark sql config should be merged:
    // TODO: session.conf.getAll, // spark sql runtime config
    getEffectiveConfig(
      session.sparkContext.getConf, // spark application config
      userProvidedOptions) // user provided config
  }
}

private[spark] case class CosmosAccountConfig(
  endpoint: String,
  key: String,
  accountName: String,
  applicationName: Option[String],
  useGatewayMode: Boolean)

private[spark] object CosmosAccountConfig {
  private[spark] val CosmosAccountEndpointUri = CosmosConfigEntry[String](key = "spark.cosmos.accountEndpoint",
    mandatory = true,
    parseFromStringFunction = accountEndpointUri => {
      new URL(accountEndpointUri)
      accountEndpointUri
    },
    helpMessage = "Cosmos DB Account Endpoint Uri")

  private[spark] val CosmosKey = CosmosConfigEntry[String](key = "spark.cosmos.accountKey",
    mandatory = true,
    parseFromStringFunction = accountKey => accountKey,
    helpMessage = "Cosmos DB Account Key")

  private[spark] val CosmosAccountName = CosmosConfigEntry[String](key = "spark.cosmos.accountEndpoint",
    mandatory = true,
    parseFromStringFunction = accountEndpointUri => {
      val url = new URL(accountEndpointUri)
      val separatorIndex = url.getHost.indexOf('.')
      if (separatorIndex > 0) {
          url.getHost.substring(0, separatorIndex)
      } else {
          url.getHost()
      }
    },
    helpMessage = "Cosmos DB Account Name")

  private[spark] val ApplicationName = CosmosConfigEntry[String](key = "spark.cosmos.applicationName",
    mandatory = false,
    parseFromStringFunction = applicationName => applicationName,
    helpMessage = "Application name")

  private[spark] val UseGatewayMode = CosmosConfigEntry[Boolean](key = "spark.cosmos.useGatewayMode",
    mandatory = false,
    defaultValue = Some(false),
    parseFromStringFunction = useGatewayMode => useGatewayMode.toBoolean,
    helpMessage = "Use gateway mode for the client operations")

  private[spark] def parseCosmosAccountConfig(cfg: Map[String, String]): CosmosAccountConfig = {
    val endpointOpt = CosmosConfigEntry.parse(cfg, CosmosAccountEndpointUri)
    val key = CosmosConfigEntry.parse(cfg, CosmosKey)
    val accountName = CosmosConfigEntry.parse(cfg, CosmosAccountName)
    val applicationName = CosmosConfigEntry.parse(cfg, ApplicationName)
    val useGatewayMode = CosmosConfigEntry.parse(cfg, UseGatewayMode)

    // parsing above already validated these assertions
    assert(endpointOpt.isDefined)
    assert(key.isDefined)
    assert(accountName.isDefined)

    CosmosAccountConfig(
      endpointOpt.get,
      key.get,
      accountName.get,
      applicationName,
      useGatewayMode.get)
  }
}

private[spark] case class CosmosReadConfig(forceEventualConsistency: Boolean)

private[spark] object CosmosReadConfig {
  val ForceEventualConsistency = CosmosConfigEntry[Boolean](key = "spark.cosmos.read.forceEventualConsistency",
    mandatory = false,
    defaultValue = Some(true),
    parseFromStringFunction = value => value.toBoolean,
    helpMessage = "Makes the client use Eventual consistency for read operations")

  def parseCosmosReadConfig(cfg: Map[String, String]): CosmosReadConfig = {
    val forceEventualConsistency = CosmosConfigEntry.parse(cfg, ForceEventualConsistency)

    CosmosReadConfig(forceEventualConsistency.get)
  }
}

case class CosmosContainerConfig(database: String, container: String)

case class CosmosWriteConfig(itemWriteStrategy: ItemWriteStrategy, maxRetryCount: Int)

object ItemWriteStrategy extends Enumeration {
  type ItemWriteStrategy = Value
  val ItemOverwrite, ItemAppend = Value

  def withNameOrThrow(name: String): Value =
    values.find(_.toString.toLowerCase == name.toLowerCase()).getOrElse(
      throw new IllegalArgumentException("name is not a valid ItemWriteStrategy"))
}

object CosmosWriteConfig {
  val itemWriteStrategy = CosmosConfigEntry[ItemWriteStrategy](key = "spark.cosmos.write.strategy",
    defaultValue = Option.apply(ItemWriteStrategy.ItemOverwrite),
    mandatory = false,
    parseFromStringFunction = itemWriteStrategyAsString =>
      ItemWriteStrategy.withNameOrThrow(itemWriteStrategyAsString),
    helpMessage = "Cosmos DB Item write Strategy: ItemOverwrite (using upsert), ItemAppend (using create, ignore 409)")

  val maxRetryCount = CosmosConfigEntry[Int](key = "spark.cosmos.write.maxRetryCount",
    mandatory = false,
    defaultValue = Option.apply(3),
    parseFromStringFunction = maxRetryAttempt => {
      val cnt = maxRetryAttempt.toInt
      if (cnt < 0) {
        throw new IllegalArgumentException(s"expected a non-negative number")
      }
      cnt
    },
    helpMessage = "Cosmos DB Write Max Retry Attempts on failure")

  def parseWriteConfig(cfg: Map[String, String]): CosmosWriteConfig = {
    val itemWriteStrategyOpt = CosmosConfigEntry.parse(cfg, itemWriteStrategy)
    val maxRetryCountOpt = CosmosConfigEntry.parse(cfg, maxRetryCount)

    // parsing above already validated this
    assert(itemWriteStrategyOpt.isDefined)
    assert(maxRetryCountOpt.isDefined)

    CosmosWriteConfig(itemWriteStrategyOpt.get, maxRetryCountOpt.get)
  }
}

object CosmosContainerConfig {
  private[spark] val DATABASE_NAME_KEY = "spark.cosmos.database"
  private[spark] val CONTAINER_NAME_KEY = "spark.cosmos.container"

  val databaseNameSupplier = CosmosConfigEntry[String](key = DATABASE_NAME_KEY,
    mandatory = true,
    parseFromStringFunction = database => database,
    helpMessage = "Cosmos DB database name")

  val containerNameSupplier = CosmosConfigEntry[String](key = CONTAINER_NAME_KEY,
    mandatory = true,
    parseFromStringFunction = container => container,
    helpMessage = "Cosmos DB container name")

  def parseCosmosContainerConfig(cfg: Map[String, String]): CosmosContainerConfig = {
    this.parseCosmosContainerConfig(cfg, None, None)
  }

  def parseCosmosContainerConfig(
                                cfg: Map[String, String],
                                databaseName: Option[String],
                                containerName: Option[String]): CosmosContainerConfig = {

    val databaseOpt = databaseName.getOrElse(CosmosConfigEntry.parse(cfg, databaseNameSupplier).get)
    val containerOpt = containerName.getOrElse(CosmosConfigEntry.parse(cfg, containerNameSupplier).get)

    CosmosContainerConfig(databaseOpt, containerOpt)
  }
}

private[spark] case class CosmosSchemaInferenceConfig(
                                          inferSchemaSamplingSize: Int,
                                          inferSchemaEnabled: Boolean,
                                          inferSchemaQuery: Option[String])

private[spark] object CosmosSchemaInferenceConfig {
    private val DefaultSampleSize: Int = 1000

    val inferSchemaSamplingSize = CosmosConfigEntry[Int](key = "spark.cosmos.read.inferSchemaSamplingSize",
        mandatory = false,
        parseFromStringFunction = size => size.toInt,
        helpMessage = "Sampling size to use when inferring schema")

    val inferSchemaEnabled = CosmosConfigEntry[Boolean](key = "spark.cosmos.read.inferSchemaEnabled",
        mandatory = false,
        parseFromStringFunction = enabled => enabled.toBoolean,
        helpMessage = "Whether schema inference is enabled or should return raw json")

    val inferSchemaQuery = CosmosConfigEntry[String](key = "spark.cosmos.read.inferSchemaQuery",
        mandatory = false,
        parseFromStringFunction = query => query,
        helpMessage = "When schema inference is enabled, used as custom query to infer it")

    def parseCosmosReadConfig(cfg: Map[String, String]): CosmosSchemaInferenceConfig = {
        val samplingSize = CosmosConfigEntry.parse(cfg, inferSchemaSamplingSize)
        val enabled = CosmosConfigEntry.parse(cfg, inferSchemaEnabled)
        val query = CosmosConfigEntry.parse(cfg, inferSchemaQuery)

        CosmosSchemaInferenceConfig(
            samplingSize.getOrElse(DefaultSampleSize),
            enabled.getOrElse(false),
            query)
    }
}

private object ChangeFeedModes extends Enumeration {
  type ChangeFeedMode = Value

  private[spark] val incremental = Value("Incremental")
  private[spark] val fullFidelity = Value("FullFidelity")
}

private case class CosmosChangeFeedConfig(changeFeedMode: ChangeFeedMode)

private object CosmosChangeFeedConfig {
  private val DefaultChangeFeedMode: ChangeFeedMode = ChangeFeedModes.incremental

  private[spark] val changeFeedMode = CosmosConfigEntry[ChangeFeedMode](key = "spark.cosmos.changeFeed.mode",
    mandatory = false,
    parseFromStringFunction = changeFeedModeString => ChangeFeedModes.withName(changeFeedModeString),
    helpMessage = "ChangeFeed mode (Incremental or FullFidelity)")

  private[spark] def parseCosmosChangeFeedConfig(cfg: Map[String, String]): CosmosChangeFeedConfig = {
    val changeFeedModeParsed = CosmosConfigEntry.parse(cfg, changeFeedMode)

    CosmosChangeFeedConfig(changeFeedModeParsed.getOrElse(DefaultChangeFeedMode))
  }
}

case class CosmosConfigEntry[T](key: String,
                                mandatory: Boolean,
                                defaultValue: Option[T] = Option.empty,
                                parseFromStringFunction: String => T,
                                helpMessage: String) {
  CosmosConfigEntry.configEntriesDefinitions.put(key, this)

  def parse(paramAsString: String) : T = {
    try {
      parseFromStringFunction(paramAsString)
    } catch {
      case e: Exception => throw new RuntimeException(s"invalid configuration for ${key}:${paramAsString}. Config description: ${helpMessage}",  e)
    }
  }
}

// TODO: moderakh how to merge user config with SparkConf application config?
object CosmosConfigEntry {
  private val configEntriesDefinitions = new java.util.HashMap[String, CosmosConfigEntry[_]]()

  def allConfigNames(): Seq[String] = {
    configEntriesDefinitions.keySet().asScala.toSeq
  }

  def parse[T](configuration: Map[String, String], configEntry: CosmosConfigEntry[T]): Option[T] = {
    // TODO moderakh: where should we handle case sensitivity?
    // we are doing this here per config parsing for now
    val opt = configuration.map { case (key, value) => (key.toLowerCase(Locale.ROOT), value) }.get(configEntry.key.toLowerCase(Locale.ROOT))
    if (opt.isDefined) {
      Option.apply(configEntry.parse(opt.get))
    }
    else {
      if (configEntry.mandatory) {
        throw new RuntimeException(s"mandatory option ${configEntry.key} is missing. Config description: ${configEntry.helpMessage}")
      } else {
        configEntry.defaultValue.orElse(Option.empty)
      }
    }
  }
}
