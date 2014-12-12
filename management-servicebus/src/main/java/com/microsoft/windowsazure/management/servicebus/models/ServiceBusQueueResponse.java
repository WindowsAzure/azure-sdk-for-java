/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* A response to a request for a particular queue.
*/
public class ServiceBusQueueResponse extends OperationResponse {
    private String name;
    
    /**
    * Optional. The name of the queue.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the queue.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private ServiceBusQueue queue;
    
    /**
    * Optional. The requested queue.
    * @return The Queue value.
    */
    public ServiceBusQueue getQueue() {
        return this.queue;
    }
    
    /**
    * Optional. The requested queue.
    * @param queueValue The Queue value.
    */
    public void setQueue(final ServiceBusQueue queueValue) {
        this.queue = queueValue;
    }
}
