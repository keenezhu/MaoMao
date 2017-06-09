package ustc.maomao.patterns.interpreter;

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

		ValueContext con = new ValueContext();//构造值上下文

		ValueExpression exp = constructExp();//获取已构造的表达式

		System.out.println(exp.interpret(con));
	}

	/**
	 * 构造表达式
	 * @return 表达式
	 */
	public ValueExpression constructExp() {		
		return new AddExpression(new AddExpression(new TerminalExpression("玖"), new TerminalExpression("肆")),
				new TerminalExpression("伍"));
	}

}
