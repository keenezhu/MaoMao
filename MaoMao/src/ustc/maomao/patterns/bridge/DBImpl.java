package ustc.maomao.patterns.bridge;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         数据库访问实现接口
 * 
 */
public interface DBImpl {
	/**
	 * 在数据库中新建一个记录
	 * @param o 新建的对象
	 * @return 新建结果
	 */
	public boolean insert(Object o);

	/**
	 * 更新数据库中的已有记录
	 * @param o 更新的对象
	 * @return 更新结果
	 */
	public boolean update(Object o);

	/**
	 * 从数据库中删除一个已有记录
	 * @param o 删除的对象
	 * @return 删除的结果
	 */
	public boolean delete(Object o);

	/**
	 * 从数据库中查询一条记录
	 * @param o 含有查询条件的对象
	 * @return 查询结果
	 */
	public Object query(Object o);
}
