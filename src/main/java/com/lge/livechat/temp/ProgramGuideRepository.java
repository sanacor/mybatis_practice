package com.lge.livechat.temp;

import com.lge.livechat.model.Customers;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramGuideRepository {
    Customers findByProgramId(String schd_tid);

}
