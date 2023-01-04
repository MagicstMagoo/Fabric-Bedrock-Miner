package yan.lx.bedrockminer;

import net.minecraft.text.Text;
import org.slf4j.Logger;

public class Debug {
    public static final Logger LOGGER = BedrockMinerMod.LOGGER;

    public static final boolean enable = false;

    public static void info(String msg) {
        if(enable){
            LOGGER.info(msg);
        }
    }
}
