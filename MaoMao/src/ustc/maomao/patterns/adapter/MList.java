package ustc.maomao.patterns.adapter;

import java.util.HashMap;
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
 *         菜单列表目标类型接口
 * 
 */
public interface MList {

	/**
	 * @return List<HashMap<String,String>>类型菜单数据
	 */
	public List<HashMap<String, String>> getData();

}
