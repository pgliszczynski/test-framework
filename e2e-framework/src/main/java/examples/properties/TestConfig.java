package examples.properties;

import com.codeborne.selenide.Configuration;
import lombok.extern.slf4j.Slf4j;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

@Slf4j
public class TestConfig {

    private static Properties properties;

    //Possible values: prod, stage, dev
    public static String testDataSource = getProperty("e2e.test.data.source", "dev");

    //==================================================================================================================
    // Web properties
    //==================================================================================================================

    public static String baseUrl = getProperty("e2e.test.baseUrl", "https://www.google.com");
    public static Integer testFailTimeout = Integer.parseInt(getProperty("e2e.test.fail.timeout", "10000"));
    public static Integer pageLoadTimeout = Integer.parseInt(getProperty("e2e.test.timeout.page", "30000"));

    //==================================================================================================================
    // Selenide configuration properties
    //==================================================================================================================

    static {
        //Setup Selenide configuration
        Configuration.baseUrl = baseUrl;
        Configuration.browser = getProperty("e2e.test.browser", "chrome");
        Configuration.webdriverLogsEnabled =
                Boolean.parseBoolean(getProperty("e2e.test.webdriverLogsEnabled", "false"));
        Configuration.timeout = testFailTimeout;
        Configuration.holdBrowserOpen = Boolean.parseBoolean(getProperty("e2e.test.holdBrowserOpen", "false"));
        Configuration.headless = Boolean.parseBoolean(getProperty("e2e.test.headless", "true"));
        Configuration.browserSize = getProperty("e2e.test.browser.resolution", "1920x1080");
        Configuration.pageLoadTimeout = pageLoadTimeout;
    }

    //==================================================================================================================

    public static void loadProperties() {
        properties = getProperties();
        Properties systemProperties = System.getProperties();
        systemProperties.putAll(properties);
        systemProperties.put("e2e.test.baseUrl", baseUrl);
    }

    private static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            try (InputStream stream = TestConfig.class.getResourceAsStream("/application.properties")) {
                if (stream != null) {
                    properties.load(stream);
                    log.info("Loading properties from located file application.properties");
                } else {
                    log.info("No application.properties file was found. Using default properties");
                }
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }
        return properties;
    }

    private static String getProperty(String key, String def) {
        Properties properties = getProperties();
        String result = System.getProperty(key);
        if (result == null) {
            result = properties.getProperty(key, def);
        }
        log.debug("Test run property '{}' is set to '{}'", key, result);
        return result;
    }
}
