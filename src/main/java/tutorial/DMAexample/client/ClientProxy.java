package tutorial.DMAexample.client;


import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.init.Items;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.DMAexample.CommonProxy;
import tutorial.DMAexample.MyCode;
import tutorial.DMAexample.MyEntities.ArrowLaser;
import tutorial.DMAexample.MyEntities.DeathBallEntity;
import tutorial.DMAexample.MyEntities.TestMob;
import tutorial.DMAexample.render.LaserRenderer;
import tutorial.DMAexample.render.renderDeathBall;
import tutorial.DMAexample.render.renderTestEntity;


public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                // This is for rendering entities and so forth later on
        	
        	EntityRegistry.registerGlobalEntityID(DeathBallEntity.class, "DeathBall", EntityRegistry.findGlobalUniqueEntityId());
    		System.out.println("Entity Reged");
        	RenderingRegistry.registerEntityRenderingHandler(DeathBallEntity.class, new renderDeathBall(Items.iron_ingot));
    		System.out.println("Renderer Reged");
    		RenderingRegistry.registerEntityRenderingHandler(TestMob.class, new renderTestEntity(new ModelBiped(), 0.5F));
    		RenderingRegistry.registerEntityRenderingHandler(ArrowLaser.class, new LaserRenderer());
    		System.out.println("KILL ME");
    		
        }
        
}