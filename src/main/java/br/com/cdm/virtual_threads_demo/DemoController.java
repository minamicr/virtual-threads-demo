package br.com.cdm.virtual_threads_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String get() throws InterruptedException {
        // Sleep para simular um processamento na thread (IOBlocking)
        // Poderia ser um acesso a banco de dados, acesso a arquivo
        Thread.sleep(3000);
        return "Hello World";
    }
}
