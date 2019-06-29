// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for StorageErrorCode.
 */
public final class StorageErrorCode extends ExpandableStringEnum<StorageErrorCode> {
    /**
     * Static value AccountAlreadyExists for StorageErrorCode.
     */
    public static final StorageErrorCode ACCOUNT_ALREADY_EXISTS = fromString("AccountAlreadyExists");

    /**
     * Static value AccountBeingCreated for StorageErrorCode.
     */
    public static final StorageErrorCode ACCOUNT_BEING_CREATED = fromString("AccountBeingCreated");

    /**
     * Static value AccountIsDisabled for StorageErrorCode.
     */
    public static final StorageErrorCode ACCOUNT_IS_DISABLED = fromString("AccountIsDisabled");

    /**
     * Static value AuthenticationFailed for StorageErrorCode.
     */
    public static final StorageErrorCode AUTHENTICATION_FAILED = fromString("AuthenticationFailed");

    /**
     * Static value AuthorizationFailure for StorageErrorCode.
     */
    public static final StorageErrorCode AUTHORIZATION_FAILURE = fromString("AuthorizationFailure");

    /**
     * Static value ConditionHeadersNotSupported for StorageErrorCode.
     */
    public static final StorageErrorCode CONDITION_HEADERS_NOT_SUPPORTED = fromString("ConditionHeadersNotSupported");

    /**
     * Static value ConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode CONDITION_NOT_MET = fromString("ConditionNotMet");

    /**
     * Static value EmptyMetadataKey for StorageErrorCode.
     */
    public static final StorageErrorCode EMPTY_METADATA_KEY = fromString("EmptyMetadataKey");

    /**
     * Static value InsufficientAccountPermissions for StorageErrorCode.
     */
    public static final StorageErrorCode INSUFFICIENT_ACCOUNT_PERMISSIONS = fromString("InsufficientAccountPermissions");

    /**
     * Static value InternalError for StorageErrorCode.
     */
    public static final StorageErrorCode INTERNAL_ERROR = fromString("InternalError");

    /**
     * Static value InvalidAuthenticationInfo for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_AUTHENTICATION_INFO = fromString("InvalidAuthenticationInfo");

    /**
     * Static value InvalidHeaderValue for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_HEADER_VALUE = fromString("InvalidHeaderValue");

    /**
     * Static value InvalidHttpVerb for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_HTTP_VERB = fromString("InvalidHttpVerb");

    /**
     * Static value InvalidInput for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_INPUT = fromString("InvalidInput");

    /**
     * Static value InvalidMd5 for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_MD5 = fromString("InvalidMd5");

    /**
     * Static value InvalidMetadata for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_METADATA = fromString("InvalidMetadata");

    /**
     * Static value InvalidQueryParameterValue for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_QUERY_PARAMETER_VALUE = fromString("InvalidQueryParameterValue");

    /**
     * Static value InvalidRange for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_RANGE = fromString("InvalidRange");

    /**
     * Static value InvalidResourceName for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_RESOURCE_NAME = fromString("InvalidResourceName");

    /**
     * Static value InvalidUri for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_URI = fromString("InvalidUri");

    /**
     * Static value InvalidXmlDocument for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_XML_DOCUMENT = fromString("InvalidXmlDocument");

    /**
     * Static value InvalidXmlNodeValue for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_XML_NODE_VALUE = fromString("InvalidXmlNodeValue");

    /**
     * Static value Md5Mismatch for StorageErrorCode.
     */
    public static final StorageErrorCode MD5MISMATCH = fromString("Md5Mismatch");

    /**
     * Static value MetadataTooLarge for StorageErrorCode.
     */
    public static final StorageErrorCode METADATA_TOO_LARGE = fromString("MetadataTooLarge");

    /**
     * Static value MissingContentLengthHeader for StorageErrorCode.
     */
    public static final StorageErrorCode MISSING_CONTENT_LENGTH_HEADER = fromString("MissingContentLengthHeader");

    /**
     * Static value MissingRequiredQueryParameter for StorageErrorCode.
     */
    public static final StorageErrorCode MISSING_REQUIRED_QUERY_PARAMETER = fromString("MissingRequiredQueryParameter");

    /**
     * Static value MissingRequiredHeader for StorageErrorCode.
     */
    public static final StorageErrorCode MISSING_REQUIRED_HEADER = fromString("MissingRequiredHeader");

    /**
     * Static value MissingRequiredXmlNode for StorageErrorCode.
     */
    public static final StorageErrorCode MISSING_REQUIRED_XML_NODE = fromString("MissingRequiredXmlNode");

