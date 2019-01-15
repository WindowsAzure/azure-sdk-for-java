/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for MongoDB migration outputs.
 */
public class MongoDbProgress {
    /**
     * The number of document bytes copied during the Copying stage.
     */
    @JsonProperty(value = "bytesCopied", required = true)
    private long bytesCopied;

    /**
     * The number of documents copied during the Copying stage.
     */
    @JsonProperty(value = "documentsCopied", required = true)
    private long documentsCopied;

    /**
     * The elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan
     * format).
     */
    @JsonProperty(value = "elapsedTime", required = true)
    private String elapsedTime;

    /**
     * The errors and warnings that have occurred for the current object. The
     * keys are the error codes.
     */
    @JsonProperty(value = "errors", required = true)
    private Map<String, MongoDbError> errors;

    /**
     * The number of oplog events awaiting replay.
     */
    @JsonProperty(value = "eventsPending", required = true)
    private long eventsPending;

    /**
     * The number of oplog events replayed so far.
     */
    @JsonProperty(value = "eventsReplayed", required = true)
    private long eventsReplayed;

    /**
     * The timestamp of the last oplog event received, or null if no oplog
     * event has been received yet.
     */
    @JsonProperty(value = "lastEventTime")
    private DateTime lastEventTime;

    /**
     * The timestamp of the last oplog event replayed, or null if no oplog
     * event has been replayed yet.
     */
    @JsonProperty(value = "lastReplayTime")
    private DateTime lastReplayTime;

    /**
     * The name of the progress object. For a collection, this is the
     * unqualified collection name. For a database, this is the database name.
     * For the overall migration, this is null.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The qualified name of the progress object. For a collection, this is the
     * database-qualified name. For a database, this is the database name. For
     * the overall migration, this is null.
     */
    @JsonProperty(value = "qualifiedName")
    private String qualifiedName;

    /**
     * The type of progress object. Possible values include: 'Migration',
     * 'Database', 'Collection'.
     */
    @JsonProperty(value = "resultType", required = true)
    private String resultType;

    /**
     * Possible values include: 'NotStarted', 'ValidatingInput',
     * 'Initializing', 'Restarting', 'Copying', 'InitialReplay', 'Replaying',
     * 'Finalizing', 'Complete', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "state", required = true)
    private MongoDbMigrationState state;

    /**
     * The total number of document bytes on the source at the beginning of the
     * Copying stage, or -1 if the total size was unknown.
     */
    @JsonProperty(value = "totalBytes", required = true)
    private long totalBytes;

    /**
     * The total number of documents on the source at the beginning of the
     * Copying stage, or -1 if the total count was unknown.
     */
    @JsonProperty(value = "totalDocuments", required = true)
    private long totalDocuments;

    /**
     * Get the number of document bytes copied during the Copying stage.
     *
     * @return the bytesCopied value
     */
    public long bytesCopied() {
        return this.bytesCopied;
    }

    /**
     * Set the number of document bytes copied during the Copying stage.
     *
     * @param bytesCopied the bytesCopied value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withBytesCopied(long bytesCopied) {
        this.bytesCopied = bytesCopied;
        return this;
    }

    /**
     * Get the number of documents copied during the Copying stage.
     *
     * @return the documentsCopied value
     */
    public long documentsCopied() {
        return this.documentsCopied;
    }

    /**
     * Set the number of documents copied during the Copying stage.
     *
     * @param documentsCopied the documentsCopied value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withDocumentsCopied(long documentsCopied) {
        this.documentsCopied = documentsCopied;
        return this;
    }

    /**
     * Get the elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan format).
     *
     * @return the elapsedTime value
     */
    public String elapsedTime() {
        return this.elapsedTime;
    }

    /**
     * Set the elapsed time in the format [ddd.]hh:mm:ss[.fffffff] (i.e. TimeSpan format).
     *
     * @param elapsedTime the elapsedTime value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * Get the errors and warnings that have occurred for the current object. The keys are the error codes.
     *
     * @return the errors value
     */
    public Map<String, MongoDbError> errors() {
        return this.errors;
    }

