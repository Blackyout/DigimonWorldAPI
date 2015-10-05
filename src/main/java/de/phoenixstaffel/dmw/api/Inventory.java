package de.phoenixstaffel.dmw.api;

import java.util.ArrayList;
import java.util.List;

import de.phoenixstaffel.dmw.DigimonWorldAPI;
import de.phoenixstaffel.dmw.api.world.InventorySlot;
import de.phoenixstaffel.dmw.core.CompoundStructure;

public class Inventory extends CompoundStructure {
    private static final int INVENTORY_SIZE = 30;
    private List<InventorySlot> slots = new ArrayList<>();
    
    public Inventory(DigimonWorldAPI main, long baseAddress) {
        for (byte i = 0; i < INVENTORY_SIZE; i++)
            slots.add(new InventorySlot(main, baseAddress, i));
    }
    
    public InventorySlot getInventorySlot(int id) {
        return slots.size() < id && id > 0 ? slots.get(id) : null;
    }
    
    public List<InventorySlot> getInventorySlots() {
        return slots;
    }
    
}
