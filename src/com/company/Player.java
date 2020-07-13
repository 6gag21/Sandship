package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Warehouse> warehouses;

    public Player( String name){
        this.name = name;
        this.warehouses = new ArrayList<>();
    }

    public Warehouse createNewWarehouse(){
        Warehouse warehouse = new Warehouse();
        warehouses.add(warehouse);
        return warehouse;
    }
}
