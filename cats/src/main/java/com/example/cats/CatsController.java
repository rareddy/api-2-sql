package com.example.cats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatsController {

    @RequestMapping(value = "/cats", method = RequestMethod.GET, produces="application/json")
    public List<Cat> custom() {
        List<Cat> i = new ArrayList<Cat>();

        i.add(new Cat("Aldo", "Persian Cat", Arrays.asList("silly", "cuddley"),
                new Owner("Joe", "123 Elm St, Chicago, IL"),
                Arrays.asList(new Traits("Skittishness"), new Traits("Outgoingness"))));

        i.add(new Cat("Ginger", "Rag Doll", Arrays.asList("curious", "playful"),
                new Owner("David", "123 Market St, Newyork, NY"),
                Arrays.asList(new Traits("Dominance"), new Traits("Spontaneity"))));
        return i;
    }
}