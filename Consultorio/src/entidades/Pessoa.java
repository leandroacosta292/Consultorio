/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author leandro
 */
public class Pessoa {

    private int ID;
    private String Nome;
    private String DataNasc;
    private String Sexo;
    private String Rg;
    private String CPF;
    private String SUS;
    private String NomeMae;
    private String Fone;
    private String Fone2;
    private int EnderecoId;
    private boolean ativo;
    private boolean medico;

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
     * @return the DataNasc
     */
    public String getDataNasc() {
        return DataNasc;
    }

    /**
     * @param DataNasc the DataNasc to set
     */
    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Rg
     */
    public String getRg() {
        return Rg;
    }

    /**
     * @param Rg the Rg to set
     */
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the NomeMae
     */
    public String getNomeMae() {
        return NomeMae;
    }

    /**
     * @param NomeMae the NomeMae to set
     */
    public void setNomeMae(String NomeMae) {
        this.NomeMae = NomeMae;
    }

    /**
     * @return the Fone
     */
    public String getFone() {
        return Fone;
    }

    /**
     * @param Fone the Fone to set
     */
    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    /**
     * @return the Fone2
     */
    public String getFone2() {
        return Fone2;
    }

    /**
     * @param Fone2 the Fone2 to set
     */
    public void setFone2(String Fone2) {
        this.Fone2 = Fone2;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the SUS
     */
    public String getSUS() {
        return SUS;
    }

    /**
     * @param SUS the SUS to set
     */
    public void setSUS(String SUS) {
        this.SUS = SUS;
    }

    /**
     * @return the EnderecoId
     */
    public int getEnderecoId() {
        return EnderecoId;
    }

    /**
     * @param EnderecoId the EnderecoId to set
     */
    public void setEnderecoId(int EnderecoId) {
        this.EnderecoId = EnderecoId;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the medico
     */
    public boolean isMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(boolean medico) {
        this.medico = medico;
    }

}
