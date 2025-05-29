package br.com.fiap.globalsolution.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "global_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoa;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;
    private String cidade = "São Paulo";
    private String estado = "SP";
    private String profissao;
    @Enumerated(EnumType.STRING)
    private TipoDeficiencia pcd;
    private String senha;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public TipoDeficiencia getPcd() {
        return pcd;
    }

    public void setPcd(TipoDeficiencia pcd) {
        this.pcd = pcd;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
