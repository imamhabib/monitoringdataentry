/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkl54.util;

import java.util.List;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public interface AbstractService<T> {
    
    public void save(T t);
    public void update(T t);
    public void delete(T t);
    public T getById(Object id);
    public List<T> getAll();
}
