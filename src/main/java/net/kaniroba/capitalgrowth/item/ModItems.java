package net.kaniroba.capitalgrowth.item;

import net.kaniroba.capitalgrowth.CapitalGrowth;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CapitalGrowth.MODID);

    public static final RegistryObject<Item> WALLET = ITEMS.register("wallet",
              () -> new Item(new Item.Properties().
                      useItemDescriptionPrefix().
                      setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("capital_growth:wallet")))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
