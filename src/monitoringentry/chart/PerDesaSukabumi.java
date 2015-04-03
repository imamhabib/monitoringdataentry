/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.chart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.text.NumberFormat;
import javax.swing.JPanel;
import monitoringentry.dao.B1Dao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author gal
 */
public class PerDesaSukabumi extends JPanel {

    public PerDesaSukabumi() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(320, 600));
        this.add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //long data = B1Dao.getInstance().getCleanCount();

        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202030001").size()*/6, "1", "Pasiripis");//surade
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202030002").size()*/33, "1", "Buniwangi");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202030003").size()*/23, "1", "Cipendeuy");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202030017").size()*/13, "1", "Sukatani");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202110006").size()*/33, "1", "Pelabuhanratu");//palabuhan
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202110007").size()*/13, "1", "Citepus");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202110009").size()*/3, "1", "  Buniwangi");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202110011").size()*/3, "1", "Pasirsuren");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202110013").size()*/33, "1", "Jayanti");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202160006").size()*/27, "1", " Buniwangi");//geger bitung
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202190003").size()*/31, "1", "Cikahuripan");//kadudampit
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202250001").size()*/7, "1", " Sukatani");//parakan salak

        return dataset;
    }

    class CustomRenderer extends BarRenderer {

        private final Paint[] colors;

        public CustomRenderer(final Paint[] colors) {
            this.colors = colors;
        }

        @Override
        public Paint getItemPaint(final int row, final int column) {
            return this.colors[column % this.colors.length];
        }
    }

    private JFreeChart createChart(CategoryDataset dataset) {
        long data = B1Dao.getInstance().getCleanCountByKab("3209");
        JFreeChart chart = ChartFactory.createBarChart3D(
                "Barchart Kab Sukabumi 1", "Desa",
                "", dataset, PlotOrientation.HORIZONTAL, true, true, false);

        chart.addSubtitle(new TextTitle("Total data " + data));
        chart.setBackgroundPaint(Color.GREEN);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        CategoryItemRenderer renderer = new CustomRenderer(
                new Paint[]{Color.red, Color.red, Color.red,
                    Color.red, Color.yellow, Color.yellow,
                    Color.yellow, Color.yellow, Color.yellow,
                    Color.magenta, Color.blue, Color.pink}
        );
        plot.setRenderer(renderer);
        CategoryItemLabelGenerator generator
                = new StandardCategoryItemLabelGenerator("{2}",
                        NumberFormat.getInstance());
        renderer.setBaseItemLabelGenerator(generator);
        renderer.setBaseItemLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        renderer.setBaseItemLabelsVisible(true);
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.OUTSIDE3, TextAnchor.BASELINE_RIGHT));

        CategoryAxis axis = plot.getDomainAxis();
        axis.setLowerMargin(0.013);
        axis.setUpperMargin(0.003);
        //axis.setCategoryMargin(-.05);
        BarRenderer barRenderer = (BarRenderer) chart.getCategoryPlot().getRenderer();
        barRenderer.setItemMargin(0.5);
        barRenderer.setItemLabelAnchorOffset(-1.0);
        barRenderer.setDrawBarOutline(false);
        barRenderer.setShadowVisible(false);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setLabel("Data Clean");
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        LegendItemCollection chartLegend = new LegendItemCollection();
        Shape shape = new Rectangle(15, 15);
        chartLegend.add(new LegendItem("Kec.Surade", null, null, null, shape, Color.red));
        chartLegend.add(new LegendItem("Kec.Palabuhanratu", null, null, null, shape, Color.yellow));
        chartLegend.add(new LegendItem("Kec.Geger Bitung", null, null, null, shape, Color.magenta));
        chartLegend.add(new LegendItem("Kec.Kadudampit", null, null, null, shape, Color.blue));
        chartLegend.add(new LegendItem("Kec.Parakan Salak", null, null, null, shape, Color.pink));
        plot.setFixedLegendItems(chartLegend);
        chart.getLegend().setFrame(BlockBorder.NONE);

        return chart;
    }
}
