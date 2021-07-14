package com.knoldus.testcase;

import com.knoldus.util.Phonebook;
import static org.junit.Assert.assertEquals;

public class PhonebookTest {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("Sakshi",7017496);
        pb.add("Shikha",22211);
        pb.add("Ritika",22833);
       assertEquals(pb.findPhoneByName("Sakshi"),7017496);
       assertEquals(pb.findPhoneByNumber(22833),"Ritika");
    }
}
