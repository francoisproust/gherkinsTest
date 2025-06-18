package fr.perso;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/addition.feature",
        glue = {"src/test/java/fr/perso/StepDefinitions.java"})
public class StepDefinitions {

    private int a = 0;
    private int b = 0;
    private int resultat = 0;

}
