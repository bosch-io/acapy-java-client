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

/**
 * TxnOrPublishRevocationsResult
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class TxnOrPublishRevocationsResult {
    public static final String SERIALIZED_NAME_SENT = "sent";
    @SerializedName(SERIALIZED_NAME_SENT)
    private PublishRevocations sent;
    public static final String SERIALIZED_NAME_TXN = "txn";
    @SerializedName(SERIALIZED_NAME_TXN)
    private TransactionRecord txn;
}
