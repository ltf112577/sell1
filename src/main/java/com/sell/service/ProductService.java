package com.sell.service;

import com.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @program: sell
 * @description: 商品业务层
 * @author: Mr.Li
 * @create: 2020-06-21 22:43
 **/
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     *查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo>findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);
}
