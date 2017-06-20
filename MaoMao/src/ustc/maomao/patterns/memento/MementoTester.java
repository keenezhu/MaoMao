package ustc.maomao.patterns.memento;

import ustc.maomao.patterns.mediator.Staff;
import ustc.maomao.patterns.state.PlacedState;
import ustc.maomao.patterns.state.PreparedState;
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
 *         备忘录模式测试器
 * 
 */
public class MementoTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		//生成订单
		Patron p = new Patron();
		MealOrder o = p.orderFood();
        o.setState(new PlacedState(o));
       
		Staff staff=new Staff();
		staff.setOrder(o);
		//备份订单状态
		staff.storeOrderSate();
		 //更改订单状态
		staff.changeOrderState(new PreparedState(o));
		 //恢复订单状态
        staff.restoreOrderState();
	}

}
