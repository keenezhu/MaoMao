package ustc.maomao.patterns.support;

import ustc.maomao.patterns.decorator.FoodItem;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         COS菜单项类型
 *      
 */
public class MenuItem implements FoodItem{
	
	private int mType;//菜单项类型
	private String mName;//菜单项名称
	private float mPrice;//菜单项价格
	/**
	 * @return the mType
	 */
	public int getmType() {
		return mType;
	}
	/**
	 * @param mType the mType to set
	 */
	public void setmType(int mType) {
		this.mType = mType;
	}
	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}
	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}
	/**
	 * @return the mPrice
	 */
	public float getmPrice() {
		return mPrice;
	}
	/**
	 * @param mPrice the mPrice to set
	 */
	public void setmPrice(float mPrice) {
		this.mPrice = mPrice;
	}
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.decorator.FoodItem#order(int)
	 */
	@Override
	public void order(int num) {		
		System.out.println("您订购了 "+mName+" 菜品："+num+"份");
	}		

}
