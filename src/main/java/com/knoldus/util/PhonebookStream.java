package com.knoldus.util;

import java.util.stream.Stream;

class Phone {
    private final String name;
    private final long number;
    Phone(String name,long number){
        this.name=name;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public long getNumber(){
        return number;
    }
}
public class PhonebookStream {
    public Stream<Phone> list;
    public void add(String name, long number){
        Phone obj= new Phone(name,number);
        list=Stream.concat(Stream.of(obj),list);
    }
    public long findPhoneByName(String name){
        Phone ans = list.filter(x-> x.getName().equals(name)).findAny().orElse(null);
        assert ans != null;
        return  ans.getNumber();
    }
    public String findPhoneByNumber(long number){
        Phone ans= list.filter(x-> x.getNumber()==number).findAny().orElse(null);
        assert ans != null;
        return ans.getName();
    }
}
class Main1{
    public static void main(String[] args) {
        PhonebookStream obj = new PhonebookStream();
        obj.add("Sakshi",222);
        obj.add("shikha",11234);
        obj.add("Ritika",218932);
        System.out.println(obj.findPhoneByName("Sakshi"));
        System.out.println(obj.findPhoneByNumber(11234));
    }
}

