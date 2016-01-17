package com.choonster.testmod3.tileentity;

import com.choonster.testmod3.block.BlockColoredMultiRotatable.EnumFaceRotation;
import net.minecraft.util.EnumFacing;

/**
 * A TileEntity that stores an {@link EnumFacing} value and an {@link EnumFaceRotation} value.
 *
 * @author Choonster
 */
public class TileEntityColoredMultiRotatable extends TileEntityColoredRotatable {
	private EnumFaceRotation faceRotation = EnumFaceRotation.UP;

	public EnumFaceRotation getFaceRotation() {
		return faceRotation;
	}

	public void setFaceRotation(EnumFaceRotation faceRotation) {
		this.faceRotation = faceRotation;
		markDirty();
	}
}