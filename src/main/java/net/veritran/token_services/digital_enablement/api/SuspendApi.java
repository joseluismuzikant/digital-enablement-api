package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.ErrorsResponse;
import net.veritran.token_services.digital_enablement.model.GatewayErrorsResponse;
import net.veritran.token_services.digital_enablement.model.SuspendRequestSchema;
import net.veritran.token_services.digital_enablement.model.SuspendResponseSchema;

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
@Component("net.veritran.token_services.digital_enablement.api.SuspendApi")
public class SuspendApi {
    private ApiClient apiClient;

    public SuspendApi() {
        this(new ApiClient());
    }

    @Autowired
    public SuspendApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Used to temporarily suspend one or more Tokens.
     * This API is used to temporarily suspend one or more Tokens (for example, suspending all Tokens on a device in response to the device being lost).  The API is limited to 10 Tokens per request. MDES will coordinate the suspension of the Tokens and notify any relevant parties that the Tokens have been suspended. A suspended Token can be unsuspended using the Unsuspend resource. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param suspendRequestSchema Contains the details of the request message.  (optional)
     * @return SuspendResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuspendResponseSchema createSuspend(SuspendRequestSchema suspendRequestSchema) throws RestClientException {
        return createSuspendWithHttpInfo(suspendRequestSchema).getBody();
    }

    /**
     * Used to temporarily suspend one or more Tokens.
     * This API is used to temporarily suspend one or more Tokens (for example, suspending all Tokens on a device in response to the device being lost).  The API is limited to 10 Tokens per request. MDES will coordinate the suspension of the Tokens and notify any relevant parties that the Tokens have been suspended. A suspended Token can be unsuspended using the Unsuspend resource. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param suspendRequestSchema Contains the details of the request message.  (optional)
     * @return ResponseEntity&lt;SuspendResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuspendResponseSchema> createSuspendWithHttpInfo(SuspendRequestSchema suspendRequestSchema) throws RestClientException {
        Object postBody = suspendRequestSchema;
        
        String path = UriComponentsBuilder.fromPath("/digitization/static/1/0/suspend").build().toUriString();

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

        ParameterizedTypeReference<SuspendResponseSchema> returnType = new ParameterizedTypeReference<SuspendResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
