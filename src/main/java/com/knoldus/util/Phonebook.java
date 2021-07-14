package com.knoldus.util;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public String name;
    public long number;
    public HashMap<String,Long> map= new HashMap<>();
    public void add(String name,long number){
        this.name=name;
        this.number=number;
        map.put(name,number);
    }
    public long findPhoneByName(String name){
        if(map.containsKey(name))
            return map.get(name);
        return -1;
    }
    public String findPhoneByNumber(long number){
       for(Map.Entry<String,Long> e:map.entrySet()){
           if(e.getValue()==number) return e.getKey();
       }
       return "-1";
    }

    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        for(Map.Entry<String,Long> e:map.entrySet()) {
            str.append(" Name: ").append(e.getKey()).append(" Phone no.: ").append(e.getValue());
        }
        return str.toString();
    }

}
class Main{
    public static void main(String[] args) {
        Phonebook pb = new Phonebook();
        pb.add("Sakshi",7017496);
        pb.add("Shikha",22211);
        pb.add("Ritika",22833);
        System.out.println(pb);
        System.out.println(pb.findPhoneByName("Sakshi"));
        System.out.println(pb.findPhoneByNumber(7017496));

    }
}
