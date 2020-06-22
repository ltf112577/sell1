package com.sell.service.impl;
import java.util.Date;

import com.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-19 21:34
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeId() {
        List<ProductCategory> list = categoryService.findByCategoryTypeId(Arrays.asList(1, 2, 3, 5, 6));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生专享");
        productCategory.setCategoryType(6);
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());

        ProductCategory p = categoryService.save(productCategory);
        Assert.assertNotNull(p);
    }
}