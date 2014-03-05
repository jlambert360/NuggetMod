package com.NuggetMod.Main;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockNuggetBlock extends Block {
	//Wasting Space..............................................................................................................................................................................................................................................................................................................................................................
	
	public BlockNuggetBlock(){
		super(Material.ground);
	}
}
	/*
	1.6
	private String texturePath;
	
	private ItemStack itemDropped;
	private int quantityDroppedMin = 1;
	private int quantityDroppedMax = 1;
	
	public BlockNuggetBlock(int par1, Material par2Material, String par3String) {
		super(par1, par2Material);
		
		this.texturePath = par3String;
	}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("mod/" + this.texturePath);
	}
	
	/**
	 * 
	 * @param par1ItemStack
	 * @param par2 Max
	 * @param par3 Min
	 */
	/*
	public void setItemDroppedAndQuantity(ItemStack par1ItemStack, int par2, int par3){
		this.itemDropped = par1ItemStack;
		this.quantityDroppedMax = par2;
		this.quantityDroppedMin = par3;
	}
	
	public void setItemDroppedAndQuantity(ItemStack par1ItemStack, int par2){
		this.itemDropped = par1ItemStack;
		this.quantityDroppedMax = par2;
		this.quantityDroppedMin = par2;
	
	}
	
	public void setItemDropped(ItemStack par1ItemStack){
		this.itemDropped = par1ItemStack;
	}
	
	public int idDropped(int par1, Random par2Random, int par3){
		return this.itemDropped != null ? this.itemDropped.itemID : this.blockID;
	}
	
	public int quantityDropped(Random par1Random){
		if(this.quantityDroppedMax - this.quantityDroppedMin > 0){
				return par1Random.nextInt(this.quantityDroppedMax - this.quantityDroppedMin + 1) + this.quantityDroppedMin;
		}else{
			return this.quantityDroppedMin;
		}
		}
	
}
*/