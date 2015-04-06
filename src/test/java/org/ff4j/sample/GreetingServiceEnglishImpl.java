package org.ff4j.sample;

import org.springframework.stereotype.Component;

@Component("greeting.english")
public class GreetingServiceEnglishImpl implements GreetingService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}
