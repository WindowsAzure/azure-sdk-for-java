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
 * The Class RebindContentKeyType.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RebindContentKey", namespace = Constants.ODATA_DATA_NS)
public class RebindContentKeyType implements MediaServiceDTO {

    /** The rebind content key. */
    @XmlValue
    String rebindContentKey;

    /**
     * Gets the content key.
     * 
     * @return the content key
     */
    public String getContentKey() {
        return rebindContentKey;
    }

    /**
     * Sets the content key.
     * 
     * @param rebindContentKey
     *            the new content key
     */
    public void setContentKey(String rebindContentKey) {
        this.rebindContentKey = rebindContentKey;
    }

}
