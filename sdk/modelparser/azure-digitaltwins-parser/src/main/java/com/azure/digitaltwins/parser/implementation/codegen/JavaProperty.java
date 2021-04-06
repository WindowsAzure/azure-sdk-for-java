// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.parser.implementation.codegen;


import com.azure.core.util.logging.ClientLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Generator for a java property.
 * With java properties, there is a field, a getter and a setter.
 */
public class JavaProperty extends JavaStatement {
    private ClientLogger logger = new ClientLogger(JavaProperty.class);

    private String propertyName;
    private String propertyType;
    private JavaField field;
    private List<JavaMethod> listOfMethods;

    private boolean hasGetter;
    private boolean hasSetter;

    /**
     * Initializes a new instance of the {@link JavaProperty} class.
     *
     * @param propertyName Name of the property.
     * @param propertyType Type of the property.
     * @param hasGetter    Whether or not the property has a getter.
     * @param hasSetter    Whether or not the property has a setter.
     */
    public JavaProperty(String propertyName, String propertyType, boolean hasGetter, boolean hasSetter) {
        // propertyName should start with a lowercase character.
        if (!Character.isLowerCase(propertyName.charAt(0))) {
            logger.logThrowableAsError(new StyleException("Property name '" + propertyName + "' should start with a lowercase character"));
        }

        this.hasGetter = hasGetter;
        this.hasSetter = hasSetter;
        this.propertyName = propertyName;
        this.propertyType = propertyType;

        // Create a private field.
        this.field = new JavaField(Access.PRIVATE, propertyType, propertyName, null, Multiplicity.INSTANCE, Mutability.MUTABLE);

        this.listOfMethods = new ArrayList<>();
    }

    /**
     * Adds a getter method for the private field.
     *
     * @param description Getter method description.
     * @return The {@link JavaProperty} object itself.
     */
    public JavaProperty getter(String description) {
        String getterMethodName = getMethodName(this.propertyName, "get");
        JavaMethod setterMethod = new JavaMethod(true, Access.PUBLIC, Novelty.NORMAL, propertyType, getterMethodName, Multiplicity.INSTANCE, Mutability.MUTABLE);

        if (description != null) {
            if (!description.endsWith(".")) {
                logger.logThrowableAsError(new StyleException("Documentation text of method '" + getterMethodName + "' must end with a period. -- SA1629"));
            }

            setterMethod.addSummary(description);
            setterMethod.returns(propertyName);
        }

        JavaScope bodyScope = new JavaScope(null);
        bodyScope.addStatement(
            new JavaLine("return this." + propertyName));

        setterMethod.setBody(bodyScope);

        this.listOfMethods.add(setterMethod);

        return this;
    }

    /**
     * Adds a setter method for the private field.
     *
     * @param description Setter method description.
     * @return The {@link JavaProperty} object itself.
     */
    public JavaProperty setter(String description) {
        String setterMethodName = getMethodName(this.propertyName, "set");
        JavaMethod setterMethod = new JavaMethod(true, Access.PUBLIC, Novelty.NORMAL, "void", setterMethodName, Multiplicity.INSTANCE, Mutability.MUTABLE);

        if (description != null) {
            if (!description.endsWith(".")) {
                logger.logThrowableAsError(new StyleException("Documentation text of method '" + setterMethodName + "' must end with a period. -- SA1629"));
            }

            setterMethod.addSummary(description);
        }

        setterMethod.param(this.propertyType, "value", "Property value.");
        JavaScope bodyScope = new JavaScope(null);
        bodyScope.addStatement(
            new JavaLine("this." + this.propertyName + " = value;"));

        setterMethod.setBody(bodyScope);

        this.listOfMethods.add(setterMethod);

        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getSortingText() {
        return "";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void generateCode(CodeWriter codeWriter) throws IOException {
        this.field.generateCode(codeWriter);
        codeWriter.blank();
        for (JavaMethod method : listOfMethods) {
            method.generateCode(codeWriter);
            codeWriter.blank();
        }
    }

    /**
     * Creates a method name using a prefix and a property name.
     * The first character of the property name will be converted to upper case and the prefix will be added to the beginning.
     *
     * @param propertyName Property name.
     * @param prefix       Method prefix.
     * @return Correct method name.
     */
    private static String getMethodName(String propertyName, String prefix) {
        return prefix + propertyName.substring(0, 1).toUpperCase(Locale.getDefault()) + propertyName.substring(1);
    }
}
