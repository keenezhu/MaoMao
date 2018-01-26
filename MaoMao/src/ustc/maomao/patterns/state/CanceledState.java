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
 *         Canceled状态类
 *      
 */
public class CanceledState implements OrderState {	
	
	public CanceledState() {		
		System.out.println("订单是Canceled状态！");
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.state.OrderState#handle()
	 */
	@Override
	public void handle() {		
          System.out.println("order is canceled!");
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
