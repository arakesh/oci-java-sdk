/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about additionally added block volumes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddBlockStorageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AddBlockStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddBlockStorageDetails build() {
            AddBlockStorageDetails __instance__ =
                    new AddBlockStorageDetails(clusterAdminPassword, blockVolumeSizeInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddBlockStorageDetails o) {
            Builder copiedBuilder =
                    clusterAdminPassword(o.getClusterAdminPassword())
                            .blockVolumeSizeInGBs(o.getBlockVolumeSizeInGBs());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Base-64 encoded password for Cloudera Manager admin user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    String clusterAdminPassword;

    /**
     * The size of block volume in GB that needs to be added to each worker node.
     * All the necessary details needed for attachment are managed by service itself.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    Long blockVolumeSizeInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
