package cc.moecraft.saukiya.bukkitforgeitemslib.api;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public abstract class BFILPlugin extends JavaPlugin
{
    @Override
    public abstract void onEnable();

    @Override
    public abstract void onLoad();

    @Override
    public abstract void onDisable();
}
