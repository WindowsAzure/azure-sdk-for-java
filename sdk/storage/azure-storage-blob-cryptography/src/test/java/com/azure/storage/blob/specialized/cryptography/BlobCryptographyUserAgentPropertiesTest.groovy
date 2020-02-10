// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.specialized.cryptography

import com.azure.core.util.CoreUtils
import spock.lang.Retry
import spock.lang.Specification
import spock.lang.Timeout

@Timeout(600)
@Retry(count = 2)
class BlobCryptographyUserAgentPropertiesTest extends Specification {

    def "User agent properties not null"() {
        given:
        Map<String, String> properties = CoreUtils.getProperties("azure-storage-blob-cryptography.properties")
        expect:
        properties.get("name") == "azure-storage-blob-cryptography"
        properties.get("version").matches("(\\d)+.(\\d)+.(\\d)+([-a-zA-Z0-9.])*")
    }
}
