package ustc.maomao.patterns.command;

import java.util.List;

import ustc.maomao.patterns.support.FoodItem;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品命令接收器
 * 
 */
public class CartCommandReceiver {

	private List<FoodItem> foods;// 菜品列表

	public CartCommandReceiver(List<FoodItem> fs) {
		foods = fs;
	}

	/**
	 * 加菜品到菜品列表
	 * 
	 * @param food
	 *            菜品
	 */
	public void addFood(FoodItem food) {
		foods.add(food);
		System.out.println("向购物车添加菜品:" + food.getName());
	}

	/**
	 * 从菜品列表中删除菜品
	 * 
	 * @param food
	 *            菜品
	 */
	public void removeFood(FoodItem food) {
		System.out.println("从购物车删除菜品:" + food.getName());
		foods.remove(food);
	}

}
