package com.QEcode.OA.service;

import java.util.List;

/**  
* <p>Title: BaseService.java</p>  
* <p>Description: 抽取service层基本方法的接口</p>   
* @author QEcode  
* @date 2018年11月25日  
* @version 1.0  
*/ 
public interface BaseService <T> {
    /**
     * @Description:查询所有
     * @return
     */
    public List<T> findAll();
    
    /**
     * @Description:删除
     * @param role
     */
    public void delete(Long id);

    /**
     * @Description:增加
     * @param role
     */
    public void save(T entity);

    /**
     * @Description:根据id查询
     * @param roleId
     * @return
     */
    public T findById(Long id);

    /**
     * @Description:更新
     * @param role
     */
    public void update(T entity);

    /**
     * @Description:根据id数组查询
     * @param roleIds
     * @return
     */
    public List<T> findByIds(Long[] entityIds);
}
