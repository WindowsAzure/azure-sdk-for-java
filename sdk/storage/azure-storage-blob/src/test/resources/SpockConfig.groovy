import org.spockframework.runtime.model.parallel.ExecutionMode;

runner {
    parallel {
        enabled "LIVE".equalsIgnoreCase(System.getProperty("AZURE_TEST_MODE")) || "LIVE".equalsIgnoreCase(System.getenv("AZURE_TEST_MODE"))
        dynamic(10)
    }
}
