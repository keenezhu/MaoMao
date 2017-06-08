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
 *         客户登录状态验证
 * 
 */
public class PatronValidator extends OrderValidator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.cor.OrderValidator#valid(ustc.maomao.patterns.
	 * support.MealOrder)
	 */
	@Override
	public boolean valid(MealOrder o) {
		if (o.getCustomer().isLoginState()) {
			System.out.println("客户验证通过！");
			return toNext(o);
		} else {
			System.out.println("客户验证不通过！");
			return false;
		}
	}

}
