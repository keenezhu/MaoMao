package ustc.maomao.patterns.templatemethod;

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
 *         模板方法模式测试器
 *      
 */
public class TemplateMethodTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		Patron p=new Patron();
		p.setLoginState(true);
		p.orderFood();		
		PayOrder po=new PayCard();
		p.setPayOption(po);
        p.pay();
	}

}
