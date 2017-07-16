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
 *         数据库抽象访问类型
 * 
 */
public abstract class DBManager {

	private DBImpl db;// 数据库访问的实现

	/**
	 * 向数据库中持久化一个对象
	 * 
	 * @param o
	 *            进行持久化的对象
	 * @return 持久化结果
	 */
	public boolean persist(Object o) {
		log("插入一个对象",o);
		return db.insert(o);
	}

	/**
	 * 对数据库中已有对象修改
	 * 
	 * @param o
	 *            被修改的对象
	 * @return 修改结果
	 */
	public boolean modify(Object o) {
		log("修改一个对象",o);
		return db.update(o);
	}

	/**
	 * 移除数据库中已有对象
	 * 
	 * @param o
	 *            被移除的对象
	 * @return 移除结果
	 */
	public boolean remove(Object o) {
		log("移除一个对象",o);
		return db.delete(o);
	}

	/**
	 * 从数据库获取对象
	 * 
	 * @param o
	 *            含有获取条件的对象
	 * @return 获取的结果对象
	 */
	public Object get(Object o) {
		log("获取一个对象",o);
		return db.query(o);
	}

	/**
	 * @param db
	 *            the db to set
	 */
	public void setDb(DBImpl db) {
		this.db = db;
	}

	/**
	 * 数据库访问日志记录
	 * @param operation 访问日志
	 */
	public abstract void log(String operation,Object o);

}
