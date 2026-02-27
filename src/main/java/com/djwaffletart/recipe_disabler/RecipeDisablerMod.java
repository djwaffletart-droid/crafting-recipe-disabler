package com.djwaffletart.recipe_disabler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod(RecipeDisablerMod.MODID)
@EventBusSubscriber
public class RecipeDisablerMod {
    public static final String MODID = "recipe_disabler";

    public RecipeDisablerMod() {
        // Mod constructor
    }

    @SubscribeEvent
    public static void setup(final FMLCommonSetupEvent event) {
        // Common Setup
    }

    @SubscribeEvent
    public static void doClientStuff(final FMLClientSetupEvent event) {
        // Client Setup
    }

    @SubscribeEvent
    public static void doServerStuff(final FMLDedicatedServerSetupEvent event) {
        // Server Setup
    }
}