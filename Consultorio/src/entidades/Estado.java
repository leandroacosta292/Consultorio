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
public class Estado {
    
    private int EstadoId;
    private String Nome;
    private String Sigla;

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
     * @return the Sigla
     */
    public String getSigla() {
        return Sigla;
    }

    /**
     * @param Sigla the Sigla to set
     */
    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    /**
     * @return the EstadoId
     */
    public int getEstadoId() {
        return EstadoId;
    }

    /**
     * @param EstadoId the EstadoId to set
     */
    public void setEstadoId(int EstadoId) {
        this.EstadoId = EstadoId;
    }
    
    
}
