package ustc.maomao.patterns.flyweight;

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
 *         消息发送器
 * 
 */
public class MessageSender {
	
	private List<Patron> receivers;// 消息接收者

	/**
	 * @param receivers the receivers to set
	 */
	public void setReceivers(List<Patron> receivers) {
		this.receivers = receivers;
	}

	/**
	 * 根据接收者列表发送消息
	 */
	public void sendGreetingMessage() {		
		for (Patron p : receivers) {
			IMessage message = GreetingMessageFac.obtainMessage(p.getLevel());
			message.send(p);
		}
	}
}
