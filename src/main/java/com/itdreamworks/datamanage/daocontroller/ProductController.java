package com.itdreamworks.datamanage.daocontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.Product;
import com.itdreamworks.datamanage.mapper.ProductMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductMapper productMapper;

    @GetMapping("/productlistbycondition")
    public Result getProductListByCondition(Product product,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Product> list =productMapper.getProductListByCondition(product);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @GetMapping("/productinfoinmap")
    public  List<Product>  productInfoInMap(String customerId){
        List<Product> list =productMapper.getProductListByCustomerId(customerId);
        return list;
    }

}
