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
 *         新闻观察者接口
 * 
 */
public interface NewsObserver {
	
	/**
	 * 观察者收到新闻执行的行为
	 * @param message 新闻
	 */
	public void update(News message);
	
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
