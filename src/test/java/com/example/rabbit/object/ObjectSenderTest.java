package com.example.rabbit.object;

import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectSenderTest {
    @Autowired
    private ObjectSender objectSender;

    @Test
    public void test(){
        User user=new User();
        user.setName("yhw");
        user.setPassword("why");
        objectSender.send(user);
    }
}