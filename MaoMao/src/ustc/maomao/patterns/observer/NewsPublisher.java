package ustc.maomao.patterns.observer;

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
 *         新闻发布类
 * 
 */
public class NewsPublisher {
	private News news;// 新闻
	private List<NewsObserver> observers = new ArrayList<NewsObserver>();// 观察者列表

	/**
	 * 新闻生成，并通知所有的观察者
	 */
	public void generateNews() {
		news = new News();
		notifyObserver();
	}

	/**
	 * 通知观察者
	 */
	private void notifyObserver() {
		for (NewsObserver o : observers) {
			o.update(news);
		}
	}

	/**
	 * 添加观察者
	 * 
	 * @param o
	 *            观察者
	 */
	public void addObserver(NewsObserver o) {
		observers.add(o);
	}

	/**
	 * 删除观察者
	 * 
	 * @param o
	 *            观察者
	 */
	public void removeObserver(NewsObserver o) {
		observers.remove(o);
	}
}
