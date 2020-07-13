package com.company;

import com.company.material.Material;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<Material, Integer> materials;

    public Warehouse(){
        this.materials = new HashMap<>();
    }

    public void addMaterial (Material material, int quantity){
        if(!materials.containsKey(material)){
            materials.put(material, quantity);
        }
    }

    public void removeMaterial(Material material){
        materials.remove(material);
    }

    public Map<Material, Integer> getMaterials() {
        return materials;
    }

    public void setMaterials(Map<Material, Integer> materials) {
        this.materials = materials;
    }
}
