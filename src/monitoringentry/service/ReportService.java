/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import monitoringentry.dao.ErrorListDao;
import monitoringentry.entity.Errorlist;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author Habib
 */
public class ReportService {
    
    private ReportService() {
    }
    
    public static ReportService getInstance() {
        return ReportServiceHolder.INSTANCE;
    }
    
    private static class ReportServiceHolder {

        private static final ReportService INSTANCE = new ReportService();
    }
    
    public JasperPrint getReportError() {
        try {
            List<Errorlist> list = ErrorListDao.getInstance().getError();
            JRDataSource dataSource = new JRBeanCollectionDataSource(list);
            Map<String, Object> parameters = new HashMap<>();
            parameters.put(JRParameter.REPORT_DATA_SOURCE, dataSource);
            JasperPrint print = JasperFillManager.fillReport(getClass().getResourceAsStream("/reports/Error.jasper"), parameters);
            return print;
        } catch (JRException ex) {
            Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
