package com.shuimu.springboot2.service.impl;

import com.github.pagehelper.PageHelper;
import com.shuimu.springboot2.dao.UserDao;
import com.shuimu.springboot2.model.User;
import com.shuimu.springboot2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 删除 * * @param id
     */
    @Override
    public void delete(int id) {
        userDao.deleteByPrimaryKey(id);
    }

    /**
     * 增加 * * @param user
     */
    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    /**
     * 更新 * * @param user
     */
    @Override
    public int update(User user) {
        return userDao.updateByPrimaryKey(user);
    }

    /**
     * 查询单个 * * @param id
     */
    @Override
    public User selectById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    /**
     * 查询全部列表,并做分页 * * @param pageNum 开始页数 * @param pageSize 每页显示的数据条数
     */
    @Override
    public List<User> selectAll(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return userDao.selectAll();
    }
}

