package ustc.maomao.patterns.decorator;

import ustc.maomao.patterns.support.FoodItem;
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
 *         甜味菜品
 *      
 */
public class SweetFood extends FoodDecorator {

	/**
	 * @param fi 被包装的菜品
	 */
	public SweetFood(FoodItem fi) {
		super(fi);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * 订菜
	 * @param num 菜品数量
	 * @param level 甜味等级
	 */
	public void order(int num,int level){
		order(num);
		setSweetLevel(level);
	}
	
	/**
	 * 设置菜品甜味等级
	 * @param level 等级
	 */
	public void setSweetLevel(int level){
		System.out.println("   甜味等级是："+level);
	}


	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#accept(ustc.maomao.patterns.visitor.MealOrderVisitor)
	 */
	@Override
	public void accept(MealOrderVisitor visitor) {
		visitor.visit(this);		
	}

}
