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
 *         简单菜品
 * 
 */
public class SimpleFood implements FoodItem {

	private long id;// 菜品对象id
	private String name;// 菜品名称

	private int ammount;// 菜品数量

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.decorator.FoodItem#getAmmount()
	 */
	@Override
	public int getAmmount() {
		// TODO Auto-generated method stub
		return ammount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.decorator.FoodItem#order(int)
	 */
	@Override
	public void order(int num) {
		ammount = num;
		System.out.println("您订购了 " + name + " 菜品：" + num + "份");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.decorator.FoodItem#accept(ustc.maomao.patterns.
	 * visitor.MealOrderVisitor)
	 */
	@Override
	public void accept(MealOrderVisitor visitor) {
		visitor.visit(this);
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.FoodItem#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
