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


package net.veritran.token_services.digital_enablement.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TokenForLCM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-20T14:45:14.955-03:00")



public class TokenForLCM {
  @JsonProperty("tokenUniqueReference")
  private String tokenUniqueReference = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("suspendedBy")
  private List<String> suspendedBy = null;

  @JsonProperty("statusTimestamp")
  private String statusTimestamp = null;

  public TokenForLCM tokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * The unique reference allocated to the Token which is always present even if an error occurs. &lt;br&gt;      __Max Length:64__ 
   * @return tokenUniqueReference
  **/
  @ApiModelProperty(example = "DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45", value = "The unique reference allocated to the Token which is always present even if an error occurs. <br>      __Max Length:64__ ")
  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }

  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }

  public TokenForLCM status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of Token. Must be either:    * &#39;INACTIVE&#39; (Token has not yet been activated)  * &#39;ACTIVE&#39; (Token is active and ready to transact)  * &#39;SUSPENDED&#39; (Token is suspended and unable to transact)  * &#39;DEACTIVATED&#39; (Token has been permanently deactivated).&lt;br&gt;      __Max Length:32__ 
   * @return status
  **/
  @ApiModelProperty(example = "SUSPENDED", value = "The current status of Token. Must be either:    * 'INACTIVE' (Token has not yet been activated)  * 'ACTIVE' (Token is active and ready to transact)  * 'SUSPENDED' (Token is suspended and unable to transact)  * 'DEACTIVATED' (Token has been permanently deactivated).<br>      __Max Length:32__ ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TokenForLCM suspendedBy(List<String> suspendedBy) {
    this.suspendedBy = suspendedBy;
    return this;
  }

  public TokenForLCM addSuspendedByItem(String suspendedByItem) {
    if (this.suspendedBy == null) {
      this.suspendedBy = new ArrayList<String>();
    }
    this.suspendedBy.add(suspendedByItem);
    return this;
  }

   /**
   * (CONDITIONAL only supplied if status is SUSPENDED) Who or what caused the Token to be suspended One or more values of:     * ISSUER - Suspended by the Issuer.    * TOKEN_REQUESTOR - Suspended by the Token Requestor     * MOBILE_PIN_LOCKED - Suspended due to the Mobile PIN being locked    * CARDHOLDER - Suspended by the Cardholder &lt;br&gt;          __Max Length__: N/A     
   * @return suspendedBy
  **/
  @ApiModelProperty(value = "(CONDITIONAL only supplied if status is SUSPENDED) Who or what caused the Token to be suspended One or more values of:     * ISSUER - Suspended by the Issuer.    * TOKEN_REQUESTOR - Suspended by the Token Requestor     * MOBILE_PIN_LOCKED - Suspended due to the Mobile PIN being locked    * CARDHOLDER - Suspended by the Cardholder <br>          __Max Length__: N/A     ")
  public List<String> getSuspendedBy() {
    return suspendedBy;
  }

  public void setSuspendedBy(List<String> suspendedBy) {
    this.suspendedBy = suspendedBy;
  }

  public TokenForLCM statusTimestamp(String statusTimestamp) {
    this.statusTimestamp = statusTimestamp;
    return this;
  }

   /**
   * The date and time the token status was last updated. Expressed in ISO 8601 extended format as one of the following:     * YYYY-MM-DDThh:mm:ss[.sss]Z    * YYYY-MM-DDThh:mm:ss[.sss]�hh:mm    * Where [.sss] is optional and can be 1 to 3 digits. &lt;br&gt;  __Max Length:29__  
   * @return statusTimestamp
  **/
  @ApiModelProperty(value = "The date and time the token status was last updated. Expressed in ISO 8601 extended format as one of the following:     * YYYY-MM-DDThh:mm:ss[.sss]Z    * YYYY-MM-DDThh:mm:ss[.sss]�hh:mm    * Where [.sss] is optional and can be 1 to 3 digits. <br>  __Max Length:29__  ")
  public String getStatusTimestamp() {
    return statusTimestamp;
  }

  public void setStatusTimestamp(String statusTimestamp) {
    this.statusTimestamp = statusTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenForLCM tokenForLCM = (TokenForLCM) o;
    return Objects.equals(this.tokenUniqueReference, tokenForLCM.tokenUniqueReference) &&
        Objects.equals(this.status, tokenForLCM.status) &&
        Objects.equals(this.suspendedBy, tokenForLCM.suspendedBy) &&
        Objects.equals(this.statusTimestamp, tokenForLCM.statusTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenUniqueReference, status, suspendedBy, statusTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenForLCM {\n");
    
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suspendedBy: ").append(toIndentedString(suspendedBy)).append("\n");
    sb.append("    statusTimestamp: ").append(toIndentedString(statusTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

