package net.bluephs.miocore.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen(){
        ModOreGeneration.generateOres();
        ModTreeGeneration.generateTrees();
    }
}
