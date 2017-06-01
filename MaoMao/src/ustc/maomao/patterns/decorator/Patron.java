package ustc.maomao.patterns.decorator;

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
	
	public void orderFood(){
		
		SimpleFood f1=new SimpleFood();
		f1.setFoodName("辣子鸡");
		f1.order(1);
		
		SpicyFood f2=new SpicyFood(f1);		
		f2.order(2);
		f2.setSpicyLevel(3);
		
		SweetFood f3=new SweetFood(f1);
		f3.order(1, 2);
		
	}

}
