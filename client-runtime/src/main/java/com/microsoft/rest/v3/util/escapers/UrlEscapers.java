/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v3.util.escapers;

/**
 * Collection of useful URL escapers.
 */
public final class UrlEscapers {

    private static final String UNRESERVED_SYMBOLS = "-._~";
    private static final String SUB_DELIMS = "!$&'()*+,;=";

    /** An escaper for escaping path parameters. */
    public static final PercentEscaper PATH_ESCAPER = new PercentEscaper(UNRESERVED_SYMBOLS + SUB_DELIMS + ":@", false);
    /** An escaper for escaping query parameters. */
    public static final PercentEscaper QUERY_ESCAPER = new PercentEscaper(UNRESERVED_SYMBOLS + "/?", false);
    /** An escaper for escaping form parameters. */
    public static final PercentEscaper FORM_ESCAPER = new PercentEscaper(UNRESERVED_SYMBOLS, true);

}
