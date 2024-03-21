package com.userpublic.productmanagement.pack;

public class Main {

    public static void main(String[] args) {
        Service service=new Service();
        service.addEntities(new Entities("14 pro","Apple","High",1200,"2000mw"));
        for(Entities entity:service.getEntities()){
            System.out.println(entity);
        }
    }
}