    /**
     * Static value MultipleConditionHeadersNotSupported for StorageErrorCode.
     */
    public static final StorageErrorCode MULTIPLE_CONDITION_HEADERS_NOT_SUPPORTED = fromString("MultipleConditionHeadersNotSupported");

    /**
     * Static value OperationTimedOut for StorageErrorCode.
     */
    public static final StorageErrorCode OPERATION_TIMED_OUT = fromString("OperationTimedOut");

    /**
     * Static value OutOfRangeInput for StorageErrorCode.
     */
    public static final StorageErrorCode OUT_OF_RANGE_INPUT = fromString("OutOfRangeInput");

    /**
     * Static value OutOfRangeQueryParameterValue for StorageErrorCode.
     */
    public static final StorageErrorCode OUT_OF_RANGE_QUERY_PARAMETER_VALUE = fromString("OutOfRangeQueryParameterValue");

    /**
     * Static value RequestBodyTooLarge for StorageErrorCode.
     */
    public static final StorageErrorCode REQUEST_BODY_TOO_LARGE = fromString("RequestBodyTooLarge");

    /**
     * Static value ResourceTypeMismatch for StorageErrorCode.
     */
    public static final StorageErrorCode RESOURCE_TYPE_MISMATCH = fromString("ResourceTypeMismatch");

    /**
     * Static value RequestUrlFailedToParse for StorageErrorCode.
     */
    public static final StorageErrorCode REQUEST_URL_FAILED_TO_PARSE = fromString("RequestUrlFailedToParse");

    /**
     * Static value ResourceAlreadyExists for StorageErrorCode.
     */
    public static final StorageErrorCode RESOURCE_ALREADY_EXISTS = fromString("ResourceAlreadyExists");

    /**
     * Static value ResourceNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode RESOURCE_NOT_FOUND = fromString("ResourceNotFound");

    /**
     * Static value ServerBusy for StorageErrorCode.
     */
    public static final StorageErrorCode SERVER_BUSY = fromString("ServerBusy");

    /**
     * Static value UnsupportedHeader for StorageErrorCode.
     */
    public static final StorageErrorCode UNSUPPORTED_HEADER = fromString("UnsupportedHeader");

    /**
     * Static value UnsupportedXmlNode for StorageErrorCode.
     */
    public static final StorageErrorCode UNSUPPORTED_XML_NODE = fromString("UnsupportedXmlNode");

    /**
     * Static value UnsupportedQueryParameter for StorageErrorCode.
     */
    public static final StorageErrorCode UNSUPPORTED_QUERY_PARAMETER = fromString("UnsupportedQueryParameter");

    /**
     * Static value UnsupportedHttpVerb for StorageErrorCode.
     */
    public static final StorageErrorCode UNSUPPORTED_HTTP_VERB = fromString("UnsupportedHttpVerb");

    /**
     * Static value InvalidMarker for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_MARKER = fromString("InvalidMarker");

    /**
     * Static value MessageNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode MESSAGE_NOT_FOUND = fromString("MessageNotFound");

    /**
     * Static value MessageTooLarge for StorageErrorCode.
     */
    public static final StorageErrorCode MESSAGE_TOO_LARGE = fromString("MessageTooLarge");

    /**
     * Static value PopReceiptMismatch for StorageErrorCode.
     */
    public static final StorageErrorCode POP_RECEIPT_MISMATCH = fromString("PopReceiptMismatch");

    /**
     * Static value QueueAlreadyExists for StorageErrorCode.
     */
    public static final StorageErrorCode QUEUE_ALREADY_EXISTS = fromString("QueueAlreadyExists");

    /**
     * Static value QueueBeingDeleted for StorageErrorCode.
     */
    public static final StorageErrorCode QUEUE_BEING_DELETED = fromString("QueueBeingDeleted");

    /**
     * Static value QueueDisabled for StorageErrorCode.
     */
    public static final StorageErrorCode QUEUE_DISABLED = fromString("QueueDisabled");

    /**
     * Static value QueueNotEmpty for StorageErrorCode.
     */
    public static final StorageErrorCode QUEUE_NOT_EMPTY = fromString("QueueNotEmpty");

    /**
     * Static value QueueNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode QUEUE_NOT_FOUND = fromString("QueueNotFound");

    /**
     * Creates or finds a StorageErrorCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageErrorCode.
     */
    @JsonCreator
    public static StorageErrorCode fromString(String name) {
        return fromString(name, StorageErrorCode.class);
    }

    /**
     * @return known StorageErrorCode values.
     */
    public static Collection<StorageErrorCode> values() {
        return values(StorageErrorCode.class);
    }
}
