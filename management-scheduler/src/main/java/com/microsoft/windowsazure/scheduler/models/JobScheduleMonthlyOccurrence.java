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
* Occurrences of days within a month.
*/
public class JobScheduleMonthlyOccurrence {
    private JobScheduleDay day;
    
    /**
    * Required. Day of the occurrence. Must be one of monday, tuesday,
    * wednesday, thursday, friday, saturday, sunday.
    * @return The Day value.
    */
    public JobScheduleDay getDay() {
        return this.day;
    }
    
    /**
    * Required. Day of the occurrence. Must be one of monday, tuesday,
    * wednesday, thursday, friday, saturday, sunday.
    * @param dayValue The Day value.
    */
    public void setDay(final JobScheduleDay dayValue) {
        this.day = dayValue;
    }
    
    private Integer occurrence;
    
    /**
    * Optional. Occurrence of the day within the month. Must be between -31 and
    * 31.
    * @return The Occurrence value.
    */
    public Integer getOccurrence() {
        return this.occurrence;
    }
    
    /**
    * Optional. Occurrence of the day within the month. Must be between -31 and
    * 31.
    * @param occurrenceValue The Occurrence value.
    */
    public void setOccurrence(final Integer occurrenceValue) {
        this.occurrence = occurrenceValue;
    }
    
    /**
    * Initializes a new instance of the JobScheduleMonthlyOccurrence class.
    *
    */
    public JobScheduleMonthlyOccurrence() {
    }
    
    /**
    * Initializes a new instance of the JobScheduleMonthlyOccurrence class with
    * required arguments.
    *
    */
    public JobScheduleMonthlyOccurrence(JobScheduleDay day) {
        this.setDay(day);
    }
}
