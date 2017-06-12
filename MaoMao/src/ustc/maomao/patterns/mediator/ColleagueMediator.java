package ustc.maomao.patterns.mediator;

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
 *         仲裁者类
 * 
 */
public class ColleagueMediator {

	private Patron patron;// 协作者patron
	private Staff staff;// 协作者staff
	private Deliverer deliverer;// 协作者deliverer

	public ColleagueMediator(Patron p, Staff s, Deliverer d) {
		patron = p;
		staff = s;
		deliverer = d;
	}

	/**
	 * 仲裁行为
	 * 
	 * @param c
	 *            协作者
	 */
	public void mediate(Colleague c) {
		if (patron == c) {
			if (!staff.requestDelivery(patron.getOrder())) {
				patron.receiveMessage("订单验证不通过!");
			}
		} else if (staff == c) {
			deliverer.deliver(patron.getOrder());
		} else if (deliverer == c) {
			patron.receiveMessage("订单已配送！");
			staff.receiveMessage("订单已配送！");
		}
	}
}
