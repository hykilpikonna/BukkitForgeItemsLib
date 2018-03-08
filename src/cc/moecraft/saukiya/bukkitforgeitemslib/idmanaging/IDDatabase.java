package cc.moecraft.saukiya.bukkitforgeitemslib.idmanaging;

import cc.moecraft.saukiya.bukkitforgeitemslib.Main;
import cc.moecraft.saukiya.bukkitforgeitemslib.api.Database;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public class IDDatabase extends Database
{
    public IDDatabase()
    {
        super(Main.getInstance(), "ID_Database", "bfildb");
    }

    public void readOrAddItem()
    {

    }
}
