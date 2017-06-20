package ustc.maomao.patterns.iterator;

import ustc.maomao.patterns.mediator.Staff;
import ustc.maomao.patterns.support.MealOrder;
import ustc.maomao.patterns.support.Patron;
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
 *         迭代器模式测试器
 * 
 */
public class IteratorTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {

		PendingOrders po = new PendingOrders();
        //构造测试数据集
		for (int i = 0; i < 10; i++) {
			Patron p = new Patron();
			p.setName("p" + i);
			MealOrder o = new MealOrder(p);
			po.add(o);
		}
       
		Staff staff=new Staff();
		staff.checkPendingOrders(po);

	}

}
