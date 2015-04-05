/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.chart;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JPanel;
import monitoringentry.dao.B1Dao;
import monitoringentry.dao.KecamatanDao;
import monitoringentry.entity.Kabupaten;
import monitoringentry.entity.Kecamatan;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StackedBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Toshiba
 */
public class UploadedDataPerKecamatanByKabChart extends JPanel{
    
    private String kab;
    
    public UploadedDataPerKecamatanByKabChart(String kab) {
        this.kab = kab;
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 250));
        this.add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        List listKec = KecamatanDao.getInstance().getKecByKab(kab);
        Kecamatan kec;
        for(int i=0; i<listKec.size(); i++){
            kec = (Kecamatan) listKec.get(i);
            double clean = B1Dao.getInstance().getEntryCountByKec(kec.getId());
            double total = B1Dao.getInstance().getByKec(kec.getId()).size();
            double cp = clean/total;
            double bcp = total-cp;
            result.addValue(cp, "Sudah Dientry", kec.getNama());
            result.addValue(bcp, "Belum Dientry", kec.getNama());
        }
        return result;
    }
    
    private JFreeChart createChart(CategoryDataset categoryDataset){
        JFreeChart chart = ChartFactory.createStackedBarChart(new Kabupaten(kab).getNama(), "Kecamatan", "Persentase", categoryDataset, PlotOrientation.VERTICAL, true, true, false);
        chart.setBackgroundPaint(Color.white);

        CategoryPlot plot = (CategoryPlot)chart.getPlot();   
        plot.setBackgroundPaint(Color.lightGray);   
        plot.setRangeGridlinePaint(Color.white);
        
        NumberAxis rangeAxis2 = (NumberAxis) plot.getRangeAxis();
        rangeAxis2.setNumberFormatOverride(NumberFormat.getPercentInstance());
        
        StackedBarRenderer renderer = (StackedBarRenderer)plot.getRenderer();   
        renderer.setRenderAsPercentages(true);
        renderer.setDrawBarOutline(false);   
        renderer.setItemLabelsVisible(true);  

        renderer.setSeriesItemLabelGenerator(0, new StandardCategoryItemLabelGenerator());   
        renderer.setSeriesItemLabelGenerator(1, new StandardCategoryItemLabelGenerator());       
        return chart;
    }
    
}
