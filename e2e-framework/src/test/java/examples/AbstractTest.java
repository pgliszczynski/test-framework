package examples;

import examples.ui.core.config.listeners.TestLoggingListener;
import examples.properties.TestConfig;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ExamplesApplication.class)
@ExtendWith(TestLoggingListener.class)
public abstract class AbstractTest {

    static {
            TestConfig.loadProperties();
    }
}
