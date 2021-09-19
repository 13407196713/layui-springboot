package com.southwind.layuispringboot.controller;

import com.southwind.layuispringboot.mapper.ProductMapper;
import com.southwind.layuispringboot.service.ProductService;
import com.southwind.layuispringboot.vo.BarVO;
import com.southwind.layuispringboot.vo.DataVO;
import com.southwind.layuispringboot.vo.PieVO;
import com.southwind.layuispringboot.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page, Integer limit){
        return productService.findData(page, limit);
    }

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return productService.getBarVO();
    }

    @RequestMapping("/pieVO")
    @ResponseBody
    public List<PieVO> getPieVO(){
        return productService.getPieVO();
    }

//    @RequestMapping("/pieVO")
//    @ResponseBody
//    public List<ProductBarVO> getPieVO(){
//        return productMapper.findAllProductBarVO();
//    }

}
