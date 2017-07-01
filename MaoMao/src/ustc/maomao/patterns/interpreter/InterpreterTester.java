package ustc.maomao.patterns.interpreter;

import java.util.Random;

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
 *         解释器模式测试器
 * 
 */
public class InterpreterTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		LoginCodeVerifier verifier = new LoginCodeVerifier();
		Random r=new Random();
		while(!verifier.verify(r.nextInt(10))){
			verifier.updateExp();			
		}
		System.out.println("验证码正确！");
	}

}
