package ustc.maomao.patterns.abstractfac;

import ustc.maomao.patterns.support.Data;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         统计图表绘制器，是使用图表元素创建工厂的客户端
 *      
 */
public class CDrawer {
	
	private ChartFac  chartFac;
	public CDrawer(ChartFac fac){
		chartFac=fac;
	}
	/**
	 * 绘制饼状图元素
	 * @param data 图表数据源
	 */
	public void drawPie(Data data){
		Pie pie=chartFac.createPie(data);
		pie.draw();
	}
	/**
	 * 绘制线状图元素
	 * @param data 图表数据源
	 */
	public void drawLine(Data data){
		Line line=chartFac.createLine(data);
		line.draw();
	}
	
	/**
	 * 绘制柱状图元素
	 * @param data 图表数据源
	 */
	public void drawBar(Data data){
		Bar bar=chartFac.createBar(data);
		bar.draw();
	}
}
