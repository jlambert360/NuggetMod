package com.NuggetMod.Main;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = NuggetMain.modid)
public class NuggetMain {
	//Wasting Space..............................................................................................................................................................................................................................................................................................................................................................
	public static final String version = "1.7.2 - 1.0.0.5A";
	public static final String modid = "NuggetMain";
	
	//Materials
	public static ToolMaterial NuggetSwordMaterial = EnumHelper.addToolMaterial("NuggetSwordMat", 3, 2000, 15.0F, 996.0F, 30);
		
	//Swords
	public static Item swordnugget;
	
	//Achievements
	public static Achievement nuggetAchievement;
	public static Achievement nuggetswordAchievement;
	public static Achievement chickennuggetAchievement;
	
	//Blocks
	public static Block nuggetblock; 
	
	//Items
	public static Item itemnugget;
	public static Item itembbqsauce;
	public static Item itemmashedpotatoes;
	public static Item itemnuggetbiscuit;
	public static Item itemnuggetpotatoes;
	
	//Creative Tab
	public static CreativeTabs tabNugget = new CreativeTabs("nuggettab"){
		public Item getTabIconItem() {
			return itemnuggetbiscuit;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		
		//Tools
		swordnugget = new ItemSword(NuggetSwordMaterial).setUnlocalizedName("nuggetsword").setCreativeTab(tabNugget).setTextureName(modid + ":" + "NuggetSword");
		GameRegistry.registerItem(swordnugget, "nuggetsword");
		
		//Items                   |
		//           restores half\/
		itemnugget = new ItemFood(6, false).setUnlocalizedName("nugget").setCreativeTab(tabNugget).setTextureName(modid + ":" + "Nugget");
		GameRegistry.registerItem(itemnugget, "itemnugget");
		itembbqsauce = new ItemFood(1, false).setUnlocalizedName("bbqsauce").setCreativeTab(tabNugget).setTextureName(modid + ":" + "BBQSauce");
		GameRegistry.registerItem(itembbqsauce, "bbqsauce");
		itemmashedpotatoes = new ItemFood(1, false).setUnlocalizedName("mashedpotatoes").setCreativeTab(tabNugget).setTextureName(modid + ":" + "MashedPotatoes");
		GameRegistry.registerItem(itemmashedpotatoes, "mashedpotatoes");
		itemnuggetbiscuit = new ItemFood(10, false).setUnlocalizedName("nuggetbiscuit").setCreativeTab(tabNugget).setTextureName(modid + ":" + "NuggetBiscut");
		GameRegistry.registerItem(itemnuggetbiscuit, "nuggetbiscuit");
		itemnuggetpotatoes = new ItemFood(8, false).setUnlocalizedName("nuggetpotatoes").setCreativeTab(tabNugget).setTextureName(modid + ":" + "NuggetPotatoes");
		GameRegistry.registerItem(itemnuggetpotatoes, "nuggetpotatoes");
		
		//Blocks
		nuggetblock = new BlockNuggetBlock().setBlockName("NuggetBlock").setCreativeTab(tabNugget).setBlockTextureName(modid + ":" + "NuggetBlock");
		GameRegistry.registerBlock(nuggetblock, "nuggetblock");

		//Recipes
		//Recipes For Blocks
				GameRegistry.addRecipe(new ItemStack(nuggetblock), new Object[] {
					"SSS",
					"SUS",
					"SSS",
					'S', Blocks.stone, 'U', itemnuggetbiscuit
				});
				
				//Recipes For Food
				GameRegistry.addSmelting(Items.cooked_chicken, new ItemStack(itemnugget, 2), 0.0F);
				GameRegistry.addRecipe(new ItemStack(itembbqsauce), new Object[] {
					" D ",
					" O ",
					" B ",
					'D', Items.wheat_seeds, 'O', Items.sugar, 'B', Items.bowl
				});
				GameRegistry.addRecipe(new ItemStack(itemmashedpotatoes), new Object[] {
					"   ",
					" P ",
					" B ",
					'P', Items.potato, 'B', Items.bowl
				});
				GameRegistry.addRecipe(new ItemStack(itemnuggetbiscuit), new Object[] {
					" W ",
					" N ",
					" W ",
					'W', Items.bread, 'N', itemnugget
				});
				GameRegistry.addRecipe(new ItemStack(itemnuggetpotatoes), new Object[] {
					"   ",
					" N ",
					" M ",
					'N', itemnugget, 'M', itemmashedpotatoes
				});
				GameRegistry.addRecipe(new ItemStack(swordnugget), new Object[] {
					"DND",
					"CNC",
					"ESE",
					'D', Items.diamond, 'N', itemnugget, 'C', Items.cooked_chicken, 'E', Items.emerald, 'S', Items.stick 
				});
	}
	
	@EventHandler
	public void load(FMLInitializationEvent e){
	//Achievements
	//Name                                                    achname coords achievement picture    prerequisite 
	nuggetAchievement = new Achievement("achievement.nugget", "nugget", 5, 0, itemnuggetbiscuit, (Achievement)AchievementList.buildWorkBench).initIndependentStat().registerStat().setSpecial();
	nuggetswordAchievement = new Achievement("achievement.nuggetsword", "nuggetsword", 3, 0, swordnugget, (Achievement)AchievementList.buildWorkBench).initIndependentStat().registerStat().setSpecial();
	chickennuggetAchievement = new Achievement("achievement.chickennugget", "chickennugget", 5, 1, itemnugget, (Achievement)AchievementList.buildWorkBench).initIndependentStat().registerStat().setSpecial();
	//AchievementPage.registerAchievementPage(new AchievementPage("Nugget Mod Achievements", new Achievement[]{nuggetAchievement, nuggetswordAchievement}));
	
	//Register World Generator
			GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 0);
			GameRegistry.registerWorldGenerator(new NuggetOreGenerator(), 0);
	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		FMLCommonHandler.instance().bus().register(new NuggetOnCraftEvent());
		//MinecraftForge.EVENT_BUS.register(new NuggetOnCraftEvent());
		
		FMLCommonHandler.instance().bus().register(new ConnectionHandler());
		
	}
}
	/*
	1.6
	
	//Enum Register
	public static EnumToolMaterial NUGGETSWORD = EnumHelper.addToolMaterial("NUGGETSWORD", 3, 2000, 15.0F, 996.0F, 30);
	
	//Blocks
	public static Block nuggetblock = new BlockNuggetBlock(1000, Material.ground, "NuggetBlock").setHardness(1.0F).setCreativeTab(CreativeTabs.tabBlock).setUnlocalizedName("NuggetBlock");
	
	//Items										   //id - food restore - saturation - wolf food\\
	public static Item itemnugget = new ItemNugget(1001, 6, 0.6F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("Nugget").func_111206_d("nugget_cooked");
	public static Item itembbqsauce = new ItemBBQSauce(1002, 1, 0.2F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("BBQ Sauce").func_111206_d("bbqsauce");
	public static Item itemmashedpotatoes = new ItemMashedPotatoes(1003, 1, 0.2F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("Mashed Potatoes").func_111206_d("mashedpotatoes");
	public static Item itemnuggetbiscuit = new ItemNuggetBiscuit(1004, 10, 0.8F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("NuggetBiscuit").func_111206_d("nuggetbiscuit");
	public static Item itemnuggetpotatoes = new ItemNuggetPotatoes(1005, 8, 0.6F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("Nugget Dipped in Mashed Potatoes").func_111206_d("nuggetpotatoes");
	
	//Swords
	
	public static Item swordNugget = (new ItemSwordNugget(1006, NUGGETSWORD)).setUnlocalizedName("swordNugget").func_111206_d("nugget_sword");
	
	
	//Pickaxes
	
	
	
	//Armor
	
	
	
	//Shovels
	
	
	
	//Hoes
	
	
	
	//Records
	
	
	
	public static ModCraftingHandler modCraftHandler = new ModCraftingHandler();
	
	public static CreativeTabs tabNugget = new CustomCreativeTabs(CreativeTabs.getNextID(), itemnuggetbiscuit.itemID, "tabNugget", "NuggetTab", "Nuggets");
	
	public static Achievement nuggetAchievement = (new Achievement(60, "nugget", 5, 0, itemnuggetbiscuit, AchievementList.buildWorkBench)).registerAchievement().setSpecial();
	public static Achievement nuggetswordAchievement = (new Achievement(61, "nuggetsword", 3, 0, swordNugget, AchievementList.buildWorkBench)).registerAchievement().setSpecial();
	
	
	public void load() {
		itemnugget.setCreativeTab(tabNugget);
		nuggetblock.setCreativeTab(tabNugget);
		itembbqsauce.setCreativeTab(tabNugget);
		itemnuggetpotatoes.setCreativeTab(tabNugget);
		itemnuggetbiscuit.setCreativeTab(tabNugget);
		itemmashedpotatoes.setCreativeTab(tabNugget);
		swordNugget.setCreativeTab(tabNugget);
		
		//Blocks
		GameRegistry.registerBlock(nuggetblock);
		
		//Items
		GameRegistry.registerItem(itemnugget, "Nugget");
		GameRegistry.registerItem(itembbqsauce, "BBQSauce");
		GameRegistry.registerItem(itemmashedpotatoes, "MashedPotatoes");
		GameRegistry.registerItem(itemnuggetbiscuit, "NuggetinaBiscuit");
		GameRegistry.registerItem(itemnuggetpotatoes, "NuggetDippedinMashedPotatoes");
		GameRegistry.registerItem(swordNugget, "NuggetSword");
		
		//Blocks
		LanguageRegistry.addName(nuggetblock, "Nugget Block");
		
		//Items
		LanguageRegistry.addName(itemnugget, "Nugget");
		LanguageRegistry.addName(itembbqsauce, "BBQ Sauce");
		LanguageRegistry.addName(itemmashedpotatoes, "Mashed Potatoes");
		LanguageRegistry.addName(itemnuggetbiscuit, "Nugget in a Biscuit");
		LanguageRegistry.addName(itemnuggetpotatoes, "Nugget Dipped in Mashed Potatoes");
		LanguageRegistry.addName(swordNugget, "Super OP Nugget Sword");
		
		//CraftHandler
		GameRegistry.registerCraftingHandler(modCraftHandler);
		
		//Recipes For Blocks
		GameRegistry.addRecipe(new ItemStack(nuggetblock), new Object[] {
			"SSS",
			"SUS",
			"SSS",
			'S', Block.stone, 'U', itemnuggetbiscuit
		});
		
		//Recipes For Food
		GameRegistry.addSmelting(Item.chickenCooked.itemID, new ItemStack(itemnugget), 0.0F);
		GameRegistry.addRecipe(new ItemStack(itembbqsauce), new Object[] {
			" D ",
			" O ",
			" B ",
			'D', Item.seeds, 'O', Item.sugar, 'B', Item.bowlEmpty
		});
		GameRegistry.addRecipe(new ItemStack(itemmashedpotatoes), new Object[] {
			"   ",
			" P ",
			" B ",
			'P', Item.potato, 'B', Item.bowlEmpty
		});
		GameRegistry.addRecipe(new ItemStack(itemnuggetbiscuit), new Object[] {
			" W ",
			" N ",
			" W ",
			'W', Item.bread, 'N', itemnugget
		});
		GameRegistry.addRecipe(new ItemStack(itemnuggetpotatoes), new Object[] {
			"   ",
			" N ",
			" M ",
			'N', itemnugget, 'M', itemmashedpotatoes
		});
		GameRegistry.addRecipe(new ItemStack(swordNugget), new Object[] {
			"DND",
			"CNC",
			"ESE",
			'D', Item.diamond, 'N', itemnugget, 'C', Item.chickenCooked, 'E', Item.emerald, 'S', Item.stick 
		});
		//Register World Generator
		GameRegistry.registerWorldGenerator(new ModWorldGenerator());
		GameRegistry.registerWorldGenerator(new NuggetOreGenerator());
		
		//Ore Drops
		((BlockNuggetBlock) nuggetblock).setItemDroppedAndQuantity(new ItemStack(itemnuggetbiscuit), 1, 1);
	
		//Achievements
		addAchievementLocalizations();
	
	}

	private void addAchievementLocalizations() {
		addAcievementName("nugget", "Eat Chicken Nuggets!");
		addAcievementDescription("nugget", "Nom Nom Time!");
		addAcievementName("nuggetsword", "You are now OP!");
		addAcievementDescription("nuggetsword", "One Hit!");
	}

	public void addAcievementDescription(String par1String, String par2String) {
		LanguageRegistry.instance().addStringLocalization("achievement." + par1String + ".desc", "en_US", par2String);
	}

	public void addAcievementName(String par1String, String par2String) {
		LanguageRegistry.instance().addStringLocalization("achievement." + par1String, "en_US", par2String);
	}

	public String getVersion() {
		return version;
	}
	
	public String getName(){
		return name;
	}
	
}
*/