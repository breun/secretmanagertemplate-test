This repository reproduces the issue reported at https://github.com/GoogleCloudPlatform/spring-cloud-gcp/issues/1551

* Run `./mvnw clean verify`
* `com.example.secretmanagertemplate.BeanTests.context_should_contain_PubSubTemplate_bean` succeeds, which is expected.
* `com.example.secretmanagertemplate.BeanTests.context_should_contain_SecretManagerTemplate_bean` fails, which is not expected. According to https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#secret-manager-template a `SecretManagerTemplate` bean should be available in the application context when `com.google.cloud:spring-cloud-gcp-starter-secretmanager` is on the classpath.