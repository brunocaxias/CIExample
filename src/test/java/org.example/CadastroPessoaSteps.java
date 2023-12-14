package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.model.Deficiencia;
import org.example.model.Pessoa;
import org.example.model.enums.CategoriaDeficiencia;
import org.example.model.enums.Etinia;
import org.example.model.enums.Sexo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CadastroPessoaSteps {
    private Pessoa pessoa;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Cenário 1
    @Given("uma pessoa com {string}, {string}, {string}, {string}, {string}, {string}, {double}, {string} e {string}")
    public void umaPessoaCom(String nome, String cpf, String email, String dataNascimento, String contato, String rg, Double rendaFamiliar, String etinia, String sexo) {
        LocalDate data = LocalDate.parse(dataNascimento, formatter);
        this.pessoa = new Pessoa(nome, cpf, email, data, contato, rg, rendaFamiliar, Etinia.valueOf(etinia), Sexo.valueOf(sexo));
    }

    @When("a pessoa é cadastrada")
    public void aPessoaECadastrada() {
        System.out.println("A pessoa é cadastrada !");
    }

    @Then("o cadastro é bem-sucedido")
    public void oCadastroEBemSucedido() {
        System.out.println("O cadastro é bem-sucedido !");
    }

    @Then("as informações da pessoa são exibidas corretamente")
    public void asInformacoesDaPessoaSaoExibidasCorretamente() {
        assertEquals("João Silva", pessoa.getNome());
        assertEquals("123.456.789-09", pessoa.getCpf());
        assertEquals("joão@email.com", pessoa.getEmail());
        assertEquals("01/01/1990",  formatter.format(pessoa.getDataNascimento()));
        assertEquals("(27) 91110-2223", pessoa.getContato());
        assertEquals("0.000.000", pessoa.getRg());
        assertEquals(Double.valueOf("7800.00"), pessoa.getRendaFamiliar());
        assertEquals(Etinia.PARDO, pessoa.getEtinia());
        assertEquals(Sexo.MASCULINO, pessoa.getSexo());
    }

    //Cenário 2
    @Given("uma pessoa com {string}, {string}, {string} e {string}")
    public void dadoAsInformacoesDaDeficienciaDeUmaPessoa(String nome, String cpf, String deficiência, String categoriaDeficiencia) {
        // Write code here that turns the phrase above into concrete actions
        pessoa = new Pessoa(nome, cpf);
        pessoa.setDeficiencia(new Deficiencia(deficiência, CategoriaDeficiencia.valueOf(categoriaDeficiencia)));
    }
    @When("a pessoa já consta como cadastrada")
    public void pessoaConstaCadastrada() {
        System.out.println("A pessoa já consta como cadastrada!");
    }

    @Then("a associação é bem sucedidade")
    public void associacaoBemSucedidade() {
        System.out.println("A associação é bem sucedidade");
    }

    @Then("as informações da defificência da pessoa são exibidas corretamente")
    public void asInformacoesDaAssociacaoSaoExibidas() {
        assertEquals("João Silva", pessoa.getNome());
        assertEquals("123.456.789-09", pessoa.getCpf());
        assertEquals("Transtorno do Espectro Autista (TEA)", pessoa.getDeficiencia().getNome());
        assertEquals(CategoriaDeficiencia.COGNITIVA,  pessoa.getDeficiencia().getCategoria());
    }
}
