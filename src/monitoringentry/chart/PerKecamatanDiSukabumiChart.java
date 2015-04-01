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
public class PerKecamatanDiSukabumiChart extends JPanel{
    public PerKecamatanDiSukabumiChart(){
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(300, 300));
        this.add(chartPanel);
    }
    
        private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        long data = B1Dao.getInstance().getCleanCountByKab("3202");
        dataset.setValue("Kecamatan Ciemas", B1Dao.getInstance().getByKec("3202010").size());
        dataset.setValue("Kecamatan Ciracap", B1Dao.getInstance().getByKec("3202020").size());
        dataset.setValue("Kecamatan Surade", B1Dao.getInstance().getByKec("3202030").size());
        dataset.setValue("Kecamatan Cidadap", B1Dao.getInstance().getByKec("3202081").size());
        dataset.setValue("Kecamatan Pelabuhanratu", B1Dao.getInstance().getByKec("3202110").size());
        dataset.setValue("Kecamatan Simpenan", B1Dao.getInstance().getByKec("3202111").size());
        dataset.setValue("Kecamatan Geger Bitung", B1Dao.getInstance().getByKec("3202160").size());
        dataset.setValue("Kecamatan Kadudampit", B1Dao.getInstance().getByKec("3202190").size());
        dataset.setValue("Kecamatan Parakan Salak", B1Dao.getInstance().getByKec("3202250").size());
        dataset.setValue("Kecamatan Cisolok", B1Dao.getInstance().getByKec("3202290").size());
        
        return dataset;
    }

    
    private JFreeChart createChart(PieDataset dataset){
        JFreeChart chart = ChartFactory.createPieChart("Summary Data Masuk Kabupaten Sukabumi", dataset, true, true, false);
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