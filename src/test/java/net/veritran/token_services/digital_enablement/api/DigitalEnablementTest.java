package net.veritran.token_services.digital_enablement.api;

import net.veritran.token_services.digital_enablement.client.invoker.ApiClient;

public abstract class DigitalEnablementTest {
    protected ApiClient getApi() {
        return new ApiClient("src/test/resources/application.properties");
    }
}
