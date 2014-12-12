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

package com.microsoft.windowsazure.scheduler.models;

/**
* Action to invoke following the failure of all of the retries of a job
* occurrence.
*/
public class JobErrorAction {
    private JobQueueMessage queueMessage;
    
    /**
    * Optional. Queue and content for a queue message action type.
    * @return The QueueMessage value.
    */
    public JobQueueMessage getQueueMessage() {
        return this.queueMessage;
    }
    
    /**
    * Optional. Queue and content for a queue message action type.
    * @param queueMessageValue The QueueMessage value.
    */
    public void setQueueMessage(final JobQueueMessage queueMessageValue) {
        this.queueMessage = queueMessageValue;
    }
    
    private JobHttpRequest request;
    
    /**
    * Optional. Request for a http or https action type.
    * @return The Request value.
    */
    public JobHttpRequest getRequest() {
        return this.request;
    }
    
    /**
    * Optional. Request for a http or https action type.
    * @param requestValue The Request value.
    */
    public void setRequest(final JobHttpRequest requestValue) {
        this.request = requestValue;
    }
    
    private JobActionType type;
    
    /**
    * Required. Type of action. Can be one of http, https, storageQueue.
    * @return The Type value.
    */
    public JobActionType getType() {
        return this.type;
    }
    
    /**
    * Required. Type of action. Can be one of http, https, storageQueue.
    * @param typeValue The Type value.
    */
    public void setType(final JobActionType typeValue) {
        this.type = typeValue;
    }
    
    /**
    * Initializes a new instance of the JobErrorAction class.
    *
    */
    public JobErrorAction() {
    }
    
    /**
    * Initializes a new instance of the JobErrorAction class with required
    * arguments.
    *
    */
    public JobErrorAction(JobActionType type) {
        this.setType(type);
    }
}
