package com.QEcode.OA.portal.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.QEcode.OA.common.pojo.Config;

public class ZookeeperDao {
    
    @Resource(name="hibernateTemplate")
    protected HibernateTemplate hibernateTemplate;
    
    
    /**
     * @Description:从数据库中获取配置信息
     * @return
     */
    public List<Config> downLoadConfigFromDB(){
	String sql = "select *from config";
	Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
	Query query = session.createQuery(sql);
	return query.list();
    }
    
    /**
     * @Description:将配置文件上传到数据库中
     * @param configName
     * @param configValue
     */
    public void upLoadConfigToDB(String configName,String configValue){
	String sql = "insert into config(config_name,config_value) value(?,?)";
	hibernateTemplate.
	
    }
    
    
    
    

    
    
}
