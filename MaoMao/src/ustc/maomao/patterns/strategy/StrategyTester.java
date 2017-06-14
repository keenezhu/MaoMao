package ustc.maomao.patterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
 *         策略模式测试器
 *      
 */
public class StrategyTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		
		MenuViewer mv=new MenuViewer();
		MenuSorter ms=new MNameSorter();
		//构造测试数据
		List<MenuItem> data=new ArrayList<MenuItem>();
		Random r=new Random();
		for(int i=0;i<10;i++){
			int rint=r.nextInt(20);
			MenuItem item=new MenuItem();
			item.setmName("name:"+rint);
			item.setmPrice(rint-i);
			data.add(item);			
			}		
		mv.setItems(data);
		mv.setSorter(ms);
		//显示排序结果
		mv.displayAsc();
		
	}

}
