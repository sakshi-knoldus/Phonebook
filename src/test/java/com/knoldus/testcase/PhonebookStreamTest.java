package com.knoldus.testcase;

import com.knoldus.util.PhonebookStream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhonebookStreamTest {
    @Test
    public void test(){
        PhonebookStream obj = new PhonebookStream();
        obj.add("Sakshi",222);
        obj.add("shikha",11234);
        obj.add("Ritika",218932);
        assertEquals(obj.findPhoneByName("Sakshi"),222);
        assertEquals(obj.findPhoneByNumber(11234),"shikha");
    }
}
