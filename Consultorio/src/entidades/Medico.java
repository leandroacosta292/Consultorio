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
public class Medico {
    
    private String crm;
    private int id_medico;
    private int pessoa_id;

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico;
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    /**
     * @return the pessoa_id
     */
    public int getPessoa_id() {
        return pessoa_id;
    }

    /**
     * @param pessoa_id the pessoa_id to set
     */
    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }
    
    
}
