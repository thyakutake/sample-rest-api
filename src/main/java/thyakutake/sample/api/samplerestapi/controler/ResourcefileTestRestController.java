package thyakutake.sample.api.samplerestapi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import thyakutake.sample.api.samplerestapi.model.TaskItem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class ResourcefileTestRestController {
    @Value("${test-value}")
    private String testValue;

    @GetMapping(value="/test")
    String addItem() {

        return testValue;
    }



}

