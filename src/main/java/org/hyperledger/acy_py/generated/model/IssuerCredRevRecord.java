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

/**
 * IssuerCredRevRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IssuerCredRevRecord {
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_CRED_EX_ID = "cred_ex_id";
    @SerializedName(SERIALIZED_NAME_CRED_EX_ID)
    private String credExId;
    public static final String SERIALIZED_NAME_CRED_REV_ID = "cred_rev_id";
    @SerializedName(SERIALIZED_NAME_CRED_REV_ID)
    private String credRevId;
    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private String recordId;
    public static final String SERIALIZED_NAME_REV_REG_ID = "rev_reg_id";
    @SerializedName(SERIALIZED_NAME_REV_REG_ID)
    private String revRegId;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
