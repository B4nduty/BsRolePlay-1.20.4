package banduty.bsroleplay.item.custom;

import banduty.bsroleplay.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class JudgeHammer extends Item {
    public JudgeHammer (Settings settings) {
        super(settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos positionClicked = context.getBlockPos();
        PlayerEntity player = context.getPlayer();

        context.getWorld().playSound(null, positionClicked, ModSounds.JUDGE_HAMMER_RIGHT_CLICK,
                SoundCategory.BLOCKS, 1f, 1f);

        return ActionResult.SUCCESS;
    }
}
