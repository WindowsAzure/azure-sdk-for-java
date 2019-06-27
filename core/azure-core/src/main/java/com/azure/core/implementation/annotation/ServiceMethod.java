// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * Annotation given to all service client methods that perform network operations.
 */
@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ServiceMethod {

    /**
     * Represents whether the method operation will be performed asynchronously or synchronously (i.e. blocking).
     * @return
     */
    boolean isAsync() default false;
}
