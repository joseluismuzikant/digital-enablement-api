# Based on https://www.baeldung.com/spring-boot-rest-client-swagger-codegen

1. We use https://search.maven.org/classic/remotecontent?filepath=io/swagger/swagger-codegen-cli/2.4.15/swagger-codegen-cli-2.4.15.jar
    for generate this code and...
    
2. This yaml https://developer.mastercard.com/devzone/api/secure/servicespec/DigitalEnablementAPI/1.3.0
    also in src/main/resources/digital_enablement_API-1.3.0.yaml
    
3. Sample of how to generate these stub classes:

```shell
    java -jar swagger-codegen-cli-2.4.15.jar generate -i digital_enablement_API-1.3.0.yaml 
     --api-package net.veritran.token-services.digital-enablement.api  
     --model-package net.veritran.token-services.digital-enablement.model 
     --invoker-package net.veritran.token-services.digital-enablement.client.invoker 
     --group-id net.veritran.token-services 
     --artifact-id digital-enablement 
     --artifact-version 0.0.1-SNAPSHOT  -l java 
     --library resttemplate  -o spring-swagger-codegen-api-client
```
4. Also this stubs was modified following this project:

    https://developer.mastercard.com/platform/documentation/security-and-authentication/using-oauth-1a-to-access-mastercard-apis/

For sending OAuth1.0 appropriated headers to the MDES sandbox environment

# digital-enablements

MDES for Merchants
- API version: 1.3.0
  - Build date: 2020-08-20T14:45:14.955-03:00

The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>net.veritran.token-services</groupId>
  <artifactId>digital-enablement-api-proxy</artifactId>
  <version>1.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "net.veritran.token-services:digital-enablement-api-proxy:0.0.2-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/digital-enablement-0.0.2-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import net.veritran.token_services.digital_enablement.client.invoker.*;
import net.veritran.token_services.digital_enablement.client.invoker.auth.*;
import net.veritran.token_services.digital_enablement.model.*;
import net.veritran.token_services.digital_enablement.api.DeleteApi;

import java.io.File;
import java.util.*;

public class DeleteApiExample {

