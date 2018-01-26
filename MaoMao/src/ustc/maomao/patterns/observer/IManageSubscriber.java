package ustc.maomao.patterns.observer;

import ustc.maomao.patterns.support.Patron;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         订阅客户管理接口
 *      
 */
public interface IManageSubscriber {

	/**
	 * 添加订阅客户
	 * @param p 客户
	 */
	public void addPatron(Patron p);
	
	/**
	 * 移除订阅客户
	 * @param p 客户
	 */
	public void removePatron(Patron p);
	
}
