/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Leandro
 */
public class Receituario {
    
    private int idReceituario;
    private String tipoMedicamento;
    private String nome;
    private String principioAtivo;
    private String laboratorio;
    private String concentracao;
    private String apresentacao;
    private String viaAdm;
    private String possologia;
    private int atendimentoMedId;

    /**
     * @return the idReceituario
     */
    public int getIdReceituario() {
        return idReceituario;
    }

    /**
     * @param idReceituario the idReceituario to set
     */
    public void setIdReceituario(int idReceituario) {
        this.idReceituario = idReceituario;
    }

    /**
     * @return the tipoMedicamento
     */
    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    /**
     * @param tipoMedicamento the tipoMedicamento to set
     */
    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the principioAtivo
     */
    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    /**
     * @param principioAtivo the principioAtivo to set
     */
    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    /**
     * @return the laboratorio
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * @return the concentracao
     */
    public String getConcentracao() {
        return concentracao;
    }

    /**
     * @param concentracao the concentracao to set
     */
    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }

    /**
     * @return the apresentacao
     */
    public String getApresentacao() {
        return apresentacao;
    }

    /**
     * @param apresentacao the apresentacao to set
     */
    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    /**
     * @return the viaAdm
     */
    public String getViaAdm() {
        return viaAdm;
    }

    /**
     * @param viaAdm the viaAdm to set
     */
    public void setViaAdm(String viaAdm) {
        this.viaAdm = viaAdm;
    }

    /**
     * @return the possologia
     */
    public String getPossologia() {
        return possologia;
    }

    /**
     * @param possologia the possologia to set
     */
    public void setPossologia(String possologia) {
        this.possologia = possologia;
    }

    /**
     * @return the atendimentoMedId
     */
    public int getAtendimentoMedId() {
        return atendimentoMedId;
    }

    /**
     * @param atendimentoMedId the atendimentoMedId to set
     */
    public void setAtendimentoMedId(int atendimentoMedId) {
        this.atendimentoMedId = atendimentoMedId;
    }
    
    
}
