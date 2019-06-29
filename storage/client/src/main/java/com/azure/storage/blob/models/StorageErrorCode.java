// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

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
     * Static value AppendPositionConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode APPEND_POSITION_CONDITION_NOT_MET = fromString("AppendPositionConditionNotMet");

    /**
     * Static value BlobAlreadyExists for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_ALREADY_EXISTS = fromString("BlobAlreadyExists");

    /**
     * Static value BlobNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_NOT_FOUND = fromString("BlobNotFound");

    /**
     * Static value BlobOverwritten for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_OVERWRITTEN = fromString("BlobOverwritten");

    /**
     * Static value BlobTierInadequateForContentLength for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_TIER_INADEQUATE_FOR_CONTENT_LENGTH = fromString("BlobTierInadequateForContentLength");

    /**
     * Static value BlockCountExceedsLimit for StorageErrorCode.
     */
    public static final StorageErrorCode BLOCK_COUNT_EXCEEDS_LIMIT = fromString("BlockCountExceedsLimit");

    /**
     * Static value BlockListTooLong for StorageErrorCode.
     */
    public static final StorageErrorCode BLOCK_LIST_TOO_LONG = fromString("BlockListTooLong");

    /**
     * Static value CannotChangeToLowerTier for StorageErrorCode.
     */
    public static final StorageErrorCode CANNOT_CHANGE_TO_LOWER_TIER = fromString("CannotChangeToLowerTier");

    /**
     * Static value CannotVerifyCopySource for StorageErrorCode.
     */
    public static final StorageErrorCode CANNOT_VERIFY_COPY_SOURCE = fromString("CannotVerifyCopySource");

    /**
     * Static value ContainerAlreadyExists for StorageErrorCode.
     */
    public static final StorageErrorCode CONTAINER_ALREADY_EXISTS = fromString("ContainerAlreadyExists");

    /**
     * Static value ContainerBeingDeleted for StorageErrorCode.
     */
    public static final StorageErrorCode CONTAINER_BEING_DELETED = fromString("ContainerBeingDeleted");

    /**
     * Static value ContainerDisabled for StorageErrorCode.
     */
    public static final StorageErrorCode CONTAINER_DISABLED = fromString("ContainerDisabled");

    /**
     * Static value ContainerNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode CONTAINER_NOT_FOUND = fromString("ContainerNotFound");

    /**
     * Static value ContentLengthLargerThanTierLimit for StorageErrorCode.
     */
    public static final StorageErrorCode CONTENT_LENGTH_LARGER_THAN_TIER_LIMIT = fromString("ContentLengthLargerThanTierLimit");

    /**
     * Static value CopyAcrossAccountsNotSupported for StorageErrorCode.
     */
    public static final StorageErrorCode COPY_ACROSS_ACCOUNTS_NOT_SUPPORTED = fromString("CopyAcrossAccountsNotSupported");

    /**
     * Static value CopyIdMismatch for StorageErrorCode.
     */
    public static final StorageErrorCode COPY_ID_MISMATCH = fromString("CopyIdMismatch");

    /**
     * Static value FeatureVersionMismatch for StorageErrorCode.
     */
    public static final StorageErrorCode FEATURE_VERSION_MISMATCH = fromString("FeatureVersionMismatch");

    /**
     * Static value IncrementalCopyBlobMismatch for StorageErrorCode.
     */
    public static final StorageErrorCode INCREMENTAL_COPY_BLOB_MISMATCH = fromString("IncrementalCopyBlobMismatch");

    /**
     * Static value IncrementalCopyOfEralierVersionSnapshotNotAllowed for StorageErrorCode.
     */
    public static final StorageErrorCode INCREMENTAL_COPY_OF_ERALIER_VERSION_SNAPSHOT_NOT_ALLOWED = fromString("IncrementalCopyOfEralierVersionSnapshotNotAllowed");

    /**
     * Static value IncrementalCopySourceMustBeSnapshot for StorageErrorCode.
     */
    public static final StorageErrorCode INCREMENTAL_COPY_SOURCE_MUST_BE_SNAPSHOT = fromString("IncrementalCopySourceMustBeSnapshot");

    /**
     * Static value InfiniteLeaseDurationRequired for StorageErrorCode.
     */
    public static final StorageErrorCode INFINITE_LEASE_DURATION_REQUIRED = fromString("InfiniteLeaseDurationRequired");

    /**
     * Static value InvalidBlobOrBlock for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_BLOB_OR_BLOCK = fromString("InvalidBlobOrBlock");

    /**
     * Static value InvalidBlobTier for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_BLOB_TIER = fromString("InvalidBlobTier");

    /**
     * Static value InvalidBlobType for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_BLOB_TYPE = fromString("InvalidBlobType");

    /**
     * Static value InvalidBlockId for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_BLOCK_ID = fromString("InvalidBlockId");

    /**
     * Static value InvalidBlockList for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_BLOCK_LIST = fromString("InvalidBlockList");

    /**
     * Static value InvalidOperation for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_OPERATION = fromString("InvalidOperation");

    /**
     * Static value InvalidPageRange for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_PAGE_RANGE = fromString("InvalidPageRange");

    /**
     * Static value InvalidSourceBlobType for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_SOURCE_BLOB_TYPE = fromString("InvalidSourceBlobType");

    /**
     * Static value InvalidSourceBlobUrl for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_SOURCE_BLOB_URL = fromString("InvalidSourceBlobUrl");

    /**
     * Static value InvalidVersionForPageBlobOperation for StorageErrorCode.
     */
    public static final StorageErrorCode INVALID_VERSION_FOR_PAGE_BLOB_OPERATION = fromString("InvalidVersionForPageBlobOperation");

    /**
     * Static value LeaseAlreadyPresent for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ALREADY_PRESENT = fromString("LeaseAlreadyPresent");

    /**
     * Static value LeaseAlreadyBroken for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ALREADY_BROKEN = fromString("LeaseAlreadyBroken");

    /**
     * Static value LeaseIdMismatchWithBlobOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ID_MISMATCH_WITH_BLOB_OPERATION = fromString("LeaseIdMismatchWithBlobOperation");

    /**
     * Static value LeaseIdMismatchWithContainerOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ID_MISMATCH_WITH_CONTAINER_OPERATION = fromString("LeaseIdMismatchWithContainerOperation");

    /**
     * Static value LeaseIdMismatchWithLeaseOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ID_MISMATCH_WITH_LEASE_OPERATION = fromString("LeaseIdMismatchWithLeaseOperation");

    /**
     * Static value LeaseIdMissing for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_ID_MISSING = fromString("LeaseIdMissing");

    /**
     * Static value LeaseIsBreakingAndCannotBeAcquired for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_IS_BREAKING_AND_CANNOT_BE_ACQUIRED = fromString("LeaseIsBreakingAndCannotBeAcquired");

    /**
     * Static value LeaseIsBreakingAndCannotBeChanged for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_IS_BREAKING_AND_CANNOT_BE_CHANGED = fromString("LeaseIsBreakingAndCannotBeChanged");

    /**
     * Static value LeaseIsBrokenAndCannotBeRenewed for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_IS_BROKEN_AND_CANNOT_BE_RENEWED = fromString("LeaseIsBrokenAndCannotBeRenewed");

    /**
     * Static value LeaseLost for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_LOST = fromString("LeaseLost");

    /**
     * Static value LeaseNotPresentWithBlobOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_NOT_PRESENT_WITH_BLOB_OPERATION = fromString("LeaseNotPresentWithBlobOperation");

    /**
     * Static value LeaseNotPresentWithContainerOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_NOT_PRESENT_WITH_CONTAINER_OPERATION = fromString("LeaseNotPresentWithContainerOperation");

    /**
     * Static value LeaseNotPresentWithLeaseOperation for StorageErrorCode.
     */
    public static final StorageErrorCode LEASE_NOT_PRESENT_WITH_LEASE_OPERATION = fromString("LeaseNotPresentWithLeaseOperation");

    /**
     * Static value MaxBlobSizeConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode MAX_BLOB_SIZE_CONDITION_NOT_MET = fromString("MaxBlobSizeConditionNotMet");

    /**
     * Static value NoPendingCopyOperation for StorageErrorCode.
     */
    public static final StorageErrorCode NO_PENDING_COPY_OPERATION = fromString("NoPendingCopyOperation");

    /**
     * Static value OperationNotAllowedOnIncrementalCopyBlob for StorageErrorCode.
     */
    public static final StorageErrorCode OPERATION_NOT_ALLOWED_ON_INCREMENTAL_COPY_BLOB = fromString("OperationNotAllowedOnIncrementalCopyBlob");

    /**
     * Static value PendingCopyOperation for StorageErrorCode.
     */
    public static final StorageErrorCode PENDING_COPY_OPERATION = fromString("PendingCopyOperation");

    /**
     * Static value PreviousSnapshotCannotBeNewer for StorageErrorCode.
     */
    public static final StorageErrorCode PREVIOUS_SNAPSHOT_CANNOT_BE_NEWER = fromString("PreviousSnapshotCannotBeNewer");

    /**
     * Static value PreviousSnapshotNotFound for StorageErrorCode.
     */
    public static final StorageErrorCode PREVIOUS_SNAPSHOT_NOT_FOUND = fromString("PreviousSnapshotNotFound");

    /**
     * Static value PreviousSnapshotOperationNotSupported for StorageErrorCode.
     */
    public static final StorageErrorCode PREVIOUS_SNAPSHOT_OPERATION_NOT_SUPPORTED = fromString("PreviousSnapshotOperationNotSupported");

    /**
     * Static value SequenceNumberConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode SEQUENCE_NUMBER_CONDITION_NOT_MET = fromString("SequenceNumberConditionNotMet");

    /**
     * Static value SequenceNumberIncrementTooLarge for StorageErrorCode.
     */
    public static final StorageErrorCode SEQUENCE_NUMBER_INCREMENT_TOO_LARGE = fromString("SequenceNumberIncrementTooLarge");

    /**
     * Static value SnapshotCountExceeded for StorageErrorCode.
     */
    public static final StorageErrorCode SNAPSHOT_COUNT_EXCEEDED = fromString("SnapshotCountExceeded");

    /**
     * Static value SnaphotOperationRateExceeded for StorageErrorCode.
     */
    public static final StorageErrorCode SNAPHOT_OPERATION_RATE_EXCEEDED = fromString("SnaphotOperationRateExceeded");

    /**
     * Static value SnapshotsPresent for StorageErrorCode.
     */
    public static final StorageErrorCode SNAPSHOTS_PRESENT = fromString("SnapshotsPresent");

    /**
     * Static value SourceConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode SOURCE_CONDITION_NOT_MET = fromString("SourceConditionNotMet");

    /**
     * Static value SystemInUse for StorageErrorCode.
     */
    public static final StorageErrorCode SYSTEM_IN_USE = fromString("SystemInUse");

    /**
     * Static value TargetConditionNotMet for StorageErrorCode.
     */
    public static final StorageErrorCode TARGET_CONDITION_NOT_MET = fromString("TargetConditionNotMet");

    /**
     * Static value UnauthorizedBlobOverwrite for StorageErrorCode.
     */
    public static final StorageErrorCode UNAUTHORIZED_BLOB_OVERWRITE = fromString("UnauthorizedBlobOverwrite");

    /**
     * Static value BlobBeingRehydrated for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_BEING_REHYDRATED = fromString("BlobBeingRehydrated");

    /**
     * Static value BlobArchived for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_ARCHIVED = fromString("BlobArchived");

    /**
     * Static value BlobNotArchived for StorageErrorCode.
     */
    public static final StorageErrorCode BLOB_NOT_ARCHIVED = fromString("BlobNotArchived");

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
