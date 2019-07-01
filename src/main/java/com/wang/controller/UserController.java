package com.wang.controller;

import com.wang.model.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    private JdbcOperations jdbcTemplate;

    @RequestMapping(value="{id}")
    public User getUser(@PathVariable long id) throws Exception {

        User user = userService.getUserById(id);

        return user;
    }
    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from user2";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }
    @RequestMapping("hello")
    public String test(){
        return "hello!!!";
    }
}
