package com.yjl.travel.dao;

import com.yjl.travel.mapper.FavoriteMapper;
import com.yjl.travel.model.Favorite;
import com.yjl.travel.model.MyFavorite;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;


public class FavoriteDao {
    /**
     * 判断用户是否收藏过
     * @param uid
     * @param rid
     * @return
     */
    public List<Favorite> findFavoriteByUidAndRid(int uid, int rid){
        SqlSession session = null;
        List<Favorite> list = new ArrayList<>();
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            list = mapper.findFavoriteByUidAndRid(uid, rid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }

    /**
     * 添加收藏
     * @param uid
     * @param rid
     * @return
     */
    public boolean addFavorite(int uid, int rid){
        boolean flag = false;
        SqlSession session = null;
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            flag = mapper.insertFavorite(uid, rid);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return flag;
    }

    /**
     * 取消收藏
     * @param uid
     * @param rid
     * @return
     */
    public boolean cancelFavorite(int uid, int rid){
        boolean flag = false;
        SqlSession session = null;
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            flag = mapper.deleteFavorite(uid, rid);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return flag;
    }

    /**
     * 我的收藏
     * @param uid
     * @return
     */
    public List<MyFavorite> findMyFavorite(int uid,int start,int pageSize){
        SqlSession session = null;
        List<MyFavorite> list = new ArrayList<>();
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            list = mapper.findMyFavorite(uid,start,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }

    /**
     * 总页数
     * @param uid
     * @return
     */
    public int getTotalCount(int uid){
        int totalCount = 0;
        SqlSession session = null;
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            totalCount = mapper.getTotalCount(uid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return totalCount;
    }

    /**
     *
     * @param rname
     * @param start
     * @param pageSize
     * @return
     */
    public List<MyFavorite> findFavoriteNum(String rname,double gt_price,double lt_price, int start, int pageSize){
        SqlSession session = null;
        List<MyFavorite> list = new ArrayList<>();
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            list = mapper.findFavoriteNum(rname,gt_price,lt_price,start,pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }

    /**
     *
     * @return
     */
    public int getFavoriteTotalCount(String rname,double gt_price,double lt_price){
        int totalCount = 0;
        SqlSession session = null;
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            totalCount = mapper.getFavoriteTotalCount(rname,gt_price,lt_price);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return totalCount;
    }

    /**
     * 随机推荐
     * @return
     */
    public List<MyFavorite> randFind(){
        SqlSession session = null;
        List<MyFavorite> list = new ArrayList<>();
        try {
            session = DButil.getSession();
            FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
            list = mapper.randFind();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }
}
