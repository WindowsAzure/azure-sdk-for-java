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

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* The compute capabilities.
*/
public class ComputeCapabilities {
    private ArrayList<String> virtualMachinesRoleSizes;
    
    /**
    * Optional. Role sizes support for IaaS deployments.
    * @return The VirtualMachinesRoleSizes value.
    */
    public ArrayList<String> getVirtualMachinesRoleSizes() {
        return this.virtualMachinesRoleSizes;
    }
    
    /**
    * Optional. Role sizes support for IaaS deployments.
    * @param virtualMachinesRoleSizesValue The VirtualMachinesRoleSizes value.
    */
    public void setVirtualMachinesRoleSizes(final ArrayList<String> virtualMachinesRoleSizesValue) {
        this.virtualMachinesRoleSizes = virtualMachinesRoleSizesValue;
    }
    
    private ArrayList<String> webWorkerRoleSizes;
    
    /**
    * Optional. Role sizes support for PaaS deployments.
    * @return The WebWorkerRoleSizes value.
    */
    public ArrayList<String> getWebWorkerRoleSizes() {
        return this.webWorkerRoleSizes;
    }
    
    /**
    * Optional. Role sizes support for PaaS deployments.
    * @param webWorkerRoleSizesValue The WebWorkerRoleSizes value.
    */
    public void setWebWorkerRoleSizes(final ArrayList<String> webWorkerRoleSizesValue) {
        this.webWorkerRoleSizes = webWorkerRoleSizesValue;
    }
    
    /**
    * Initializes a new instance of the ComputeCapabilities class.
    *
    */
    public ComputeCapabilities() {
        this.setVirtualMachinesRoleSizes(new LazyArrayList<String>());
        this.setWebWorkerRoleSizes(new LazyArrayList<String>());
    }
}
