package ustc.maomao.patterns.support;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         尾注
 * 
 */
public class Footer {
	private static Footer footer = new Footer();
    private Footer(){}
	public static Footer instance() {
		return footer;
	}
}
