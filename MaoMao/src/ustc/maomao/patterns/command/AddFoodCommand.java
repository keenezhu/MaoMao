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
 *         加菜品命令
 * 
 */
public class AddFoodCommand implements CartCommand {

	private CartCommandReceiver receiver;// 命令接收器
	private FoodItem food;// 菜品

	public AddFoodCommand(FoodItem f, CartCommandReceiver r) {
		food = f;
		receiver = r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.command.CartCommand#execute(ustc.maomao.patterns.
	 * support.FoodItem)
	 */
	@Override
	public void execute() {
		receiver.addFood(food);
		System.out.println("添加菜品完毕！");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.command.CartCommand#undo()
	 */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		receiver.removeFood(food);
		System.out.println("添加菜品命令已撤销！");
	}

}
