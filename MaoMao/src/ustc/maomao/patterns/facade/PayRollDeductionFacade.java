package ustc.maomao.patterns.facade;

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
 *         工资抵扣子系统接口
 *      
 */
public class PayRollDeductionFacade {
	private Bill bill;//内部账单
	private Account account;//账户
	private PayLogger pl;//支付日志
	
	public PayRollDeductionFacade(){
		bill=new Bill();
		account=new Account();
		pl=new PayLogger();
	}	
	/**
	 * 支付接口
	 * @param o 订单
	 * @return 支付结果
	 */
	public boolean pay(MealOrder o){
		PaySecurity.detectMalware();
		boolean result=account.expense();
		pl.payLog(result);
		if(result){
			bill.createBill();
		}
		return result;		
	}

}
