package com.venkat.mohan1;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.venkat.mohan2.MyOwnProperties;

@Configuration
@Import({ MyOwnProperties.class})
@AutoConfigureBefore(WebMvcAutoConfiguration.class)
public class myConfig2 {

}
