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
 *         扁平风格图表元素创建工厂
 *      
 */
public class FlatChartFac extends ChartFac {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.ChartFac#createLine(ustc.maomao.patterns.abstractfac.Data)
	 */
	@Override
	public Line createLine(Data data) {
		// TODO Auto-generated method stub
		FlatLine line=new FlatLine();
		line.setData(data);
		return line;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.ChartFac#createPie(ustc.maomao.patterns.abstractfac.Data)
	 */
	@Override
	public Pie createPie(Data data) {
		// TODO Auto-generated method stub
		FlatPie pie=new FlatPie();
		pie.setData(data);
		return pie;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.abstractfac.ChartFac#createBar(ustc.maomao.patterns.abstractfac.Data)
	 */
	@Override
	public Bar createBar(Data data) {
		// TODO Auto-generated method stub
		FlatBar bar=new FlatBar();
		bar.setData(data);
		return bar;
	}

}
