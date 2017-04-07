package ustc.maomao.patterns.abstractfac;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         水晶风格的线状图
 *      
 */
public class CrystalLine extends Line {
	
	private Data data;

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.Line#draw()
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("绘制水晶样式的线状图...");
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}	
	

}
