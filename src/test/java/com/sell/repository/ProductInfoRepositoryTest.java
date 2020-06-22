package com.sell.repository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @program: sell
 * @description:
 * @author: Mr.Li
 * @create: 2020-06-20 00:02
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save(){
        ProductInfo info = new ProductInfo();
        info.setProductId("123456");
        info.setProductName("皮蛋粥");
        info.setProductPrice(new BigDecimal(3.2));
        info.setProductStock(100);
        info.setProductDescription("招牌粥");
        info.setProductIcon("htts://xxx.com");
        info.setProductStatus(2);
        info.setCategoryType(0);
        info.setCreateTime(new Date());
        info.setUpdateTime(new Date());
        ProductInfo result = repository.save(info);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(2);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}