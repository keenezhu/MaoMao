package ustc.maomao.patterns.support;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.visitor.MealOrderVisitor;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品订单
 * 
 */
public class MealOrder {
	private List<FoodItem> foods;// 菜品列表
	private Patron customer;
	private boolean paid;
	

	public MealOrder(Patron p) {
		foods = new ArrayList<FoodItem>();
		customer=p;
	}

	/**
	 * 向订单中加入菜品
	 * 
	 * @param food
	 *            菜品
	 */
	public void addFood(FoodItem food) {
		foods.add(food);
	}

	/**
	 * 访问订单菜品
	 * 
	 * @param visitor
	 */
	public void accept(MealOrderVisitor visitor) {
		for (FoodItem food : foods) {
			food.accept(visitor);
		}
	}

	/**
	 * @return the customer
	 */
	public Patron getCustomer() {
		return customer;
	}
	
	/**
	 * @return the paid
	 */
	public boolean isPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

}
