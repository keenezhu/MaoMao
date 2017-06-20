package ustc.maomao.patterns.mediator;

import ustc.maomao.patterns.iterator.OrderIterator;
import ustc.maomao.patterns.iterator.PendingOrders;
import ustc.maomao.patterns.state.PlacedState;
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
public class Staff implements Colleague {

	private ColleagueMediator mediator;// 仲裁者

	/**
	 * @param mediator
	 *            the mediator to set
	 */
	public void setMediator(ColleagueMediator mediator) {
		this.mediator = mediator;
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
}
