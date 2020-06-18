package com.yjl.travel.service;

import com.yjl.travel.model.Category;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();

    Category findCategoryByCid(int cid);
}
