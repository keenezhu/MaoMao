package ustc.maomao.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.support.Patron;
import ustc.maomao.patterns.support.PatronLevel;
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
 *         享元模式测试器
 * 
 */
public class FlyweightTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		MessageSender ms = new MessageSender();
		List<Patron> patrons = new ArrayList<Patron>();
		for (int i = 0; i < 1000; i++) {
			Patron p = new Patron();
			if (i % 7 == 0) {
				p.setLevel(PatronLevel.VIP);
				p.setName("vip"+i);
			} else if (i % 5 == 0) {
				p.setLevel(PatronLevel.SVIP);
				p.setName("svip"+i);
			} else {
				p.setLevel(PatronLevel.Normal);
				p.setName("noraml"+i);
			}
			patrons.add(p);
		}
		ms.setReceivers(patrons);
		ms.sendGreetingMessage();
	}

}
