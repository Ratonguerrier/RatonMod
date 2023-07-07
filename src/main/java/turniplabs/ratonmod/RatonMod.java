package turniplabs.ratonmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.src.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.ratonmod.item.ItemSpawnEgg;


public class RatonMod implements ModInitializer
{
    public static final String MOD_ID = "ratonmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    static int ratonmodIds = 800;

    public static final Item pigSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds, EntityPig.class), "spawn_egg.pig", "spawnEggs/pig.png");
    public static final Item cowSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 1, EntityCow.class), "spawn_egg.cow", "spawnEggs/cow.png");
    public static final Item chickenSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 2, EntityChicken.class), "spawn_egg.chicken", "spawnEggs/chicken.png");
    public static final Item sheepSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 3, EntitySheep.class), "spawn_egg.sheep", "spawnEggs/sheep.png");
    public static final Item squidSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 4, EntitySquid.class), "spawn_egg.squid", "spawnEggs/squid.png");
    public static final Item wolfSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 5, EntityWolf.class), "spawn_egg.wolf", "spawnEggs/wolf.png");
    public static final Item zombieSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 6, EntityZombie.class), "spawn_egg.zombie", "spawnEggs/zombie.png");
    public static final Item armouredZombieSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 7, EntityArmouredZombie.class), "spawn_egg.armoured_zombie", "spawnEggs/armoured_zombie.png");
    public static final Item giantZombieSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 8, EntityGiantZombie.class), "spawn_egg.giant", "spawnEggs/giant.png");
    public static final Item creeperSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 9, EntityCreeper.class), "spawn_egg.creeper", "spawnEggs/creeper.png");
    public static final Item skeletonSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 10, EntitySkeleton.class), "spawn_egg.skeleton", "spawnEggs/skeleton.png");
    public static final Item spiderSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 11, EntitySpider.class), "spawn_egg.spider", "spawnEggs/spider.png");
    public static final Item slimeSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 12, EntitySlime.class), "spawn_egg.slime", "spawnEggs/slime.png");
    public static final Item zombiePigmanSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 13, EntityPigZombie.class), "spawn_egg.pigman", "spawnEggs/pigman.png");
    public static final Item ghastSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 14, EntityGhast.class), "spawn_egg.ghast", "spawnEggs/ghast.png");
    public static final Item monsterSpawnEgg = ItemHelper.createItem( MOD_ID, new ItemSpawnEgg(ratonmodIds + 15, EntityMob.class), "spawn_egg.monster", "spawnEggs/monster.png");

    @Override
    public void onInitialize() {
        LOGGER.info("RatonMod initialized.");
    }
}
