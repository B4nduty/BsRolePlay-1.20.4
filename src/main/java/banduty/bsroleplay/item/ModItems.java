package banduty.bsroleplay.item;

import banduty.bsroleplay.BsRolePlay;
import banduty.bsroleplay.item.custom.HolyWeapon;
import banduty.bsroleplay.item.custom.JudgeHammer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JUDGE_HAMMER = registerItem("judge_hammer",
            new JudgeHammer(new FabricItemSettings().maxCount(1).maxDamage(0)));

    public static final Item POLICE_BATON = registerItem("police_baton",
            new SwordItem(ModToolMaterial.POLICE, 3, 1f, new FabricItemSettings().maxDamage(0)));

    public static final Item HOLY_WEAPON = registerItem("holy_weapon",
            new HolyWeapon(new FabricItemSettings().maxCount(1).maxDamage(5)));

    public static final Item JUDGE_CHESTPLATE = registerItem("judge_chestplate",
            new ArmorItem(ModArmorMaterials.JUDGE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item JUDGE_LEGGINGS = registerItem("judge_leggings",
            new ArmorItem(ModArmorMaterials.JUDGE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item JUDGE_BOOTS = registerItem("judge_boots",
            new ArmorItem(ModArmorMaterials.JUDGE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item POLICE_HELMET = registerItem("police_helmet",
            new ArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item POLICE_CHESTPLATE = registerItem("police_chestplate",
            new ArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item POLICE_LEGGINGS = registerItem("police_leggings",
            new ArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item POLICE_BOOTS = registerItem("police_boots",
            new ArmorItem(ModArmorMaterials.POLICE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item HOLY_HELMET = registerItem("holy_helmet",
            new ArmorItem(ModArmorMaterials.HOLY, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BsRolePlay.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BsRolePlay.LOGGER.info("Registering Mod Items for " + BsRolePlay.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
