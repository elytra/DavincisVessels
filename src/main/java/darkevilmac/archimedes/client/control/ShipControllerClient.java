package darkevilmac.archimedes.client.control;

import net.minecraft.entity.player.EntityPlayer;

import darkevilmac.archimedes.common.control.ShipControllerCommon;
import darkevilmac.archimedes.common.entity.EntityShip;
import darkevilmac.archimedes.common.network.ArchimedesShipsNetworking;

public class ShipControllerClient extends ShipControllerCommon {
    @Override
    public void updateControl(EntityShip ship, EntityPlayer player, int control) {
        super.updateControl(ship, player, control);
        ArchimedesShipsNetworking.NETWORK.send().packet("ControlInputMessage")
                .with("dimID", ship.worldObj.provider.getDimension())
                .with("entityID", ship.getEntityId())
                .with("control", control).toServer();
    }
}
