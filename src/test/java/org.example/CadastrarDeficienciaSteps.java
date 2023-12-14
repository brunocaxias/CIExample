import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.model.Deficiencia;
import org.example.model.enums.CategoriaDeficiencia;

import static org.junit.Assert.assertEquals;

public class CadastrarDeficienciaSteps {
    private Deficiencia deficiencia;
    @Given("dado as informações sobre uma deficiênca: {string} e {string}")
    public void dadoAsInformacoesDeDeficiencia(String nome, String categoria) {
        // Write code here that turns the phrase above into concrete actions
        deficiencia = new Deficiencia(nome, CategoriaDeficiencia.valueOf(categoria));
    }
    @When("a deficiênca é cadastrada")
    public void deficiêncaCadastrada() {
        System.out.println("A deficiênca é cadastrada!");
    }

    @Then("o cadastro da deficiência é bem-sucedido")
    public void cadastroDaDeficiênciaBemSucedido() {
        System.out.println("O cadastro da deficiência é bem-sucedido");
    }

    @Then("as informações da deficiência são exibidas corretamente")
    public void asInformacoesDaPessoaSaoExibidasCorretamente() {
        assertEquals("Transtorno do Espectro Autista (TEA)", deficiencia.getNome());
        assertEquals(CategoriaDeficiencia.COGNITIVA, deficiencia.getCategoria());
    }
}
