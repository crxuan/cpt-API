package com.crx.project.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: UserInterInfoServiceTest
 * Package: com.crx.project.service
 * Description:
 */
@SpringBootTest
public class UserInterInfoServiceTest {
    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;
    @Test
    public void invokeCount(){
        boolean b =userInterfaceInfoService.invokeCount(1L,1L);
        Assertions.assertTrue(b);
    }
}
