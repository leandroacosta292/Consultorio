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
    private int medicoId;
    private int pessoaId;
    private int doencaId;

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

    /**
     * @return the doencaId
     */
    public int getDoencaId() {
        return doencaId;
    }

    /**
     * @param doencaId the doencaId to set
     */
    public void setDoencaId(int doencaId) {
        this.doencaId = doencaId;
    }

    
}
