/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.chart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import monitoringentry.dao.B1Dao;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlotState;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.text.TextUtilities;
import org.jfree.ui.HorizontalAlignment;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author gal
 */
public class UploadedDataChart extends JPanel {

    public UploadedDataChart() {
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(300, 300));
        this.add(chartPanel);
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        long data = B1Dao.getInstance().getRowCount()+212;
        dataset.setValue("Data Masuk", data);
        dataset.setValue("Belum dientry", (1888 - data));
        return dataset;
    }

    static class CustomRingPlot extends RingPlot {

        private final Font centerTextFont;
        private final Color centerTextColor;

        public CustomRingPlot(PieDataset dataset) {
            super(dataset);
            this.centerTextFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);
            this.centerTextColor = Color.LIGHT_GRAY;
        }

        @Override
        protected void drawItem(Graphics2D g2, int section,
                Rectangle2D dataArea, PiePlotState state, int currentPass) {
            super.drawItem(g2, section, dataArea, state, currentPass);
            if (currentPass == 1 && section == 0) {
                Number n = Math.round((this.getDataset().getValue(section)).doubleValue());
                String string = n.toString();
                double dob = (Double.parseDouble(string)) * 100 / 1888;
                String persen = null;
                if (dob <= 100) {
                    persen = String.format("%.2f%%", dob).replace(".", ",");
                } else {
                    persen = "Overload";
                }
                g2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
                g2.setPaint(Color.green);
                TextUtilities.drawAlignedString(persen, g2,
                        (float) dataArea.getCenterX(),
                        (float) dataArea.getCenterY(),
                        TextAnchor.CENTER);

                g2.setFont(this.centerTextFont);
                g2.setPaint(this.centerTextColor);
                TextUtilities.drawAlignedString(string, g2,
                        (float) dataArea.getCenterX(),
                        (float) dataArea.getCenterY() - 5,
                        TextAnchor.BOTTOM_CENTER);

            }
        }

    }

    private static JFreeChart createChart(PieDataset dataset) {
        CustomRingPlot plot = new CustomRingPlot(dataset);
        JFreeChart chart = new JFreeChart("Jumlah Data masuk",
                JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        chart.setBackgroundPaint(new GradientPaint(new Point(0, 0),
                Color.DARK_GRAY, new Point(400, 200), Color.blue));

        TextTitle t = chart.getTitle();
        t.setHorizontalAlignment(HorizontalAlignment.CENTER);
        t.setPaint(new Color(240, 240, 240));
        t.setFont(new Font("Arial", Font.BOLD, 24));

        plot.setBackgroundPaint(null);
        plot.setOutlineVisible(false);
        plot.setLabelGenerator(null);
        plot.setSectionPaint("Data Masuk", Color.white);
        plot.setSectionPaint("Belum dientry", new Color(100, 100, 100));
        plot.setSectionDepth(0.12);
        plot.setSectionOutlinesVisible(false);
        plot.setShadowPaint(null);

        return chart;

    }

}
