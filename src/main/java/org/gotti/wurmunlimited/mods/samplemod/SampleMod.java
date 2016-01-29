package org.gotti.wurmunlimited.mods.samplemod;

import java.util.logging.Logger;

import org.gotti.wurmunlimited.modloader.interfaces.Initable;
import org.gotti.wurmunlimited.modloader.interfaces.PreInitable;
import org.gotti.wurmunlimited.modloader.interfaces.WurmClientMod;

public class SampleMod implements WurmClientMod, Initable, PreInitable {

	private static final Logger LOGGER = Logger.getLogger(SampleMod.class.getName());

	@Override
	public void init() {
		LOGGER.info("init");
	}

	@Override
	public void preInit() {
		LOGGER.info("preInit");
	}

}
