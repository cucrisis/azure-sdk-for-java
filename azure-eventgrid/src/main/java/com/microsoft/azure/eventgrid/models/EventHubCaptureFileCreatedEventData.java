/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.EventHub.CaptureFileCreated event.
 */
public class EventHubCaptureFileCreatedEventData {
    /**
     * The path to the capture file.
     */
    @JsonProperty(value = "fileurl")
    private String fileurl;

    /**
     * The file type of the capture file.
     */
    @JsonProperty(value = "fileType")
    private String fileType;

    /**
     * The shard ID.
     */
    @JsonProperty(value = "partitionId")
    private String partitionId;

    /**
     * The file size.
     */
    @JsonProperty(value = "sizeInBytes")
    private Integer sizeInBytes;

    /**
     * The number of events in the file.
     */
    @JsonProperty(value = "eventCount")
    private Integer eventCount;

    /**
     * The smallest sequence number from the queue.
     */
    @JsonProperty(value = "firstSequenceNumber")
    private Integer firstSequenceNumber;

    /**
     * The last sequence number from the queue.
     */
    @JsonProperty(value = "lastSequenceNumber")
    private Integer lastSequenceNumber;

    /**
     * The first time from the queue.
     */
    @JsonProperty(value = "firstEnqueueTime")
    private DateTime firstEnqueueTime;

    /**
     * The last time from the queue.
     */
    @JsonProperty(value = "lastEnqueueTime")
    private DateTime lastEnqueueTime;

    /**
     * Get the fileurl value.
     *
     * @return the fileurl value
     */
    public String fileurl() {
        return this.fileurl;
    }

    /**
     * Set the fileurl value.
     *
     * @param fileurl the fileurl value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withFileurl(String fileurl) {
        this.fileurl = fileurl;
        return this;
    }

    /**
     * Get the fileType value.
     *
     * @return the fileType value
     */
    public String fileType() {
        return this.fileType;
    }

    /**
     * Set the fileType value.
     *
     * @param fileType the fileType value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Get the partitionId value.
     *
     * @return the partitionId value
     */
    public String partitionId() {
        return this.partitionId;
    }

    /**
     * Set the partitionId value.
     *
     * @param partitionId the partitionId value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * Get the sizeInBytes value.
     *
     * @return the sizeInBytes value
     */
    public Integer sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Set the sizeInBytes value.
     *
     * @param sizeInBytes the sizeInBytes value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    /**
     * Get the eventCount value.
     *
     * @return the eventCount value
     */
    public Integer eventCount() {
        return this.eventCount;
    }

    /**
     * Set the eventCount value.
     *
     * @param eventCount the eventCount value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withEventCount(Integer eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    /**
     * Get the firstSequenceNumber value.
     *
     * @return the firstSequenceNumber value
     */
    public Integer firstSequenceNumber() {
        return this.firstSequenceNumber;
    }

    /**
     * Set the firstSequenceNumber value.
     *
     * @param firstSequenceNumber the firstSequenceNumber value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withFirstSequenceNumber(Integer firstSequenceNumber) {
        this.firstSequenceNumber = firstSequenceNumber;
        return this;
    }

    /**
     * Get the lastSequenceNumber value.
     *
     * @return the lastSequenceNumber value
     */
    public Integer lastSequenceNumber() {
        return this.lastSequenceNumber;
    }

    /**
     * Set the lastSequenceNumber value.
     *
     * @param lastSequenceNumber the lastSequenceNumber value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withLastSequenceNumber(Integer lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
        return this;
    }

    /**
     * Get the firstEnqueueTime value.
     *
     * @return the firstEnqueueTime value
     */
    public DateTime firstEnqueueTime() {
        return this.firstEnqueueTime;
    }

    /**
     * Set the firstEnqueueTime value.
     *
     * @param firstEnqueueTime the firstEnqueueTime value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withFirstEnqueueTime(DateTime firstEnqueueTime) {
        this.firstEnqueueTime = firstEnqueueTime;
        return this;
    }

    /**
     * Get the lastEnqueueTime value.
     *
     * @return the lastEnqueueTime value
     */
    public DateTime lastEnqueueTime() {
        return this.lastEnqueueTime;
    }

    /**
     * Set the lastEnqueueTime value.
     *
     * @param lastEnqueueTime the lastEnqueueTime value to set
     * @return the EventHubCaptureFileCreatedEventData object itself.
     */
    public EventHubCaptureFileCreatedEventData withLastEnqueueTime(DateTime lastEnqueueTime) {
        this.lastEnqueueTime = lastEnqueueTime;
        return this;
    }

}
