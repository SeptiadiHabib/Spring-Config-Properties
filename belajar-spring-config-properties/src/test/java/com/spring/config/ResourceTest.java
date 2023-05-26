package com.spring.config;

import com.spring.config.resourceloader.ResourceLoaderTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ResourceTest {

    @Test
    void testResource() throws IOException {
        var resource = new ClassPathResource("/text/sample.txt");

        Assertions.assertNotNull(resource);
        Assertions.assertTrue(resource.exists());
        Assertions.assertNotNull(resource.getFile());
    }
}
