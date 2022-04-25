/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.3
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
 * InputDescriptors
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class InputDescriptors {
    public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
    @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
    private Constraints constraints;
    public static final String SERIALIZED_NAME_GROUP = "group";
    @SerializedName(SERIALIZED_NAME_GROUP)
    private List<String> group = null;
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    public static final String SERIALIZED_NAME_METADATA = "metadata";
    @SerializedName(SERIALIZED_NAME_METADATA)
    private Object metadata;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_PURPOSE = "purpose";
    @SerializedName(SERIALIZED_NAME_PURPOSE)
    private String purpose;
    public static final String SERIALIZED_NAME_SCHEMA = "schema";
    @SerializedName(SERIALIZED_NAME_SCHEMA)
    private SchemasInputDescriptorFilter schema;
}
