/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import monitoringentry.entity.Errorlist;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ErrorListDao extends DaoService<Errorlist> {

    private ErrorListDao() {
        super(Errorlist.class);
    }

    public static ErrorListDao getInstance() {
        return ErrorListDaoHolder.INSTANCE;
    }

    private static class ErrorListDaoHolder {

        private static final ErrorListDao INSTANCE = new ErrorListDao();
    }

    public List<Errorlist> getError() {
        return entity().createQuery("Select e from Errorlist e").getResultList();
    }

}
