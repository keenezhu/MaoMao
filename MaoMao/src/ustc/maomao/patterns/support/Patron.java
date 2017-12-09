package ustc.maomao.patterns.support;

import ustc.maomao.patterns.decorator.SimpleFood;
import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;
import ustc.maomao.patterns.mediator.Colleague;
import ustc.maomao.patterns.mediator.ColleagueMediator;
import ustc.maomao.patterns.memento.CareTaker;
import ustc.maomao.patterns.state.OrderState;
import ustc.maomao.patterns.state.PlacedState;
import ustc.maomao.patterns.templatemethod.PayOrder;
import ustc.maomao.patterns.visitor.FoodLevelVisitor;
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
public class Patron extends Employee implements Colleague {

	private PatronLevel level;// 客户等级

	private MealOrder order;// 菜品订单

	private boolean loginState;// 当前客户登录状态

	private String name;// 客户名称

	private PayOrder payOption;// 支付方式

	private ColleagueMediator mediator;// 仲裁者

	/**
	 * 接收消息
	 * 
	 * @param message
	 *            消息
	 */
	public void receiveMessage(String message) {
		System.out.println("Patron收到消息：" + message);
	}

	/**
	 * 请求配送订单
	 */
	public void requestDelivery() {
		mediator.mediate(this);
	}

	/**
	 * 订餐
	 *
	 * @return 订单
	 */
	public MealOrder orderFood() {

		order = new MealOrder(this);

		SimpleFood f1 = new SimpleFood();
		f1.setName("花生米");
		f1.order(5);
		order.addFood(f1);

		SimpleFood f2 = new SimpleFood();
		f2.setName("麻辣豆腐");
		SpicyFood spicyF2 = new SpicyFood(f2);
		spicyF2.order(2);
		spicyF2.setSpicyLevel(SpicyLevel.Dead);
		order.addFood(spicyF2);

		SimpleFood f3 = new SimpleFood();
		f3.setName("拔丝香蕉");
		SweetFood sweetF3 = new SweetFood(f3);
		sweetF3.order(5, SweetLevel.Cloying);
		order.addFood(sweetF3);

		SimpleFood f4 = new SimpleFood();
		f4.setName("皮蛋豆腐");
		f4.order(7);
		order.addFood(f4);

		return order;
	}

	/**
	 * 支付订单
	 * 
	 * @param po
	 *            支付方式
	 */
	public PayBill pay() {
		PayBill pb = payOption.check(order);
		if (pb != null) {
			System.out.println("支付成功！");
			order.setPaid(true);
		} else {
			System.out.println("支付不成功！");
			order.setPaid(false);
		}
		return pb;
	}

	/**
	 * @return the level
	 */
	public PatronLevel getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(PatronLevel level) {
		this.level = level;
	}

	/**
	 * @return the loginState
	 */
	public boolean isLoginState() {
		return loginState;
	}

	/**
	 * @param loginState
	 *            the loginState to set
	 */
	public void setLoginState(boolean loginState) {
		this.loginState = loginState;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the order
	 */
	public MealOrder getOrder() {
		return order;
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
	 * @param payOption
	 *            the payOption to set
	 */
	public void setPayOption(PayOrder payOption) {
		this.payOption = payOption;
	}

}
