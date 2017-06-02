package ustc.maomao.patterns.support;

import ustc.maomao.patterns.decorator.SimpleFood;
import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;
import ustc.maomao.patterns.templatemethod.PayOrder;
import ustc.maomao.patterns.visitor.FoodTypeVisitor;

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
	
	private MealOrder order;//菜品订单
	
	/**
	 * 订餐
	 *
	 * @return 订单
	 */
	public MealOrder orderFood(){
		
		order =new MealOrder();
		
		
		SimpleFood f1=new SimpleFood();
		f1.setName("辣子鸡");
		f1.order(1);
		order.addFood(f1);
		
		SimpleFood f2=new SimpleFood();
		f2.setName("麻辣豆腐");
		SpicyFood spicyF2=new SpicyFood(f2);		
		spicyF2.order(2);
		spicyF2.setSpicyLevel(3);
		order.addFood(spicyF2);
		
		SimpleFood f3=new SimpleFood();
		f3.setName("拔丝香蕉");
		SweetFood sweetF3=new SweetFood(f3);
		sweetF3.order(5, 2);
		order.addFood(sweetF3);
		
		return order;
	}
	
	/**
	 * 支付订单
	 * @param po 支付方式
	 */
	public void pay(PayOrder po){
		po.check(order);
	}
	
	/**
	 * 查看订单菜品统计信息
	 */
	public void viewOrderStatis(){
		FoodTypeVisitor visitor=new FoodTypeVisitor();
		order.statis(visitor);
		visitor.displayResult();
	}

}
