package ustc.maomao.patterns.visitor;

import ustc.maomao.patterns.decorator.SimpleFood;
import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;
import ustc.maomao.patterns.support.SpicyLevel;
import ustc.maomao.patterns.support.SweetLevel;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         查看订单中菜品类型，根据菜品类型提醒客户： 1. 普通菜品订购超过5份，享受8折优惠 2.
 *         检查辣味菜品的辣味等级，如果为死亡辣，则提醒慎重选择 3. 检查甜味菜品的甜味等级，如果为腻甜，则提醒慎重选择
 * 
 */
public class FoodLevelVisitor implements MealOrderVisitor {

	private int count;// 普通菜品数量
	private boolean said = false;// 是否已提醒

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.
	 * decorator.SimpleFood)
	 */
	@Override
	public void visit(SimpleFood sf) {
		// TODO Auto-generated method stub
		count += sf.getAmmount();
		if (!said) {
			if (count >= 5) {
				said = true;
				System.out.println("你订购的普通菜品数量达到了5，可享受8折优惠！");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.
	 * decorator.SweetFood)
	 */
	@Override
	public void visit(SweetFood sf) {
		// TODO Auto-generated method stub
		if (sf.getSweetLevel() == SweetLevel.Cloying) {
			System.out.println("你订购的甜味菜品含有@@腻甜@@等级，有可能会破坏味觉，请慎重选择！");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.visitor.MealOrderVisitor#visit(ustc.maomao.patterns.
	 * decorator.SpicyFood)
	 */
	@Override
	public void visit(SpicyFood sf) {
		// TODO Auto-generated method stub
		if (sf.getSpicyLevel() == SpicyLevel.Dead) {
			System.out.println("你订购的辣味菜品含有@@死亡辣@@等级，有可能会产生生命危险，请慎重选择！");
		}
	}

}
