package com.userpublic.productmanagement.pack;

import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Entities> entities=new ArrayList<>();

    public static List<Entities> getEntities() {
        return entities;
    }

    public void addEntities(Entities entity){
        entities.add(entity);
    }
}
