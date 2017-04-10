
package ustc.maomao.patterns.abstractfac;

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
 *         抽象工厂模式测试器
 * 
 */
public class AbstractFacTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		        // 构造图表元素创建工厂
				ChartFac fac = new FlatChartFac();
				
				// 构造图表绘制对象
				CDrawer drawer = new CDrawer(fac);
				
				// 根据数据源绘制柱状图
				Data barData = new Data();
				drawer.drawBar(barData);

				//根据数据源绘制线状图
				Data lineData = new Data();
				drawer.drawLine(lineData);
				
				//根据数据源绘制饼状图
		        Data pieData=new Data();
		        drawer.drawPie(pieData);
		
	}

}
