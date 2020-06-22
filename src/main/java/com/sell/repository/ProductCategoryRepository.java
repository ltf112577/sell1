package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: sell
 * @description: 数据访问层
 * @author: Mr.Li
 * @create: 2020-06-16 23:27
 **/
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
