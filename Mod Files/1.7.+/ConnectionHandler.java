package com.NuggetMod.Main;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.network.NetworkCheckHandler;

public class ConnectionHandler{

	@SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
		try {
			if (UpdateCheck.isUpdateAvailable()) {
				event.player.addChatComponentMessage(new ChatComponentText("["+EnumChatFormatting.RED + EnumChatFormatting.ITALIC +"Nugget Mod"+EnumChatFormatting.RESET+"] " + StatCollector.translateToLocal("Update for Nugget Mod found!")+" "+StatCollector.translateToLocal("Please go to")+" "+StatCollector.translateToLocal("http://adf.ly/ewRp1")+" "+StatCollector.translateToLocal("to update to the new version")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			event.player.addChatComponentMessage(new ChatComponentText("["+EnumChatFormatting.RED + EnumChatFormatting.ITALIC +"Nugget Mod"+EnumChatFormatting.RESET+"] "+EnumChatFormatting.RED+"Unable to connect to the Update Server!"));
		}
	}
}