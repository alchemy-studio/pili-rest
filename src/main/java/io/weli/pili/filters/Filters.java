package io.weli.pili.filters;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

// https://stackoverflow.com/questions/19825946/how-to-add-a-filter-class-in-spring-boot/30658752#30658752
// https://stackoverflow.com/questions/5928046/spring-mvc-utf-8-encoding
@Configuration
public class Filters {
    @Bean
    public FilterRegistrationBean utf8Encoding() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CharacterEncodingFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("encoding", "UTF-8");
        registration.setName("encodingFilter");
        registration.setOrder(1);
        return registration;
    }
}
