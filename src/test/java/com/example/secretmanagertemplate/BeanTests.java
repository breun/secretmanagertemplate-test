package com.example.secretmanagertemplate;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.secretmanager.SecretManagerTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BeanTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void context_should_contain_PubSubTemplate_bean() {
		PubSubTemplate pubSubTemplateBean = context.getBean(PubSubTemplate.class);
		assertThat(pubSubTemplateBean).isNotNull();
	}

	@Test
	void context_should_contain_SecretManagerTemplate_bean() {
		SecretManagerTemplate secretManagerTemplateBean = context.getBean(SecretManagerTemplate.class);
		assertThat(secretManagerTemplateBean).isNotNull();
	}
}