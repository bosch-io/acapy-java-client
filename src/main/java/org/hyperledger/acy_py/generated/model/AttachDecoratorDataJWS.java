/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre2
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
 * AttachDecoratorDataJWS
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class AttachDecoratorDataJWS {
    public static final String SERIALIZED_NAME_HEADER = "header";
    @SerializedName(SERIALIZED_NAME_HEADER)
    private AttachDecoratorDataJWSHeader header;
    public static final String SERIALIZED_NAME_PROTECTED = "protected";
    @SerializedName(SERIALIZED_NAME_PROTECTED)
    private String _protected;
    public static final String SERIALIZED_NAME_SIGNATURE = "signature";
    @SerializedName(SERIALIZED_NAME_SIGNATURE)
    private String signature;
    public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
    @SerializedName(SERIALIZED_NAME_SIGNATURES)
    private List<AttachDecoratorData1JWS> signatures = null;
}
