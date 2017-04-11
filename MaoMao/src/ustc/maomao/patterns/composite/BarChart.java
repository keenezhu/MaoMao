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
 *         柱状图
 *      
 */
public class BarChart implements StatisView {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.composite.StatisView#draw()
	 */
	@Override
	public void draw() {
		System.out.println("绘制柱状图...");
	}

}
