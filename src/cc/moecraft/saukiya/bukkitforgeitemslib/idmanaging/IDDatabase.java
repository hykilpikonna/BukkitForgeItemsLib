package cc.moecraft.saukiya.bukkitforgeitemslib.idmanaging;

import cc.moecraft.saukiya.bukkitforgeitemslib.Main;
import cc.moecraft.saukiya.bukkitforgeitemslib.utils.Database;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public class IDDatabase extends Database
{
    // 当前数值最大的ID, 用于添加ID
    // Current maximum numeric virtual ID, used for assigning new IDs.
    private int currentMaxId;

    private static final String CURRENT_ID_CONFIG_NODE = "Properties.CurrentMaxID";
    private static final String BFIL_ID_PREFIX = "BFIL_IDs.";
    private static final String NAME_PREFIX = "Names.";

    public IDDatabase()
    {
        super(Main.getInstance(), "ID_Database", "bfildb");

        // 获取当前数值最大的ID
        // Obtain the current maximum ID.
        if (!contains(CURRENT_ID_CONFIG_NODE)) set(CURRENT_ID_CONFIG_NODE, 0);
        currentMaxId = getInt(CURRENT_ID_CONFIG_NODE);
    }

    /**
     * 保存最大的ID
     * Save the current maximum ID
     */
    public void saveCurentMaxId()
    {
        set(CURRENT_ID_CONFIG_NODE, currentMaxId);
        save();
    }

    /**
     * 通过名字找到ID
     * 如果没有的话创建新的ID
     *
     * Find virtual ID with properties,
     * If it's not found, assign new ID.
     *
     * @param itemName 物品名 (不是显示名) | Name (Not Display-Name)
     * @return 物品ID | Item Virtual ID
     */
    public int findID(String itemName)
    {

    }

    /**
     * 创建新的ID
     *
     * Assign a new virtual ID.
     *
     * @param itemName 物品名 (不是显示名)
     * @return 物品ID
     */
    public int assignNewId(String itemName)
    {
        currentMaxId++;
        int itemID = currentMaxId;
        set(BFIL_ID_PREFIX + itemID);
        set(NAME_PREFIX + itemName, itemID);
    }
}
