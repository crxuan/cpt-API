package com.crx.cptclientsdk;

import com.crx.cptclientsdk.client.CptApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * ClassName: CptApiClientConfig
 * Package: com.example.cptclientsdk
 * Description:
 *
 * @author
 */
@Configuration
@ConfigurationProperties("cptapi.client")
@Data
@ComponentScan
public class CptApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public CptApiClient cptApiClient() {
        return new CptApiClient(accessKey, secretKey);
    }

}
