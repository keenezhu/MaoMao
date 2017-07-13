package ustc.maomao.patterns.prototype;

import java.util.HashMap;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         通知原型管理器
 * 
 */
public class NotificationProtoManager {

	private static HashMap<String, Notification> manager = new HashMap<String, Notification>();

	static {
		/**
		 * 订单通知原型构造
		 */
		NotificationFooter orderFooter = new NotificationFooter();
		// 初始化orderFooter
		//
		manager.put("order", new Notification(orderFooter));
		
		/**
		 * 系统通知原型构造
		 */
		NotificationFooter sysFooter = new NotificationFooter();
		// 初始化sysFooter
		//
		manager.put("system", new Notification(sysFooter));

		/**
		 * 会员通知原型构造
		 */
		NotificationFooter patronFooter = new NotificationFooter();
		// 初始化patronFooter
		//
		manager.put("patron", new Notification(patronFooter));
	}

	/**
	 * 根据通知类型获取原型对象
	 * @param type 通知类型 
	 * @return 对应类型的原型对象
	 */
	public static Notification getNotificationProto(String type) {
		return manager.get(type);
	}

}
