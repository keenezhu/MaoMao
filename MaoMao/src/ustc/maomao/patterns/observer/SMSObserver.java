package ustc.maomao.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.support.Patron;

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
public class SMSObserver implements NewsObserver,IManageSubscriber {

	private List<Patron> patrons = new ArrayList<Patron>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.observer.NewsObserver#update(ustc.maomao.patterns.
	 * observer.News)
	 */
	@Override
	public void update(News message) {
		for (Patron p : patrons) {
			sendSMS(p,message);
		}
	}

	private void sendSMS(Patron p,News message) {
		System.out.println(p.getName() + "收到SMS新闻!");
	}

	
	@Override
	public void addPatron(Patron p) {
		// TODO Auto-generated method stub
		patrons.add(p);
	}

	
	@Override
	public void removePatron(Patron p) {
		// TODO Auto-generated method stub
		patrons.remove(p);
	}

}
