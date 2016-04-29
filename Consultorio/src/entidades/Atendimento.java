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
public class Atendimento {
    
    private int idAtendimento;
    private String atendimento;
    private String conduta;
    private int receituarioId;
    private int medicoId;
    private int pessoaId;

    /**
     * @return the idAtendimento
     */
    public int getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * @param idAtendimento the idAtendimento to set
     */
    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    /**
     * @return the atendimento
     */
    public String getAtendimento() {
        return atendimento;
    }

    /**
     * @param atendimento the atendimento to set
     */
    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    /**
     * @return the conduta
     */
    public String getConduta() {
        return conduta;
    }

    /**
     * @param conduta the conduta to set
     */
    public void setConduta(String conduta) {
        this.conduta = conduta;
    }

    /**
     * @return the receituarioId
     */
    public int getReceituarioId() {
        return receituarioId;
    }

    /**
     * @param receituarioId the receituarioId to set
     */
    public void setReceituarioId(int receituarioId) {
        this.receituarioId = receituarioId;
    }

    /**
     * @return the medicoId
     */
    public int getMedicoId() {
        return medicoId;
    }

    /**
     * @param medicoId the medicoId to set
     */
    public void setMedicoId(int medicoId) {
        this.medicoId = medicoId;
    }

    /**
     * @return the pessoaId
     */
    public int getPessoaId() {
        return pessoaId;
    }

    /**
     * @param pessoaId the pessoaId to set
     */
    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    
}
