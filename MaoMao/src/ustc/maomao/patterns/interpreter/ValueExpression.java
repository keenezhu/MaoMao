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
 *         值表达式接口
 *      
 */
public interface ValueExpression {
       
    /**
     * 解释行为
     * @param con 上下文
     * @return 解释结果
     */
    public int interpret(ValueContext con);
}
