package ustc.maomao.patterns.builder;

import java.util.List;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         构造器指导者，用来指导构造器工作
 * 
 */
public class BuilderDirector {

	/**
	 * @param builder 构造器
	 * @param data 数据源
	 */
	public void construct(TextBuilder builder, List<MenuItem> data) {
		
		for (MenuItem mi : data) {
             builder.convertmType(mi.getmType());
             builder.convertmName(mi.getmName());
             builder.convertmPrice(mi.getmPrice());
		}
	}

}
