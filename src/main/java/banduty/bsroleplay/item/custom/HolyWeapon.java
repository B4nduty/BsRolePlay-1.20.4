package banduty.bsroleplay.item.custom;

import banduty.bsroleplay.sound.ModSounds;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HolyWeapon extends Item {
    public HolyWeapon (Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        World World = context.getWorld();

        Entity lightning = new LightningEntity(EntityType.LIGHTNING_BOLT, World);
        lightning.setPosition(positionClicked.toCenterPos());
        World.spawnEntity(lightning);

        context.getWorld().playSound(null, positionClicked, SoundEvents.BLOCK_AMETHYST_BLOCK_RESONATE,
                SoundCategory.BLOCKS, 1f, 1f);

        return ActionResult.SUCCESS;
    }
}
