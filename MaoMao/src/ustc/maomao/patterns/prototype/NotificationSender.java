
package ustc.maomao.patterns.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


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

	//通知的内容数据源
	private List<HashMap<String, String>> notis;
	//存储通知的发送队列
	private Queue<Notification> sendQueue=new LinkedBlockingQueue<Notification>();
    
	/**
	 * 通过通知原型对象复制，完成新通知对象创建
	 */
	public void sendNotification() {
		
		Notification notiProto = new Notification();		
		// initialize notiProto
		//
		long startTime=System.currentTimeMillis();
        //根据数据源构造通知对象，并将构造后的通知对象发出		
		for (HashMap<String, String> noti : notis) {
			Notification notification = notiProto.clone();
			if (notification != null) {
				notification.setContent(noti.get("content"));
				notification.setTitle(noti.get("title"));
				send(notification);
				System.out.println(notification.getTitle()+"通知已发送");
			}
		}
		System.out.println("共用时毫秒："+(System.currentTimeMillis()-startTime));		
	}

	/**
	 * @param noti
	 */
	private void send(Notification noti) {
		sendQueue.add(noti);		
		//other operations
	}

	/**
	 * @return the sendQueue
	 */
	public Queue<Notification> getSendQueue() {
		return sendQueue;
	}

	/**
	 * @param notis the notis to set
	 */
	public void setNotis(List<HashMap<String, String>> notis) {
		this.notis = notis;
	}	
	
}
