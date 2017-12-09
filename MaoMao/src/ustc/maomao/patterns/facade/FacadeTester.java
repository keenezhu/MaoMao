package ustc.maomao.patterns.facade;

import ustc.maomao.patterns.support.Patron;
import ustc.maomao.patterns.support.PatternTester;
import ustc.maomao.patterns.templatemethod.PayCard;
import ustc.maomao.patterns.templatemethod.PayOrder;
import ustc.maomao.patterns.templatemethod.PayPayRollDeduction;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         门面模式测试器
 *      
 */
public class FacadeTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		Patron p=new Patron();
		p.setLoginState(true);
		PayOrder po=new PayPayRollDeduction();
		p.setPayOption(po);		
		p.orderFood();
        p.pay();
	}

}
