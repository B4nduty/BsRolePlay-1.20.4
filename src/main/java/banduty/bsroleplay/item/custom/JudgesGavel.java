package banduty.bsroleplay.item.custom;

import banduty.bsroleplay.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JudgesGavel extends Item {
    public JudgesGavel (Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        context.getWorld().playSound(null, positionClicked, ModSounds.JUDGES_GAVEL_RIGHT_CLICK,
                SoundCategory.BLOCKS, 1f, 1f);

        return ActionResult.SUCCESS;
    }
}
