package ustc.maomao.patterns.cor;

import ustc.maomao.patterns.support.MealOrder;
import ustc.maomao.patterns.visitor.FoodLevelVisitor;
import ustc.maomao.patterns.visitor.FoodTypeVisitor;
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
 *         订单控制器
 * 
 */
public class MealOrderController {

	private OrderValidator validator;
	

	/**
	 * 验证目标订单是否有效
	 * 
	 * @param order
	 *            目标订单
	 * @return 验证结果
	 */
	public boolean validateOrder(MealOrder order) {        
		return validator.valid(order);
	}

	/**
	 * @param validator
	 *            the validator to set
	 */
	public void setValidator(OrderValidator validator) {
		this.validator = validator;
	}
	
	/**
	 * 显示订单菜品统计信息
	 */
	public void dispayOrderStatis(MealOrder order) {
		FoodTypeVisitor typeVisitor=new FoodTypeVisitor();
		order.accept(typeVisitor);
		typeVisitor.displayResult();
	}

	/**
	 * 检查订单并提醒客户关于菜品的信息
	 */
	public void warningOrder(MealOrder order) {
		FoodLevelVisitor levelVisitor=new FoodLevelVisitor();
		order.accept(levelVisitor);
	}	
	
}
