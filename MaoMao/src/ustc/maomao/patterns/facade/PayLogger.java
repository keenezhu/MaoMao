package ustc.maomao.patterns.facade;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         支付日志
 * 
 */
public class PayLogger {
	private Account acount;// 支付账户

	/**
	 * 记录支付行为
	 */
	public void payLog(boolean type) {
		if (type) {
			System.out.println("支付成功行为已记录!");
		} else {
			System.out.println("支付失败行为已记录!");
		}
	}
}
