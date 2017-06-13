package ustc.maomao.patterns.memento;

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

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		Patron p=new Patron();
		//两次备忘
        p.storeOrderSate();
        p.storeOrderSate();
        //三次恢复
        p.restoreOrderState();
        p.restoreOrderState();
        p.restoreOrderState();
        
	}

}
