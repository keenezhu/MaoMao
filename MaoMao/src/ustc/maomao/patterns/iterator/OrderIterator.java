package ustc.maomao.patterns.iterator;

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
 *         订单迭代器接口
 * 
 */
public interface OrderIterator {

	/**
	 * 向下迭代
	 * 
	 * @return 下一个订单
	 */
	public MealOrder down();

	/**
	 * 首元素迭代
	 * 
	 * @return 首元素订单
	 */
	public MealOrder first();

	/**
	 * 向上迭代
	 * 
	 * @return 上一个订单
	 */
	public MealOrder up();

	/**
	 * 末元素迭代
	 * 
	 * @return 末元素订单
	 */
	public MealOrder last();

	/**
	 * 判断是否还有下一个元素
	 * 
	 * @return 结果
	 */
	public boolean hasNext();

	/**
	 * 判断是否还有上一个元素
	 * 
	 * @return 结果
	 */
	public boolean hasLast();

}
