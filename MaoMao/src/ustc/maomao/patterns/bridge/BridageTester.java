package ustc.maomao.patterns.bridge;

import ustc.maomao.patterns.support.MenuItem;
import ustc.maomao.patterns.support.PatternTester;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         Bridge模式测试器
 *      
 */
public class BridageTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		DBImpl db=new SQLiteDBImpl();
		DBManager dbm=new DBManagerWithXmlLog();
        dbm.setDb(db);
        MenuItem item=new MenuItem();
        item.setmName("name");
        dbm.get(item);
        dbm.modify(item);
        dbm.remove(item);
        dbm.persist(item);
	}

}
