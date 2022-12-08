package io.github.rawchickenneg.cnmd.common.registry;

import io.github.rawchickenneg.cnmd.ClayNoMoreBalanced;
import io.github.rawchickenneg.cnmd.common.block.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.Blocks.AMETHYST_CLUSTER;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ClayNoMoreBalanced.MOD_ID);
    public static final RegistryObject<Block> SCLAME_POTATO_BLOCK = BLOCKS.register("sclame_potato", () -> new SclamePotatoBlock(Block.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> SCLAME_CAKE_BLOCK = BLOCKS.register("sclame_cake", () -> new SclameCakeBlock(Block.Properties.copy(Blocks.CAKE)));
    public static final RegistryObject<Block> CLAY_BLOCK = BLOCKS.register("clay_block", () -> {
        return new CommonBlocks(Block.Properties.of(Material.METAL).strength(3.0F, 10F).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK));
    });
    public static final RegistryObject<Block> CLAY_TREE_SAPLING = BLOCKS.register("clay_tree_sapling", () -> {
        return new SaplingBlock(new ClayTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS));
    });
    public static final RegistryObject<Block> CLAY_LOG = BLOCKS.register("clay_log", () -> {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.CLAY).strength(1.0F, 1.0F).sound(SoundType.ANCIENT_DEBRIS));
    });
    public static final RegistryObject<Block> AMETHYST_SHOWCASE = BLOCKS.register("amethyst_showcase", () -> {
        return new AmethystShowcaseBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F).sound(SoundType.WOOD));
    });
    public static final RegistryObject<Block> ENDER_PEARL_BLOCK = BLOCKS.register("ender_pearl_block", () -> {
        return new CommonBlocks(Block.Properties.of(Material.STONE).strength(3.0F, 5F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> NATURAL_SCLAME_BLOCK = BLOCKS.register("natural_sclame_block", () -> {
        return new SlimeBlock(BlockBehaviour.Properties.of(Material.CLAY, MaterialColor.GRASS).strength(0.2F).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion());
    });
    public static final RegistryObject<Block> CLAY_ROLL_BLOCK = BLOCKS.register("clay_roll_block", () -> {
        return new RotatedPillarBlock(Block.Properties.of(Material.CLAY, MaterialColor.CLAY).strength(1.0F, 1.0F).sound(SoundType.ANCIENT_DEBRIS));
    });
    public static final RegistryObject<Block> PORCELAIN_BLOCK = BLOCKS.register("porcelain_block", () -> {
        return new CommonBlocks(Block.Properties.of(Material.STONE).strength(1.4F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> PORCELAIN_TILE = BLOCKS.register("porcelain_tile", () -> {
        return new CommonBlocks(Block.Properties.of(Material.STONE).strength(1.4F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> PORCELAIN_TILE_LARGE = BLOCKS.register("porcelain_tile_large", () -> {
        return new CommonBlocks(Block.Properties.of(Material.STONE).strength(1.4F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> PORCELAIN_TILE_TINY = BLOCKS.register("porcelain_tile_tiny", () -> {
        return new CommonBlocks(Block.Properties.of(Material.STONE).strength(1.4F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> TOILET = BLOCKS.register("toilet", () -> {
        return new Toilet(Block.Properties.of(Material.STONE).strength(1.4F).requiresCorrectToolForDrops().sound(SoundType.STONE));
    });
    public static final RegistryObject<Block> NETHERITE_SPONGE_BLOCK = BLOCKS.register("netherite_sponge", () -> {
        return new NetheriteSpongeBlock(BlockBehaviour.Properties.of(Material.SPONGE).strength(0.6F).sound(SoundType.NETHER_WART));
    });
    public static final RegistryObject<Block> NETHERITE_SPONGE_ABSORBED_BLOCK = BLOCKS.register("netherite_sponge_absorbed", () -> {
        return new MagmaBlock(BlockBehaviour.Properties.of(Material.SPONGE).strength(0.6F).sound(SoundType.NETHER_WART));
    });
    public static final RegistryObject<Block> BUDDING_ROSE_QUARTZ = BLOCKS.register("budding_rose_quartz", () -> {
        return new BuddingRoseQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops());
    });
    public static final RegistryObject<Block> ROSE_QUARTZ_CLUSTER = BLOCKS.register("rose_quartz_cluster", () -> {
        return new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> {
        return 5;
        }));
    });
    public static final RegistryObject<Block> LARGE_ROSE_QUARTZ_BUD = BLOCKS.register("large_rose_quartz_bud", () -> {
        return new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
        }));
    });
    public static final RegistryObject<Block> MEDIUM_ROSE_QUARTZ_BUD = BLOCKS.register("medium_rose_quartz_bud", () -> {
        return new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
        }));
    });
    public static final RegistryObject<Block> SMALL_ROSE_QUARTZ_BUD = BLOCKS.register("small_rose_quartz_bud", () -> {
        return new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
        }));
    });
}




