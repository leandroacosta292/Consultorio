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
public class Cidade {
    
    private String Nome;
    private String CEP;
    private int EstadoID;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Estado
     */
    public int getEstadoID() {
        return EstadoID;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstadoID(int Estado) {
        this.EstadoID = Estado;
    }
    
}
