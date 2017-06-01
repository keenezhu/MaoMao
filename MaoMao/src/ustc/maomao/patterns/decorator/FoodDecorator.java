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
 *         菜品装饰器
 *      
 */
public class FoodDecorator implements FoodItem {
	
	private FoodItem food;//被包装的菜品对象
	
	public FoodDecorator(FoodItem fi){
		food=fi;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#setAmount(int)
	 */
	@Override
	public void order(int num) {
		// TODO Auto-generated method stub
         food.order(num);
	}

}
