package ustc.maomao.patterns.templatemethod;

import ustc.maomao.patterns.support.MealOrder;
import ustc.maomao.patterns.support.PayBill;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         订单结算抽象类
 * 
 */
public abstract class PayOrder {

	/**
	 * 结帐
	 * 
	 * @param o
	 *            菜品订单
	 * @return 结帐结果
	 */
	public final PayBill check(MealOrder o) {
		PayBill pb = null;
		if (confirm(o)) {
			if (pay(o)) {
				getReceipt(o);
				pb = new PayBill();
			}
		}
		return pb;
	}

	/**
	 * 支付订单
	 * 
	 * @param o
	 *            菜品订单
	 * @return 支付结果
	 */
	protected abstract boolean pay(MealOrder o);

	/**
	 * 确认订单
	 * 
	 * @param o
	 *            菜品订单
	 */
	private boolean confirm(MealOrder o) {
		if (o.getCustomer().isLoginState()) {
			System.out.println("订单确认完成！");
			return true;
		} else {
			System.out.println("顾客未登录!");
			return false;
		}
	}

	/**
	 * 获取收据
	 * 
	 * @param o
	 *            菜品订单
	 */
	private void getReceipt(MealOrder o) {
		System.out.println("收据接收完成！");
	}
}
