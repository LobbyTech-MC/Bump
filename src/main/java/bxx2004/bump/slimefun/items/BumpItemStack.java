package bxx2004.bump.slimefun.items;

import bxx2004.bump.Bump;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.guizhanss.guizhanlib.utils.ChatUtil;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class BumpItemStack extends SlimefunItemStack {
    public BumpItemStack(String id, Material material) {
        super(
            id,
            material,
            Bump.getLocalization().getItemName(id),
            Bump.getLocalization().getItemLore(id)
        );
    }

    public BumpItemStack(String id, Material material, String... appendLore) {
        super(
            id,
            material,
            Bump.getLocalization().getItemName(id),
            Bump.getLocalization().getItemLore(id)
        );

        ItemMeta im = getItemMeta();
        List<String> lore = im.getLore();
        for (String line : appendLore) {
            lore.add(ChatUtil.color(line));
        }
        im.setLore(lore);
        setItemMeta(im);
    }
}