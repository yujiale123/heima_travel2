package com.yjl.travel.dao;

import com.yjl.travel.mapper.CategoryMapper;
import com.yjl.travel.model.Category;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class CategoryDao {
    /**
     * 查找Category全部信息
     * @return id和name
     */
    public List<Category> findAll(){
        SqlSession session = null;
        List<Category> all = null;
        try {
            session = DButil.getSession();
            CategoryMapper mapper = session.getMapper(CategoryMapper.class);
            all = mapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return all;
    }

    public Category findCategoryByCid(int cid){
        SqlSession session = null;
        Category category = null;
        try {
            session = DButil.getSession();
            CategoryMapper mapper = session.getMapper(CategoryMapper.class);
            category = mapper.findCategoryByCid(cid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return category;
    }
}
