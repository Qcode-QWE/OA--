package com.QEcode.OA.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QEcode.OA.dao.UserDao;
import com.QEcode.OA.pojo.User;
import com.QEcode.OA.service.UserService;

/**  
* <p>Title: UserServiceImpl.java</p>  
* <p>Description: user业务层实现类</p>   
* @author QEcode  
* @date 2018年11月25日  
* @version 1.0  
*/ 
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
	// TODO 自动生成的方法存根
	return null;
    }

    @Override
    public void delete(Long id) {
	// TODO 自动生成的方法存根
	
    }

    @Override
    public void save(User entity) {
	// TODO 自动生成的方法存根
	
    }

    /**
     * @Description:根据id查询用户
     * @param userId
     * @return
     */
    public User findById(Long id) {
	return userDao.findById(id);
    }

    @Override
    public void update(User entity) {
	// TODO 自动生成的方法存根
	
    }

    @Override
    public List<User> findByIds(Long[] entityIds) {
	// TODO 自动生成的方法存根
	return null;
    }
    
    
    

}
