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
public class PerDesaCirebon2 extends JPanel {

    public PerDesaCirebon2() {
        CategoryDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(320, 600));
        this.add(chartPanel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //long data = B1Dao.getInstance().getCleanCount();
       dataset.setValue(B1Dao.getInstance().getByDesa("3209171002").size(),"1","Pasindangan");//Gunungjati
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171004").size(),"1","Klayan");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209171005").size()*/23,"1","Jatimerta");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209171006").size()*/1,"1","Astana");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171007").size(),"1","Kalisapu");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171008").size(),"1","Wanakaya");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171009").size(),"1"," Grogol");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209171010").size()*/2,"1","Babadan");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171013").size(),"1","Sambeng");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171014").size(),"1","Sirnabaya");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209171015").size(),"1","Mertasinga");       
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209090004").size()*/33,"1","Luwung");//mundu
        dataset.setValue(B1Dao.getInstance().getByDesa("3209090005").size(),"1","Waruduwur");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209090006").size(),"1","Citemu");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209090007").size(),"1","Bandengan");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209090008").size(),"1","Mundu Pesisir");       
        dataset.setValue(B1Dao.getInstance().getByDesa("3209180010").size(),"1","Bungko");//kapetakan
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209180018").size()*/9,"1","Grogol");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209180020").size(),"1","Kepetakan");
        dataset.setValue(B1Dao.getInstance().getByDesa("3209180021").size(),"1","Bungko Lor");
        dataset.setValue(/*B1Dao.getInstance().getByDesa("3209040009").size()*/5,"1","Pakusamben");//babakan
        dataset.setValue(B1Dao.getInstance().getByDesa("3209111001").size(),"1","Sampiran");//talun
        
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
                "Barchart Kab Cirebon 2", "Desa",
                "", dataset, PlotOrientation.HORIZONTAL, true, true, false);

        chart.addSubtitle(new TextTitle("Total data " + data));
        chart.setBackgroundPaint(Color.GREEN);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        CategoryItemRenderer renderer = new CustomRenderer(
                new Paint[]{Color.red, Color.red, Color.red,Color.red,Color.red,
                    Color.red,Color.red,Color.red,Color.red,Color.red,Color.red,
                    Color.yellow, Color.yellow,Color.yellow,Color.yellow,Color.yellow,
                    Color.cyan,Color.cyan,Color.cyan,Color.cyan,
                    Color.magenta, Color.pink}
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
        chartLegend.add(new LegendItem("Kec.Gunungjati", null, null, null, shape, Color.red));
        chartLegend.add(new LegendItem("Kec.Mundu", null, null, null, shape, Color.yellow));
        chartLegend.add(new LegendItem("Kec.Kapetakan", null, null, null, shape, Color.cyan));
        chartLegend.add(new LegendItem("Kec.Babakan", null, null, null, shape, Color.magenta));
        chartLegend.add(new LegendItem("Kec.Talun", null, null, null, shape, Color.pink));
        plot.setFixedLegendItems(chartLegend);
        chart.getLegend().setFrame(BlockBorder.NONE);

        return chart;
    }
}
