package com.simple.quick.starter.normal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xu.qiang
 * @date 17/8/10
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/META-INF/spring/server.xml")
public class RpcSeverTest {


    @Test
    public  void hehe() throws InterruptedException {


        while(true){
            Thread.sleep(1000L);
        }

    }
}