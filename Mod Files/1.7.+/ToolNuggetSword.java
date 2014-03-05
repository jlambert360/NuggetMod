package com.NuggetMod.Main;

import net.minecraft.item.ItemSword;

public class ToolNuggetSword extends ItemSword {

	public ToolNuggetSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(NuggetMain.tabNugget);
		setTextureName(NuggetMain.modid + ":" + "NuggetSword");
	}

}
