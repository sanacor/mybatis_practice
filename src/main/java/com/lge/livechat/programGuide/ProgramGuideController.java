package com.lge.livechat.programGuide;

import com.lge.livechat.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramGuideController {

    @Autowired
    private ProgramGuideService programGuideService;

    @GetMapping("/customer")
    public Customers findByCustomerId() {
        System.out.println("GET /program_guide");
        Customers customers = programGuideService.findByCustomerId(1);
        return customers;
    }

}
