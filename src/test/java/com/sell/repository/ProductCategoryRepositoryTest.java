package com.sell.repository;
import java.util.Date;

import com.sell.dataobject.ProductCategory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-16 23:31
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOne(){
        ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("李土福严选");
        productCategory.setCategoryType(10);
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findById(3).orElse(null);
        productCategory.setCategoryName("李土福严选");
        productCategory.setCategoryType(4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertEquals(productCategory,result);
    }
}