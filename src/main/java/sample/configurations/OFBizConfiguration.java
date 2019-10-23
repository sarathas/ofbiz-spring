package sample.configurations;

import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Use delegator and dispatcher from OFBiz as Spring-managed beans.
 */
@Configuration
public class OFBizConfiguration {

    @Bean
    public Delegator delegator() {
        return DelegatorFactory.getDelegator("default");
    }

    @Bean
    public LocalDispatcher dispatcher() {
        return ServiceContainer.getLocalDispatcher("spring", delegator());
    }
}
