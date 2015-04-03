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
public class PerDesaSukabumi2 extends JPanel {

    public PerDesaSukabumi2() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(320, 600));
        this.add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //long data = B1Dao.getInstance().getCleanCount();

        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202111003").size()*/22, "1", "Loji");//simpenan
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202111004").size()*/4, "1", "Cidadap");//simpenan
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202111007").size()*/11, "1", "Sangrawayan");//simpenan
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202020008").size()*/5, "1", "Cikangkung");//ciracap
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202020002").size()*/17, "1", "Ujung Genteng");//ciracap
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202081002").size()*/3, "1", " Cidadap");//cidadap
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202290001").size()*/3, "1", "Pasirbaru");//cisolok
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202290002").size()*/3, "1", "Cikahuripan");//cisolok
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202290003").size()*/13, "1", "Cisolok");//cisolok
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202010002").size()*/3, "1", "Ciwaru");//ciemas
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202010006").size()*/13, "1", "Girimukti");//ciemas
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202010007").size()*/31, "1", "Mandrajaya");//ciemas
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3202010008").size()*/3, "1", "Mekarsari");//ciemas

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
                "Barchart Kab Sukabumi 2", "Desa",
                "", dataset, PlotOrientation.HORIZONTAL, true, true, false);

        chart.addSubtitle(new TextTitle("Total data " + data));
        chart.setBackgroundPaint(Color.GREEN);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        CategoryItemRenderer renderer = new CustomRenderer(
                new Paint[]{Color.red, Color.red, Color.red,
                    Color.yellow, Color.yellow, Color.cyan,
                    Color.magenta, Color.magenta,Color.magenta,
                    Color.pink,Color.pink,Color.pink,Color.pink}
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
        chartLegend.add(new LegendItem("Kec.Simpenan", null, null, null, shape, Color.red));
        chartLegend.add(new LegendItem("Kec.Ciracap", null, null, null, shape, Color.yellow));
        chartLegend.add(new LegendItem("Kec.Cidadap", null, null, null, shape, Color.cyan));
        chartLegend.add(new LegendItem("Kec.Cisolok", null, null, null, shape, Color.magenta));
        chartLegend.add(new LegendItem("Kec.Ciemas", null, null, null, shape, Color.pink));
        plot.setFixedLegendItems(chartLegend);
        chart.getLegend().setFrame(BlockBorder.NONE);

        return chart;
    }
}
