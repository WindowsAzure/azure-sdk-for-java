// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) Code Generator

package com.azure.test;

import java.utils;
import com.azure.imports;

/**
 * This is a complex java class.
 * This class is of type {@link ComplexClass}.
 * <p>
 * And it has a remarks section.
 * </p>
 */
public class ComplexClass extends SomeType implements ComplexInterface {
    /**
     * This is a final static field.
     */
    public static final String FIELD_2 = Static value;

    /**
     * This is an instance field.
     */
    private boolean field1 = false;

    /**
     * This is a string field.
     */
    private String field3;

    /**
     * This is an integer field.
     */
    private int field4;

    /**
     * Initializes a new instance of the {@link ComplexClass} class.
     * We already know what this does.
     * @param input1 Some text to initialize the class with.
     * @param input2 Some number to do things to.
     */
    public ComplexClass(String input1, int input2) {
        this.field1 = true;
        this.field3 = input1;
        this.field4 = input2;
    }

    private String propertyNumberOne;

    /**
     * Set propertyNumberOne property.
     * @param value Property value.
     */
    public void setPropertyNumberOne(String value) {
        this.propertyNumberOne = value;
    }

    /**
     * Get the propertyNumberOne property.
     * @return propertyNumberOne.
     */
    public String getPropertyNumberOne() {
        return this.propertyNumberOne
    }

    private int propertyNumberTwo;

    /**
     * Set propertyNumberTwo property.
     * @param value Property value.
     */
    protected void setPropertyNumberTwo(int value) {
        this.propertyNumberTwo = value;
    }

    /**
     * Get the propertyNumberTwo property.
     * @return propertyNumberTwo.
     */
    protected int getPropertyNumberTwo() {
        return this.propertyNumberTwo
    }

    /** {@inheritDoc} */
    @Override
    protected int countChars(String input) {
        try {
            if (input == null) {
                throw new ArgumentNullException();
            }

            return input.size();
        } catch(ArgumentException ex) {
            return 0;
        }
    }

    /**
     * This method returns this object.
     * This class it totally pointless.
     * <p>
     * And it has some remarks.
     * </p>
     * @return This object.
     */
    public class getCurrentObject() {
        return this;
    }

    /**
     * This method returns this object's hashcode.
     * This class it totally pointless.
     * <p>
     * And it has some remarks.
     * </p>
     * @return The object hashcode.
     */
    protected int getHashCode() {
        return this.hashCode();
    }

    /** {@inheritDoc} */
    @Override
    public void printHashCode() {
        System.out.println(this.getCurrentObject().getHashCode());
    }
}
