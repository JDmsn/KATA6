package kata6;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.PlotOrientation;

public class HistogramDisplay<T> extends ApplicationFrame {    
    private final Histogram<T> hm;
    private final String aNme;
    
    public HistogramDisplay(Histogram<T> hm, String htlName) {
        super("HISTOGRAMA");
        this.hm = hm;
        this.aNme = htlName;
        setContentPane(createPanel());
        pack();
    }
    
    private ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(600, 400));
        return chartPanel;      
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dt) {
        JFreeChart chart = ChartFactory.createBarChart(null, aNme, "Número", dt, PlotOrientation.VERTICAL, false, false, false);
        return chart;            
    }
    
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dt = new DefaultCategoryDataset();
        for (T key : hm.keySet()) {
            dt.addValue(hm.get(key), "", (Comparable) key);
        }
        return dt;
    }
    
    public void execute() {
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
