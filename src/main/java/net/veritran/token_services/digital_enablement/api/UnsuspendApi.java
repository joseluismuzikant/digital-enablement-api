package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.ErrorsResponse;
import net.veritran.token_services.digital_enablement.model.GatewayErrorsResponse;
import net.veritran.token_services.digital_enablement.model.UnSuspendRequestSchema;
import net.veritran.token_services.digital_enablement.model.UnSuspendResponseSchema;

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
@Component("net.veritran.token_services.digital_enablement.api.UnsuspendApi")
public class UnsuspendApi {
    private ApiClient apiClient;

    public UnsuspendApi() {
        this(new ApiClient());
    }

    @Autowired
    public UnsuspendApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Used to unsuspend one or more previously suspended Tokens. The API is limited to 10 Tokens per request.
     * This API is used to unsuspend one or more previously suspended Tokens. The API is limited to 10 Tokens per request. MDES will coordinate the unsuspension of the Tokens and notify any relevant parties that the Tokens have now been unsuspended. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param unsuspendRequestSchema Contains the details of the request message.  (optional)
     * @return UnSuspendResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UnSuspendResponseSchema createUnsuspend(UnSuspendRequestSchema unsuspendRequestSchema) throws RestClientException {
        return createUnsuspendWithHttpInfo(unsuspendRequestSchema).getBody();
    }

    /**
     * Used to unsuspend one or more previously suspended Tokens. The API is limited to 10 Tokens per request.
     * This API is used to unsuspend one or more previously suspended Tokens. The API is limited to 10 Tokens per request. MDES will coordinate the unsuspension of the Tokens and notify any relevant parties that the Tokens have now been unsuspended. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param unsuspendRequestSchema Contains the details of the request message.  (optional)
     * @return ResponseEntity&lt;UnSuspendResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UnSuspendResponseSchema> createUnsuspendWithHttpInfo(UnSuspendRequestSchema unsuspendRequestSchema) throws RestClientException {
        Object postBody = unsuspendRequestSchema;
        
        String path = UriComponentsBuilder.fromPath("/digitization/static/1/0/unsuspend").build().toUriString();

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

        ParameterizedTypeReference<UnSuspendResponseSchema> returnType = new ParameterizedTypeReference<UnSuspendResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
