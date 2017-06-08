package ustc.maomao.patterns.command;

import java.util.Stack;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         命令激活器
 *      
 */
public class CommandInvoker {
    Stack<CartCommand> commands=new Stack<CartCommand>();//管理命令的栈   
	/**
	 * 命令入栈
	 * @param command 命令
	 */
	public void push(CartCommand command){
		command.execute();
		commands.push(command);
	}
	/**
	 * 命令出栈 
	 */
	public void pop(){
		CartCommand command=commands.pop();
		command.undo();		
	}
}
