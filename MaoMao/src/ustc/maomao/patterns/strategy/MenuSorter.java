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
 *         菜单排序接口
 * 
 */
public interface MenuSorter {
	/**
	 * 升序排列
	 * 
	 * @param dataSource
	 *            数据源
	 * @return 排序结果
	 */
	public List<MenuItem> asc(List<MenuItem> dataSource);

	/**
	 * 降序排列
	 * 
	 * @param dataSource
	 *            数据源
	 * @return 排序结果
	 */
	public List<MenuItem> desc(List<MenuItem> dataSource);
}
