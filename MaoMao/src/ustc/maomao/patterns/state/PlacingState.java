package ustc.maomao.patterns.state;

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
 *         Placing状态类
 * 
 */
public class PlacingState implements OrderState {
	private MealOrder context;// 状态上下文

	public PlacingState(MealOrder con) {
		context = con;
		System.out.println("订单是Placing状态！");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.state.OrderState#handle()
	 */
	@Override
	public void handle() {
		context.setState(new CanceledState());
		System.out.println("订单已取消");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
