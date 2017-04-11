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
 *         mysql数据库访问实现
 *      
 */
public class MySQLDBImpl implements DBImpl {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.bridge.DBImpl#insert(java.lang.Object)
	 */
	@Override
	public boolean insert(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.bridge.DBImpl#update(java.lang.Object)
	 */
	@Override
	public boolean update(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.bridge.DBImpl#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.bridge.DBImpl#query(java.lang.Object)
	 */
	@Override
	public Object query(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
