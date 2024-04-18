package com.motorista_app.motorista_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idMotorista;
    private String tipoFormulario;
    private String luzes;
    private String freios;
    private String pneus;
    private String relato;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdMotorista() {
        return idMotorista;
    }
    public void setIdMotorista(String idMotorista) {
        this.idMotorista = idMotorista;
    }
    public String getLuzes() {
        return luzes;
    }
    public void setLuzes(String luzes) {
        this.luzes = luzes;
    }
    public String getFreios() {
        return freios;
    }
    public void setFreios(String freios) {
        this.freios = freios;
    }
    public String getPneus() {
        return pneus;
    }
    public void setPneus(String pneus) {
        this.pneus = pneus;
    }
    public String getRelato() {
        return relato;
    }
    public void setRelato(String relato) {
        this.relato = relato;
    }
    public String getTipoFormulario() {
        return tipoFormulario;
    }
    public void setTipoFormulario(String tipoFormulario) {
        this.tipoFormulario = tipoFormulario;
    }

    


    
    
}
