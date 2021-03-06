/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The lifecycle state of a run.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@lombok.extern.slf4j.Slf4j
public enum RunLifecycleState {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Canceling("CANCELING"),
    Canceled("CANCELED"),
    Failed("FAILED"),
    Succeeded("SUCCEEDED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, RunLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (RunLifecycleState v : RunLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RunLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RunLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RunLifecycleState', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
