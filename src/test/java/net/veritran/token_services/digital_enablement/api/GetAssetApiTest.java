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

import net.veritran.token_services.digital_enablement.model.AssetResponseSchema;
import org.junit.Assert;
import org.junit.Test;

/**
 * API tests for GetAssetApi
 */
public class GetAssetApiTest extends DigitalEnablementTest {

    private final GetAssetApi api = new GetAssetApi(super.getApi());

    /**
     * Used to retrieve static Assets from the MDES repository.
     * <p>
     * This API is used to retrieve static Assets from MDES?s repository, such as - Card art, MasterCard brand logos, Issuers? logos, and Terms and Conditions. Every Asset in the repository is referenced using an Asset ID. Once an Asset has been assigned to an Asset ID, the contents of the Asset will not change. If contents do need to change (for example, Issuer has supplied new artwork for a product), they will be updated in the repository and be assigned a new Asset ID.  Different types of Assets are supported in the repository, such as images and text files; and for each type of Asset, multiple formats may be supported. For example, a single image Asset may be supported in various file formats; or variant sizes, allowing the Token Requestor to select the most appropriate format to use for a particular target device.
     */
    @Test
    public void getAssetTest() {
        String assetId = "3789637f-32a1-4810-a138-4bf34501c509";
        AssetResponseSchema response = api.getAsset(assetId);
        Assert.assertEquals(response.getMediaContents().size(), 1);
    }

}
