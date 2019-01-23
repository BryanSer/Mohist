package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.passive.EntityZombieHorse;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ZombieHorse;

public class CraftZombieHorse extends CraftAbstractHorse implements ZombieHorse {

    public CraftZombieHorse(CraftServer server, EntityZombieHorse entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftZombieHorse";
    }

    @Override
    public EntityType getType() {
        return EntityType.ZOMBIE_HORSE;
    }

}