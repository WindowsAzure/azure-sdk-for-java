/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation.content;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * This type maps the XML returned in protection key.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetProtectionKey", namespace = Constants.ODATA_DATA_NS)
public class ProtectionKeyRestType implements MediaServiceDTO {
    @XmlValue
    String protectionKey;

    /**
     * @return the protection key
     */
    public String getProtectionKey() {
        return protectionKey;
    }

    /**
     * @param protection
     *            key id
     *            the protection key id to set
     */
    public void setProtectionKey(String protectionKey) {
        this.protectionKey = protectionKey;
    }

}
