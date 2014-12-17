package bootbugs.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController {

    @RequestMapping('/foo')
    String foo() {
        "foo"
    }
}
