# Custom Spring Boot 3.x starter library and example application

## Questions
- [y] should the starter module use `spring-boot-starter-parent` as a parent?
- [?] should the starter module use the Spring Boot BOM in `<dependencyManagement>` for version mgmt?
- [intellij-cache] why does the example app have a weird issue with finding `org.springframework.boot.SpringApplication`, that's directly from a fresh spring boot project out of the initializer
- should there be the `package-info` and `module-info` files in the starter module? what about the example app module?
- are both `spring.factories` and `spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` required under `resources/META-INF`?
  - the docs imply that any event listeners that should automatically be registered should be in `spring.factories`
  - ...but the `spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` file is supposed to be the current way to register auto-configuration classes
