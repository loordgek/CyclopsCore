package org.cyclops.cyclopscore.client.render.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import org.cyclops.cyclopscore.tileentity.CyclopsTileEntity;

/**
 * General renderer for {@link org.cyclops.cyclopscore.tileentity.CyclopsTileEntity} with {@link net.minecraft.client.model.ModelBase} models.
 * @author rubensworks
 *
 */
public class RenderTileEntityModelBase<T extends CyclopsTileEntity, M extends ModelBase> extends RenderTileEntityModel<T, M> {

    /**
     * Make a new instance.
     * @param model The model to render.
     * @param texture The texture to render the model with.
     */
    public RenderTileEntityModelBase(M model, ResourceLocation texture) {
        super(model, texture);
    }

    @Override
    protected void renderModel(T tile, M model, float partialTick, int destroyStage) {
        model.render(null, 0, 0, 0, 0, 0, 0);
    }
}
