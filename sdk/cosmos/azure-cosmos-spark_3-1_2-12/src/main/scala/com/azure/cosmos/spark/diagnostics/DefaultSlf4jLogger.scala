// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.spark.diagnostics

import org.slf4j.{Logger, LoggerFactory}

private[spark] final class DefaultSlf4jLogger(classType: Class[_]) extends ILogger {
  // Make the log field transient so that objects with Logging can
  // be serialized and used on another machine
  @transient private lazy val log: Logger = LoggerFactory.getLogger(logName)

  // Method to get the logger name for this object
  protected def logName: String = {
    // Ignore trailing $'s in the class names for Scala objects
    classType.getName.stripSuffix("$")
  }

  // Log methods that take only a String
  def logInfo(msg: => String) {
    if (log.isInfoEnabled) log.info(msg)
  }

  def logDebug(msg: => String) {
    if (log.isDebugEnabled) log.debug(msg)
  }

  def logTrace(msg: => String) {
    if (log.isTraceEnabled) log.trace(msg)
  }

  def logWarning(msg: => String) {
    if (log.isWarnEnabled) log.warn(msg)
  }

  def logError(msg: => String) {
    if (log.isErrorEnabled) log.error(msg)
  }

  // Log methods that take Throwables (Exceptions/Errors) too
  def logInfo(msg: => String, throwable: Throwable) {
    if (log.isInfoEnabled) log.info(msg, throwable)
  }

  def isDebugLogEnabled: Boolean = {
    log.isDebugEnabled()
  }

  def logDebug(msg: => String, throwable: Throwable) {
    if (log.isDebugEnabled) log.debug(msg, throwable)
  }

  def logTrace(msg: => String, throwable: Throwable) {
    if (log.isTraceEnabled) log.trace(msg, throwable)
  }

  def logWarning(msg: => String, throwable: Throwable) {
    if (log.isWarnEnabled) log.warn(msg, throwable)
  }

  def logError(msg: => String, throwable: Throwable) {
    if (log.isErrorEnabled) log.error(msg, throwable)
  }

  override def logItemWriteCompletion(writeOperation: WriteOperation): Unit = {
    logInfo(s"$writeOperation completed")
  }

  override def logItemWriteSkipped(writeOperation: WriteOperation, detail: => String): Unit = {
    logInfo(s"$writeOperation skipped, $detail")
  }

  override def logItemWriteFailure(writeOperation: WriteOperation): Unit = {
    logInfo(s"$writeOperation failed")
  }

  override def logItemWriteFailure(writeOperation: WriteOperation, throwable: Throwable): Unit = {
    logInfo(s"$writeOperation failed", throwable)
  }

  override def logItemWriteDetails(writeOperation: WriteOperation, detail: => String): Unit = {
    logInfo(s"$writeOperation $detail")
  }
}
