package com.southwind.layuispringboot.entity;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private String description;
    private float price;
    private Integer stock;//库存
    private String categoryleveloneId;// 分类1
    private String categoryleveltwoId;// 分类2
    private String categorylevelthreeId;// 分类3
    private String fileName;
}
