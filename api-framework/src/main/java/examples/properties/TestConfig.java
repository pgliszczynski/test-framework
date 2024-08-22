package examples.properties;

import lombok.extern.slf4j.Slf4j;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class TestConfig {

    private static Properties properties;

    //Possible values: prod, stage, dev
    public static String testDataSource = getProperty("e2e.test.data.source", "dev");

    //==================================================================================================================
    // API properties
    //==================================================================================================================

    public static String baseUrl = getProperty("e2e.test.baseUrl", "https://dog.ceo");

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
