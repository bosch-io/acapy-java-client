/*
 * aca-py api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.0
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
 * CredentialDefinitionsCreatedResults
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class CredentialDefinitionsCreatedResults {
    public static final String SERIALIZED_NAME_CREDENTIAL_DEFINITION_IDS = "credential_definition_ids";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_DEFINITION_IDS)
    private List<String> credentialDefinitionIds = null;
}
