package banduty.bsroleplay;

import banduty.bsroleplay.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BsRolePlay implements ModInitializer {
	public static final String MOD_ID = "bsroleplay";
    public static final Logger LOGGER = LoggerFactory.getLogger("bsroleplay");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}