package net.jokay.energia.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.jokay.energia.block.UsineboisacaciaBlock;
import net.jokay.energia.block.UsineboisBlock;
import net.jokay.energia.EnergiaModElements;

import java.util.Map;

@EnergiaModElements.ModElement.Tag
public class SeedacaciasaplingsLorsDunClickDroitSurUnBlocProcedure extends EnergiaModElements.ModElement {
	public SeedacaciasaplingsLorsDunClickDroitSurUnBlocProcedure(EnergiaModElements instance) {
		super(instance, 60);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure SeedacaciasaplingsLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure SeedacaciasaplingsLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure SeedacaciasaplingsLorsDunClickDroitSurUnBloc!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure SeedacaciasaplingsLorsDunClickDroitSurUnBloc!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == UsineboisBlock.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), UsineboisacaciaBlock.block.getDefaultState(), 3);
		}
	}
}
