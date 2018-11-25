package com.QEcode.OA.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.QEcode.OA.dao.BaseDao;

/**  
* <p>Title: BaseDaoImpl.java</p>  
* <p>Description:抽取dao基本功能的实现类 </p>   
* @author QEcode  
* @date 2018年11月25日  
* @version 1.0  
*/ 
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource(name="hibernateTemplate")
    protected HibernateTemplate hibernateTemplate;
    
    private Class<T> clazz;
    
    
    public BaseDaoImpl(){
	//利用反射得到T的类型
	
	ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
	this.clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }
    
    /**
     * @Description:保存实体
     * @param entity
     */
    public void save(T entity){
	hibernateTemplate.save(entity);
    }
    
    /**
     * @Description:修改实体
     * @param entity
     */
    public void update(T entity){
	hibernateTemplate.update(entity);
    }

    /**
     * @Description:根据id删除实体
     * @param id
     */
    public void delete(Long id){
	Object object = hibernateTemplate.get(clazz, id);
	hibernateTemplate.delete(object);
    }
    
    
    /**
     * @Description:根据id查询实体
     * @param id 实体id
     * @return
     */
    public T findById(long id){

	return hibernateTemplate.get(clazz , id);

    }
    
    /**
     * @Description:根据多个id获取多个实体
     * @param ids
     * @return
     */
    public List<T> findByIds(Long[] ids){
	//防止空指针异常
	if (ids == null || ids.length ==0) {
	    //返回一个空的集合
	    return Collections.EMPTY_LIST;
	}
	
	List<T> list = new ArrayList<T>();
	for (Long id : ids) {
	    list.add(hibernateTemplate.get(clazz, id));
	}
	return list;
    }
    /**
     * @Description:查询实体列表
     * @return
     */
    public List<T> findAll(){
	return (List<T>) hibernateTemplate.find("from "+clazz.getSimpleName());
    }
}
