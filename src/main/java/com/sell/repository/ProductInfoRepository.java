package com.sell.repository;

import com.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: sell
 * @description: 逻辑层
 * @author: Mr.Li
 * @create: 2020-06-19 23:54
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
List<ProductInfo>findByProductStatus(Integer productStatus);
}
