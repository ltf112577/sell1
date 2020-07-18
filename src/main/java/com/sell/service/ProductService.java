package com.sell.service;

import com.sell.dataobject.ProductInfo;
import com.sell.dto.CartDTO;
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

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);

}
