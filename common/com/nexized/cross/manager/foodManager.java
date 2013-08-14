package com.nexized.cross.manager;

/*
 * Author: nexized
 * Last changed: 2013-08-13 by nexized
 * Licensed under nexized cross license - see license.txt for further information
 */

import com.nexized.cross.conf.confEntity;
import com.nexized.cross.conf.confLocalisation;
import com.nexized.cross.item.food.crossFood;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class foodManager {

	// @Defined Items (@nexized)
	public static Item foodRawbacon;
    public static Item foodBacon;
    
    // @Defined Items (@mod_attackz)  
	public static Item foodCorn;
	public static Item foodTomato;
	public static Item foodStrawberry;
	public static Item foodBlueberry;
	public static Item foodGreenTomato;
	public static Item foodOrange;
	public static Item foodLettuce;
	public static Item foodEggplant;
	public static Item foodEggScramled;
	public static Item foodRawbacon;
	public static Item foodCookedbacon;
    public static void doWork(confEntity idm, confLocalisation local) {
    	// @Add Food Items
    	addFood(idm);
    	// @Add Food Names
    	addNames(local);
    }
    
    public static void addFood(confEntity idm) {
    	foodRawbacon = (new crossFood(idm.foodRawbaconID, 1, 0.1F, true).setUnlocalizedName("foodRawbacon"));
    	foodBacon = (new crossFood(idm.foodBaconID, 3, 0.3F, true).setUnlocalizedName("foodBacon"));
    	foodCorn = (new crossFood(idm.foodCornID, 1, 0.1F, true).setUnlocalizedName("foodCorn"));
    	foodTomato = (new crossFood(idm.foodTomatoID, 3, 0.3F, true).setUnlocalizedName("foodTomato"));
    	foodStrawberry = (new crossFood(idm.foodStrawberryID, 1, 0.1F, true).setUnlocalizedName("foodStrawberry"));
    	foodBlueberry = (new crossFood(idm.foodBlueberryID, 3, 0.3F, true).setUnlocalizedName("foodBlueberry"));
    	foodGreenTomato = (new crossFood(idm.foodGreenTomatoID, 1, 0.1F, true).setUnlocalizedName("foodGreenTomato"));
    	foodOrange = (new crossFood(idm.foodOrangeID, 3, 0.3F, true).setUnlocalizedName("foodOrange"));
    	foodLettuce = (new crossFood(idm.foodLettuceID, 1, 0.1F, true).setUnlocalizedName("foodLettuce"));
    	foodEggplant = (new crossFood(idm.foodEggplantID, 3, 0.3F, true).setUnlocalizedName("foodEggplant"));
    	foodEggScramled = (new crossFood(idm.foodEggScramledID, 3, 0.3F, true).setUnlocalizedName("foodEggScramled"));
    }
    
    public static void addNames(confLocalisation local) {
    	LanguageRegistry.addName(foodCorn, local.foodCornName);
    	LanguageRegistry.addName(foodTomato, local.foodTomatoName);
    	LanguageRegistry.addName(foodStrawberry, local.foodStrawberryName);
    	LanguageRegistry.addName(foodBlueberry, local.foodBlueberryName);
    	LanguageRegistry.addName(foodGreenTomato, local.foodGreenTomatoName);
    	LanguageRegistry.addName(foodOrange, local.foodOrangeName);
    	LanguageRegistry.addName(foodLettuce, local.foodLettuceName);
    	LanguageRegistry.addName(foodEggplant, local.foodEggplantName);
    	LanguageRegistry.addName(foodEggScramled, local.foodEggScramledName);
    	LanguageRegistry.addName(foodRawbacon, local.foodRawbaconName);
    	LanguageRegistry.addName(foodBacon, local.foodBaconName);
    }
    
}
