package com.axone.xproject;

import com.axone.xproject.config.AsyncSyncConfiguration;
import com.axone.xproject.config.EmbeddedElasticsearch;
import com.axone.xproject.config.EmbeddedSQL;
import com.axone.xproject.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { XprojectAzeSampleApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
public @interface IntegrationTest {
}
