package com.NuggetMod.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class NuggetOnSmeltEvent {

		@SubscribeEvent
		public void whenISmeltAnItemOrBlock(PlayerEvent.ItemSmeltedEvent e){
			if(Block.getBlockFromItem(e.smelting.getItem()).equals(Items.cooked_chicken)){
				e.player.addStat(NuggetMain.chickennuggetAchievement, 1);
			}
		}
}

