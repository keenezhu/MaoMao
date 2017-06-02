package ustc.maomao.patterns.support;

import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         订餐客户
 *      
 */
public class Patron {
	
	/**
	 * 订餐
	 */
	public void orderFood(){
		
		MenuItem f1=new MenuItem();
		f1.setmName("辣子鸡");
		f1.order(1);
		
		SpicyFood f2=new SpicyFood(f1);		
		f2.order(2);
		f2.setSpicyLevel(3);
		
		SweetFood f3=new SweetFood(f1);
		f3.order(1, 2);
		
	}

}
