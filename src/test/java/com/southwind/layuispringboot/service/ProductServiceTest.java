package com.southwind.layuispringboot.service;

import com.southwind.layuispringboot.vo.BarVO;
import com.southwind.layuispringboot.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {
    @Autowired
    private ProductService service;

    @Test
    void findData(){
//        DataVO dataVO = service.findData();
        int i = 0;
    }

    @Test
    void test(){
        BarVO barVO = service.getBarVO();
        int i = 0;
    }
}