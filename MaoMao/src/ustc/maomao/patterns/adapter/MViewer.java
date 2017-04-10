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
 *         显示List<HashMap<String,String>>菜单数据的视图类型
 * 
 */
public class MViewer {
	
	/**
	 * 显示List<HashMap<String,String>>菜单数据
	 * @param data 提供List<HashMap<String,String>>菜单数据的目标类型
	 */
	public void displayMenuList(MList dataSource){
	    List<HashMap<String,String>> data=dataSource.getData();
	    for(HashMap<String,String> item:data){
	    	System.out.println("渲染:"+item.get("mType")+"##"+item.get("mName")+"##"+item.get("mPrice"));
	    }
	}	

}
