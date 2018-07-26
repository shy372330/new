package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
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
            "<if test='roleId!=1 and roleId!=2 and roleId!=3 and roleId!=6 and manageUserId !=null '> "+
            " AND ManageUserId=#{manageUserId}"+
            "</if>"+
            "<if test='organizationType ==2 '> "+
            " AND substring(DeviceNo,1,2)=#{organizationNo}"+
            "</if>"+
            "<if test='organizationType ==3 '> "+
            " AND substring(DeviceNo,1,5)=#{organizationNo}"+
            "</if>"+
            "<if test='saleDate != null'> "+
            " AND DATE_FORMAT(DATE_ADD(SaleDate,INTERVAL -1 DAY), '%Y-%m-%d')=#{saleDate}"+
            "</if>"+
            "<if test='customerId != null'> "+
            " AND CustomerId=#{customerId}"+
            "</if>"+
            "<if test='boilerModelNumber != null'> "+
            " AND BoilerModelNumber=#{boilerModelNumber}"+
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
            " order by EditDateTime desc"+
            "</script>")
    List<Product> getProductListByCondition(Product product);

    @Insert("INSERT into product(DeviceNo,DeviceType,BoilerNo,BoilerModelNumber,Tonnage,Medium,Fuel,IsSell,CustomerId,SaleDate,Longitude,Latitude,Province,City,District,Street,CreateDateTime,EditDateTime,ManageUserId,ManageUserName) " +
            " VALUES(#{deviceNo},#{deviceType},#{boilerNo},#{boilerModelNumber},#{tonnage},#{medium},#{fuel},#{isSell},#{customerId},DATE_FORMAT(DATE_ADD(#{saleDate},INTERVAL 1 DAY), '%Y-%m-%d'),#{longitude},#{latitude},#{province},#{city}," +
            "#{district},#{street},#{createDateTime},#{editDateTime},#{manageUserId},#{manageUserName})")
    void insertProduct(Product product);

    @Update("update product set DeviceNo=#{deviceNo},DeviceType=#{deviceType},BoilerNo=#{boilerNo},BoilerModelNumber=#{boilerModelNumber},Tonnage=#{tonnage},Medium=#{medium}," +
            "Fuel=#{fuel},IsSell=#{isSell},CustomerId=#{customerId},SaleDate=DATE_FORMAT(DATE_ADD(#{saleDate},INTERVAL 1 DAY), '%Y-%m-%d'),Longitude=#{longitude},Latitude=#{latitude},Province=#{province},City=#{city}," +
            "District=#{district},Street=#{street},EditDateTime=#{editDateTime},ManageUserId=#{manageUserId},ManageUserName=#{manageUserName}" +
            " where Id=#{id}")
    void updateProduct(Product product);

    @Delete("delete from product where Id =#{id}")
    void deleteProductById(int id);
}
