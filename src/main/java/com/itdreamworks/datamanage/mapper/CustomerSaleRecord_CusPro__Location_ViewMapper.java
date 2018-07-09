package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.CustomerSaleRecord_CusPro__Location_View;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CustomerSaleRecord_CusPro__Location_ViewMapper {
    @Select("select  d.*,t.ProductCode,n.deviceNo,n.lat,n.lng from Customer_Sale_Record d LEFT JOIN CustomerProduct t\n" +
            "on t.Id =d.CustomerProductId LEFT JOIN Location n on n.deviceNo = t.DeviceNo\n" +
            "where d.CustomerId=#{customerId} limit #{from},#{pageSize}")
    @ResultType(CustomerSaleRecord_CusPro__Location_View.class)
    List<CustomerSaleRecord_CusPro__Location_View> findAll(@Param("customerId") String customerId, @Param("from") Integer pageNum, @Param("pageSize") Integer pageSize);

}
