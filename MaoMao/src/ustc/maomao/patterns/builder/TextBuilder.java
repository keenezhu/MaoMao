package ustc.maomao.patterns.builder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         文本构造器接口，将菜单项数据源构造为文本
 *      
 */
public interface TextBuilder {
	
	/**
	 * 将菜单项类型转换为文本
	 * @param mType 菜单项类型
	 */
	public void convertmType(int mType);
	/**
	 * 将菜单项名称转换为文本
	 * @param mName 菜单项名称
	 */
	public void convertmName(String mName);
	
	/**
	 * 将菜单项价格转换为文本
	 * @param mPrice 菜单项价格
	 */
	public void convertmPrice(float mPrice);

}
