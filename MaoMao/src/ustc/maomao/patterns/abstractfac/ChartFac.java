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
 *         创建图表元素的抽象工厂
 *      
 */
public abstract class ChartFac {
	
	
	/**
	 * @param data 图表数据源
	 * @return Line 线状图
	 */
	public abstract Line createLine(Data data);
	
	/**
	 * @param data 图表数据源
	 * @return Pie 饼状图
	 */
	public abstract Pie createPie(Data data);
	
	/**
	 * @param data 图表数据源
	 * @return Bar 柱状图
	 */
	public abstract Bar createBar(Data data);

}
