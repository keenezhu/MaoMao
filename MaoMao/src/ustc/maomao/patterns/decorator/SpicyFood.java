package ustc.maomao.patterns.decorator;

import ustc.maomao.patterns.support.FoodItem;
import ustc.maomao.patterns.support.SpicyLevel;
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
 *         辣味菜品
 *      
 */
public class SpicyFood extends FoodDecorator {
	
	private SpicyLevel spicyLevel=SpicyLevel.Middle;//辣味等级，默认为中辣

	/**
	 * @return the spicyLevel
	 */
	public SpicyLevel getSpicyLevel() {
		return spicyLevel;
	}

	/**
	 * @param spicyLevel the spicyLevel to set
	 */
	public void setSpicyLevel(SpicyLevel spicyLevel) {
		System.out.println("辣味等级："+spicyLevel);
		this.spicyLevel = spicyLevel;
	}

	/**
	 * @param fi 被包装的菜品
	 */
	public SpicyFood(FoodItem fi) {
		super(fi);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 点菜
	 * @param num 菜品数量
	 * @param level 辣味等级
	 */
	public void order(int num,SpicyLevel level){
		order(num);
		setSpicyLevel(level);
	}	

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#accept(ustc.maomao.patterns.visitor.MealOrderVisitor)
	 */
	@Override
	public void accept(MealOrderVisitor visitor) {
		visitor.visit(this);		
	}

}
