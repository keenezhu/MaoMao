package ustc.maomao.patterns.composite;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import ustc.maomao.patterns.abstractfac.ChartFac;
import ustc.maomao.patterns.abstractfac.CrystalChartFac;
import ustc.maomao.patterns.support.Data;
import ustc.maomao.patterns.support.PatternTester;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         组合模式测试器
 * 
 */
public class CompositeTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {

		ChartFac chartFac = new CrystalChartFac();
		Data chartData = new Data();

		// 构造一个统计视图单页page1
		ChartPage page1 = new ChartPage();
		page1.addView(chartFac.createBar(chartData));
		page1.addView(chartFac.createPie(chartData));

		// 构造一个统计视图单页page2
		ChartPage page2 = new ChartPage();
		page2.addView(chartFac.createBar(chartData));
		page2.addView(chartFac.createLine(chartData));

		// 构造一个含单页的统计视图组合页
		ChartPage multiPages = new ChartPage();
		multiPages.addView(page1);
		multiPages.addView(page2);

		// 使用ChartViewer显示统计视图页面
		ChartViewer cv = new ChartViewer();
		cv.display(multiPages);

	}

}
