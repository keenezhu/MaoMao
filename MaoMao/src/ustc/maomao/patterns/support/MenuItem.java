package ustc.maomao.patterns.support;

import ustc.maomao.patterns.proxy.ImageUpdater;
import ustc.maomao.patterns.proxy.MenuImage;

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
public class MenuItem implements ImageUpdater{
	
	private int mType;//菜单项类型
	private String mName;//菜单项名称
	private float mPrice;//菜单项价格
	private MenuImage mImage;//菜单项图片
	/**
	 * @param mImage the mImage to set
	 */
	public void setmImage(MenuImage mImage) {
		this.mImage = mImage;
	}
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
	
	public void display(){
		System.out.println("菜品："+mName+"\n价格："+mPrice);
		mImage.show(this);
	}
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.proxy.ImageUpdater#update()
	 */
	@Override
	public void update() {
		System.out.println("图片已刷新！");		
	}	

}
