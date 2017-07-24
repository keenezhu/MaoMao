package ustc.maomao.patterns.cor;

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
 *         抽象订单验证器
 * 
 */
public abstract class OrderValidator {
	
	private OrderValidator successor;// 后继

	/**
	 * 验证行为
	 * @param o 订单
	 * @return 验证结果
	 */
	public abstract boolean valid(MealOrder o);
	
	/**
	 * 将目标对象传递到责任链下一个节点
	 * @param o
	 * @return
	 */
	protected boolean toNext(MealOrder o){
		if(successor!=null){
			return successor.valid(o);
		}else{
			System.out.println("验证完毕！");
			return true;
		}
	}

	/**
	 * @param successor
	 *            the successor to set
	 */
	public void setSuccessor(OrderValidator successor) {
		this.successor = successor;
	}
}
