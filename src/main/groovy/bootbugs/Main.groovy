package bootbugs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration(exclude = GroovyTemplateAutoConfiguration)
@ComponentScan('bootbugs.controller')
class Main {
  static void main(String... args) {
    SpringApplication.run(Main, args)
  }
}
