package ustc.maomao.patterns.decorator;

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
	public void order(int num,int level){
		order(num);
		setSpicyLevel(level);
	}
	
	/**
	 * 设置辣味等级
	 * @param level 等级
	 */
	public void setSpicyLevel(int level){
		System.out.println("   辣味等级是："+level);
	}

}
