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
 *         按菜品类型分别统计不同类型菜品数量
 *      
 */
public class FoodTypeVisitor implements MealOrderVisitor {
	
	private int simple,sweet,spicy;

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.decorator.SimpleFood)
	 */
	@Override
	public void visit(SimpleFood sf) {
		// TODO Auto-generated method stub
        simple+=sf.getAmmount();
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.decorator.SweetFood)
	 */
	@Override
	public void visit(SweetFood sf) {
		// TODO Auto-generated method stub
        sweet+=sf.getAmmount();
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.decorator.SpicyFood)
	 */
	@Override
	public void visit(SpicyFood sf) {
		// TODO Auto-generated method stub
        spicy+=sf.getAmmount();
	}
	
	public void displayResult(){
		System.out.println("普通菜品数量为："+simple);
		System.out.println("甜味菜品数量为："+sweet);
		System.out.println("辣味菜品数量为："+spicy);
	}

}
