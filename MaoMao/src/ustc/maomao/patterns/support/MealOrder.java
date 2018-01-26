package ustc.maomao.patterns.support;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.memento.IMemento;
import ustc.maomao.patterns.state.OrderState;
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
	private Patron customer;// 客户
	private boolean paid;// 是否支付
	private OrderState state;// 订单状态

	public MealOrder(Patron p) {
		foods = new ArrayList<FoodItem>();
		customer = p;
	}

	/**
	 * 依据状态而变化的"取消"订单行为
	 */
	public void cancel() {
		state.handle();
	}

	/**
	 * 创建备忘录
	 * 
	 * @return
	 */
	public IMemento createMemento() {
		OrderState history = null;
		try {
			history = (OrderState) state.clone();
			System.out.println("状态已备份!");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new OrderMemento(history);
	}

	/**
	 * 恢复订单状态
	 * 
	 * @param memento
	 *            备忘录
	 */
	public void restoreState(IMemento memento) {
		OrderMemento mem = (OrderMemento) memento;
		state = mem.getState();		
		System.out.println(state.toString()+"状态已恢复!");
	}

	/**
	 * 
	 * 订单状态备忘录类
	 *
	 */
	private class OrderMemento implements IMemento {

		private OrderState history;// 备份的状态

		OrderMemento(OrderState state) {
			history = state;
		}

		/**
		 * 获取历史状态
		 * 
		 * @return 状态
		 */
		OrderState getState() {
			return history;
		}
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
	 * 删除指定的菜品
	 * @param food
	 */
	public void removeFood(FoodItem food){
		foods.remove(food);
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
	 * @param paid
	 *            the paid to set
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(OrderState state) {
		this.state = state;
	}

}
