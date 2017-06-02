package ustc.maomao.patterns.decorator;

import ustc.maomao.patterns.support.FoodItem;
import ustc.maomao.patterns.support.SweetLevel;
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
	
	private SweetLevel sweetLevel=SweetLevel.Normal;//甜味等级，默认为甜
	
	

	/**
	 * @return the sweetLevel
	 */
	public SweetLevel getSweetLevel() {
		return sweetLevel;
	}


	/**
	 * @param sweetLevel the sweetLevel to set
	 */
	public void setSweetLevel(SweetLevel sweetLevel) {
		System.out.println("甜味等级："+sweetLevel);
		this.sweetLevel = sweetLevel;
	}


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
	public void order(int num,SweetLevel level){
		order(num);
		setSweetLevel(level);
	}
	

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#accept(ustc.maomao.patterns.visitor.MealOrderVisitor)
	 */
	@Override
	public void accept(MealOrderVisitor visitor) {
		visitor.visit(this);		
	}

}
