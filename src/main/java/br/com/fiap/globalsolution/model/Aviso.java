package br.com.fiap.globalsolution.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "global_aviso")
public class Aviso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAviso;
    @Enumerated(EnumType.STRING)
    private Ocorrencia ocorrencia;
    @Enumerated(EnumType.STRING)
    private Gravidade gravidade;
    private String localizacao;
    private LocalDateTime dataHora;

    public Long getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(Long idAviso) {
        this.idAviso = idAviso;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Gravidade getGravidade() {
        return gravidade;
    }

    public void setGravidade(Gravidade gravidade) {
        this.gravidade = gravidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
