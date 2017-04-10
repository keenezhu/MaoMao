package ustc.maomao.patterns.singleton;

import java.util.ArrayList;
import java.util.List;

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
 *         Singleton模式的测试器
 * 
 */
public class SingletonTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {

		// 构造5个使用Configuration的ConfigurationClient1对象
		List<ConfigurationClient1> client1s = new ArrayList<ConfigurationClient1>();
		for (int i = 0; i < 5; i++) {
			ConfigurationClient1 cc1 = new ConfigurationClient1();
			client1s.add(cc1);
		}

		// 构造5个使用Configuration的ConfigurationClient2对象
		List<ConfigurationClient2> client2s = new ArrayList<ConfigurationClient2>();
		for (int i = 0; i < 5; i++) {
			ConfigurationClient2 cc2 = new ConfigurationClient2();
			client2s.add(cc2);
		}

		// ConfigurationClient1对象使用Configuration单例对象
		for (ConfigurationClient1 cc1 : client1s) {
			cc1.useConfiguration();
		}

		// ConfigurationClient2对象使用Configuration单例对象
		for (ConfigurationClient2 cc2 : client2s) {
			cc2.useConfiguration();
		}

	}

}
