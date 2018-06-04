package com.example.rabbit.hello;

import com.example.rabbit.neo.NeoSender;
import com.example.rabbit.neo.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSenderTest {
    @Autowired
    private HelloSender helloSender;
    @Autowired
    private NeoSender neoSender;
    @Autowired
    private NeoSender2 neoSender2;

    @Test
    public void hello(){
        helloSender.send();
    }

    @Test
    public void oneToMany(){
        for(int i=0;i<100;i++){
            neoSender.send(i);
        }
    }

    @Test
    public void manyToMany(){
        for(int i=0;i<100;i++){
            neoSender.send(i);
            neoSender2.send(i);
        }
    }
}