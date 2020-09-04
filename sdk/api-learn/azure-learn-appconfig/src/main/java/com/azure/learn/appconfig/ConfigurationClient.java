package com.azure.learn.appconfig;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.learn.appconfig.models.ConfigurationSetting;

@ServiceClient(builder = ConfigurationClientBuilder.class)
public final class ConfigurationClient {

    ConfigurationClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationSetting getConfigurationSetting(String key) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationSetting getConfigurationSetting(String key, String label) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationSetting getConfigurationSetting(ConfigurationSetting setting, boolean ifChanged) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
