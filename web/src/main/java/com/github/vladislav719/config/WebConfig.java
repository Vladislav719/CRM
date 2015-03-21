package com.github.vladislav719.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by Vlad on 21.03.2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.github.vladislav719.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }



    @Bean
    public ViewResolver resolver() {
        InternalResourceViewResolver url = new InternalResourceViewResolver();
        url.setPrefix("/WEB-INF/views/");
        url.setSuffix(".jsp");
        url.setViewClass(JstlView.class);
        return url;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        registry.addResourceHandler("/views/**").addResourceLocations("/views/");

        /*
        *   swagger UI resources
        * */
//        registry.addResourceHandler("/css/**").addResourceLocations("/api/css/");
//        registry.addResourceHandler("/images/**").addResourceLocations("/api/images/");
//        registry.addResourceHandler("/js/**").addResourceLocations("/api/js/");
//        registry.addResourceHandler("/fonts/**").addResourceLocations("/api/fonts/");
//        registry.addResourceHandler("/lib/**").addResourceLocations("/api/lib/");
//        registry.addResourceHandler("*.html").addResourceLocations("/");
    }

}
