/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author pretto
 */
public interface IDAO {

    ArrayList<Object> objs = new ArrayList<>();
    Object obj = new Object();

    public String salvar(Object o);

    public String atualizar(Object o);

    public String excluir(int id);

    public ArrayList<Object> consultarTodos();

    public ArrayList<Object> consultar(String criterio);

    public Object consultarId(int id);
}