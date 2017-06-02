package ustc.maomao.patterns.templatemethod;

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
 *         卡支付
 *      
 */
public class PayCard extends PayOrder {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.templatemethod.PayOrder#pay(ustc.maomao.patterns.support.MealOrder)
	 */
	@Override
	protected boolean pay(MealOrder o) {
		
		System.out.println("支付完成！");
		
		return true;
	}

}
