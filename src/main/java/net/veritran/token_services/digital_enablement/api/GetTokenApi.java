package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.ErrorsResponse;
import net.veritran.token_services.digital_enablement.model.GatewayErrorsResponse;
import net.veritran.token_services.digital_enablement.model.GetTokenRequestSchema;
import net.veritran.token_services.digital_enablement.model.GetTokenResponseSchema;

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
@Component("net.veritran.token_services.digital_enablement.api.GetTokenApi")
public class GetTokenApi {
    private ApiClient apiClient;

    public GetTokenApi() {
        this(new ApiClient());
    }

    @Autowired
    public GetTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Used to get the status and details of a single given Token.
     * This API is used to get the status and details of a single given Token. It may be used to check current Token state or in exception scenarios (such as network time out) to ensure that external systems remain in sync with the Token state as maintained by MDES. Optionally, if requested, the token number can also be provided in the response (in encrypted form).  
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param getTokenRequestSchema Contains the details of the request message.  (optional)
     * @return GetTokenResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTokenResponseSchema getToken(GetTokenRequestSchema getTokenRequestSchema) throws RestClientException {
        return getTokenWithHttpInfo(getTokenRequestSchema).getBody();
    }

    /**
     * Used to get the status and details of a single given Token.
     * This API is used to get the status and details of a single given Token. It may be used to check current Token state or in exception scenarios (such as network time out) to ensure that external systems remain in sync with the Token state as maintained by MDES. Optionally, if requested, the token number can also be provided in the response (in encrypted form).  
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>401</b> - Example gateway error response 
     * <p><b>500</b> - Example application error response 
     * @param getTokenRequestSchema Contains the details of the request message.  (optional)
     * @return ResponseEntity&lt;GetTokenResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTokenResponseSchema> getTokenWithHttpInfo(GetTokenRequestSchema getTokenRequestSchema) throws RestClientException {
        Object postBody = getTokenRequestSchema;

        String path = UriComponentsBuilder.fromPath("/digitization/static/1/0/getToken").build().toUriString();

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

        ParameterizedTypeReference<GetTokenResponseSchema> returnType = new ParameterizedTypeReference<GetTokenResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
