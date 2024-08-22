package examples.ui.core.config.listeners;

import io.qameta.allure.Attachment;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

@Slf4j
public class TestLoggingListener implements TestWatcher {
    public void testSuccessful(ExtensionContext context) {
        log.info(String.format("Test passed: %s > %s", context.getTestClass().get().getName(), context.getTestMethod().get().getName()));
        log.info("\n\u001b[32m  _____                _       ____                                   _ \n |_   _|   ___   ___  | |_    |  _ \\    __ _   ___   ___    ___    __| |\n   | |    / _ \\ / __| | __|   | |_) |  / _` | / __| / __|  / _ \\  / _` |\n   | |   |  __/ \\__ \\ | |_    |  __/  | (_| | \\__ \\ \\__ \\ |  __/ | (_| |\n   |_|    \\___| |___/  \\__|   |_|      \\__,_| |___/ |___/  \\___|  \\__,_|\n                                                                        \u001b[0m");
    }

    @Attachment
    public void testFailed(ExtensionContext context, Throwable cause) {
        log.info("\n  _____                _       _____           _   _              _ \n |_   _|   ___   ___  | |_    |  ___|   __ _  (_) | |   ___    __| |\n   | |    / _ \\ / __| | __|   | |_     / _` | | | | |  / _ \\  / _` |\n   | |   |  __/ \\__ \\ | |_    |  _|   | (_| | | | | | |  __/ | (_| |\n   |_|    \\___| |___/  \\__|   |_|      \\__,_| |_| |_|  \\___|  \\__,_|\n                                                                    ");
        log.info(String.format("Test failed: %s > %s", context.getTestClass().get().getName(), context.getTestMethod().get().getName()));    }
}
