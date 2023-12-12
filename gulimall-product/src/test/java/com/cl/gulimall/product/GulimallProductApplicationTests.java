package com.cl.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cl.gulimall.product.entity.BrandEntity;
import com.cl.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为手机");
        brandService.updateById(brandEntity);
        System.out.println("保存成功。。。");
    }

    @Test
    void testQuery() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
    }

}
