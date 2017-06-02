package ustc.maomao.patterns.decorator;

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
 *         装饰器模式测试器
 *      
 */
public class DecoratorTester implements PatternTester{

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
		Patron p=new Patron();
		p.orderFood();
	}

}
