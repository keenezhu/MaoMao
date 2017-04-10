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
 *         扁平风格的线状图
 *      
 */
public class FlatLine extends Line {
	
	private Data data;

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.Line#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制扁平样式的线状图...");
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
	
	

}
