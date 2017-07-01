package ustc.maomao.patterns.interpreter;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         终结表达式
 * 
 */
public class TerminalExpression implements ValueExpression {

	private String symbol;// 终结符号

	public TerminalExpression(String sym) {
		symbol = sym;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.interpreter.ValueExpression#interpret(ustc.maomao.
	 * patterns.interpreter.ValueContext)
	 */
	@Override
	public int interpret(ValueContext con) {		
		return con.getValue(symbol);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return symbol;
	}

}
