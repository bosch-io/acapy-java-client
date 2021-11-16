/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * SchemasInputDescriptorFilter
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class SchemasInputDescriptorFilter {
    public static final String SERIALIZED_NAME_ONEOF_FILTER = "oneof_filter";
    @SerializedName(SERIALIZED_NAME_ONEOF_FILTER)
    private Boolean oneofFilter;
    public static final String SERIALIZED_NAME_URI_GROUPS = "uri_groups";
    @SerializedName(SERIALIZED_NAME_URI_GROUPS)
    private List<List<SchemaInputDescriptor>> uriGroups = null;
}
