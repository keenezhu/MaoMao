package ustc.maomao.patterns.decorator;

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
 *         菜品装饰器
 * 
 */
public abstract class FoodDecorator implements FoodItem {

	private FoodItem food;// 被包装的菜品对象

	public FoodDecorator(FoodItem fi) {
		food = fi;
	}
	
	

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.FoodItem#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return food.getName();
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.decorator.FoodItem#setAmount(int)
	 */
	@Override
	public void order(int num) {
		// TODO Auto-generated method stub
		food.order(num);
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.decorator.FoodItem#getAmmount()
	 */
	@Override
	public int getAmmount() {
		// TODO Auto-generated method stub
		return food.getAmmount();
	}


}
