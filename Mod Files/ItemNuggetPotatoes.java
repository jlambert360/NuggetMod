

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNuggetPotatoes extends ItemFood {

	public ItemNuggetPotatoes(int id, int hunger, float saturation, boolean wolffood) {
		super(id, hunger, saturation, wolffood);
	}
	
	private String texturePath;
	
	@SideOnly(Side.CLIENT)
	private Icon icon;
	
	


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister){
		this.icon = par1IconRegister.registerIcon("mod/NuggetPotatoes");
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1){
		return this.icon;
	}
}