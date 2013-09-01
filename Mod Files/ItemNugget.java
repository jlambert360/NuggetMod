

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.Icon;

public class ItemNugget extends ItemFood {

	public ItemNugget(int id, int hunger, float saturation, boolean wolffood) {
		super(id, hunger, saturation, wolffood);
	}
	
	private String texturePath;
	
	@SideOnly(Side.CLIENT)
	private Icon icon;
	
	


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.icon = par1IconRegister.registerIcon("mod/Nugget");
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1){
		return this.icon;
	}
}
