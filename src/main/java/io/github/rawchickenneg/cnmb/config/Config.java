package io.github.rawchickenneg.cnmb.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {
    public static final Config CONFIG;
    public static final ForgeConfigSpec SPEC;

    static {
        Pair<Config, ForgeConfigSpec> entry = new ForgeConfigSpec.Builder().configure(Config::new);
        CONFIG = entry.getKey();
        SPEC = entry.getValue();
    }

    public final ForgeConfigSpec.ConfigValue<Integer> CLAY;
    public final ForgeConfigSpec.ConfigValue<Long> CLAYMORE;
    public final ForgeConfigSpec.ConfigValue<Integer> BRICK;
    public final ForgeConfigSpec.ConfigValue<Integer> GLOW;
    public final ForgeConfigSpec.ConfigValue<Integer> AMETHYST;
    public final ForgeConfigSpec.ConfigValue<Integer> DUPLICATE;
    public final ForgeConfigSpec.ConfigValue<Integer> BURN;
    public final ForgeConfigSpec.ConfigValue<Integer> BONE;
    public final ForgeConfigSpec.ConfigValue<Integer> PRISMARINE;
    public final ForgeConfigSpec.ConfigValue<Integer> PHANTOM;
    public final ForgeConfigSpec.ConfigValue<Integer> LIGHTING;
    public final ForgeConfigSpec.ConfigValue<Integer> IRON;
    public final ForgeConfigSpec.ConfigValue<Integer> NETHERITE;
    public final ForgeConfigSpec.ConfigValue<Integer> GILDED;
    public final ForgeConfigSpec.ConfigValue<Integer> GOLD;
    public final ForgeConfigSpec.ConfigValue<Integer> GOLDEN;
    public final ForgeConfigSpec.ConfigValue<Integer> LEAVES;
    public final ForgeConfigSpec.ConfigValue<Integer> STICKY;
    public final ForgeConfigSpec.ConfigValue<Integer> DRY;
    public final ForgeConfigSpec.ConfigValue<Integer> HONEY;
    public final ForgeConfigSpec.ConfigValue<Integer> CHORUS;
    public final ForgeConfigSpec.ConfigValue<Integer> RECALL;
    public final ForgeConfigSpec.ConfigValue<Integer> VEX;
    public final ForgeConfigSpec.ConfigValue<Integer> VOID;
    public final ForgeConfigSpec.ConfigValue<Integer> BASKET;
    public final ForgeConfigSpec.ConfigValue<Integer> PULL;
    public final ForgeConfigSpec.ConfigValue<Integer> FLINT;
    public final ForgeConfigSpec.ConfigValue<Integer> QUARTZ;
    public final ForgeConfigSpec.ConfigValue<Integer> OBSIDIAN;
    public final ForgeConfigSpec.ConfigValue<Integer> PILLAGER;
    public final ForgeConfigSpec.ConfigValue<Integer> RAVAGER;
    public final ForgeConfigSpec.ConfigValue<Integer> ENDER;
    public final ForgeConfigSpec.ConfigValue<Integer> EXCHANGE;
    public final ForgeConfigSpec.ConfigValue<Integer> STONE;
    public final ForgeConfigSpec.ConfigValue<Integer> LAZULI;
    public final ForgeConfigSpec.ConfigValue<Integer> GLOWSTONE;
    public final ForgeConfigSpec.ConfigValue<Integer> BASE;
    public final ForgeConfigSpec.ConfigValue<Boolean> TNT;
    public final ForgeConfigSpec.ConfigValue<Boolean> EXPLODE;
    public final ForgeConfigSpec.ConfigValue<Boolean> ADVANCED;
    public final ForgeConfigSpec.ConfigValue<Boolean> ULTIMATE;

    public Config(ForgeConfigSpec.Builder builder){
        builder.push("Weapon Damage");
        builder.push("Claymore");
        CLAYMORE = builder
                .defineInRange("hurt damage", 24, 1, Long.MAX_VALUE);
        builder.pop();
        builder.pop();
        builder.push("Thrown Projectile Damage");
        builder.push("Clay Ball");
        CLAY = builder
                .defineInRange("hurt damage", 2, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Iron Ingot");
        IRON = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Gold Ingot");
        GOLD = builder
                .defineInRange("hurt damage", 10, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Netherite Ingot");
        NETHERITE = builder
                .defineInRange("hurt damage", 12, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Brick");
        BRICK = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Glow Clay Ball");
        GLOW = builder
                .defineInRange("hurt damage", 1, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Gilded Clay Ball");
        GILDED = builder
                .defineInRange("hurt damage", 7, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Honey Clay Ball");
        HONEY = builder
                .defineInRange("hurt damage", 5, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Leaves Clay Ball");
        LEAVES = builder
                .defineInRange("hurt damage", 2, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Dry Clay Ball");
        DRY = builder
                .defineInRange("hurt damage", 2, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Sticky Clay Ball");
        STICKY = builder
                .defineInRange("hurt damage", 3, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Lazuli Clay Ball");
        LAZULI = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Glowstone Clay Ball");
        GLOWSTONE = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Base Clay Ball");
        BASE = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Amethyst Clay Ball");
        AMETHYST = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Duplicate Clay Ball");
        DUPLICATE = builder
                .defineInRange("hurt damage", 0, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Burn Clay Ball");
        BURN = builder
                .defineInRange("hurt damage", 5, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Bone Clay Ball");
        BONE = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Stone Clay Ball");
        STONE = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Prismarine Clay Ball");
        PRISMARINE = builder
                .defineInRange("hurt damage", 8, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Phantom Clay Ball");
        PHANTOM = builder
                .defineInRange("hurt damage", 8, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Lighting Clay Ball");
        LIGHTING = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Golden Clay Ball");
        GOLDEN = builder
                .defineInRange("hurt damage", 7, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Chorus Clay Ball");
        CHORUS = builder
                .defineInRange("hurt damage", 8, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Recall Clay Ball");
        RECALL = builder
                .defineInRange("hurt damage", 8, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Vex Clay Ball");
        VEX = builder
                .defineInRange("hurt damage", 12, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Void Clay Ball");
        VOID = builder
                .defineInRange("hurt damage", 12, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Basket Clay Ball");
        BASKET = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Pull Clay Ball");
        PULL = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Flint Clay Ball");
        FLINT = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Quartz Clay Ball");
        QUARTZ = builder
                .defineInRange("hurt damage", 6, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Obsidian Clay Ball");
        OBSIDIAN = builder
                .defineInRange("hurt damage", 8, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Pillager Clay Ball");
        PILLAGER = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Ravager Clay Ball");
        RAVAGER = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Ender Clay Ball");
        ENDER = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.push("Exchange Clay Ball");
        EXCHANGE = builder
                .defineInRange("hurt damage", 4, 0, Integer.MAX_VALUE);
        builder.pop();
        builder.pop();
        builder.push("Explode Projectile Settings");
        builder.push("TNT Clay Ball");
        TNT = builder
                .define("explode with terrain destruction", true);
        builder.pop();
        builder.push("Explode Clay Ball");
        EXPLODE = builder
                .define("explode with terrain destruction", true);
        builder.pop();
        builder.push("Advanced Explode Clay Ball");
        ADVANCED = builder
                .define("explode with terrain destruction", true);
        builder.pop();
        builder.push("Ultimate Explode Clay Ball");
        ULTIMATE = builder
                .define("explode with terrain destruction", true);
        builder.pop();
        builder.pop();
    }
}
