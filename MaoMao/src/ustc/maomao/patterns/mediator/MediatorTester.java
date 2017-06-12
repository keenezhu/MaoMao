package ustc.maomao.patterns.mediator;

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
 *         仲裁者模式测试器
 * 
 */
public class MediatorTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
		Patron p = new Patron();
		Staff s = new Staff();
		Deliverer d = new Deliverer();
		ColleagueMediator mediator = new ColleagueMediator(p, s, d);
		p.setMediator(mediator);
		s.setMediator(mediator);
		d.setMediator(mediator);
		
		p.requestDelivery();

	}

}
