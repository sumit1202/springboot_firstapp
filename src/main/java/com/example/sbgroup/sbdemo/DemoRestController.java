package com.example.sbgroup.sbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach1;
    private Coach myCoach2;

    @Autowired
    DemoRestController(@Qualifier("cricketCoach") Coach fCoach, @Qualifier("cricketCoach") Coach cCoach) {
        myCoach1 = fCoach;
        myCoach2 = cCoach;
    }

    @GetMapping("/check")
    public String FunCheck() {
        return "Comparing 2 beans, if (myCoach1 == myCoach2) and ans is "+ (myCoach1==myCoach2)+".";
    }

}
