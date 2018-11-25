package com.QEcode.OA.dao;

import java.util.List;

/**  
* <p>Title: BaseDao.java</p>  
* <p>Description:抽取dao基本功能的接口 </p>   
* @author QEcode  
* @date 2018年11月25日  
* @version 1.0  
*/ 
public interface BaseDao<T> {
    /**
     * @Description:保存实体
     * @param entity
     */
    public void save(T entity);
    
    /**
     * @Description:修改实体
     * @param entity
     */
    public void update(T entity);
    
    /**
     * @Description:根据id删除实体
     * @param id
     */
    public void delete(Long id);
    
    
    /**
     * @Description:根据id查询实体
     * @param id 实体id
     * @return
     */
    public T findById(long id);
    
    
    /**
     * @Description:根据多个id获取多个实体
     * @param ids
     * @return
     */
    public List<T> findByIds(Long[] ids);
    
    /**
     * @Description:查询实体列表
     * @return
     */
    public List<T> findAll();
}
