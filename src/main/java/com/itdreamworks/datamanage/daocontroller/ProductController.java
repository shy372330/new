package com.itdreamworks.datamanage.daocontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.Product;
import com.itdreamworks.datamanage.mapper.ProductMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductMapper productMapper;

    /**
     * 获得产品列表数据
     * @param product
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/productlistbycondition")
    public Result getProductListByCondition(Product product,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Product> list =productMapper.getProductListByCondition(product);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 编辑产品
     * @param product
     * @return
     */
    @PostMapping("/editproduct")
    public Result editProduct(@RequestBody Product product){
        if(product.getId()!=null){
            productMapper.updateProduct(product);
        }else{
            productMapper.insertProduct(product);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除产品信息
     * @param id
     * @return
     */
    @PostMapping( "/deleteproductbyid")
    public Result deleteProductById(@RequestParam int id) {
        productMapper.deleteProductById(id);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/productinfoinmap")
    public  List<Product>  productInfoInMap(String customerId){
        List<Product> list =productMapper.getProductListByCustomerId(customerId);
        return list;
    }

}
