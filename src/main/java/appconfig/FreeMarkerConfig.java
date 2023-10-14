
package appconfig;
import org.javalite.activeweb.freemarker.AbstractFreeMarkerConfig;
public class FreeMarkerConfig  extends AbstractFreeMarkerConfig{
       @Override
    public void init() {
        getConfiguration().setNumberFormat("0.##");
    }
}
