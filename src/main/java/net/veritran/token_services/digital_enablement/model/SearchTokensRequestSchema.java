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
import net.veritran.token_services.digital_enablement.model.FundingAccountInfo;

/**
 * SearchTokensRequestSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-20T14:45:14.955-03:00")



public class SearchTokensRequestSchema {
  @JsonProperty("requestId")
  private String requestId = null;

  @JsonProperty("responseHost")
  private String responseHost = null;

  @JsonProperty("fundingAccountInfo")
  private FundingAccountInfo fundingAccountInfo = null;

  @JsonProperty("tokenRequestorId")
  private String tokenRequestorId = null;

  public SearchTokensRequestSchema requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Unique identifier for the request. ")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public SearchTokensRequestSchema responseHost(String responseHost) {
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  @ApiModelProperty(example = "site2.payment-app-provider.com", value = "The host that originated the request. Future calls in the same conversation may be routed to this host. ")
  public String getResponseHost() {
    return responseHost;
  }

  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }

  public SearchTokensRequestSchema fundingAccountInfo(FundingAccountInfo fundingAccountInfo) {
    this.fundingAccountInfo = fundingAccountInfo;
    return this;
  }

   /**
   * Get fundingAccountInfo
   * @return fundingAccountInfo
  **/
  @ApiModelProperty(value = "")
  public FundingAccountInfo getFundingAccountInfo() {
    return fundingAccountInfo;
  }

  public void setFundingAccountInfo(FundingAccountInfo fundingAccountInfo) {
    this.fundingAccountInfo = fundingAccountInfo;
  }

  public SearchTokensRequestSchema tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * Identifies the Token Requestor. Only tokens associated with the token requestor will be returned. Length - 11.  
   * @return tokenRequestorId
  **/
  @ApiModelProperty(example = "98765432101", value = "Identifies the Token Requestor. Only tokens associated with the token requestor will be returned. Length - 11.  ")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTokensRequestSchema searchTokensRequestSchema = (SearchTokensRequestSchema) o;
    return Objects.equals(this.requestId, searchTokensRequestSchema.requestId) &&
        Objects.equals(this.responseHost, searchTokensRequestSchema.responseHost) &&
        Objects.equals(this.fundingAccountInfo, searchTokensRequestSchema.fundingAccountInfo) &&
        Objects.equals(this.tokenRequestorId, searchTokensRequestSchema.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, responseHost, fundingAccountInfo, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTokensRequestSchema {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    fundingAccountInfo: ").append(toIndentedString(fundingAccountInfo)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
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

