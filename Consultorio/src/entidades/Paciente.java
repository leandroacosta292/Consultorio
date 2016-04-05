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
public class Paciente {
    
    private int PessoaId;
    private String Responsavel;
    private String TelResponsavel;

    /**
     * @return the PessoaId
     */
    public int getPessoaId() {
        return PessoaId;
    }

    /**
     * @param PessoaId the PessoaId to set
     */
    public void setPessoaId(int PessoaId) {
        this.PessoaId = PessoaId;
    }

    /**
     * @return the Responsavel
     */
    public String getResponsavel() {
        return Responsavel;
    }

    /**
     * @param Responsavel the Responsavel to set
     */
    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    /**
     * @return the TelResponsavel
     */
    public String getTelResponsavel() {
        return TelResponsavel;
    }

    /**
     * @param TelResponsavel the TelResponsavel to set
     */
    public void setTelResponsavel(String TelResponsavel) {
        this.TelResponsavel = TelResponsavel;
    }
    
    
}
