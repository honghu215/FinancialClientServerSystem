package com.financial.web;


import com.financial.entity.UserEntity;
import com.financial.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 *
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserMapper userMapper;

    /*
     * @return
     */
    @GetMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=userMapper.getAll();
        return users;
    }

    /*
     * @param id
     * @return
     */
    @GetMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=userMapper.getOne(id);
        return user;
    }

    /*
     * @param user
     */
    @PostMapping("/add")
    public void save(UserEntity user) {
        userMapper.insert(user);
    }

    /*
     * @param user
     */
    @PutMapping(value="update")
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    /*
     * @param id
     */
    @DeleteMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }


    /*
     * @return
     */
    @GetMapping("/test1")
    public synchronized String test1() {

        logger.info("locked");
        for (int i=0;i<10;i++) {
            logger.info(String.valueOf(i));
            try {
                logger.info(Thread.currentThread().getName()+ "sleep for 5 seconds!");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        logger.info("released lock");
        return "Success";
    }


    /**
     * 2.
     */
    Semaphore semaphore=new Semaphore(1);

    @GetMapping("/test2")
    public String test2(){


        int availablePermits = semaphore.availablePermits();
        if(availablePermits>0){
            logger.info("acquired resource");
        }else{
            logger.info("resource is being used, please try agian later");
            return "Resource is busy！";
        }
        try {
            //request
            semaphore.acquire(1);
            logger.info("resource is being used");
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            semaphore.release(1);
        }
        logger.info("release resource");
        return "Success";
    }
}