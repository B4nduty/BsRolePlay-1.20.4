package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BSROLEPLAY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BsRolePlay.MOD_ID,"judge_hammer"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bsroleplay"))
                    .icon(() -> new ItemStack(ModItems.JUDGE_HAMMER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.JUDGE_HAMMER);

                        entries.add(ModItems.JUDGE_CHESTPLATE);
                        entries.add(ModItems.JUDGE_LEGGINGS);
                        entries.add(ModItems.JUDGE_BOOTS);

                        entries.add(ModItems.POLICE_BATON);

                        entries.add(ModItems.POLICE_HELMET);
                        entries.add(ModItems.POLICE_CHESTPLATE);
                        entries.add(ModItems.POLICE_LEGGINGS);
                        entries.add(ModItems.POLICE_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        BsRolePlay.LOGGER.info("Registering Item Groups for " + BsRolePlay.MOD_ID);
    }
}
