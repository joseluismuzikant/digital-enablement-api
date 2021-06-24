package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.ErrorsResponse;
import net.veritran.token_services.digital_enablement.model.GatewayErrorsResponse;
import net.veritran.token_services.digital_enablement.model.TokenizeRequestSchema;
import net.veritran.token_services.digital_enablement.model.TokenizeResponseSchema;

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
@Component("net.veritran.token_services.digital_enablement.api.TokenizeApi")
public class TokenizeApi {
    private ApiClient apiClient;

    public TokenizeApi() {
        this(new ApiClient());
    }

    @Autowired
    public TokenizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Used to digitize a card to create a server-based Token.
     * Used to digitize a card to create a server-based Token. MDES will perform both card availability and eligibility checks to check that this specific card is eligible for digitization. As both availability and eligibility are combined, only a Tokenization Authorization message is sent to the issuer as part of this request to authorize the digitization. No Tokenization Eligibility message is sent. The digitization decision will be one of Approved or Declined. 
     * <p><b>200</b> - Contains the details of the token response message when a push account receipt is supplied in the tokenize request. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param tokenizeRequestSchema A Tokenize request is used to digitize a PAN.   (optional)
     * @return TokenizeResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TokenizeResponseSchema createTokenize(TokenizeRequestSchema tokenizeRequestSchema) throws RestClientException {
        return createTokenizeWithHttpInfo(tokenizeRequestSchema).getBody();
    }

    /**
     * Used to digitize a card to create a server-based Token.
     * Used to digitize a card to create a server-based Token. MDES will perform both card availability and eligibility checks to check that this specific card is eligible for digitization. As both availability and eligibility are combined, only a Tokenization Authorization message is sent to the issuer as part of this request to authorize the digitization. No Tokenization Eligibility message is sent. The digitization decision will be one of Approved or Declined. 
     * <p><b>200</b> - Contains the details of the token response message when a push account receipt is supplied in the tokenize request. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param tokenizeRequestSchema A Tokenize request is used to digitize a PAN.   (optional)
     * @return ResponseEntity&lt;TokenizeResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TokenizeResponseSchema> createTokenizeWithHttpInfo(TokenizeRequestSchema tokenizeRequestSchema) throws RestClientException {
        Object postBody = tokenizeRequestSchema;
        
        String path = UriComponentsBuilder.fromPath("/digitization/static/1/0/tokenize").build().toUriString();

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

        ParameterizedTypeReference<TokenizeResponseSchema> returnType = new ParameterizedTypeReference<TokenizeResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
