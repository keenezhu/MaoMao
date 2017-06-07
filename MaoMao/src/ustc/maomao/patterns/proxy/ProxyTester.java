package ustc.maomao.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.support.MenuItem;
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
 *         代理模式测试器
 *      
 */
public class ProxyTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		
		//构造菜单项列表数据源
		List<MenuItem> menuItems=new ArrayList<MenuItem>();
		for(int i=0;i<10;i++){
			MenuItem item=new MenuItem();
			item.setmName("item"+i);
			item.setmPrice(i);
			MenuImage image=new MenuImageProxy();
			item.setmImage(image);
			menuItems.add(item);
		}
		//显示菜单项列表
		for(MenuItem item:menuItems){
			item.display();
		}	
		
	}

}
