package ustc.maomao.patterns.composite;

import java.util.ArrayList;
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

	private List<StatisView> views = new ArrayList<StatisView>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.composite.StatisView#draw()
	 */
	@Override
	public void draw() {
		System.out.println("绘制统计页面");
		for (StatisView v : views) {
			v.draw();
		}
	}

	/**
	 * @param view
	 *            to add
	 */
	public void addView(StatisView view) {
		views.add(view);
	}

	/**
	 * @param view
	 *            to remove
	 */
	public void removeView(StatisView view) {
		views.remove(view);
	}

}
