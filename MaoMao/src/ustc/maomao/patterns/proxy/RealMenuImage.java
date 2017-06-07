package ustc.maomao.patterns.proxy;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         目标菜单项图片
 *      
 */
public class RealMenuImage implements MenuImage {
	
	
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.proxy.MenuImage#show()
	 */
	@Override
	public void show() {		
         System.out.println("显示目标菜单项图片！");         
	}	

}
