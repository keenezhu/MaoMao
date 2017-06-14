package ustc.maomao.patterns.memento;

import ustc.maomao.patterns.state.FinishedState;
import ustc.maomao.patterns.state.PlacedState;
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
		Patron p = new Patron();
		MealOrder o = p.orderFood();

		// 两次备忘
		o.setState(new PlacedState(o));
		o.go();
		p.storeOrderSate();

		o.setState(new FinishedState(o));
		o.go();
		p.storeOrderSate();

		// 三次恢复
		p.restoreOrderState();
		o.go();
		p.restoreOrderState();
		o.go();
		p.restoreOrderState();
		o.go();

	}

}
