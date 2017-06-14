package ustc.maomao.patterns.state;

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
 *         状态模式测试器
 * 
 */
public class StateTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		Patron p = new Patron();
		MealOrder o = p.orderFood();
		//订单已生成
		OrderState placed = new PlacedState(o);
		o.setState(placed);
		o.go();
		//订单已准备好
		OrderState prepared = new PreparedState(o);
		o.setState(prepared);
		o.go();
	}

}
