/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.guntram.mcmod.easierchests.interfaces;

import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;


/**
 *
 * @author gbl
 */
public interface SlotClicker {
    public void EasierChests$onMouseClick(Slot slot, int invSlot, int button, ClickType slotActionType);
    public int EasierChests$getPlayerInventoryStartIndex();
    public int EasierChests$playerInventoryIndexFromSlotIndex(int slot);
    public int EasierChests$slotIndexfromPlayerInventoryIndex(int slot);
}
