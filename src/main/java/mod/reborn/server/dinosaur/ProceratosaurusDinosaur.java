package mod.reborn.server.dinosaur;

import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.ProceratosaurusEntity;
import mod.reborn.server.period.TimePeriod;

public class ProceratosaurusDinosaur extends Dinosaur {
    public static final double SPEED = 0.3F;
    public ProceratosaurusDinosaur(){
        super();

        this.setName("Proceratosaurus");
        this.setDinosaurType(DinosaurType.NEUTRAL);
        this.setDinosaurClass(ProceratosaurusEntity.class);
        this.setTimePeriod(TimePeriod.JURASSIC);
        this.setEggColorMale(0xD8D189, 0xB0554A);
        this.setEggColorFemale(0xD8D189, 0x939393);
        this.setHealth(10, 40);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStorage(27);
        this.setStrength(3, 20);
        this.setMaximumAge(fromDays(45));
        this.setEyeHeight(0.45F, 1.6F);
        this.setSizeX(0.3F, 1.4F);
        this.setSizeY(0.5F, 1.8F);
        this.setDiet(Diet.CARNIVORE.get());
        this.setBones("ribcage", "tooth", "shoulder", "skull", "neck_vertebrae", "leg_bones", "pelvis", "ribcage", "arm_bones", "shoulder", "tail_vertebrae");
        this.setHeadCubeName("Head");
        this.setScale(0.9F, 0.4F);
        this.shouldDefendOffspring();
        this.setAttackBias(120);
        this.setImprintable(true);
        this.setDefendOwner(true);
        this.setStorage(12);
        this.setBreeding(false, 2, 6, 20, false, true);
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "", "leg_bones", "arm_bones", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
    }
}
