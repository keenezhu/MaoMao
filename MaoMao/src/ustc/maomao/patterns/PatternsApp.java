
package ustc.maomao.patterns;

import ustc.maomao.patterns.factorymethod.FactoryMethodTester;
import ustc.maomao.patterns.singleton.SingletonTester;
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
 *         调用每个模式包中的测试器，即可完成对应的模式示例测试
 *      
 */
public class PatternsApp {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//将SingletonTester替换成目标模式测试器
		PatternTester pt=new SingletonTester();
		pt.test();		
	}

}
