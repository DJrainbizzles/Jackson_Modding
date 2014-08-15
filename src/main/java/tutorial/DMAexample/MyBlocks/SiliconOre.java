package tutorial.DMAexample.MyBlocks;

import java.util.Random;

import tutorial.DMAexample.MyCode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class SiliconOre extends Block 
	{

	        public SiliconOre (Material material) 
	        {
	        	
	                super(material);
	                
	                
	        }
	        public Item getItemDropped(int metadata, Random random, int fortune) {
	        	return MyCode.silicon;
	        }
	}	