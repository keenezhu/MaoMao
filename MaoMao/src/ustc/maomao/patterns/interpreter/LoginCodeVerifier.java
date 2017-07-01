package ustc.maomao.patterns.interpreter;

import java.util.Random;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         验证码识别类
 * 
 */
public class LoginCodeVerifier {

	private ValueExpression exp;// 目标表达式
	private ValueContext con;// 表达式上下文

	public LoginCodeVerifier() {
		con = new ValueContext();// 初始化表达式上下文
		generateRandomExpression();
	}

	/**
	 * 验证用户输入值与表达式计算结果是否一致
	 * 
	 * @param value
	 * @return
	 */
	public boolean verify(int value) {
		int expValue = exp.interpret(con);
		System.out.println("输入的验证码："+value);
		return value == expValue;
	}

	/**
	 * 随机生成表达式
	 * @return 已生成的表达式
	 */
	private ValueExpression generateRandomExpression() {
		Random r = new Random();
		exp=new AddExpression(
				new SubExpression(new TerminalExpression(con.getSymbol(r.nextInt(10))),
						new TerminalExpression(con.getSymbol(r.nextInt(5)))),
				new TerminalExpression(con.getSymbol(r.nextInt(9))));
		System.out.println("表达式："+exp.toString());
		return exp;
	}
	
	/**
	 * 刷新表达式
	 */
	public void updateExp(){
		generateRandomExpression();
	}

}
