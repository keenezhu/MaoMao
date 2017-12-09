
package ustc.maomao.patterns.support;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import ustc.maomao.patterns.prototype.Notification;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         发送Notification的客户端
 * 
 */
public class NotificationSender {

	// 存储通知的发送队列
	private Queue<Notification> sendQueue = new LinkedBlockingQueue<Notification>();

	Notification notiProto; // 通知原型对象

	public NotificationSender(Notification proto) {
		notiProto = proto;
	}

	/**
	 * 通过通知原型对象复制，完成新通知对象创建
	 */
	public void sendNotification(String title, String content, Employee receiver) {

		Notification notification = notiProto.clone();
		notification.setContent(content);
		notification.setTitle(title);
		send(notification, receiver);

		System.out.println(title + " 通知已发送！");

	}

	/**
	 * 发送通知
	 * 
	 * @param noti
	 *            通知
	 */
	private void send(Notification noti, Employee receiver) {

		// other operations
	}

}
