package turniplabs.ratonmod.item;

import net.minecraft.src.*;
import net.minecraft.src.command.commands.SummonCommand;
import turniplabs.ratonmod.RatonMod;

public class ItemSpawnEgg extends Item
{
    private final Class entityClass;

    public ItemSpawnEgg(int i, Class entity)
    {
        super(i);
        this.entityClass = entity;
    }

    private void spawnAt(World world, double x, double y, double z, EntityPlayer entityplayer)
    {
        Entity entity = SummonCommand.createEntity(this.entityClass, world);
        entity.entityInitOnSpawn();
        entity.setLocationAndAngles(x + 0.5, y, z + 0.5, 0.0F, 0.0F);
        world.entityJoinedWorld(entity);

        RatonMod.LOGGER.info(entityClass.getName() + " spawned at " + x + " " + y + " " + z + " by " + entityplayer.username);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int l, double heightPlaced)
    {
        itemstack.consumeItem(entityplayer);
        switch (l)
        {
            case 0:
                --y;
                break;

            case 1:
                ++y;
                break;

            case 2:
                --z;
                break;

            case 3:
                z++;
                break;

            case 4:
                --x;
                break;

            case 5:
                x++;
                break;
        }
        spawnAt(world, x, y, z, entityplayer);
        return true;
    }
    public boolean useItemOnEntity(ItemStack itemstack, EntityLiving entityliving, EntityPlayer entityplayer) {
        itemstack.consumeItem(entityplayer);
        spawnAt(entityliving.worldObj, entityliving.posX, entityliving.posY + 0.5, entityliving.posZ, entityplayer);
        return true;
    }
}
