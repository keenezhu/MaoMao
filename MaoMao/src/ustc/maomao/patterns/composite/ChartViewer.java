package ustc.maomao.patterns.composite;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         统计视图显示的客户端
 *      
 */
public class ChartViewer {
	
	/**
	 * 用于显示给定的统计视图，而不区分统计视图的类型是Pie，Bar，Line还是ChartPage
	 * @param view 显示的统计视图
	 */
	public void display(StatisView view){
		view.draw();
	}

}
