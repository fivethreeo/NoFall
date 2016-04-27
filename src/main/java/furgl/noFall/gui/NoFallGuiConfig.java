package furgl.noFall.gui;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import furgl.noFall.Config;
import furgl.noFall.NoFall;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class NoFallGuiConfig extends GuiConfig 
{
	public NoFallGuiConfig(GuiScreen parent) 
	{
		super(parent, getConfigElements(), NoFall.MODID, false, false, "No Fall Configuration");
	}

	private static List<IConfigElement> getConfigElements() {
        final List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.addAll(new ConfigElement(Config.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements());
        return list;
    }
}