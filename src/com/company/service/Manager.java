package com.company.service;

import com.company.Warehouse;
import com.company.material.Material;

public class Manager {

    public static void transaction(Warehouse sender, Warehouse receiver, Material material, int quantity) {
        if(!receiver.getMaterials().containsKey(material)){
            receiver.addMaterial(material, 0);
        }
        if(sender.getMaterials().containsKey(material) && sender.getMaterials().get(material) >= quantity
                && receiver.getMaterials().get(material) + quantity <= material.getMaxCapacity()){
            int senderMaterialCount = sender.getMaterials().get(material);
            sender.getMaterials().put(material, senderMaterialCount - quantity);
            int receiverMaterialCount = receiver.getMaterials().get(material);
            receiver.getMaterials().put(material, receiverMaterialCount + quantity);
        }

    }
}
