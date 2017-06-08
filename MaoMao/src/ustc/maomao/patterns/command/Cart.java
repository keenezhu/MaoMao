package ustc.maomao.patterns.command;

import java.util.ArrayList;
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
 *         购物车
 * 
 */
public class Cart {

	private List<FoodItem> foods = new ArrayList<FoodItem>();// 菜品列表
	CommandInvoker ci = new CommandInvoker();// 命令激活器
	CartCommandReceiver cr = new CartCommandReceiver(foods);// 命令接收器

	/**
	 * 添加菜品
	 * @param food 菜品
	 */
	public void add(FoodItem food) {
		ci.push(new AddFoodCommand(food, cr));
	}

	/**
	 * 删除菜品
	 * @param food 菜品
	 */
	public void remove(FoodItem food) {
		ci.push(new RemoveFoodCommand(food, cr));
	}

	/**
	 * 撤销
	 */
	public void cancel() {
		ci.pop();
	}
	
	public void display(){
		System.out.println("购物车中的菜品有：");
		for(FoodItem food:foods){
			System.out.println(food.getName());
		}
	}

}
