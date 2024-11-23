package runnerPack;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features"
        , glue = {"steps"}
        , tags = "@Sanity")
public class Runner {
}
