package pro.vinyard.vb.plugin;


import pro.vinyard.vb.plugin.api.PluginContext;
import pro.vinyard.vb.plugin.api.VelocityBlueprintPlugin;

public class AocScrapperPlugin extends VelocityBlueprintPlugin {

    public AocScrapperPlugin(PluginContext context) {
        super(context);
    }

    @Override
    public void start() {
        log.trace("AocScrapperPlugin.start()");
    }

    @Override
    public void stop() {
        log.trace("AocScrapperPlugin.stop()");
    }

    @Override
    public void delete() {
        log.trace("AocScrapperPlugin.delete()");
    }
}
