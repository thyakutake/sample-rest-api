package thyakutake.sample.api.samplerestapi.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloRestController {
    @RequestMapping(value = "/resthello")
    String hello() {
        return """
                Hello
                It works!
                現在時刻は %s です
                """.formatted(LocalDateTime.now());
    }

}

