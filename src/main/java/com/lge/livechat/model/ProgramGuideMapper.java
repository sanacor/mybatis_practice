package com.lge.livechat.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lge.livechat.model.Customers;

/**
 * @author Eddú Meléndez
 */
@Mapper
public interface ProgramGuideMapper {

    @Select("select * from customers where customer_id = #{customerId}")
    Customers findByCustomerId(@Param("customerId") Integer customerId);

}
