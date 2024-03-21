package com.userpublic.productmanagement.pack;

import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Entities> entities=new ArrayList<>();

    public void addEntities(Entities entity){
        entities.add(entity);
    }
}
