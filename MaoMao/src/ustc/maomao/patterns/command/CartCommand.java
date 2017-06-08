package ustc.maomao.patterns.command;

import ustc.maomao.patterns.support.FoodItem;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         购物车命令
 * 
 */
public interface CartCommand {
	/**
	 * 命令执行行为
	 * 
	 */
	public void execute();

	/**
	 * 命令撤销行为
	 *
	 */
	public void undo();
}
