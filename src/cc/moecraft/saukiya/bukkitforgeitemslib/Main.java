package cc.moecraft.saukiya.bukkitforgeitemslib;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 此类由 Hykilpikonna 在 2018/03/07 创建!
 * Created by Hykilpikonna on 2018/03/07!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        instance = this;

        // 模板
        throw new UnsupportedOperationException();
    }

    @Override
    public void onLoad()
    {
        // 模板
        throw new UnsupportedOperationException();
    }

    @Override
    public void onDisable()
    {
        // 模板
        throw new UnsupportedOperationException();
    }

    public static Main instance;

    public static Main getInstance()
    {
        return instance;
    }
}
