//package com.mms.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.mms.bean.Mobile;
//import com.mms.dao.MobileDAO;
//
//class MMSControllerTest {
//
//    @Autowired
//    MobileDAO dao;
//
//    private Mobile mobile;
//
//    @Before
//    public void setUp() throws Exception {
//        // Code executed before each test method
//        mobile = new Mobile();
//        mobile.setId(123);
//        mobile.setBrand("Realme");
//        mobile.setModel("XIVUltra");
//        mobile.setPrice(35000);
//       
//    }
//
//    @Test
//    public void testPerformInsert() {
//        // Test if the mobile object is saved to the database
//        dao.save(mobile);
//        assertNotNull(mobile.getId());
//    }
//
//    @Test
//    public void testGetAll() {
//        // Test if the getAll() method returns a list of mobiles
//        List<Mobile> mobiles = (List<Mobile>) dao.findAll();
//        assertNotNull(mobiles);
//    }
//
//    @Test
//    public void testPerformUpdate() {
//        // Test if the mobile object is updated in the database
//        dao.save(mobile);
//        mobile.setPrice(50000);
//        dao.save(mobile);
//        Mobile updatedPrice = dao.findById(mobile.getId()).orElse(null);
//        assertEquals(updatedPrice.getPrice(), 50000);
//    }
//
//    @Test
//    public void testPerformDelete() {
//        // Test if the mobile object is deleted from the database
//        dao.save(mobile);
//        dao.deleteById(mobile.getId());
//        Mobile deletedMobile = dao.findById(mobile.getId()).orElse(null);
//        assertEquals(deletedMobile, null);
//    }
//}
//
//
