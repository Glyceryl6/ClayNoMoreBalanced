package io.github.rawchickenneg.cnmd.common.item.clayballs;

import io.github.rawchickenneg.cnmd.common.entity.ThrownGlowstoneClayBall;
import io.github.rawchickenneg.cnmd.config.Config;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class GlowstoneClayBall extends Item {
    public GlowstoneClayBall(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack heldStack = player.getItemInHand(hand);
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 1F, 0.4F / (level.random.nextFloat() * 0.4F + 0.8F));
        if (!level.isClientSide) {
            ThrownGlowstoneClayBall clayball = new ThrownGlowstoneClayBall(level, player);
            clayball.setItem(heldStack);
            clayball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.0F, 1.0F);
            level.addFreshEntity(clayball);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            heldStack.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(heldStack, level.isClientSide());
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        String string = new TranslatableComponent("item.clay_no_more_balanced.clay_balls_damage").getString();
        String damage = String.valueOf(Config.CONFIG.GLOWSTONE.get());
        tooltip.add(new TranslatableComponent("item.clay_no_more_balanced.stone_clay_ball.tip").withStyle(ChatFormatting.YELLOW));
        tooltip.add(new TranslatableComponent("item.clay_no_more_balanced.lazuli_clay_ball.tip").withStyle(ChatFormatting.BLUE));
        tooltip.add(new TranslatableComponent("item.clay_no_more_balanced.glowstone_clay_ball.tip").withStyle(ChatFormatting.AQUA));
        tooltip.add(new TextComponent(""));
        tooltip.add(new TextComponent(" " + damage + " " + string).withStyle(ChatFormatting.DARK_GREEN));
    }

}
