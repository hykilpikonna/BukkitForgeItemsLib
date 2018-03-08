package cc.moecraft.saukiya.bukkitforgeitemslib.elements;

import java.util.ArrayList;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public class BFILItemProperties
{
    // 必要的部分 从子插件传过来的
    // 物品名 (不是显示名)
    private String name;

    // 子插件名
    private String subPluginName;

    // 不必要的部分
    // 显示名
    public String displayName;

    // Lore
    public ArrayList<String> lore;

    public BFILItemProperties(String subPluginName, String name)
    {

    }

    public String getName()
    {
        return subPluginName + "_" + name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
