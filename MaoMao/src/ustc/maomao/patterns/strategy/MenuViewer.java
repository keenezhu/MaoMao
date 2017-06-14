package ustc.maomao.patterns.strategy;

import java.util.List;

import ustc.maomao.patterns.support.MenuItem;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜单浏览类
 * 
 */
public class MenuViewer {

	private List<MenuItem> items;// 菜单列表

	private MenuSorter sorter;// 排序策略

	/**
	 * 升序浏览
	 */
	public void displayAsc() {
		sorter.asc(items);
		for (MenuItem item : items) {
			System.out.println(item.getmName() + "--**--" + item.getmPrice());
		}
	}

	/**
	 * 降序浏览
	 */
	public void displayDesc() {
		sorter.desc(items);
		for (MenuItem item : items) {
			System.out.println(item.getmName() + "--**--" + item.getmPrice());
		}
	}

	/**
	 * @param sorter
	 *            the sorter to set
	 */
	public void setSorter(MenuSorter sorter) {
		this.sorter = sorter;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

}
