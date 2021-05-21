package com.lge.livechat.programGuide;

import com.lge.livechat.model.Customers;
import com.lge.livechat.model.ProgramGuideMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramGuideService {

    @Autowired
    private ProgramGuideMapper programGuideMapper;

    public Customers findByCustomerId(Integer customerId) {
        Customers customers = programGuideMapper.findByCustomerId(customerId);
        return customers;
    }


}
