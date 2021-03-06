package com.nexized.cross.conf;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class confEntity {
	
	// @oreBlocks
	public int oreAluminumID = 500;
	public int oreCopperID = 501;
	public int orePlatinumID = 502;
	public int oreSilverID = 503;
	public int oreTinID = 504;
	public int oreExperienceID = 505;
	
	// @ingotBlocks
	public int blockAluminumID = 510;
	public int blockCopperID = 511;
	public int blockPlatinumID = 512;
	public int blockSilverID = 513;
	public int blockSteelID = 514;
	public int blockTinID = 515;
	
	// @addBlocks
	public int blockFosilID = 520;
	
	//@itemTools
	public int axeAluminumID = 3000;
	public int axeCopperID = 3001;
	public int axePlatinumID = 3002;
	public int axeSilverID = 3003;
	public int axeSteelID = 3004;
	public int axeTinID = 3005;
	
	public int hoeAluminumID = 3010;
	public int hoeCopperID = 3011;
	public int hoePlatinumID = 3012;
	public int hoeSilverID = 3013;
	public int hoeSteelID = 3014;
	public int hoeTinID = 3015;
	
	public int shovelAluminumID = 3020;
	public int shovelCopperID = 3021;
	public int shovelPlatinumID = 3022;
	public int shovelSilverID = 3023;
	public int shovelSteelID = 3024;
	public int shovelTinID = 3025;
	
	public int pickAluminumID = 3030;
	public int pickCopperID = 3031;
	public int pickPlatinumID = 3032;
	public int pickSilverID = 3033;
	public int pickSteelID = 3034;
	public int pickTinID = 3035;
	
	public int swordAluminumID = 3040;
	public int swordCopperID = 3041;
	public int swordPlatinumID = 3042;
	public int swordSilverID = 3043;
	public int swordSteelID = 3044;
	public int swordTinID = 3045;
	
	//@item Armors
	public int helmAluminumID = 3050;
	public int helmCopperID = 3051;
	public int helmPlatinumID = 3052;
	public int helmSilverID = 3053;
	public int helmSteelID = 3054;
	public int helmTinID = 3055;
	
	public int chestAluminumID = 3060;
	public int chestCopperID = 3061;
	public int chestPlatinumID = 3062;
	public int chestSilverID = 3063;
	public int chestSteelID = 3064;
	public int chestTinID = 3065;
	
	public int legsAluminumID = 3070;
	public int legsCopperID = 3071;
	public int legsPlatinumID = 3072;
	public int legsSilverID = 3073;
	public int legsSteelID = 3074;
	public int legsTinID = 3075;
	
	public int bootsAluminumID = 3080;
	public int bootsCopperID = 3081;
	public int bootsPlatinumID = 3082;
	public int bootsSilverID = 3083;
	public int bootsSteelID = 3084;
	public int bootsTinID = 3085;

	// @itemIngot
	public int ingotAluminumID = 3090;
	public int ingotCopperID = 3091;
	public int ingotPlatinumID = 3092;
	public int ingotSilverID = 3093;
	public int ingotSteelID = 3094;
	public int ingotTinID = 3095;
	
	
	public void runTask(FMLPreInitializationEvent event) {
		
		// @Configuration Initialization
		Configuration conf = new Configuration(event.getSuggestedConfigurationFile());

		// @Load Configuration
		conf.load();
		
		// @oreBlocks
		oreAluminumID = conf.getBlock("oreBlock", "Aluminum Ore", oreAluminumID).getInt();
		oreCopperID = conf.getBlock("oreBlock", "Copper Ore", oreCopperID).getInt();
		orePlatinumID = conf.getBlock("oreBlock", "Platinum Ore", orePlatinumID).getInt();
		oreSilverID = conf.getBlock("oreBlock", "Silver Ore", oreSilverID).getInt();
		oreTinID = conf.getBlock("oreBlock", "Tin Ore", oreTinID).getInt();
		oreExperienceID = conf.getBlock("oreBlock", "Experience Ore", oreExperienceID).getInt();
		
		// @ingotBlocks
		blockAluminumID = conf.getBlock("ingotBlock", "Aluminum Block", blockAluminumID).getInt();
		blockCopperID = conf.getBlock("ingotBlock", "Copper Block", blockCopperID).getInt();
		blockPlatinumID = conf.getBlock("ingotBlock", "Platinum Block", blockPlatinumID).getInt();
		blockSilverID = conf.getBlock("ingotBlock", "Silver Block", blockSilverID).getInt();
		blockSteelID = conf.getBlock("ingotBlock", "Steel Block", blockSteelID).getInt();
		blockTinID = conf.getBlock("ingotBlock", "Tin Block", blockTinID).getInt();
		
		// @addBlocks
		blockFosilID = conf.getBlock("oreBlock", "Fosil Block", blockFosilID).getInt();
		
		// @itemTools
		axeAluminumID = conf.getItem("toolAxe", "Aluminum Axe", axeAluminumID).getInt();
		axeCopperID = conf.getItem("toolAxe", "Copper Axe", axeCopperID).getInt();
		axePlatinumID = conf.getItem("toolAxe", "Platinum Axe", axePlatinumID).getInt();
		axeSilverID = conf.getItem("toolAxe", "Silver Axe", axeSilverID).getInt();
		axeSteelID = conf.getItem("toolAxe", "Steel Axe", axeSteelID).getInt();
		axeTinID = conf.getItem("toolAxe", "Tin Axe", axeTinID).getInt();
		
		hoeAluminumID = conf.getItem("toolHoe", "Aluminum Hoe", hoeAluminumID).getInt();
		hoeCopperID = conf.getItem("toolHoe", "Copper Hoe", hoeCopperID).getInt();
		hoePlatinumID = conf.getItem("toolHoe", "Platinum Hoe", hoePlatinumID).getInt();
		hoeSilverID = conf.getItem("toolHoe", "Silver Hoe", hoeSilverID).getInt();
		hoeSteelID = conf.getItem("toolHoe", "Steel Hoe", hoeSteelID).getInt();
		hoeTinID = conf.getItem("toolHoe", "Tin Hoe", hoeTinID).getInt();
		
		shovelAluminumID = conf.getItem("toolShovel", "Aluminum Shovel", shovelAluminumID).getInt();
		shovelCopperID = conf.getItem("toolShovel", "Copper Shovel", shovelCopperID).getInt();
		shovelPlatinumID = conf.getItem("toolShovel", "Platinum Shovel", shovelPlatinumID).getInt();
		shovelSilverID = conf.getItem("toolShovel", "Silver Shovel", shovelSilverID).getInt();
		shovelSteelID = conf.getItem("toolShovel", "Steel Shovel", shovelSteelID).getInt();
		shovelTinID = conf.getItem("toolShovel", "Tin Shovel", shovelTinID).getInt();
		
		pickAluminumID = conf.getItem("toolPick", "Aluminum Pick", pickAluminumID).getInt();
		pickCopperID = conf.getItem("toolPick", "Copper Pick", pickCopperID).getInt();
		pickPlatinumID = conf.getItem("toolPick", "Platinum Pick", pickPlatinumID).getInt();
		pickSilverID = conf.getItem("toolPick", "Silver Pick", pickSilverID).getInt();
		pickSteelID = conf.getItem("toolPick", "Steel Pick", pickSteelID).getInt();
		pickTinID = conf.getItem("toolPick", "Tin Pick", pickTinID).getInt();
		
		swordAluminumID = conf.getItem("toolSword", "Aluminum Sword", swordAluminumID).getInt();
		swordCopperID = conf.getItem("toolSword", "Copper Sword", swordCopperID).getInt();
		swordPlatinumID = conf.getItem("toolSword", "Platinum Sword", swordPlatinumID).getInt();
		swordSilverID = conf.getItem("toolSword", "Silver Sword", swordSilverID).getInt();
		swordSteelID = conf.getItem("toolSword", "Steel Sword", swordSteelID).getInt();
		swordTinID = conf.getItem("toolSword", "Tin Sword", swordTinID).getInt();
		
		helmAluminumID = conf.getItem("armorHelm", "Aluminum Helm", helmAluminumID).getInt();
		helmCopperID = conf.getItem("armorHelm", "Copper Helm", helmCopperID).getInt();
		helmPlatinumID = conf.getItem("armorHelm", "Platinum Helm", helmPlatinumID).getInt();
		helmSilverID = conf.getItem("armorHelm", "Silver Helm", helmSilverID).getInt();
		helmSteelID = conf.getItem("armorHelm", "Steel Helm", helmSteelID).getInt();
		helmTinID = conf.getItem("armorHelm", "Tin Helm", helmTinID).getInt();
		
		chestAluminumID = conf.getItem("armorChest", "Aluminum Chest", chestAluminumID).getInt();
		chestCopperID = conf.getItem("armorChest", "Copper Chest", chestCopperID).getInt();
		chestPlatinumID = conf.getItem("armorChest", "Platinum Chest", chestPlatinumID).getInt();
		chestSilverID = conf.getItem("armorChest", "Silver Chest", chestSilverID).getInt();
		chestSteelID = conf.getItem("armorChest", "Steel Chest", chestSteelID).getInt();
		chestTinID = conf.getItem("armorChest", "Tin Chest", chestTinID).getInt();
		
		legsAluminumID = conf.getItem("armorLegs", "Aluminum Legs", legsAluminumID).getInt();
		legsCopperID = conf.getItem("armorLegs", "Copper Legs", legsCopperID).getInt();
		legsPlatinumID = conf.getItem("armorLegs", "Platinum Legs", legsPlatinumID).getInt();
		legsSilverID = conf.getItem("armorLegs", "Silver Legs", legsSilverID).getInt();
		legsSteelID = conf.getItem("armorLegs", "Steel Legs", legsSteelID).getInt();
		legsTinID = conf.getItem("armorLegs", "Tin Legs", legsTinID).getInt();
		
		bootsAluminumID = conf.getItem("armorBoots", "Aluminum Boots", bootsAluminumID).getInt();
		bootsCopperID = conf.getItem("armorBoots", "Copper Boots", bootsCopperID).getInt();
		bootsPlatinumID = conf.getItem("armorBoots", "Platinum Boots", bootsPlatinumID).getInt();
		bootsSilverID = conf.getItem("armorBoots", "Silver Boots", bootsSilverID).getInt();
		bootsSteelID = conf.getItem("armorBoots", "Steel Boots", bootsSteelID).getInt();
		bootsTinID = conf.getItem("armorBoots", "Tin Boots", bootsTinID).getInt();
		
		// @itemIngot
		ingotAluminumID = conf.getItem("itemIngot", "Aluminum Ingot", ingotAluminumID).getInt();
		ingotCopperID = conf.getItem("itemIngot", "Copper Ingot", ingotCopperID).getInt();
		ingotPlatinumID = conf.getItem("itemIngot", "Platinum Ingot", ingotPlatinumID).getInt();
		ingotSilverID = conf.getItem("itemIngot", "Silver Ingot", ingotSilverID).getInt();
		ingotSteelID = conf.getItem("itemIngot", "Steel Ingot", ingotSteelID).getInt();
		ingotTinID = conf.getItem("itemIngot", "Tin Ingot", ingotTinID).getInt();
		
		// Save Configuration
		conf.save();
	}
	
}