    public static void main(String[] args) {
        
        DeleteApi apiInstance = new DeleteApi();
        DeleteRequestSchema deleteRequestSchema = new DeleteRequestSchema(); // DeleteRequestSchema | Contains the details of the request message. 
        try {
            DeleteResponseSchema result = apiInstance.deleteDigitization(deleteRequestSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeleteApi#deleteDigitization");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.api.mastercard.com/mdes*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeleteApi* | [**deleteDigitization**](docs/DeleteApi.md#deleteDigitization) | **POST** /digitization/#env/1/0/delete | Used to delete one or more Tokens. The API is limited to 10 Tokens per request.
*GetAssetApi* | [**getAsset**](docs/GetAssetApi.md#getAsset) | **GET** /assets/#env/1/0/asset/{AssetId} | Used to retrieve static Assets from the MDES repository.
*GetTaskStatusApi* | [**getTaskStatus**](docs/GetTaskStatusApi.md#getTaskStatus) | **POST** /digitization/#env/1/0/getTaskStatus | Used to check the status of any asynchronous task that was previously requested.
*GetTokenApi* | [**getToken**](docs/GetTokenApi.md#getToken) | **POST** /digitization/#env/1/0/getToken | Used to get the status and details of a single given Token.
*NotifyTokenUpdatedApi* | [**notifyTokenUpdateForTokenStateChange**](docs/NotifyTokenUpdatedApi.md#notifyTokenUpdateForTokenStateChange) | **POST** /digitization/#env/1/0/notifyTokenUpdated | Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
*SearchTokensApi* | [**searchTokens**](docs/SearchTokensApi.md#searchTokens) | **POST** /digitization/#env/1/0/searchTokens | Used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN.
*SuspendApi* | [**createSuspend**](docs/SuspendApi.md#createSuspend) | **POST** /digitization/#env/1/0/suspend | Used to temporarily suspend one or more Tokens.
*TokenizeApi* | [**createTokenize**](docs/TokenizeApi.md#createTokenize) | **POST** /digitization/#env/1/0/tokenize | Used to digitize a card to create a server-based Token.
*TransactApi* | [**createTransact**](docs/TransactApi.md#createTransact) | **POST** /remotetransaction/#env/1/0/transact | Used by the Token Requestor to create a Digital Secure Remote Payment (\&quot;DSRP\&quot;) transaction cryptogram using the credentials stored within MDES in order to perform a DSRP transaction.
*UnsuspendApi* | [**createUnsuspend**](docs/UnsuspendApi.md#createUnsuspend) | **POST** /digitization/#env/1/0/unsuspend | Used to unsuspend one or more previously suspended Tokens. The API is limited to 10 Tokens per request.


## Documentation for Models

 - [AccountHolderData](docs/AccountHolderData.md)
 - [AccountHolderDataOutbound](docs/AccountHolderDataOutbound.md)
 - [AssetResponseSchema](docs/AssetResponseSchema.md)
 - [AuthenticationMethods](docs/AuthenticationMethods.md)
 - [BillingAddress](docs/BillingAddress.md)
 - [CardAccountDataInbound](docs/CardAccountDataInbound.md)
 - [CardAccountDataOutbound](docs/CardAccountDataOutbound.md)
 - [DecisioningData](docs/DecisioningData.md)
 - [DeleteRequestSchema](docs/DeleteRequestSchema.md)
 - [DeleteResponseSchema](docs/DeleteResponseSchema.md)
 - [EncryptedPayload](docs/EncryptedPayload.md)
 - [EncryptedPayloadTransact](docs/EncryptedPayloadTransact.md)
 - [Error](docs/Error.md)
 - [ErrorsResponse](docs/ErrorsResponse.md)
 - [FundingAccountData](docs/FundingAccountData.md)
 - [FundingAccountInfo](docs/FundingAccountInfo.md)
 - [FundingAccountInfoEncryptedPayload](docs/FundingAccountInfoEncryptedPayload.md)
 - [GatewayError](docs/GatewayError.md)
 - [GatewayErrorsResponse](docs/GatewayErrorsResponse.md)
 - [GatewayErrorsSchema](docs/GatewayErrorsSchema.md)
 - [GetTaskStatusRequestSchema](docs/GetTaskStatusRequestSchema.md)
 - [GetTaskStatusResponseSchema](docs/GetTaskStatusResponseSchema.md)
 - [GetTokenRequestSchema](docs/GetTokenRequestSchema.md)
 - [GetTokenResponseSchema](docs/GetTokenResponseSchema.md)
 - [MediaContent](docs/MediaContent.md)
 - [NotifyTokenEncryptedPayload](docs/NotifyTokenEncryptedPayload.md)
 - [NotifyTokenUpdatedRequestSchema](docs/NotifyTokenUpdatedRequestSchema.md)
 - [NotifyTokenUpdatedResponseSchema](docs/NotifyTokenUpdatedResponseSchema.md)
 - [PhoneNumber](docs/PhoneNumber.md)
 - [ProductConfig](docs/ProductConfig.md)
 - [SearchTokensRequestSchema](docs/SearchTokensRequestSchema.md)
 - [SearchTokensResponseSchema](docs/SearchTokensResponseSchema.md)
 - [SuspendRequestSchema](docs/SuspendRequestSchema.md)
 - [SuspendResponseSchema](docs/SuspendResponseSchema.md)
 - [Token](docs/Token.md)
 - [TokenDetail](docs/TokenDetail.md)
 - [TokenDetailData](docs/TokenDetailData.md)
 - [TokenDetailDataGetTokenOnly](docs/TokenDetailDataGetTokenOnly.md)
 - [TokenDetailDataPAROnly](docs/TokenDetailDataPAROnly.md)
 - [TokenDetailGetTokenOnly](docs/TokenDetailGetTokenOnly.md)
 - [TokenDetailPAROnly](docs/TokenDetailPAROnly.md)
 - [TokenForLCM](docs/TokenForLCM.md)
 - [TokenForNTU](docs/TokenForNTU.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [TokenizeRequestSchema](docs/TokenizeRequestSchema.md)
 - [TokenizeResponseSchema](docs/TokenizeResponseSchema.md)
 - [TransactEncryptedData](docs/TransactEncryptedData.md)
 - [TransactError](docs/TransactError.md)
 - [TransactRequestSchema](docs/TransactRequestSchema.md)
 - [TransactResponseSchema](docs/TransactResponseSchema.md)
 - [UnSuspendRequestSchema](docs/UnSuspendRequestSchema.md)
 - [UnSuspendResponseSchema](docs/UnSuspendResponseSchema.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



