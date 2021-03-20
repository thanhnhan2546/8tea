package com.github.qquang24t5._8tea.it;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/com/github/qquang24t5/_8tea/features")
public class IntegrationTest {
}
