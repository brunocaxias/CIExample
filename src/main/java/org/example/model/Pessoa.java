package  org.example.model;

import org.example.model.enums.Etinia;
import org.example.model.enums.Sexo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private String contato;
    private String rg;
    private Double rendaFamiliar;
    private Etinia etinia;
    private Sexo sexo;
    private Deficiencia deficiencia;

    public Pessoa(String nome, String cpf, String email, LocalDate dataNascimento, String contato, String rg, Double rendaFamiliar, Etinia etinia, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.contato = contato;
        this.rg = rg;
        this.rendaFamiliar = rendaFamiliar;
        this.etinia = etinia;
        this.sexo = sexo;
        this.deficiencia = null;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.deficiencia = null;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(Double rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public Etinia getEtinia() {
        return etinia;
    }

    public void setEtinia(Etinia etinia) {
        this.etinia = etinia;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Deficiencia getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(Deficiencia deficiencia) {
        this.deficiencia = deficiencia;
    }

}
