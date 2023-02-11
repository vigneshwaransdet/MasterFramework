package com.tmb.config;

import com.tmb.config.converters.StringToBrowserTypeConverter;
import org.aeonbits.owner.Config;
import org.openqa.selenium.remote.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
