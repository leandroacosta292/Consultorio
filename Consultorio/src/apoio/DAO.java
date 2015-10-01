/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.util.List;

/**
 *
 * @author leandro
 */
public interface DAO {
    
        public void salvar(Object bean);

        public void atualizar(Object bean);

        public void deletar(int id);

        public Object getById(int id);

        public List<Object> getAll();
    
    
}
