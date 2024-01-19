package com.mms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mms.bean.Mobile;
import com.mms.controller.MMSController;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class SbMmsApplicationTests {
    
    @Autowired
    MMSController controller;
    
    String insert;
    String update;
    String delete;
    String result;
    String result1;
    List<Mobile> list = new ArrayList<Mobile>();
    List<Mobile> list1 = new ArrayList<Mobile>();
    Mobile mb = new Mobile(111,"Poco","X4Ultra",20000);
    Mobile mb1 = new Mobile(113,"iPhone","X4Ultra",80000);
    Mobile mb2;
    Mobile mb3;
    
        
    @Test
    @Order(1)
    void contextLoads() {
    
    }
    
    @Test
    @Order(2)    
    public void testPerformInsert() {
        insert="Inserted";
        result=controller.performInsert(mb1);
        assertEquals(insert,result);
    }
    
    @Test
    @Order(3)
    public void testPerformUpdate() {
        update="Updated";
        result=controller.performUpdate(mb1);
        assertEquals(update,result);
    }
    
    @Test
    @Order(4)
    public void testPerformDelete() {
        delete="Deleted";
        result=controller.performDelete(723);
        result1=controller.performDelete(301);
        assertEquals(delete,result);
    }
    
    @Test
    @Order(5)
    public void testgetAllMobile() {
        list= controller .getAllMobile();
        mb2 = new Mobile(101,"Poco","XUltra",32000);
        mb3 = new Mobile(101,"iPhone","Ultra",72000);
        list1.add(mb2);
        list1.add(mb3);
        list.equals(list1);
    }

}
