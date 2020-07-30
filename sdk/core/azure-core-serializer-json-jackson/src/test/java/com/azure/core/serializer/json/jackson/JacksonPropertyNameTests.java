// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer.json.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JacksonPropertyNameTests {
    private static final String EXPECT_VALUE_IN_FIELD = "expectFieldName";
    private static final String EXPECT_VALUE_IN_METHOD = "expectMethodName";
    private static JacksonJsonSerializer serializer;

    @BeforeAll
    public static void setup() {
        serializer = new JacksonJsonSerializerProvider().createInstance();
    }

    @Test
    public void testPropertyNameOnFieldName() throws NoSuchFieldException {
        class Hotel {
            String hotelName;
        }
        Field f = Hotel.class.getDeclaredField("hotelName");
        assertMemberValue(f, "hotelName");
    }

    @Test
    public void testPropertyNameOnIgnoredFieldName() throws NoSuchFieldException {
        class Hotel {
            @JsonIgnore
            String hotelName;
        }
        Field f = Hotel.class.getDeclaredField("hotelName");
        assertMemberNull(f);
    }

    @Test
    public void testPropertyNameOnFieldAnnotation() throws NoSuchFieldException {
        class Hotel {
            @JsonProperty(value = EXPECT_VALUE_IN_FIELD)
            String hotelName;
        }
        Field f = Hotel.class.getDeclaredField("hotelName");
        assertMemberValue(f, EXPECT_VALUE_IN_FIELD);
    }

    @Test
    public void testPropertyNameOnFieldAnnotationWithEmptyValue() throws NoSuchFieldException {
        class Hotel {
            @JsonProperty(value = "")
            String hotelName;
        }
        Field f = Hotel.class.getDeclaredField("hotelName");

        assertMemberValue(f, "hotelName");
    }

    @Test
    public void testPropertyNameOnFieldAnnotationWithNullValue() throws NoSuchFieldException {
        class Hotel {
            @JsonProperty()
            String hotelName;
        }
        Field f = Hotel.class.getDeclaredField("hotelName");
        assertMemberValue(f, "hotelName");
    }

    @Test
    public void testPropertyNameOnMethodName() throws NoSuchMethodException {
        class Hotel {
            String hotelName;

            public String getHotelName() {
                return hotelName;
            }
        }

        Method m = Hotel.class.getDeclaredMethod("getHotelName");
        assertMemberValue(m, "getHotelName");
    }

    @Test
    public void testPropertyNameOnIgnoredMethodName() throws NoSuchMethodException {
        class Hotel {
            String hotelName;

            @JsonIgnore
            public String getHotelName() {
                return hotelName;
            }
        }
        Method m = Hotel.class.getDeclaredMethod("getHotelName");
        assertMemberNull(m);
    }

    @Test
    public void testPropertyNameOnMethodAnnotation() throws NoSuchMethodException {
        class Hotel {
            String hotelName;

            @JsonProperty(value = EXPECT_VALUE_IN_METHOD)
            public String getHotelName() {
                return hotelName;
            }
        }

        Method m = Hotel.class.getDeclaredMethod("getHotelName");
        assertMemberValue(m, EXPECT_VALUE_IN_METHOD);
    }


    @Test
    public void testPropertyNameOnMethodAnnotationWithEmptyValue() throws NoSuchMethodException {
        class Hotel {
            String hotelName;

            @JsonProperty(value = "")
            public String getHotelName() {
                return hotelName;
            }
        }

        Method m = Hotel.class.getDeclaredMethod("getHotelName");
        assertMemberValue(m, "getHotelName");
    }

    @Test
    public void testPropertyNameOnMethodAnnotationWithNullValue() throws NoSuchMethodException {
        class Hotel {
            String hotelName;

            @JsonProperty()
            public String getHotelName() {
                return hotelName;
            }
        }

        Method m = Hotel.class.getDeclaredMethod("getHotelName");
        assertMemberValue(m, "getHotelName");
    }

    public void assertMemberValue(Member m, String expectValue) {
        assertEquals(expectValue, serializer.getSerializerMemberName(m));
    }

    public void assertMemberNull(Member m) {
        assertNull(serializer.getSerializerMemberName(m));
    }


    @Test
    public void testPropertyNameOnConstructor() {
        Constructor[] constructors = Hotel.class.getConstructors();
        assertEquals(1, constructors.length);

        assertEquals(serializer.getSerializerMemberName(constructors[0]),
            "com.azure.core.serializer.json.jackson.Hotel");
    }

    @Test
    public void compareSerializedNameWithJsonSerializer() {

    }
}
