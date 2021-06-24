/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java)
 *
 * OpenAPI spec version: 1.3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.veritran.token_services.digital_enablement.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;
import net.veritran.token_services.digital_enablement.model.TokenizeRequestSchema;
import net.veritran.token_services.digital_enablement.model.TokenizeResponseSchema;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

/**
 * API tests for TokenizeApi
 */

public class TokenizeApiTest extends DigitalEnablementTest{

    private final TokenizeApi api = new TokenizeApi(super.getApi());


    /**
     * Used to digitize a card to create a server-based Token.
     * <p>
     * Used to digitize a card to create a server-based Token. MDES will perform both card availability and eligibility checks to check that this specific card is eligible for digitization. As both availability and eligibility are combined, only a Tokenization Authorization message is sent to the issuer as part of this request to authorize the digitization. No Tokenization Eligibility message is sent. The digitization decision will be one of Approved or Declined.
     */
    @Test
    public void createTokenizeTest() {
        try {
            TokenizeRequestSchema tokenizeRequestSchema = new ObjectMapper().readValue(new File("src/test/resources/json/Tokenize.json"), TokenizeRequestSchema.class);
            TokenizeResponseSchema response = api.createTokenize(tokenizeRequestSchema);
            Assert.assertEquals(response.getDecision(), "APPROVED");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
