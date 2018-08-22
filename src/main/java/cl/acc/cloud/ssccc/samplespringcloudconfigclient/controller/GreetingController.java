package cl.acc.cloud.ssccc.samplespringcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${app.message.greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok(greeting);
    }
}
