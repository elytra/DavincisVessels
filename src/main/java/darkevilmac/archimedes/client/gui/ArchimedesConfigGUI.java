package darkevilmac.archimedes.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

import darkevilmac.archimedes.ArchimedesShipMod;

public class ArchimedesConfigGUI extends GuiConfig {

    public ArchimedesConfigGUI(GuiScreen parentScreen) {
        super(parentScreen, generateConfigList(), "ArchimedesShipsPlus",
                false, false, GuiConfig.getAbridgedConfigPath(ArchimedesShipMod.instance.getNetworkConfig().getConfig().toString()));
    }

    public static List<IConfigElement> generateConfigList() {

        ArrayList<IConfigElement> elements = new ArrayList<IConfigElement>();

        for (String name : ArchimedesShipMod.instance.getNetworkConfig().getConfig().getCategoryNames())
            elements.add(new ConfigElement(ArchimedesShipMod.instance.getNetworkConfig().getConfig().getCategory(name)));

        return elements;
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        super.actionPerformed(button);
    }

}
