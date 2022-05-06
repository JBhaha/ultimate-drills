package com.jbhaha.xdxd.events;

import com.jbhaha.xdxd.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Vector;

public class xDxDEvents implements Listener {

    static BlockFace blockFace;

    static Vector<Material> baseMaterials = new Vector<>();
    static Vector<Material> stoneMaterials = new Vector<>();
    static Vector<Material> ironMaterials = new Vector<>();
    static Vector<Material> aboveMaterials = new Vector<>();

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent join) {
        Player player = join.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to my server :)");
    }

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.netheriteDrill.getItemMeta())) {
                    Player player = event.getPlayer();
                    event.getClickedBlock().setType(Material.MAGMA_BLOCK, true);
                }
            }
        }
    }

    @EventHandler
    public static void onLeftClick(PlayerInteractEvent event) {
        blockFace = event.getBlockFace();
    }

    @EventHandler
    public static void onBlockBreak(BlockBreakEvent breakEvent) {
        Player player = breakEvent.getPlayer();
        Block block = breakEvent.getBlock();
        String itemName = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
        if (player.getInventory().getItemInMainHand().hasItemMeta()) {
            if (itemName.equals("§eWooden Drill") ||
                    itemName.equals("§eStone Drill") ||
                    itemName.equals("§eIron Drill") ||
                    itemName.equals("§eGolden Drill") ||
                    itemName.equals("§eDiamond Drill") ||
                    itemName.equals("§eNetherite Drill")) {
                if (blockFace == BlockFace.EAST || blockFace == BlockFace.WEST) {
                    //Block faces east or west
                    breakBlocksAround(player, block, BlockFace.WEST, itemName);
                } else if (blockFace == BlockFace.NORTH || blockFace == BlockFace.SOUTH) {
                    //Block faces north or south
                    breakBlocksAround(player, block, BlockFace.NORTH, itemName);
                } else if (blockFace == BlockFace.UP || blockFace == BlockFace.DOWN) {
                    //Block faces up or down
                    breakBlocksAround(player, block, BlockFace.UP, itemName);
                }
            }
        }
    }

    public static void breakBlocksAround(Player player, Block block, BlockFace blockFace, String itemName) {

        Vector<Block> blocksWestEast = new Vector<>();
        Vector<Block> blocksNorthSouth = new Vector<>();
        Vector<Block> blocksUpDown = new Vector<>();

        //Mineable by wood and gold pickaxe (base-layer)
        baseMaterials.add(Material.ANDESITE);
        baseMaterials.add(Material.BASALT);
        baseMaterials.add(Material.BLACKSTONE);
        baseMaterials.add(Material.AMETHYST_BLOCK);
        baseMaterials.add(Material.COAL_BLOCK);
        baseMaterials.add(Material.QUARTZ_BLOCK);
        baseMaterials.add(Material.BRICKS);
        baseMaterials.add(Material.BUDDING_AMETHYST);
        baseMaterials.add(Material.COAL_ORE);
        baseMaterials.add(Material.COBBLESTONE);
        baseMaterials.add(Material.DARK_PRISMARINE);
        baseMaterials.add(Material.DIORITE);
        baseMaterials.add(Material.DRIPSTONE_BLOCK);
        baseMaterials.add(Material.END_STONE);
        baseMaterials.add(Material.GRANITE);
        baseMaterials.add(Material.LODESTONE);
        baseMaterials.add(Material.MOSSY_COBBLESTONE);
        baseMaterials.add(Material.NETHER_BRICKS);
        baseMaterials.add(Material.NETHER_GOLD_ORE);
        baseMaterials.add(Material.NETHER_QUARTZ_ORE);
        baseMaterials.add(Material.NETHERRACK);
        baseMaterials.add(Material.PRISMARINE);
        baseMaterials.add(Material.PRISMARINE_BRICKS);
        baseMaterials.add(Material.POLISHED_ANDESITE);
        baseMaterials.add(Material.POLISHED_BLACKSTONE);
        baseMaterials.add(Material.POLISHED_BLACKSTONE_BRICKS);
        baseMaterials.add(Material.POLISHED_DIORITE);
        baseMaterials.add(Material.POLISHED_GRANITE);
        baseMaterials.add(Material.RED_SANDSTONE);
        baseMaterials.add(Material.SANDSTONE);
        baseMaterials.add(Material.SMOOTH_STONE);
        baseMaterials.add(Material.STONE);
        baseMaterials.add(Material.STONE_BRICKS);
        baseMaterials.add(Material.TERRACOTTA);

        //Mineable by stone pickaxe
        stoneMaterials.add(Material.IRON_BLOCK);
        stoneMaterials.add(Material.COPPER_BLOCK);
        stoneMaterials.add(Material.EXPOSED_COPPER);
        stoneMaterials.add(Material.CUT_COPPER);
        stoneMaterials.add(Material.LAPIS_BLOCK);
        stoneMaterials.add(Material.COPPER_ORE);
        stoneMaterials.add(Material.IRON_ORE);
        stoneMaterials.add(Material.LAPIS_ORE);

        //Mineable by iron pickaxe
        ironMaterials.add(Material.DIAMOND_BLOCK);
        ironMaterials.add(Material.EMERALD_BLOCK);
        ironMaterials.add(Material.GOLD_BLOCK);
        ironMaterials.add(Material.DIAMOND_ORE);
        ironMaterials.add(Material.EMERALD_ORE);
        ironMaterials.add(Material.GOLD_ORE);
        ironMaterials.add(Material.REDSTONE_ORE);

        //Mineable by above-iron pickaxe
        aboveMaterials.add(Material.NETHERITE_BLOCK);
        aboveMaterials.add(Material.ANCIENT_DEBRIS);
        aboveMaterials.add(Material.CRYING_OBSIDIAN);
        aboveMaterials.add(Material.OBSIDIAN);


        int x = (int) block.getLocation().getX();
        int y = (int) block.getLocation().getY();
        int z = (int) block.getLocation().getZ();

        blocksWestEast.add(player.getWorld().getBlockAt(x, y, z + 1));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y, z - 1));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y + 1, z));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y - 1, z));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y + 1, z + 1));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y - 1, z + 1));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y + 1, z - 1));
        blocksWestEast.add(player.getWorld().getBlockAt(x, y - 1, z - 1));

        blocksNorthSouth.add(player.getWorld().getBlockAt(x + 1, y, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x - 1, y, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x, y + 1, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x, y - 1, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x + 1, y + 1, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x + 1, y - 1, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x - 1, y + 1, z));
        blocksNorthSouth.add(player.getWorld().getBlockAt(x - 1, y - 1, z));

        blocksUpDown.add(player.getWorld().getBlockAt(x + 1, y, z));
        blocksUpDown.add(player.getWorld().getBlockAt(x - 1, y, z));
        blocksUpDown.add(player.getWorld().getBlockAt(x, y, z + 1));
        blocksUpDown.add(player.getWorld().getBlockAt(x, y, z - 1));
        blocksUpDown.add(player.getWorld().getBlockAt(x + 1, y, z + 1));
        blocksUpDown.add(player.getWorld().getBlockAt(x + 1, y, z - 1));
        blocksUpDown.add(player.getWorld().getBlockAt(x - 1, y, z + 1));
        blocksUpDown.add(player.getWorld().getBlockAt(x - 1, y, z - 1));

        if (blockBreakableByPickaxe(block, itemName)) {
            Vector<Block> neededVector = new Vector<>();
            switch (blockFace) {
                case WEST:

                    neededVector = blocksWestEast;

                    /*for (int i = 0; i < blocksWestEast.size(); i++) {
                        Block neededBlock = blocksWestEast.get(i);
                        if (blockBreakableByPickaxe(neededBlock, itemName)) {
                            neededBlock.breakNaturally();
                        }
                    }*/
                    break;
                case NORTH:

                    neededVector = blocksNorthSouth;

                    /*for (int i = 0; i < blocksNorthSouth.size(); i++) {
                        Block neededBlock = blocksNorthSouth.get(i);
                        if (blockBreakableByPickaxe(neededBlock, itemName)) {
                            neededBlock.breakNaturally();
                        }
                    }*/
                    break;
                case UP:

                    neededVector = blocksUpDown;

                    /*for (int i = 0; i < blocksUpDown.size(); i++) {
                        Block neededBlock = blocksUpDown.get(i);
                        if (blockBreakableByPickaxe(neededBlock, itemName)) {
                            neededBlock.breakNaturally();
                        }
                    }*/
                    break;
            }
            for (int i = 0; i < neededVector.size(); i++) {
                Block neededBlock = neededVector.get(i);
                if (blockBreakableByPickaxe(neededBlock, itemName)) {
                    neededBlock.breakNaturally();
                }
            }
        }
    }

    public static boolean blockBreakableByPickaxe(Block block, String itemName){

        switch (itemName){
            case "§eWooden Drill":
            case "§eGolden Drill":
                if (baseMaterials.contains(block.getType())){
                    return true;
                }
                break;
            case "§eStone Drill":
                if (baseMaterials.contains(block.getType()) || stoneMaterials.contains(block.getType())){
                    return true;
                }
                break;
            case "§eIron Drill":
                if (baseMaterials.contains(block.getType()) || stoneMaterials.contains(block.getType()) || ironMaterials.contains(block.getType())){
                    return true;
                }
                break;
            case "§eDiamond Drill":
            case "§eNetherite Drill":
                if (baseMaterials.contains(block.getType()) || stoneMaterials.contains(block.getType()) || ironMaterials.contains(block.getType()) || aboveMaterials.contains(block.getType())){
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }

}
