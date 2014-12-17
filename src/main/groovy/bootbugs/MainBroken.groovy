package bootbugs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan('bootbugs.controller')
class MainBroken {
    static void main(String... args) {
        SpringApplication.run(MainBroken, args)
    }
}
