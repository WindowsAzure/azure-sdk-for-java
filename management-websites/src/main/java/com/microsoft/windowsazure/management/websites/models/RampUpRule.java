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

package com.microsoft.windowsazure.management.websites.models;

/**
* Specifies a routing rule which can divert traffic to different site based on
* re-route percentage and host name.and can ramp up/down traffic based on
* metrics based algorithm or based on custom logic exposed as REST API
*/
public class RampUpRule extends RoutingRule {
    private String actionHostName;
    
    /**
    * Optional. A string that contains host name of the other site which will
    * take part of the re-reouted traffic
    * @return The ActionHostName value.
    */
    public String getActionHostName() {
        return this.actionHostName;
    }
    
    /**
    * Optional. A string that contains host name of the other site which will
    * take part of the re-reouted traffic
    * @param actionHostNameValue The ActionHostName value.
    */
    public void setActionHostName(final String actionHostNameValue) {
        this.actionHostName = actionHostNameValue;
    }
    
    private String changeDecisionCallbackUrl;
    
    /**
    * Optional. A string that contains callback REST API method to determine
    * change direction and step.This property is optional
    * @return The ChangeDecisionCallbackUrl value.
    */
    public String getChangeDecisionCallbackUrl() {
        return this.changeDecisionCallbackUrl;
    }
    
    /**
    * Optional. A string that contains callback REST API method to determine
    * change direction and step.This property is optional
    * @param changeDecisionCallbackUrlValue The ChangeDecisionCallbackUrl value.
    */
    public void setChangeDecisionCallbackUrl(final String changeDecisionCallbackUrlValue) {
        this.changeDecisionCallbackUrl = changeDecisionCallbackUrlValue;
    }
    
    private Integer changeIntervalInMinutes;
    
    /**
    * Optional. A number that contains interval in minutes to evaluate health
    * of the re-reouted site and change reoute percentage with the step. This
    * property is optional
    * @return The ChangeIntervalInMinutes value.
    */
    public Integer getChangeIntervalInMinutes() {
        return this.changeIntervalInMinutes;
    }
    
    /**
    * Optional. A number that contains interval in minutes to evaluate health
    * of the re-reouted site and change reoute percentage with the step. This
    * property is optional
    * @param changeIntervalInMinutesValue The ChangeIntervalInMinutes value.
    */
    public void setChangeIntervalInMinutes(final Integer changeIntervalInMinutesValue) {
        this.changeIntervalInMinutes = changeIntervalInMinutesValue;
    }
    
    private Double changeStep;
    
    /**
    * Optional. A number that contains reroute percentage change that would
    * occur on each interval. This property is optional
    * @return The ChangeStep value.
    */
    public Double getChangeStep() {
        return this.changeStep;
    }
    
    /**
    * Optional. A number that contains reroute percentage change that would
    * occur on each interval. This property is optional
    * @param changeStepValue The ChangeStep value.
    */
    public void setChangeStep(final Double changeStepValue) {
        this.changeStep = changeStepValue;
    }
    
    private Double maxReroutePercentage;
    
    /**
    * Optional. A number that contains maximum reeoute percentage. Default is
    * 1000. This property is optional
    * @return The MaxReroutePercentage value.
    */
    public Double getMaxReroutePercentage() {
        return this.maxReroutePercentage;
    }
    
    /**
    * Optional. A number that contains maximum reeoute percentage. Default is
    * 1000. This property is optional
    * @param maxReroutePercentageValue The MaxReroutePercentage value.
    */
    public void setMaxReroutePercentage(final Double maxReroutePercentageValue) {
        this.maxReroutePercentage = maxReroutePercentageValue;
    }
    
    private Double minReroutePercentage;
    
    /**
    * Optional. A number that contains minimum reeoute percentage. Default is
    * 0. This property is optional
    * @return The MinReroutePercentage value.
    */
    public Double getMinReroutePercentage() {
        return this.minReroutePercentage;
    }
    
    /**
    * Optional. A number that contains minimum reeoute percentage. Default is
    * 0. This property is optional
    * @param minReroutePercentageValue The MinReroutePercentage value.
    */
    public void setMinReroutePercentage(final Double minReroutePercentageValue) {
        this.minReroutePercentage = minReroutePercentageValue;
    }
    
    private double reroutePercentage;
    
    /**
    * Optional. A number that contains percentage of the traffic to be
    * re-reouted.
    * @return The ReroutePercentage value.
    */
    public double getReroutePercentage() {
        return this.reroutePercentage;
    }
    
    /**
    * Optional. A number that contains percentage of the traffic to be
    * re-reouted.
    * @param reroutePercentageValue The ReroutePercentage value.
    */
    public void setReroutePercentage(final double reroutePercentageValue) {
        this.reroutePercentage = reroutePercentageValue;
    }
}
