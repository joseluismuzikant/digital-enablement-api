package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.NotifyTokenUpdatedRequestSchema;
import net.veritran.token_services.digital_enablement.model.NotifyTokenUpdatedResponseSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-20T14:45:14.955-03:00")
@Component("net.veritran.token_services.digital_enablement.api.NotifyTokenUpdatedApi")
public class NotifyTokenUpdatedApi {
    private ApiClient apiClient;

    public NotifyTokenUpdatedApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotifyTokenUpdatedApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as ?ws.mastercard.com? This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     * <p><b>200</b> - Contains the details of the response message. 
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @return NotifyTokenUpdatedResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NotifyTokenUpdatedResponseSchema notifyTokenUpdateForTokenStateChange(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema) throws RestClientException {
        return notifyTokenUpdateForTokenStateChangeWithHttpInfo(notifyTokenUpdatedRequestSchema).getBody();
    }

    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as ?ws.mastercard.com? This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     * <p><b>200</b> - Contains the details of the response message. 
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @return ResponseEntity&lt;NotifyTokenUpdatedResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NotifyTokenUpdatedResponseSchema> notifyTokenUpdateForTokenStateChangeWithHttpInfo(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema) throws RestClientException {
        Object postBody = notifyTokenUpdatedRequestSchema;
        
        String path = UriComponentsBuilder.fromPath("/digitization/static/1/0/notifyTokenUpdated").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<NotifyTokenUpdatedResponseSchema> returnType = new ParameterizedTypeReference<NotifyTokenUpdatedResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
