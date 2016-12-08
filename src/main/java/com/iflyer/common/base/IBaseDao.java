package com.iflyer.common.base;



import java.util.List;

public interface IBaseDao<T extends BaseModel> {


 /*   *//**
     * 获取集合
     * @param vo
     * @return
     * @throws Exception
     *//*
    List<T> getList(PageVo<T> vo) throws Exception;

    *//**
     * 修改操作
     * @param entity
     * @throws Exception
     *//*
    void update(T entity) throws Exception;*/

    /**
     * save函数根据参数条件,调用了insert或update函数:有则改之,无则加之
     * @param entity
     * @throws Exception
     */
    void save(T entity) throws Exception;

   /* *//**
     * insert的对象如果存在则不会修改之前的值，也不会重新增加
     * @param entity
     * @throws Exception
     *//*
    void insert(T entity) throws Exception;


    *//**
     * 删除
     * @param entity
     * @throws Exception
     *//*
    void delete(T entity) throws Exception;*/
}