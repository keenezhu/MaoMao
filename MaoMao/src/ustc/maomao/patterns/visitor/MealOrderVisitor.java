package ustc.maomao.patterns.visitor;

import ustc.maomao.patterns.decorator.SimpleFood;
import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         订单菜品访问者接口
 *      
 */
public interface MealOrderVisitor {
    /**
     * 访问普通菜品
     * @param sf 普通菜品
     */
    public void visit(SimpleFood sf);
    /**
     * 访问甜味菜品
     * @param sf 甜味菜品
     */
    public void visit(SweetFood sf);
    /**
     * 访问辣味菜品
     * @param sf 辣味菜品
     */
    public void visit(SpicyFood sf);
}
