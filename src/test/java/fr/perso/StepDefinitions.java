package fr.perso;

import fr.perso.operation.Addition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/addition.feature",
        glue = {"src/test/java/fr/perso/StepDefinitions.java"})
public class StepDefinitions {
    private Integer resultat = null;
    private Integer chiffre1;
    private Integer chiffre2 ;

    @Given("le nombre A a pour valeur {int}")
    public void le_nombre_a_a_pour_valeur(Integer a) {
        chiffre1 = a;
    }

    @Given("le nombre B a pour valeur {int}")
    public void le_nombre_b_a_pour_valeur(Integer b) {
        chiffre2 = b;
    }

    @When("j'additionne le nombre A et le nombre B")
    public void j_additionne_le_nombre_a_et_le_nombre_b() {
        resultat = Addition.additionner(chiffre1,chiffre2); // Remplacer 1 par les variables chiffre_1 et chiffre_2
    }

    @Then("le résultat est de {int}")
    public void le_résultat_est_de(Integer int1) {
        assertThat(resultat).isEqualTo(int1);
    }
}
