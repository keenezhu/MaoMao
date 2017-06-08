package ustc.maomao.patterns.command;

import ustc.maomao.patterns.decorator.SimpleFood;
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
 *         命令模式测试器
 *      
 */
public class CommandTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
        Cart cart=new Cart();
		SimpleFood food1=new SimpleFood();
		food1.setName("西红柿炒蛋");
		food1.order(2);
		
		SimpleFood food2=new SimpleFood();
		food2.setName("韭菜炒蛋");
		food2.order(1);
		
		SimpleFood food3=new SimpleFood();
		food3.setName("苦瓜炒蛋");
		food3.order(1);
		
		cart.add(food1);
		cart.add(food2);
		cart.add(food3);
		cart.remove(food1);
		
		cart.cancel();
		cart.cancel();
		
		cart.display();
		
	}

}
