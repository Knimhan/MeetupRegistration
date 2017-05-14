package com.k15t.pat;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig
{
    @Bean
    Mapper mapper()
    {
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozer/user-mappings.xml");
        return new DozerBeanMapper(mappingFiles);
    }

}
