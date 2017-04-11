package ustc.maomao.patterns.composite;

import java.util.List;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         统计图页面
 *      
 */
public class ChartPage implements StatisView {
	
	private List<StatisView> views;

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.composite.StatisView#draw()
	 */
	@Override
	public void draw() {
		System.out.println("绘制统计图页面");
		for(StatisView v:views){
			v.draw();
		}
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(List<StatisView> views) {
		this.views = views;
	}
	
}
