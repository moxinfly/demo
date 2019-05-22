package com.example.demo.Service;

import com.example.demo.entity.TbUserEntity;
import com.example.demo.mapper.customer.TbUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    TbUserMapper tbUserMapper;

    public void insert(){
        TbUserEntity entity = new TbUserEntity();
        entity.setUserName("xiaoming");
        entity.setPassword("1111");
        tbUserMapper.insert(entity);
    }


    public void update(){
        TbUserEntity entity = new TbUserEntity();
        entity.setUserName("xiaoming2");
        entity.setPassword("2222");
        tbUserMapper.insert(entity);
    }


    public List<TbUserEntity> selectAll(){
        List<TbUserEntity> list = tbUserMapper.selectAll();
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    public void test(){
        insert();
        update();
        System.out.println("执行更新方法");
        if(true){
            throw new RuntimeException();
        }else{
            update();
        }
        System.out.println("执行插入方法");
        insert();
    }

    public TbUserEntity selfSelectById(Integer id){
        return tbUserMapper.selfSelectById(id);
    }
}
