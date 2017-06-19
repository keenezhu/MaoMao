package ustc.maomao.patterns.adapter;

import java.util.ArrayList;
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
 *         菜单数据源
 * 
 */
public class MData {
	/**
	 * @return List<MenuItem>类型菜单数据
	 */
	public List<MenuItem> getMenuItems() {
		List<MenuItem> data = new ArrayList<MenuItem>();
		for (int i = 0; i < 10; i++) {
			MenuItem item = new MenuItem();
			item.setmType(i);
			item.setmName("MenuItem:" + i);
			item.setmPrice(i * 2.5f);
			data.add(item);
		}
		return data;
	}
}
