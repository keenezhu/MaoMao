package ustc.maomao.patterns.strategy;

import java.util.Comparator;
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
 *         按菜单价格排序
 * 
 */
public class MPriceSorter implements MenuSorter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.strategy.MenuSorter#asc(java.util.List)
	 */
	@Override
	public List<MenuItem> asc(List<MenuItem> dataSource) {
		// TODO Auto-generated method stub
		dataSource.sort(new Comparator<MenuItem>() {

			@Override
			public int compare(MenuItem o1, MenuItem o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getmPrice() - o2.getmPrice());
			}

		});
		return dataSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.strategy.MenuSorter#desc(java.util.List)
	 */
	@Override
	public List<MenuItem> desc(List<MenuItem> dataSource) {
		dataSource.sort(new Comparator<MenuItem>() {

			@Override
			public int compare(MenuItem o1, MenuItem o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getmPrice() - o1.getmPrice());
			}

		});
		return dataSource;
	}

}
