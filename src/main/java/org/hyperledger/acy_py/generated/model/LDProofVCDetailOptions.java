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

/**
 * LDProofVCDetailOptions
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class LDProofVCDetailOptions {
    public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
    @SerializedName(SERIALIZED_NAME_CHALLENGE)
    private String challenge;
    public static final String SERIALIZED_NAME_CREATED = "created";
    @SerializedName(SERIALIZED_NAME_CREATED)
    private String created;
    public static final String SERIALIZED_NAME_CREDENTIAL_STATUS = "credentialStatus";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_STATUS)
    private CredentialStatusOptions credentialStatus;
    public static final String SERIALIZED_NAME_DOMAIN = "domain";
    @SerializedName(SERIALIZED_NAME_DOMAIN)
    private String domain;
    public static final String SERIALIZED_NAME_PROOF_PURPOSE = "proofPurpose";
    @SerializedName(SERIALIZED_NAME_PROOF_PURPOSE)
    private String proofPurpose;
    public static final String SERIALIZED_NAME_PROOF_TYPE = "proofType";
    @SerializedName(SERIALIZED_NAME_PROOF_TYPE)
    private String proofType;
}
