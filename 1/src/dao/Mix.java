package dao;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Mix {
    // 注入集合
    private List<String> myList;
    private Map<String,String> myMap;
    private String[] myArray;
}
