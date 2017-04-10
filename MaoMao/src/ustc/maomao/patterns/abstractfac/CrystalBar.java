package ustc.maomao.patterns.abstractfac;

import ustc.maomao.patterns.support.Data;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         水晶风格的柱状图
 *      
 */
public class CrystalBar extends Bar {
	
	private Data data;

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.Bar#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制水晶样式的柱状图...");
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
	
	

}
