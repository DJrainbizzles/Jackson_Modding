package tutorial.DMAexample.render;

import tutorial.DMAexample.yourmodsname;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class renderTestEntity extends RenderBiped {

	
	private static final ResourceLocation textureLocation = new ResourceLocation(yourmodsname.MODID + ":" + "textures/models/hazmat.png");
//	textureLocation = new RecourseLocation(yourmodsname.MODID + ":" + "textures/models/hazmat.png");



public renderTestEntity(ModelBiped model, float shadowSize) {
super(model, shadowSize);
}

@Override
protected ResourceLocation getEntityTexture(Entity par1Entity)
{
return textureLocation;
}
}