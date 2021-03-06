/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties JSON element.
 */
public class DeviceTwinInfoProperties {
    /**
     * A portion of the properties that can be written only by the application
     * back-end, and read by the device.
     */
    @JsonProperty(value = "desired")
    private DeviceTwinProperties desired;

    /**
     * A portion of the properties that can be written only by the device, and
     * read by the application back-end.
     */
    @JsonProperty(value = "reported")
    private DeviceTwinProperties reported;

    /**
     * Get the desired value.
     *
     * @return the desired value
     */
    public DeviceTwinProperties desired() {
        return this.desired;
    }

    /**
     * Set the desired value.
     *
     * @param desired the desired value to set
     * @return the DeviceTwinInfoProperties object itself.
     */
    public DeviceTwinInfoProperties withDesired(DeviceTwinProperties desired) {
        this.desired = desired;
        return this;
    }

    /**
     * Get the reported value.
     *
     * @return the reported value
     */
    public DeviceTwinProperties reported() {
        return this.reported;
    }

    /**
     * Set the reported value.
     *
     * @param reported the reported value to set
     * @return the DeviceTwinInfoProperties object itself.
     */
    public DeviceTwinInfoProperties withReported(DeviceTwinProperties reported) {
        this.reported = reported;
        return this;
    }

}
