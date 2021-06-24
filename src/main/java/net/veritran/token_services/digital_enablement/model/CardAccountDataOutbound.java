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

/**
 * __(CONDITIONAL)__&lt;br&gt; The credit or debit card information for the account that is being tokenized.  Present in tokenize response if supported by the Token Requestor, if using a pushAccountReceipt and if there is a card account associated with the pushAccountReceipt in case that the issuer decision is not DECLINED. &lt;/br&gt; 
 */
@ApiModel(description = "__(CONDITIONAL)__<br> The credit or debit card information for the account that is being tokenized.  Present in tokenize response if supported by the Token Requestor, if using a pushAccountReceipt and if there is a card account associated with the pushAccountReceipt in case that the issuer decision is not DECLINED. </br> ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-20T14:45:14.955-03:00")



public class CardAccountDataOutbound {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("expiryMonth")
  private String expiryMonth = null;

  @JsonProperty("expiryYear")
  private String expiryYear = null;

  public CardAccountDataOutbound accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   *  The account number of the credit or debit card.   __Min Length:9__&lt;br&gt;  __Max Length:19__ 
   * @return accountNumber
  **/
  @ApiModelProperty(example = "5123456789012345", value = " The account number of the credit or debit card.   __Min Length:9__<br>  __Max Length:19__ ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CardAccountDataOutbound expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   *   The expiry month for the account. Two numeric digits must be supplied.   __Format: MM__&lt;br&gt; __Exact Length:2__ 
   * @return expiryMonth
  **/
  @ApiModelProperty(example = "09", value = "  The expiry month for the account. Two numeric digits must be supplied.   __Format: MM__<br> __Exact Length:2__ ")
  public String getExpiryMonth() {
    return expiryMonth;
  }

  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }

  public CardAccountDataOutbound expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * __(Required as minimum for Tokenization)__  The expiry year for the account. __Format: YY__ &lt;br&gt; __Exact Length:2__ 
   * @return expiryYear
  **/
  @ApiModelProperty(example = "21", value = "__(Required as minimum for Tokenization)__  The expiry year for the account. __Format: YY__ <br> __Exact Length:2__ ")
  public String getExpiryYear() {
    return expiryYear;
  }

  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardAccountDataOutbound cardAccountDataOutbound = (CardAccountDataOutbound) o;
    return Objects.equals(this.accountNumber, cardAccountDataOutbound.accountNumber) &&
        Objects.equals(this.expiryMonth, cardAccountDataOutbound.expiryMonth) &&
        Objects.equals(this.expiryYear, cardAccountDataOutbound.expiryYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, expiryMonth, expiryYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAccountDataOutbound {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
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

