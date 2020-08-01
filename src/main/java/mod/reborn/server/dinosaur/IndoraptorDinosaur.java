package mod.reborn.server.dinosaur;

import mod.reborn.server.api.Hybrid;
import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.GrowthStage;
import mod.reborn.server.entity.dinosaur.IndoraptorEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.util.ResourceLocation;

public class IndoraptorDinosaur extends Dinosaur implements Hybrid
{
    private ResourceLocation texture;

    public static final double SPEED = 0.4F;

    public IndoraptorDinosaur()
    {
        super();

        this.setName("Indoraptor");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(IndoraptorEntity.class);
        this.setTimePeriod(TimePeriod.NONE); //TODO, it's a hybrid, what do you do here?
        this.setEggColorMale(0xBEBABB, 0x95949A);
        this.setEggColorFemale(0xBEBABB, 0x95949A);
        this.setHealth(16, 70);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(10, 40);
        this.setMaximumAge(fromDays(30));
        this.setEyeHeight(0.55F, 5.4F);
        this.setSizeX(0.4F, 2.8F);
        this.setSizeY(0.3F, 4F);
        this.setStorage(54);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setBones( "front_leg_bones", "hind_bones", "neck_vertebrae", "claw", "pelvis", "ribcage", "shoulder", "skull", "tail_vertebrae", "tooth");
        this.setHeadCubeName("Head");
        this.setScale(1.4F, 0.25F);
        this.setAttackBias(4000);
        this.setBreeding(false, 0, 0, 999, false, false);
        this.setHybrid();
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "hind_leg_bones", "", "front_leg_bones", "claw"}};
        this.setRecipe(recipe);

        this.texture = new ResourceLocation(getDinosaurTexture("camouflage"));

    }

    @Override
    public Class<? extends Dinosaur>[] getDinosaurs()
    {
        return new Class[] { IndominusDinosaur.class, VelociraptorDinosaur.class };
    }

    @Override
    public ResourceLocation getMaleTexture(GrowthStage stage)
    {
        return texture;
    }

    @Override
    public ResourceLocation getFemaleTexture(GrowthStage stage)
    {
        return texture;
    }

}
