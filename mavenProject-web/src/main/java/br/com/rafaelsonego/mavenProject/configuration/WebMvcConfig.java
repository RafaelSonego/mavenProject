package br.com.rafaelsonego.mavenProject.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
  private static final int BROWSER_CACHE_CONTROL = 604800;

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
     .addResourceHandler("/resources/**")
     .addResourceLocations("/resources/")
     .setCachePeriod(BROWSER_CACHE_CONTROL);
  }
  
}