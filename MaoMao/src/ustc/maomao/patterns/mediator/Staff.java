package ustc.maomao.patterns.mediator;

import ustc.maomao.patterns.iterator.OrderIterator;
import ustc.maomao.patterns.iterator.PendingOrders;
import ustc.maomao.patterns.memento.CareTaker;
import ustc.maomao.patterns.state.OrderState;
import ustc.maomao.patterns.state.PlacedState;
import ustc.maomao.patterns.support.Employee;
import ustc.maomao.patterns.support.MealOrder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         餐厅员工类
 * 
 */
public class Staff extends Employee implements Colleague {

	private ColleagueMediator mediator;// 仲裁者
	private CareTaker caretaker;// 订单备忘录守护者
	private MealOrder order;// 菜品订单

	/**
	 * @param order
	 *            the order to set
	 */
	public void setOrder(MealOrder order) {
		this.order = order;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.mediator.Colleague#setMediator(ustc.maomao.patterns.
	 * mediator.ColleagueMediator)
	 */
	@Override
	public void setMediator(ColleagueMediator media) {
		// TODO Auto-generated method stub
		mediator = media;
	}

	/**
	 * 请求配送订单
	 * 
	 * @param o
	 *            订单
	 * @return 配送结果
	 */
	public boolean requestDelivery(MealOrder o) {
		if (verifyOrder(o)) {
			mediator.mediate(this);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 验证订单
	 * 
	 * @param o
	 *            订单
	 * @return 验证结果
	 */
	private boolean verifyOrder(MealOrder o) {
		System.out.println("订单验证通过!");
		return true;
	}

	/**
	 * 接收消息
	 * 
	 * @param message
	 *            消息
	 */
	public void receiveMessage(String message) {
		System.out.println("Staff收到消息：" + message);
	}

	/**
	 * 审核订单
	 * 
	 * @param orders
	 *            订单
	 */
	public void checkPendingOrders(PendingOrders orders) {
		OrderIterator iterator = orders.iterate();
		MealOrder order = iterator.first();
		if (order != null) {
			order.setState(new PlacedState(order));
			System.out.println(order.getCustomer().getName() + "订单已审核！");
			while (iterator.hasNext()) {
				order = iterator.down();
				order.setState(new PlacedState(order));
				System.out.println(order.getCustomer().getName() + "订单已审核！");
			}
		}
	}

	/**
	 * 备忘订单状态
	 */
	public void storeOrderSate() {

		if (caretaker == null) {
			caretaker = new CareTaker();
		}

		System.out.println("------备忘订单状态------");
		caretaker.addMemento(order.createMemento());
		System.out.println("------备忘完成------");

	}

	/**
	 * 恢复订单状态
	 */
	public void restoreOrderState() {
		if (caretaker == null) {
			System.out.println("没有备忘过订单状态!");
		} else {
			System.out.println("*********恢复订单状态*********");
			order.restoreState(caretaker.getMemento());
			System.out.println("*********恢复完成*********");
		}

	}

	/**
	 * 更改订单状态
	 * @param state 状态
	 */
	public void changeOrderState(OrderState state) {
		if (order != null) {
			order.setState(state);
		}
	}

}
