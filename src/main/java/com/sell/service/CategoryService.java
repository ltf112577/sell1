package com.sell.service;

import com.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @program: sell
 * @description: 业务层
 * @author: Mr.Li
 * @create: 2020-06-19 21:24
 **/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeId(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
