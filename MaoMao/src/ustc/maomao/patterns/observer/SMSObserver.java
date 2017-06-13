package ustc.maomao.patterns.observer;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         短信订阅新闻的观察者类
 *      
 */
public class SMSObserver implements NewsObserver {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.observer.NewsObserver#update(ustc.maomao.patterns.observer.News)
	 */
	@Override
	public void update(News message) {
		// TODO Auto-generated method stub
		System.out.println("收到新闻，根据SMS方式执行行为！");
	}

}
