// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.test.shared

import com.azure.storage.common.implementation.Constants
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import spock.lang.IgnoreIf
import spock.lang.Specification

abstract class ServiceVersionTest extends Specification {

    @IgnoreIf({ isBeta() })
    def "latest should be last when we release"() {
        when:
        Class clazz = getServiceVersionClass()
        def lastVersion = clazz.getEnumConstants().last()
        def latestVersion = clazz.getLatest()

        then:
        latestVersion == lastVersion
    }

    @IgnoreIf({ isBeta() })
    def "Header version should match last when we release"() {
        when:
        Class clazz = getServiceVersionClass()
        def latestVersion = clazz.getLatest()

        then:
        Constants.HeaderConstants.TARGET_STORAGE_VERSION == latestVersion.getVersion()
    }

    abstract Class getServiceVersionClass()

    protected static boolean isBeta() {
        return getVersionFromPomFile().contains("beta")
    }

    private static String getVersionFromPomFile() {
        String fileName = "pom.xml";
        File file = new File(fileName);
        def doc = new XmlMapper().readValue(file, Map.class)
        return (String) doc.get("version")
    }
}
