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
 *         非终结表达式
 *      
 */
public abstract class NonterminalExpression implements ValueExpression{
	protected ValueExpression left,right;//left左子表达式，right右子表达式
	public NonterminalExpression(ValueExpression lexp,ValueExpression rexp){
		left=lexp;
		right=rexp;
	}
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.interpreter.ValueExpression#interpret(ustc.maomao.patterns.interpreter.ValueContext)
	 */
	@Override
	public int interpret(ValueContext con) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
