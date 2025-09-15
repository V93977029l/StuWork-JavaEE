package dao;

import lombok.Data;

@Data
public class Person {
    private int id;
    private String name;

    public String toString(){
        return "{"+"id:"+id+"name:"+name+"}";
    }
}
