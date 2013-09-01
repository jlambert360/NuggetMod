import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;


public class ModCraftingHandler implements ICraftingHandler{

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		if(item.itemID == mod_NuggetMain.itemnuggetbiscuit.itemID){
			player.addStat(mod_NuggetMain.nuggetAchievement, 1);
		}
		if(item.itemID == mod_NuggetMain.swordNugget.itemID){
			player.addStat(mod_NuggetMain.nuggetswordAchievement, 1);
	}
	
		}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		
		}
	}


