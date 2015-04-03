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
public class PerDesaCirebon extends JPanel {

    public PerDesaCirebon() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(320, 600));
        this.add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //long data = B1Dao.getInstance().getCleanCount();
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041003").size(), "1", "Kalimekar");//gebang
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041005").size(), "1", "Gagasari");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041006").size(), "1", "Kalipasung");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209041007").size()*/12, "1", "Gebang Kulon");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041008").size(), "1", "Gebang");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041009").size(), "1", "Gebang Udik");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041010").size(), "1", "Gebang Ilir");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209041011").size()*/7, "1", "Gebang Mekar");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209041012").size(), "1", "Pelayangan");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209080009").size(), "1", "Kanci Kulon");//Astanajapura
        dataset.setValue(B1Dao.getInstance().getByDesa("3209080017").size(), "1", "Japurabakti");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209081001").size(), "1", "Astanamukti");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209081002").size()*/23, "1", "Pengarengan");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209081009").size(), "1", "Ender");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209181001").size(), "1", "Sura. Kulon");//Suranenggala
        dataset.setValue(B1Dao.getInstance().getByDesa("3209181003").size(), "1", "Keraton");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209181004").size()*/27, "1", "Purwawinangun");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209181005").size(), "1", "Muara");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209181006").size(), "1", "Karangrejo");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209181007").size(), "1", "Sura. Kidul");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209030017").size()*/1, "1", "Ambulu");//losari
        dataset.setValue(B1Dao.getInstance().getByDesa("3209030018").size(), "1", "Tawangsari");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209050008").size()*/8, "1", "Tambelang");//karangsembung

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
                "Barchart Kab Cirebon", "Desa",
                "", dataset, PlotOrientation.HORIZONTAL, true, true, false);

        chart.addSubtitle(new TextTitle("Total data " + data));
        chart.setBackgroundPaint(Color.GREEN);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        CategoryItemRenderer renderer = new CustomRenderer(
                new Paint[]{Color.red, Color.red, Color.red,Color.red,Color.red,
                    Color.red,Color.red,Color.red,Color.red,
                    Color.yellow, Color.yellow,Color.yellow,Color.yellow,Color.yellow,
                    Color.cyan,Color.cyan,Color.cyan,Color.cyan,Color.cyan,Color.cyan,
                    Color.magenta, Color.magenta, Color.pink}
        );
        plot.setRenderer(renderer);
        CategoryItemLabelGenerator generator
                = new StandardCategoryItemLabelGenerator("{2}",
                        NumberFormat.getInstance());
        renderer.setBaseItemLabelGenerator(generator);
        renderer.setBaseItemLabelFont(new Font("SansSerif", Font.PLAIN, 12));
        renderer.setBaseItemLabelsVisible(true);
        renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(
                ItemLabelAnchor.OUTSIDE4, TextAnchor.BASELINE_RIGHT));

        CategoryAxis axis = plot.getDomainAxis();
        axis.setLowerMargin(0.013);
        axis.setUpperMargin(0.003);
        //axis.setCategoryMargin(-.05);
        BarRenderer barRenderer = (BarRenderer) chart.getCategoryPlot().getRenderer();
        barRenderer.setItemMargin(0.5);
        barRenderer.setItemLabelAnchorOffset(-.8);
        barRenderer.setDrawBarOutline(false);
        barRenderer.setShadowVisible(false);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setLabel("Data Clean");
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        LegendItemCollection chartLegend = new LegendItemCollection();
        Shape shape = new Rectangle(15, 15);
        chartLegend.add(new LegendItem("Kec.Gebang", null, null, null, shape, Color.red));
        chartLegend.add(new LegendItem("Kec.Astanajapura", null, null, null, shape, Color.yellow));
        chartLegend.add(new LegendItem("Kec.Suranenggala", null, null, null, shape, Color.cyan));
        chartLegend.add(new LegendItem("Kec.Losari", null, null, null, shape, Color.magenta));
        chartLegend.add(new LegendItem("Kec.Karangsembung", null, null, null, shape, Color.pink));
        plot.setFixedLegendItems(chartLegend);
        chart.getLegend().setFrame(BlockBorder.NONE);

        return chart;
    }
}
