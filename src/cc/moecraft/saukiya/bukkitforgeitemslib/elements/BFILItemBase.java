package cc.moecraft.saukiya.bukkitforgeitemslib.elements;

import java.util.ArrayList;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public abstract class BFILItemBase
{
    // 必要的部分 从子插件传过来的
    // 物品名 (不是显示名)
    public String name;

    // 必要的部分, 传过来之后在BFIL获取
    // 物品ID (不是从子插件里传过来, 而是从Database里获取的)
    public String id;

    // 不必要的部分
    // 显示名
    public String displayName;

    // Lore
    public ArrayList<String> lore;


}
