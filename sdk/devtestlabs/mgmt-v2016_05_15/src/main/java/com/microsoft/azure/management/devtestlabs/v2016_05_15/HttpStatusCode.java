/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HttpStatusCode.
 */
public final class HttpStatusCode extends ExpandableStringEnum<HttpStatusCode> {
    /** Static value Continue for HttpStatusCode. */
    public static final HttpStatusCode CONTINUE = fromString("Continue");

    /** Static value SwitchingProtocols for HttpStatusCode. */
    public static final HttpStatusCode SWITCHING_PROTOCOLS = fromString("SwitchingProtocols");

    /** Static value OK for HttpStatusCode. */
    public static final HttpStatusCode OK = fromString("OK");

    /** Static value Created for HttpStatusCode. */
    public static final HttpStatusCode CREATED = fromString("Created");

    /** Static value Accepted for HttpStatusCode. */
    public static final HttpStatusCode ACCEPTED = fromString("Accepted");

    /** Static value NonAuthoritativeInformation for HttpStatusCode. */
    public static final HttpStatusCode NON_AUTHORITATIVE_INFORMATION = fromString("NonAuthoritativeInformation");

    /** Static value NoContent for HttpStatusCode. */
    public static final HttpStatusCode NO_CONTENT = fromString("NoContent");

    /** Static value ResetContent for HttpStatusCode. */
    public static final HttpStatusCode RESET_CONTENT = fromString("ResetContent");

    /** Static value PartialContent for HttpStatusCode. */
    public static final HttpStatusCode PARTIAL_CONTENT = fromString("PartialContent");

    /** Static value MultipleChoices for HttpStatusCode. */
    public static final HttpStatusCode MULTIPLE_CHOICES = fromString("MultipleChoices");

    /** Static value MovedPermanently for HttpStatusCode. */
    public static final HttpStatusCode MOVED_PERMANENTLY = fromString("MovedPermanently");

    /** Static value Redirect for HttpStatusCode. */
    public static final HttpStatusCode REDIRECT = fromString("Redirect");

    /** Static value SeeOther for HttpStatusCode. */
    public static final HttpStatusCode SEE_OTHER = fromString("SeeOther");

    /** Static value NotModified for HttpStatusCode. */
    public static final HttpStatusCode NOT_MODIFIED = fromString("NotModified");

    /** Static value UseProxy for HttpStatusCode. */
    public static final HttpStatusCode USE_PROXY = fromString("UseProxy");

    /** Static value Unused for HttpStatusCode. */
    public static final HttpStatusCode UNUSED = fromString("Unused");

    /** Static value TemporaryRedirect for HttpStatusCode. */
    public static final HttpStatusCode TEMPORARY_REDIRECT = fromString("TemporaryRedirect");

    /** Static value BadRequest for HttpStatusCode. */
    public static final HttpStatusCode BAD_REQUEST = fromString("BadRequest");

    /** Static value Unauthorized for HttpStatusCode. */
    public static final HttpStatusCode UNAUTHORIZED = fromString("Unauthorized");

    /** Static value PaymentRequired for HttpStatusCode. */
    public static final HttpStatusCode PAYMENT_REQUIRED = fromString("PaymentRequired");

    /** Static value Forbidden for HttpStatusCode. */
    public static final HttpStatusCode FORBIDDEN = fromString("Forbidden");

    /** Static value NotFound for HttpStatusCode. */
    public static final HttpStatusCode NOT_FOUND = fromString("NotFound");

    /** Static value MethodNotAllowed for HttpStatusCode. */
    public static final HttpStatusCode METHOD_NOT_ALLOWED = fromString("MethodNotAllowed");

    /** Static value NotAcceptable for HttpStatusCode. */
    public static final HttpStatusCode NOT_ACCEPTABLE = fromString("NotAcceptable");

    /** Static value ProxyAuthenticationRequired for HttpStatusCode. */
    public static final HttpStatusCode PROXY_AUTHENTICATION_REQUIRED = fromString("ProxyAuthenticationRequired");

    /** Static value RequestTimeout for HttpStatusCode. */
    public static final HttpStatusCode REQUEST_TIMEOUT = fromString("RequestTimeout");

    /** Static value Conflict for HttpStatusCode. */
    public static final HttpStatusCode CONFLICT = fromString("Conflict");

    /** Static value Gone for HttpStatusCode. */
    public static final HttpStatusCode GONE = fromString("Gone");

    /** Static value LengthRequired for HttpStatusCode. */
    public static final HttpStatusCode LENGTH_REQUIRED = fromString("LengthRequired");

    /** Static value PreconditionFailed for HttpStatusCode. */
    public static final HttpStatusCode PRECONDITION_FAILED = fromString("PreconditionFailed");

    /** Static value RequestEntityTooLarge for HttpStatusCode. */
    public static final HttpStatusCode REQUEST_ENTITY_TOO_LARGE = fromString("RequestEntityTooLarge");

    /** Static value RequestUriTooLong for HttpStatusCode. */
    public static final HttpStatusCode REQUEST_URI_TOO_LONG = fromString("RequestUriTooLong");

    /** Static value UnsupportedMediaType for HttpStatusCode. */
    public static final HttpStatusCode UNSUPPORTED_MEDIA_TYPE = fromString("UnsupportedMediaType");

    /** Static value RequestedRangeNotSatisfiable for HttpStatusCode. */
    public static final HttpStatusCode REQUESTED_RANGE_NOT_SATISFIABLE = fromString("RequestedRangeNotSatisfiable");

    /** Static value ExpectationFailed for HttpStatusCode. */
    public static final HttpStatusCode EXPECTATION_FAILED = fromString("ExpectationFailed");

    /** Static value UpgradeRequired for HttpStatusCode. */
    public static final HttpStatusCode UPGRADE_REQUIRED = fromString("UpgradeRequired");

    /** Static value InternalServerError for HttpStatusCode. */
    public static final HttpStatusCode INTERNAL_SERVER_ERROR = fromString("InternalServerError");

    /** Static value NotImplemented for HttpStatusCode. */
    public static final HttpStatusCode NOT_IMPLEMENTED = fromString("NotImplemented");

    /** Static value BadGateway for HttpStatusCode. */
    public static final HttpStatusCode BAD_GATEWAY = fromString("BadGateway");

    /** Static value ServiceUnavailable for HttpStatusCode. */
    public static final HttpStatusCode SERVICE_UNAVAILABLE = fromString("ServiceUnavailable");

    /** Static value GatewayTimeout for HttpStatusCode. */
    public static final HttpStatusCode GATEWAY_TIMEOUT = fromString("GatewayTimeout");

    /** Static value HttpVersionNotSupported for HttpStatusCode. */
    public static final HttpStatusCode HTTP_VERSION_NOT_SUPPORTED = fromString("HttpVersionNotSupported");

    /**
     * Creates or finds a HttpStatusCode from its string representation.
     * @param name a name to look for
     * @return the corresponding HttpStatusCode
     */
    @JsonCreator
    public static HttpStatusCode fromString(String name) {
        return fromString(name, HttpStatusCode.class);
    }

    /**
     * @return known HttpStatusCode values
     */
    public static Collection<HttpStatusCode> values() {
        return values(HttpStatusCode.class);
    }
}
