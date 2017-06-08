package ustc.maomao.patterns.support;

import ustc.maomao.patterns.visitor.MealOrderVisitor;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品接口
 *      
 */
public interface FoodItem {
	
    
    /**
     * 点菜
     * @param num 菜品数量
     */
    public void order(int num);
    /**
     * 接收访问者
     * @param visitor 访问者
     */
    public void accept(MealOrderVisitor visitor);
    /**
     * 获取菜品数量
     * @return 菜品数量
     */
    public int getAmmount();   
    
    /**
     * 获取菜品名称
     * @return 菜品名称
     */
    public String getName();
    
}