    /**
     * Set the errors and warnings that have occurred for the current object. The keys are the error codes.
     *
     * @param errors the errors value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withErrors(Map<String, MongoDbError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the number of oplog events awaiting replay.
     *
     * @return the eventsPending value
     */
    public long eventsPending() {
        return this.eventsPending;
    }

    /**
     * Set the number of oplog events awaiting replay.
     *
     * @param eventsPending the eventsPending value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withEventsPending(long eventsPending) {
        this.eventsPending = eventsPending;
        return this;
    }

    /**
     * Get the number of oplog events replayed so far.
     *
     * @return the eventsReplayed value
     */
    public long eventsReplayed() {
        return this.eventsReplayed;
    }

    /**
     * Set the number of oplog events replayed so far.
     *
     * @param eventsReplayed the eventsReplayed value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withEventsReplayed(long eventsReplayed) {
        this.eventsReplayed = eventsReplayed;
        return this;
    }

    /**
     * Get the timestamp of the last oplog event received, or null if no oplog event has been received yet.
     *
     * @return the lastEventTime value
     */
    public DateTime lastEventTime() {
        return this.lastEventTime;
    }

    /**
     * Set the timestamp of the last oplog event received, or null if no oplog event has been received yet.
     *
     * @param lastEventTime the lastEventTime value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withLastEventTime(DateTime lastEventTime) {
        this.lastEventTime = lastEventTime;
        return this;
    }

    /**
     * Get the timestamp of the last oplog event replayed, or null if no oplog event has been replayed yet.
     *
     * @return the lastReplayTime value
     */
    public DateTime lastReplayTime() {
        return this.lastReplayTime;
    }

    /**
     * Set the timestamp of the last oplog event replayed, or null if no oplog event has been replayed yet.
     *
     * @param lastReplayTime the lastReplayTime value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withLastReplayTime(DateTime lastReplayTime) {
        this.lastReplayTime = lastReplayTime;
        return this;
    }

    /**
     * Get the name of the progress object. For a collection, this is the unqualified collection name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the progress object. For a collection, this is the unqualified collection name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @param name the name value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the qualified name of the progress object. For a collection, this is the database-qualified name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @return the qualifiedName value
     */
    public String qualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Set the qualified name of the progress object. For a collection, this is the database-qualified name. For a database, this is the database name. For the overall migration, this is null.
     *
     * @param qualifiedName the qualifiedName value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * Get the type of progress object. Possible values include: 'Migration', 'Database', 'Collection'.
     *
     * @return the resultType value
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Set the type of progress object. Possible values include: 'Migration', 'Database', 'Collection'.
     *
     * @param resultType the resultType value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * Get possible values include: 'NotStarted', 'ValidatingInput', 'Initializing', 'Restarting', 'Copying', 'InitialReplay', 'Replaying', 'Finalizing', 'Complete', 'Canceled', 'Failed'.
     *
     * @return the state value
     */
    public MongoDbMigrationState state() {
        return this.state;
    }

    /**
     * Set possible values include: 'NotStarted', 'ValidatingInput', 'Initializing', 'Restarting', 'Copying', 'InitialReplay', 'Replaying', 'Finalizing', 'Complete', 'Canceled', 'Failed'.
     *
     * @param state the state value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withState(MongoDbMigrationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the total number of document bytes on the source at the beginning of the Copying stage, or -1 if the total size was unknown.
     *
     * @return the totalBytes value
     */
    public long totalBytes() {
        return this.totalBytes;
    }

    /**
     * Set the total number of document bytes on the source at the beginning of the Copying stage, or -1 if the total size was unknown.
     *
     * @param totalBytes the totalBytes value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withTotalBytes(long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * Get the total number of documents on the source at the beginning of the Copying stage, or -1 if the total count was unknown.
     *
     * @return the totalDocuments value
     */
    public long totalDocuments() {
        return this.totalDocuments;
    }

    /**
     * Set the total number of documents on the source at the beginning of the Copying stage, or -1 if the total count was unknown.
     *
     * @param totalDocuments the totalDocuments value to set
     * @return the MongoDbProgress object itself.
     */
    public MongoDbProgress withTotalDocuments(long totalDocuments) {
        this.totalDocuments = totalDocuments;
        return this;
    }

}
