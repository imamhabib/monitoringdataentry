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
 * @author Habib
 */
public class UploadedDataChart extends JPanel{

    public UploadedDataChart() {
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(300, 300));
        this.add(chartPanel);
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        long data = B1Dao.getInstance().getRowCount();
        dataset.setValue("Data Masuk", B1Dao.getInstance().getRowCount());
        dataset.setValue("Belum dientry", (2000-data));
        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart("Summary Data Masuk", dataset, true, true, false);
        chart.removeLegend();
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint("Data Masuk", Color.BLUE);
        plot.setSectionPaint("Belum dientry", Color.red);
        plot.setExplodePercent("Data Masuk", 0.10);
        plot.setSimpleLabels(true);

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        return chart;
    }
    
    
}
