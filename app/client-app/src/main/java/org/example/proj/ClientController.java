package org.example.proj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rival
 * @since 2025-01-20
 */

@RestController
@RequestMapping("/api")
public class ClientController {

    @GetMapping("")
    public String test(){
        return "Hello World!";
    }
}
