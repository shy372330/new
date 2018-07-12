package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductMapper {

    @Select("<script>" +
            "select * from product "+
            "<where>"+
            "1=1 "+
            "<if test='saleDate != null'> "+
            " AND SaleDate=#{saleDate}"+
            "</if>"+
            "<if test='customerId != null'> "+
            " AND CustomerId=#{customerId}"+
            "</if>"+
            "<if test='modelNumber != null'> "+
            " AND ModelNumber=#{modelNumber}"+
            "</if>"+
            "<if test='tonnage != null'> "+
            " AND Tonnage=#{tonnage}"+
            "</if>"+
            "<if test='medium != null'> "+
            " AND Medium=#{medium}"+
            "</if>"+
            "<if test='fuel != null'> "+
            " AND Fuel=#{fuel}"+
            "</if>"+
            "</where>"+
            "</script>")
    List<Product> getProductListByCondition(Product product);

    @Insert("INSERT into product(DeviceNo,BoilerNo,ModelNumber,Tonnage,Medium,Fuel,IsSell,CustomerId,SaleDate,SaleAddress,Longitude,Latitude) " +
            " VALUES(#{deviceNo},#{boilerNo},#{modelNumber},#{tonnage},#{medium},#{fuel},#{isSell},#{customerId},#{saleDate},#{saleAddress},#{longitude},#{latitude})")
    void insertProduct(Product product);

    @Update("update Boiler set DeviceNo=#{deviceNo},BoilerNo=#{boilerNo},ModelNumber=#{modelNumber},Tonnage=#{tonnage},Medium=#{medium}," +
            "Medium=#{medium},Fuel=#{fuel},IsSell=#{isSell},CustomerId=#{customerId},SaleDate=#{saleDate},SaleAddress=#{saleAddress},Longitude=#{longitude},Latitude=#{latitude}" +
            " where Id=#{id}")
    void updateProduct(@Param("product") Product product);


    @Select("select * from product where customerId=#{customerId}")
    List<Product> getProductListByCustomerId(String customerId);



}
