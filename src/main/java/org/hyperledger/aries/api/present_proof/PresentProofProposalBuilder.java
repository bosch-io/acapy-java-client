/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import com.google.gson.JsonObject;
import lombok.NonNull;
import org.hyperledger.aries.api.credentials.Credential;
import org.hyperledger.aries.api.credentials.CredentialAttributes;
import org.hyperledger.aries.api.present_proof_v2.V20PresProposalByFormat;
import org.hyperledger.aries.api.present_proof_v2.V20PresProposalRequest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Helper class to build a {@link PresentProofProposal}
 *
 */
public class PresentProofProposalBuilder {

    /**
     * Usecase: send a single wallet credential to a connection. Auto present is set to true, as the flow
     * is initiated with a specific credential anyway.
     * @param connectionId the connection id
     * @param cred {@link Credential}
     * @return simple {@link PresentProofProposal} without any predicates set
     */
    public static PresentProofProposal fromCredential(@NonNull String connectionId, @NonNull Credential cred) {
        final List<CredentialAttributes> attrs = cred.getAttrs();
        List<PresentProofProposal.PresentationPreview.PresAttrSpec> presAttr = new ArrayList<>();
        attrs.forEach( attr -> presAttr.add(PresentProofProposal.PresentationPreview.PresAttrSpec
                .builder()
                .name(attr.getName())
                .value(attr.getValue())
                .mimeType(attr.getMimeType())
                .credentialDefinitionId(cred.getCredentialDefinitionId())
                .referent(cred.getReferent())
                .build()));
        return PresentProofProposal
                .builder()
                .autoPresent(Boolean.TRUE)
                .presentationProposal(PresentProofProposal.PresentationPreview.builder().attributes(presAttr).build())
                .connectionId(connectionId)
                .build();
    }

    /**
     * A v2 indy presentation proposal is build upon a proof request
     * @param connectionId the connection id
     * @param cred {@link Credential}
     * @param requestName optional name of the proof request
     * @return {@link V20PresProposalRequest}
     */
    public static V20PresProposalRequest v2IndyFromCredential(
            @NonNull String connectionId, @NonNull Credential cred, String requestName) {

        final List<CredentialAttributes> attrs = cred.getAttrs();
        final List<JsonObject> res = new ArrayList<>();

        attrs.forEach(attr -> res.add(PresentProofRequest.ProofRequest.ProofRestrictions
                .builder()
                        .addAttributeValueRestriction(attr.getName(), attr.getValue())
                        .schemaId(cred.getSchemaId())
                        .credentialDefinitionId(cred.getCredentialDefinitionId())
                .build().toJsonObject()));

        PresentProofRequest.ProofRequest.ProofRequestedAttributes requestedAttributes = PresentProofRequest.ProofRequest.ProofRequestedAttributes
                .builder()
                .names(attrs.stream().map(CredentialAttributes::getName).collect(Collectors.toList()))
                .restrictions(res)
                .build();

        return V20PresProposalRequest
                .builder()
                .autoPresent(Boolean.TRUE)
                .connectionId(connectionId)
                .presentationProposal(V20PresProposalByFormat
                        .builder()
                        .indy(PresentProofRequest.ProofRequest
                                .builder()
                                .name(requestName != null ? requestName : "proof-request")
                                .requestedAttributes(Map.of(UUID.randomUUID().toString(), requestedAttributes))
                                .build())
                        .build())
                .build();
    }
}
