package com.jbhaha.xdxd.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack woodDrill;
    public static ItemStack stoneDrill;
    public static ItemStack ironDrill;
    public static ItemStack goldDrill;
    public static ItemStack diamondDrill;
    public static ItemStack netheriteDrill;
    public static ItemStack arrow;

    public static void init(){
        createWoodDrill();
        createStoneDrill();
        createIronDrill();
        createGoldDrill();
        createDiamondDrill();
        createNetheriteDrill();
        createArrow();
    }

    private static void createWoodDrill(){
        ItemStack item = new ItemStack(Material.WOODEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eWooden Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        woodDrill = item;

        ShapedRecipe srAcacia = new ShapedRecipe(NamespacedKey.minecraft("wooden_acacia_drill"), item);
        srAcacia.shape(" A ",
                 "AAA",
                 "ASA");
        srAcacia.setIngredient('A', Material.ACACIA_PLANKS);
        srAcacia.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srAcacia);

        ShapedRecipe srOak = new ShapedRecipe(NamespacedKey.minecraft("wooden_oak_drill"), item);
        srOak.shape(" O ",
                "OOO",
                "OSO");
        srOak.setIngredient('O', Material.OAK_PLANKS);
        srOak.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srOak);

        ShapedRecipe srDarkOak = new ShapedRecipe(NamespacedKey.minecraft("wooden_dark_oak_drill"), item);
        srDarkOak.shape(" D ",
                "DDD",
                "DSD");
        srDarkOak.setIngredient('D', Material.DARK_OAK_PLANKS);
        srDarkOak.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srDarkOak);

        ShapedRecipe srBirch = new ShapedRecipe(NamespacedKey.minecraft("wooden_birch_drill"), item);
        srBirch.shape(" B ",
                "BBB",
                "BSB");
        srBirch.setIngredient('B', Material.BIRCH_PLANKS);
        srBirch.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srBirch);

        ShapedRecipe srSpruce = new ShapedRecipe(NamespacedKey.minecraft("wooden_spruce_drill"), item);
        srSpruce.shape(" P ",
                "PPP",
                "PSP");
        srSpruce.setIngredient('P', Material.SPRUCE_PLANKS);
        srSpruce.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srSpruce);

        ShapedRecipe srJungle = new ShapedRecipe(NamespacedKey.minecraft("wooden_jungle_drill"), item);
        srJungle.shape(" J ",
                "JJJ",
                "JSJ");
        srJungle.setIngredient('J', Material.JUNGLE_PLANKS);
        srJungle.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srJungle);

        ShapedRecipe srCrimson = new ShapedRecipe(NamespacedKey.minecraft("wooden_crimson_drill"), item);
        srCrimson.shape(" C ",
                "CCC",
                "CSC");
        srCrimson.setIngredient('C', Material.CRIMSON_PLANKS);
        srCrimson.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srCrimson);

        ShapedRecipe srWarped = new ShapedRecipe(NamespacedKey.minecraft("wooden_warped_drill"), item);
        srWarped.shape(" W ",
                "WWW",
                "WSW");
        srWarped.setIngredient('W', Material.WARPED_PLANKS);
        srWarped.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(srWarped);

    }

    private static void createStoneDrill(){
        ItemStack item = new ItemStack(Material.STONE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eStone Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        stoneDrill = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("stone_drill"), item);
        sr.shape(" C ",
                "CCC",
                "CSC");
        sr.setIngredient('C', Material.COBBLESTONE);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createIronDrill(){
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eIron Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        ironDrill = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("iron_drill"), item);
        sr.shape(" I ",
                "III",
                "ISI");
        sr.setIngredient('I', Material.IRON_INGOT);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createGoldDrill(){
        ItemStack item = new ItemStack(Material.GOLDEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eGolden Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        goldDrill = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("golden_drill"), item);
        sr.shape(" G ",
                "GGG",
                "GSG");
        sr.setIngredient('G', Material.GOLD_INGOT);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createDiamondDrill(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eDiamond Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        diamondDrill = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("diamond_drill"), item);
        sr.shape(" D ",
                "DDD",
                "DSD");
        sr.setIngredient('D', Material.DIAMOND);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createNetheriteDrill(){
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eNetherite Drill");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis pickaxe is really sick.");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        netheriteDrill = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("netherite_drill"), item);
        sr.shape(" N ",
                "NNN",
                "NSN");
        sr.setIngredient('N', Material.NETHERITE_INGOT);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createArrow(){
        ItemStack item = new ItemStack(Material.ARROW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cArrow of Destruction");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis arrow is really sick.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        arrow = item;
    }

}
