package ustc.maomao.patterns.mediator;

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
 *         配送餐员类
 * 
 */
public class Deliverer implements Colleague {
	
	private ColleagueMediator mediator;//仲裁者

	/**
	 * @param mediator
	 *            the mediator to set
	 */
	public void setMediator(ColleagueMediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * 配送订单
	 * @param o 订单
	 */
	public void deliver(MealOrder o){
		 System.out.println("订单正在配送!");
	    mediator.mediate(this);
	}

}
