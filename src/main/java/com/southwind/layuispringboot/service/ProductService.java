package com.southwind.layuispringboot.service;

import com.southwind.layuispringboot.vo.BarVO;
import com.southwind.layuispringboot.vo.DataVO;
import com.southwind.layuispringboot.vo.PieVO;
import com.southwind.layuispringboot.vo.ProductVO;

import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page, Integer limit);

    public BarVO getBarVO();

    public List<PieVO> getPieVO();
}