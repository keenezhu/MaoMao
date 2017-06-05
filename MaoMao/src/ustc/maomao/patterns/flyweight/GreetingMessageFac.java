package ustc.maomao.patterns.flyweight;

import java.util.HashMap;

import ustc.maomao.patterns.support.Header;
import ustc.maomao.patterns.support.PatronLevel;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         消息工厂
 * 
 */
public class GreetingMessageFac {
	HashMap<PatronLevel, IMessage> messagePool = new HashMap<PatronLevel, IMessage>();//消息池

	/**
	 * 根据客户等级构造返回消息池中的享元消息
	 * @param level 客户等级
	 * @return 享元消息
	 */
	public IMessage obtainMessage(PatronLevel level) {
		IMessage m = null;
		switch (level) {
		case Normal: {
			m = messagePool.get(PatronLevel.Normal);
			if (m == null) {
				Header h = new Header(PatronLevel.Normal);
				m = new GreetingMessage(h);
				messagePool.put(PatronLevel.Normal, m);
			}
			break;
		}
		case VIP: {
			m = messagePool.get(PatronLevel.VIP);
			if (m == null) {
				Header h = new Header(PatronLevel.VIP);
				m = new GreetingMessage(h);
				messagePool.put(PatronLevel.VIP, m);
			}
			break;
		}
		case SVIP: {
			m = messagePool.get(PatronLevel.SVIP);
			if (m == null) {
				Header h = new Header(PatronLevel.SVIP);
				m = new GreetingMessage(h);
				messagePool.put(PatronLevel.SVIP, m);
			}
			break;
		}
		}
		return m;
	}
}
