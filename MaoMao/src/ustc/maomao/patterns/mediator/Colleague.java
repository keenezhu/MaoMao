package ustc.maomao.patterns.mediator;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         协作者接口
 *      
 */
public interface Colleague {
	
	/**
	 * 设置仲裁者
	 * @param media 仲裁者
	 */
	public void setMediator(ColleagueMediator media);
       
}
