package ustc.maomao.patterns.interpreter;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         值上下文
 * 
 */
public class ValueContext {

	private HashMap<String, Integer> symbolTable = new HashMap<String, Integer>();// 符号表
	private String[] symbols = new String[10];// 符号数组

	public ValueContext() {
		initSymbolTable();
		symbolTable.keySet().toArray(symbols);
	}

	/**
	 * 初始化符号表
	 */
	private void initSymbolTable() {
		symbolTable.put("零", 0);
		symbolTable.put("壹", 1);
		symbolTable.put("贰", 2);
		symbolTable.put("叁", 3);
		symbolTable.put("肆", 4);
		symbolTable.put("伍", 5);
		symbolTable.put("陆", 6);
		symbolTable.put("柒", 7);
		symbolTable.put("捌", 8);
		symbolTable.put("玖", 9);
	}

	/**
	 * 获取符号值
	 * 
	 * @param symbol
	 *            符号
	 * @return 值
	 *
	 */
	public int getValue(String symbol) {
		Integer value = symbolTable.get(symbol);
		if (value == null) {
			new Exception("表达式中含有不合法的符号!").printStackTrace();
		}
		return value;
	}

	/**
	 * 获取符号
	 * 
	 * @param index
	 *            符号索引
	 * @return 符号
	 */
	public String getSymbol(int index) {
		if (index < 0 || index > 9) {
			index = 0;
		}
		return symbols[index];
	}

}
