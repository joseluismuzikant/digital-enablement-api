package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

import net.veritran.token_services.digital_enablement.model.AssetResponseSchema;
import net.veritran.token_services.digital_enablement.model.ErrorsResponse;

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
@Component("net.veritran.token_services.digital_enablement.api.GetAssetApi")
public class GetAssetApi {
    private ApiClient apiClient;

    public GetAssetApi() {
        this(new ApiClient());
    }

    @Autowired
    public GetAssetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Used to retrieve static Assets from the MDES repository.
     * This API is used to retrieve static Assets from MDES?s repository, such as - Card art, MasterCard brand logos, Issuers? logos, and Terms and Conditions. Every Asset in the repository is referenced using an Asset ID. Once an Asset has been assigned to an Asset ID, the contents of the Asset will not change. If contents do need to change (for example, Issuer has supplied new artwork for a product), they will be updated in the repository and be assigned a new Asset ID.  Different types of Assets are supported in the repository, such as images and text files; and for each type of Asset, multiple formats may be supported. For example, a single image Asset may be supported in various file formats; or variant sizes, allowing the Token Requestor to select the most appropriate format to use for a particular target device. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>0</b> - unexpected error 
     * @param assetId An Asset ID corresponds to an individual Digital Asset. Digital Assets are returned as part of the Product Configuration from the Tokenize Response. The Asset ID itself is supplied as a Get request in the form of https://{INSERT ENVIRONMENT URL HERE}/mdes/assets/static/1/0/asset/{AssetID} - See JSON examples for details.   (required)
     * @return AssetResponseSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssetResponseSchema getAsset(String assetId) throws RestClientException {
        return getAssetWithHttpInfo(assetId).getBody();
    }

    /**
     * Used to retrieve static Assets from the MDES repository.
     * This API is used to retrieve static Assets from MDES?s repository, such as - Card art, MasterCard brand logos, Issuers? logos, and Terms and Conditions. Every Asset in the repository is referenced using an Asset ID. Once an Asset has been assigned to an Asset ID, the contents of the Asset will not change. If contents do need to change (for example, Issuer has supplied new artwork for a product), they will be updated in the repository and be assigned a new Asset ID.  Different types of Assets are supported in the repository, such as images and text files; and for each type of Asset, multiple formats may be supported. For example, a single image Asset may be supported in various file formats; or variant sizes, allowing the Token Requestor to select the most appropriate format to use for a particular target device. 
     * <p><b>200</b> - Contains the details of the response message. 
     * <p><b>0</b> - unexpected error 
     * @param assetId An Asset ID corresponds to an individual Digital Asset. Digital Assets are returned as part of the Product Configuration from the Tokenize Response. The Asset ID itself is supplied as a Get request in the form of https://{INSERT ENVIRONMENT URL HERE}/mdes/assets/static/1/0/asset/{AssetID} - See JSON examples for details.   (required)
     * @return ResponseEntity&lt;AssetResponseSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssetResponseSchema> getAssetWithHttpInfo(String assetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetId' when calling getAsset");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("AssetId", assetId);
        String path = UriComponentsBuilder.fromPath("/assets/static/1/0/asset/{AssetId}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<AssetResponseSchema> returnType = new ParameterizedTypeReference<AssetResponseSchema>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
