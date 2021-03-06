package com.nexized.cross.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class crossMaterials {
	
	public static EnumToolMaterial materialAluminum = EnumHelper.addToolMaterial("ALUMINUM", 2, 300, 3.5F, 2, 8);
	public static EnumToolMaterial materialCopper = EnumHelper.addToolMaterial("COPPER", 2, 200, 4.0F, 2, 8);
	public static EnumToolMaterial materialPlatinum = EnumHelper.addToolMaterial("PLATINUM", 3, 800, 6.0F, 4, 8);
	public static EnumToolMaterial materialSilver = EnumHelper.addToolMaterial("SILVER", 2, 800, 6.0F, 6, 8);
	public static EnumToolMaterial materialSteel = EnumHelper.addToolMaterial("STEEL", 4, 1600, 8.0F, 8, 8);
    public static EnumToolMaterial materialTin = EnumHelper.addToolMaterial("TIN", 2, 400, 4.5F, 5, 8);
    
    public static EnumArmorMaterial armorAluminum = EnumHelper.addArmorMaterial("ALUMINUM", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorCopper = EnumHelper.addArmorMaterial("COPPER", 8, new int[] {2, 3, 2, 1}, 8);
    public static EnumArmorMaterial armorPlatinum = EnumHelper.addArmorMaterial("PLATINUM", 16, new int[] {4, 6, 4, 2}, 16);
    public static EnumArmorMaterial armorSilver = EnumHelper.addArmorMaterial("SILVER", 12, new int[] {3, 4, 3, 2}, 12);
    public static EnumArmorMaterial armorSteel = EnumHelper.addArmorMaterial("STEEL", 32, new int[] {8, 12, 8, 4}, 32);
    public static EnumArmorMaterial armorTin= EnumHelper.addArmorMaterial("TIN", 8, new int[] {2, 3, 2, 1}, 8);
}
