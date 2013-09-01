import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;


public class ItemSwordNugget extends ItemSword{
	
	public ItemSwordNugget(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(mod_NuggetMain.tabNugget);
	}

public void registerIcons(IconRegister iconRegister){
	itemIcon = iconRegister.registerIcon("mod/NuggetSword");
}

}

	
	