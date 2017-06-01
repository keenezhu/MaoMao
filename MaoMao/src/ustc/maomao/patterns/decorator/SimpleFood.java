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
 *         简单菜品
 *      
 */
public class SimpleFood implements FoodItem {
	
	private String foodName;//菜品名称
	
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#setAmount(int)
	 */
	@Override
	public void order(int num) {
		// TODO Auto-generated method stub
        System.out.println("您订购了 "+foodName+" 菜品："+num+"份");
	}

	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}	

}
