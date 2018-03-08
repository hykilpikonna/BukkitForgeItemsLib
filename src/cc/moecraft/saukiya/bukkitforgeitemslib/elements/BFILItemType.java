package cc.moecraft.saukiya.bukkitforgeitemslib.elements;

import org.bukkit.Material;

/**
 * 此类由 Hykilpikonna 在 2018/03/08 创建!
 * Created by Hykilpikonna on 2018/03/08!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 *
 * 对应虚拟物品类型和物品的Material
 *
 * Relate virtual item type with real item material
 */
public enum BFILItemType
{
    ITEM(Material.DIAMOND_HOE), SWORD(Material.DIAMOND_SWORD), PICKAXE(Material.DIAMOND_PICKAXE), SHIELD(Material.SHIELD), BOW(Material.BOW);

    public Material material;

    BFILItemType(Material material)
    {
        this.material = material;
    }
}
