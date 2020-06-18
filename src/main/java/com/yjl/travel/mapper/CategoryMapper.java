package com.yjl.travel.mapper;

import com.yjl.travel.model.Category;

import java.util.List;


public interface CategoryMapper {
    /**
     * 查询Category全部信息
     * @return
     */
    List<Category> findAll();

    Category findCategoryByCid(int cid);

}
