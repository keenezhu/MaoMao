package ustc.maomao.patterns.templatemethod;

import ustc.maomao.patterns.facade.PayRollDeductionFacade;
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
 *         工资抵扣支付
 * 
 */
public class PayPayRollDeduction extends PayOrder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.templatemethod.PayOrder#pay(ustc.maomao.patterns.
	 * support.MealOrder)
	 */
	@Override
	protected boolean pay(MealOrder o) {
		PayRollDeductionFacade prdf = new PayRollDeductionFacade();
		boolean result = prdf.pay(o);
		if (result) {
			System.out.println("支付成功！");
		} else {
			System.out.println("支付失败");
		}
		return result;
	}

}
