package com.userpublic.productmanagement.pack;

public class Main {

    public static void main(String[] args) {
        Service service=new Service();
        Entities mobile1=new Entities("14 pro","Apple","High",1200,"2000mw");
        service.addEntities(mobile1);
    }
}
