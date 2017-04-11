package ustc.maomao.patterns.composite;

import java.util.ArrayList;
import java.util.List;

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

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		
		//构造一个统计视图单页
		ChartPage page1=new ChartPage();
        PieChart page1Pie=new PieChart();
        BarChart page1Bar=new BarChart();        
        List<StatisView> page1Views=new ArrayList<StatisView>();
        page1Views.add(page1Pie);
        page1Views.add(page1Bar);        
        page1.setViews(page1Views);
        
        //构造一个含单页的统计视图组合页
        ChartPage pages=new ChartPage();
        List<StatisView> views=new ArrayList<StatisView>();
        BarChart pagesBar=new BarChart();
        views.add(pagesBar);
        views.add(page1);
        pages.setViews(views);
        
        //使用ChartViewer显示统计视图页面
        ChartViewer cv=new ChartViewer();
        cv.display(pages);
        
	}

}
