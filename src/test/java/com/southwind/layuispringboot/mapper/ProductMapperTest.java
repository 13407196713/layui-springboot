package com.southwind.layuispringboot.mapper;

import com.southwind.layuispringboot.LayuiSpringbootApplication;
import com.southwind.layuispringboot.vo.ProductBarVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = LayuiSpringbootApplication.class)
class ProductMapperTest {
    @Autowired
    private ProductMapper mapper;

    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void test2(){
        List<ProductBarVO> list = mapper.findAllProductBarVO();
        int i = 0;
    }
}