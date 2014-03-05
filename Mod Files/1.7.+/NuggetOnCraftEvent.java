package com.NuggetMod.Main;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;

import com.NuggetMod.Main.*;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class NuggetOnCraftEvent{
	
	@SubscribeEvent
    public void onCrafting(ItemCraftedEvent event)
    {
     System.out.println("Earned Achievement");
     if (event.crafting.getItem() == NuggetMain.swordnugget)
        {
                event.player.addStat(NuggetMain.nuggetswordAchievement, 1);
        }
     System.out.println("Earned Achievement");
     if (event.crafting.getItem() == NuggetMain.itemnuggetbiscuit)
     {
             event.player.addStat(NuggetMain.nuggetAchievement, 1);
     }
     
    }
	
}
	
	/*
	@SubscribeEvent
	public void whenICraftAnItemOrBlock(PlayerEvent.ItemCraftedEvent e){
		if(Block.getBlockFromItem(e.crafting.getItem()).equals(NuggetMain.swordnugget)){
			e.player.addStat(NuggetMain.nuggetswordAchievement, 1);
					}
			
		}
	}
	*/
	/*
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		if(item.itemID == NuggetMain.itemnuggetbiscuit){
			player.addStat(NuggetMain.nuggetAchievement, 1);
		}
		if(item.itemID == NuggetMain.swordnugget){
			player.addStat(NuggetMain.nuggetswordAchievement, 1);
	}

		}

	public void onSmelting(EntityPlayer player, ItemStack item) {

		}
		*/