package ustc.maomao.patterns.adapter;

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
 *         适配器模式测试器
 *      
 */
public class AdapterTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		MViewer mviewer=new MViewer();
		MData data=new MData();
		MList dataSource=new MAdapter(data);
        mviewer.displayMenuList(dataSource);
	}

}
