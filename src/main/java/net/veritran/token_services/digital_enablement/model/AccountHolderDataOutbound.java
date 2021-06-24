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
import net.veritran.token_services.digital_enablement.model.BillingAddress;
import net.veritran.token_services.digital_enablement.model.PhoneNumber;

/**
 * __(CONDITIONAL)__&lt;br&gt; Present in tokenize response if supported by the Merchant, if using a pushAccountReceipt and if there is account holder data associated with the pushAccountReceipt in case that the issuer decision is APPROVED. Refer to &lt;a href&#x3D;\&quot;https://developer.mastercard.com/devzone/api/portal/download/0000016a-f9a1-d055-ad7a-f9efc8d50000\&quot;&gt;MDES Token Connect Token Requestor Implementation Guide and Specification &lt;/a&gt; for more details. &lt;/br&gt; 
 */
@ApiModel(description = "__(CONDITIONAL)__<br> Present in tokenize response if supported by the Merchant, if using a pushAccountReceipt and if there is account holder data associated with the pushAccountReceipt in case that the issuer decision is APPROVED. Refer to <a href=\"https://developer.mastercard.com/devzone/api/portal/download/0000016a-f9a1-d055-ad7a-f9efc8d50000\">MDES Token Connect Token Requestor Implementation Guide and Specification </a> for more details. </br> ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-20T14:45:14.955-03:00")



public class AccountHolderDataOutbound {
  @JsonProperty("accountHolderName")
  private String accountHolderName = null;

  @JsonProperty("accountHolderAddress")
  private BillingAddress accountHolderAddress = null;

  @JsonProperty("accountHolderEmailAddress")
  private String accountHolderEmailAddress = null;

  @JsonProperty("accountHolderMobilePhoneNumber")
  private PhoneNumber accountHolderMobilePhoneNumber = null;

  public AccountHolderDataOutbound accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * __(OPTIONAL)__ The name of the cardholder&lt;br&gt; __Max Length:27__ 
   * @return accountHolderName
  **/
  @ApiModelProperty(value = "__(OPTIONAL)__ The name of the cardholder<br> __Max Length:27__ ")
  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public AccountHolderDataOutbound accountHolderAddress(BillingAddress accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
    return this;
  }

   /**
   * Get accountHolderAddress
   * @return accountHolderAddress
  **/
  @ApiModelProperty(value = "")
  public BillingAddress getAccountHolderAddress() {
    return accountHolderAddress;
  }

  public void setAccountHolderAddress(BillingAddress accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
  }

  public AccountHolderDataOutbound accountHolderEmailAddress(String accountHolderEmailAddress) {
    this.accountHolderEmailAddress = accountHolderEmailAddress;
    return this;
  }

   /**
   * __(OPTIONAL)__ The e-mail address of the Account Holder&lt;br&gt; __Max Length:320__ 
   * @return accountHolderEmailAddress
  **/
  @ApiModelProperty(value = "__(OPTIONAL)__ The e-mail address of the Account Holder<br> __Max Length:320__ ")
  public String getAccountHolderEmailAddress() {
    return accountHolderEmailAddress;
  }

  public void setAccountHolderEmailAddress(String accountHolderEmailAddress) {
    this.accountHolderEmailAddress = accountHolderEmailAddress;
  }

  public AccountHolderDataOutbound accountHolderMobilePhoneNumber(PhoneNumber accountHolderMobilePhoneNumber) {
    this.accountHolderMobilePhoneNumber = accountHolderMobilePhoneNumber;
    return this;
  }

   /**
   * __(OPTIONAL)__ The mobile phone number of the account holder. 
   * @return accountHolderMobilePhoneNumber
  **/
  @ApiModelProperty(value = "__(OPTIONAL)__ The mobile phone number of the account holder. ")
  public PhoneNumber getAccountHolderMobilePhoneNumber() {
    return accountHolderMobilePhoneNumber;
  }

  public void setAccountHolderMobilePhoneNumber(PhoneNumber accountHolderMobilePhoneNumber) {
    this.accountHolderMobilePhoneNumber = accountHolderMobilePhoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderDataOutbound accountHolderDataOutbound = (AccountHolderDataOutbound) o;
    return Objects.equals(this.accountHolderName, accountHolderDataOutbound.accountHolderName) &&
        Objects.equals(this.accountHolderAddress, accountHolderDataOutbound.accountHolderAddress) &&
        Objects.equals(this.accountHolderEmailAddress, accountHolderDataOutbound.accountHolderEmailAddress) &&
        Objects.equals(this.accountHolderMobilePhoneNumber, accountHolderDataOutbound.accountHolderMobilePhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderName, accountHolderAddress, accountHolderEmailAddress, accountHolderMobilePhoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderDataOutbound {\n");
    
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountHolderAddress: ").append(toIndentedString(accountHolderAddress)).append("\n");
    sb.append("    accountHolderEmailAddress: ").append(toIndentedString(accountHolderEmailAddress)).append("\n");
    sb.append("    accountHolderMobilePhoneNumber: ").append(toIndentedString(accountHolderMobilePhoneNumber)).append("\n");
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

