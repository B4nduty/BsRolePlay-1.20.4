package banduty.bsroleplay;

import banduty.bsroleplay.entity.ModEntities;
import banduty.bsroleplay.entity.client.HolyCloudModel;
import banduty.bsroleplay.entity.client.HolyCloudRenderer;
import banduty.bsroleplay.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class BsRolePlayClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.HOLY_CLOUD, HolyCloudRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.HOLY_CLOUD, HolyCloudModel::getTexturedModelData);

    }
}
