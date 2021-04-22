package org.marion.todolist.configuration;

import org.example.todolist.marion.configuration.WebConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(
        classes = {WebConfig.class},
        loader = AnnotationConfigContextLoader.class
)
public class SpringContextIntegrationTest {
}
