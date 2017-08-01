package ustc.maomao.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.support.MealOrder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         未审核订单
 * 
 */
public class PendingOrders {

	private List<MealOrder> orderSet = new ArrayList<MealOrder>();// 聚合订单

	private int modified = 0;//orderSet修改指示器变量

	/**
	 * 向orderSet中添加订单
	 * 
	 * @param o
	 *            订单
	 * @return 添加结果
	 */
	public boolean add(MealOrder o) {
		if (o != null) {
			orderSet.add(o);
			modified++;
			return true;
		}
		return false;
	}

	/**
	 * 从orderSet中删除订单
	 * 
	 * @param o
	 *            订单
	 * @return 删除结果
	 */
	public boolean remove(MealOrder o) {
		if (o != null) {
			orderSet.remove(o);
			modified++;
			return true;
		}
		return false;
	}

	/**
	 * 获取迭代器
	 * 
	 * @return 迭代器
	 */
	public OrderIterator iterate() {
		return new SequenceIterator(modified);
	}

	private class SequenceIterator implements OrderIterator {

		int currentIndex = 0;// 当前元素索引
		int changed = 0;// 修改状态初始值
		int size = 0;// 聚合体大小

		SequenceIterator(int value) {
			changed = value;
			size = orderSet.size();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#down()
		 */
		@Override
		public MealOrder down() {
			check();
			if (size == 0 || currentIndex >= (size - 1)) {
				return null;
			} else {
				currentIndex++;
				return orderSet.get(currentIndex);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#first()
		 */
		@Override
		public MealOrder first() {
			// TODO Auto-generated method stub
			check();
			if (size == 0) {
				return null;
			} else {
				currentIndex = 0;
				return orderSet.get(currentIndex);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#up()
		 */
		@Override
		public MealOrder up() {
			check();
			if (size == 0 || currentIndex <= 0) {
				return null;
			} else {
				currentIndex--;
				return orderSet.get(currentIndex);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#last()
		 */
		@Override
		public MealOrder last() {
			check();
			if (size == 0) {
				return null;
			} else {
				currentIndex = size - 1;
				return orderSet.get(currentIndex);
			}
		}

		/**
		 * 检查迭代时，聚合体是否被修改过
		 * 
		 * @throws Exception
		 */
		private void check() {
			if (changed != modified) {
				throw new RuntimeException("订单集合已被修改，无法完成迭代！");
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			check();
			if (size != 0 && currentIndex < (size-1)) {
				return true;
			}
			return false;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see ustc.maomao.patterns.iterator.OrderIterator#hasLast()
		 */
		@Override
		public boolean hasLast() {
			check();
			if (size != 0 && currentIndex > 0) {
				return true;
			}
			return false;
		}

	}

}
