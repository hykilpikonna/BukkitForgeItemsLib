package cc.moecraft.saukiya.bukkitforgeitemslib.idmanaging;

import cc.moecraft.saukiya.bukkitforgeitemslib.Main;
import cc.moecraft.saukiya.bukkitforgeitemslib.elements.BFILItemType;
import cc.moecraft.saukiya.bukkitforgeitemslib.utils.Database;

import java.util.ArrayList;
import java.util.Map;

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

    // 当前最大耐久值Index, 用于添加ID
    // Current maximum durability index. Used for assigning new IDs.
    private Map<BFILItemType, Integer> currentMaxDurIndex;

    private static final String CURRENT_ID_CONFIG_NODE = "Properties.CurrentMaxID";
    private static final String CURRENT_DUR_PREFIX = "Properties.CurrentMaxDurIndexes.";
    private static final String BFIL_ID_PREFIX = "BFIL_IDs.";
    private static final String NAME_PREFIX = "Names.";
    private static final String KEYWORD_TYPE = "Type";
    private static final String KEYWORD_DURABILITY_INDEX = "DurIndex";

    public IDDatabase()
    {
        super(Main.getInstance(), "ID_Database", "bfildb");

        // 获取当前数值最大的ID & Dur Index
        // Obtain the current maximum ID & Dur Index.
        if (!contains(CURRENT_ID_CONFIG_NODE)) set(CURRENT_ID_CONFIG_NODE, 0);
        currentMaxId = getInt(CURRENT_ID_CONFIG_NODE);

        for (BFILItemType type : BFILItemType.values())
        {
            String currentNode = CURRENT_DUR_PREFIX + type.name();

            if (!contains(currentNode)) set(currentNode, 0);
            currentMaxDurIndex.put(type, getInt(currentNode));
        }
    }

    /**
     * 保存最大的ID & Dur Index
     * Save the current maximum ID & Dur Index
     */
    public void saveCurentMax()
    {
        set(CURRENT_ID_CONFIG_NODE, currentMaxId);

        for (BFILItemType type : BFILItemType.values())
        {
            String currentNode = CURRENT_DUR_PREFIX + type.name();

            set(currentNode, currentMaxDurIndex.get(type));
        }

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
    public int findID(String itemName, BFILItemType type)
    {
        if (!contains(NAME_PREFIX + itemName)) assignNewId(itemName, type);

        return getInt(NAME_PREFIX + itemName);
        /*getKeys(BFIL_ID_PREFIX.replace(".", "")).forEach(key ->
        {
            if (getString(key + ".Type").equals(type.name()) && getString(key + ".Dur")))
            {

            }
        });*/
    }

    /**
     * 创建新的ID
     *
     * Assign a new virtual ID.
     *
     * @param itemName 物品名 (不是显示名)
     * @return 物品ID
     */
    public int assignNewId(String itemName, BFILItemType type)
    {
        int dur = currentMaxDurIndex.get(type);
        dur++;
        currentMaxDurIndex.put(type, dur);
        currentMaxId++;
        int itemID = currentMaxId;
        set(BFIL_ID_PREFIX + itemID + "." + KEYWORD_TYPE, type.name());
        set(BFIL_ID_PREFIX + itemID + "." + KEYWORD_DURABILITY_INDEX, dur);
        set(NAME_PREFIX + itemName, itemID);

        return itemID;
    }
}
