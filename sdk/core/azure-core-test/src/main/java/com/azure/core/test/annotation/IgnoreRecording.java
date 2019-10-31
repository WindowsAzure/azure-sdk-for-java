// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.test.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation given to some tests to indicate that they shouldn't have their network calls recorded, essentially these
 * tests will only run when testing against the service.
 */
@Retention(RUNTIME)
@Target({ METHOD })
public @interface IgnoreRecording {
}
