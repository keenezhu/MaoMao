package ustc.maomao.patterns.memento;

import java.util.ArrayList;
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
 *         守护者类
 * 
 */
public class CareTaker {
	private List<IMemento> mementos = new ArrayList<IMemento>();// 保存备忘录的数据结构
	private int cursor;// 备忘录游标

	/**
	 * 将备忘录对象保存
	 * 
	 * @param memento
	 *            备忘录
	 */
	public void addMemento(IMemento memento) {
		mementos.add(memento);
		System.out.println("备忘录已保存!");
	}

	/**
	 * 根据游标获取备忘录
	 * 
	 * @return 备忘录
	 */
	public IMemento getMemento() {
		System.out.println("备忘录已获取!");
		cursor++;
		int index = mementos.size() - cursor;
		if (index <= 0) {
			index = 0;
			cursor = 0;
			System.out.println("已是最后一个备忘录!再一次恢复，将从最近的备忘位置开始!");
		}
		return mementos.get(index);
	}
}
