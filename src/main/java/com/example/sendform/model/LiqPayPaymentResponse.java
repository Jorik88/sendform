package com.example.sendform.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiqPayPaymentResponse {

    @JsonProperty("payment_id")
    private String paymentId;

    private String amount;

    private String currency;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("order_id")
    private String orderId;

    private String status;

    @JsonProperty("public_key")
    private String publicKey;

    @JsonProperty("sender_card_mask2")
    private String senderCardMask2;

    @JsonProperty("create_date")
    private String createDate;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("err_code")
    private String errCode;

    @JsonProperty("err_description")
    private String errDescription;
}
