/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.chart;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import monitoringentry.dao.B1Dao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Toshiba
 */
public class PerKecamatanDiCirebonChart extends JPanel{
    public PerKecamatanDiCirebonChart(){
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(300, 300));
        this.add(chartPanel);
    }
    
        private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        long data = B1Dao.getInstance().getCleanCountByKab("3209");
        dataset.setValue("Kecamatan Losari", B1Dao.getInstance().getByKec("3209030").size());
        dataset.setValue("Kecamatan Pabedilan", B1Dao.getInstance().getByKec("3209031").size());
        dataset.setValue("Kecamatan Babakan", B1Dao.getInstance().getByKec("3209040").size());
        dataset.setValue("Kecamatan Gebang", B1Dao.getInstance().getByKec("3209041").size());
        dataset.setValue("Kecamatan Karangsembung", B1Dao.getInstance().getByKec("3209050").size());
        dataset.setValue("Kecamatan Astanajapura", B1Dao.getInstance().getByKec("3209080").size());
        dataset.setValue("Kecamatan Pangenan", B1Dao.getInstance().getByKec("3209081").size());
        dataset.setValue("Kecamatan Mundu", B1Dao.getInstance().getByKec("3209090").size());
        dataset.setValue("Kecamatan Talun", B1Dao.getInstance().getByKec("3209111").size());
        dataset.setValue("Kecamatan Gunungjati", B1Dao.getInstance().getByKec("3209171").size());
        dataset.setValue("Kecamatan Kapetakan", B1Dao.getInstance().getByKec("3209180").size());
        dataset.setValue("Kecamatan Suranenggala", B1Dao.getInstance().getByKec("3209181").size());
        return dataset;
    }

    
    private JFreeChart createChart(PieDataset dataset){
        JFreeChart chart = ChartFactory.createPieChart("Summary Data Masuk Kabupaten Cirebon", dataset, true, true, false);
        chart.removeLegend();
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint("Data Clean", Color.green);
        plot.setSectionPaint("Belum Clean", Color.red);
        plot.setExplodePercent("Data Clean", 0.10);
        plot.setSimpleLabels(true);

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        return chart;

    }
}
