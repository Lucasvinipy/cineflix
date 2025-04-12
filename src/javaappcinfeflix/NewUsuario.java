/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaappcinfeflix;

import java.util.Date;

/**
 *
 * @author User
 */
public class NewUsuario {
    

public class Usuario {

    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private float numero;
    private Date dataNascimento;
    private String cidade;
    private String estado;
    private String pais;
    private PlanoInteresse planoInteresse;
    private Date dataCadastro;
    private boolean aceitouTermos;

    public enum PlanoInteresse {
        BASICO,
        COMPLETO
    }

    // Construtor completo
    public Usuario(int id, String nome, String sobrenome, String email, float numero, Date dataNascimento,
                   String cidade, String estado, String pais, PlanoInteresse planoInteresse, Date dataCadastro,
                   boolean aceitouTermos) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.numero = numero;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.planoInteresse = planoInteresse;
        this.dataCadastro = dataCadastro;
        this.aceitouTermos = aceitouTermos;
    }

    // Construtor vazio (se for usar setters depois)
    public Usuario() {
    }
 
 // Getters e Setters

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getSobrenome() {
    return sobrenome;
}

public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public float getNumero() {
    return numero;
}

public void setNumero(float numero) {
    this.numero = numero;
}

public Date getDataNascimento() {
    return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
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

public String getPais() {
    return pais;
}

public void setPais(String pais) {
    this.pais = pais;
}

public PlanoInteresse getPlanoInteresse() {
    return planoInteresse;
}

public void setPlanoInteresse(PlanoInteresse planoInteresse) {
    this.planoInteresse = planoInteresse;
}

public Date getDataCadastro() {
    return dataCadastro;
}

public void setDataCadastro(Date dataCadastro) {
    this.dataCadastro = dataCadastro;
}

public boolean isAceitouTermos() {
    return aceitouTermos;
}

public void setAceitouTermos(boolean aceitouTermos) {
    this.aceitouTermos = aceitouTermos;
}
   
    

   

}


    
    
    
    
    
    
}
