package banduty.bsroleplay.datagen;

import banduty.bsroleplay.block.ModBlocks;
import banduty.bsroleplay.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JUDGE_HAMMER, 1)
                .pattern(" TO")
                .pattern(" ST")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('O', Items.GOLD_INGOT)
                .input('T', Items.DARK_OAK_PLANKS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JUDGE_HAMMER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JUDGE_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BJB")
                .pattern("BBB")
                .input('B', Items.BLACK_WOOL)
                .input('J', ModItems.JUDGE_HAMMER)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.JUDGE_HAMMER), conditionsFromItem(ModItems.JUDGE_HAMMER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JUDGE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JUDGE_LEGGINGS, 1)
                .pattern("BBB")
                .pattern("B B")
                .pattern("J J")
                .input('B', Items.BLACK_WOOL)
                .input('J', ModItems.JUDGE_HAMMER)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.JUDGE_HAMMER), conditionsFromItem(ModItems.JUDGE_HAMMER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JUDGE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JUDGE_BOOTS, 1)
                .pattern("   ")
                .pattern("J J")
                .pattern("B B")
                .input('B', Items.BLACK_WOOL)
                .input('J', ModItems.JUDGE_HAMMER)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.JUDGE_HAMMER), conditionsFromItem(ModItems.JUDGE_HAMMER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JUDGE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLICE_BATON, 1)
                .pattern("  B")
                .pattern(" B ")
                .pattern("I  ")
                .input('B', Items.BLACK_WOOL)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POLICE_BATON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLICE_HELMET, 1)
                .pattern("BBB")
                .pattern("BPB")
                .pattern("   ")
                .input('B', Items.BLACK_WOOL)
                .input('P', ModItems.POLICE_BATON)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.POLICE_BATON), conditionsFromItem(ModItems.POLICE_BATON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POLICE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLICE_CHESTPLATE, 1)
                .pattern("B B")
                .pattern("BPB")
                .pattern("BBB")
                .input('B', Items.BLACK_WOOL)
                .input('P', ModItems.POLICE_BATON)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.POLICE_BATON), conditionsFromItem(ModItems.POLICE_BATON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POLICE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLICE_LEGGINGS, 1)
                .pattern("BBB")
                .pattern("B B")
                .pattern("P P")
                .input('B', Items.BLACK_WOOL)
                .input('P', ModItems.POLICE_BATON)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.POLICE_BATON), conditionsFromItem(ModItems.POLICE_BATON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POLICE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POLICE_BOOTS, 1)
                .pattern("   ")
                .pattern("P P")
                .pattern("B B")
                .input('B', Items.BLACK_WOOL)
                .input('P', ModItems.POLICE_BATON)
                .criterion(hasItem(Items.BLACK_WOOL), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(ModItems.POLICE_BATON), conditionsFromItem(ModItems.POLICE_BATON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POLICE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOLY_WEAPON, 1)
                .pattern(" G ")
                .pattern("WSW")
                .pattern(" W ")
                .input('W', Items.DARK_OAK_WOOD)
                .input('G', Items.GOLD_BLOCK)
                .input('S', Items.NETHER_STAR)
                .criterion(hasItem(Items.DARK_OAK_WOOD), conditionsFromItem(Items.BLACK_WOOL))
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_WEAPON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HOLY_HELMET, 1)
                .pattern("GGG")
                .pattern("GHG")
                .pattern("GGG")
                .input('G', Items.GOLD_BLOCK)
                .input('H', ModItems.HOLY_WEAPON)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(ModItems.HOLY_WEAPON), conditionsFromItem(ModItems.HOLY_WEAPON))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HOLY_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HOLY_CLOUD_GENERATOR_STATION, 1)
                .pattern("WWW")
                .pattern("WHW")
                .pattern("WWW")
                .input('W', Items.WHITE_WOOL)
                .input('H', ModItems.HOLY_WEAPON)
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .criterion(hasItem(ModItems.HOLY_WEAPON), conditionsFromItem(ModItems.HOLY_WEAPON))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.HOLY_CLOUD_GENERATOR_STATION)));
    }
}
