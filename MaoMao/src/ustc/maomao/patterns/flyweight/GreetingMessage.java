package ustc.maomao.patterns.flyweight;

import ustc.maomao.patterns.support.CosLogo;
import ustc.maomao.patterns.support.Footer;
import ustc.maomao.patterns.support.Header;
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
 *         问候消息
 * 
 */
public class GreetingMessage implements IMessage {
	
	private CosLogo logo = CosLogo.instance();// 商标
	private Footer footer = Footer.instance();// 尾注
	private Header header;// 头注

	public GreetingMessage(Header h) {
		header = h;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.flyweight.IMessage#send()
	 */
	@Override
	public boolean send(Patron r) {
		Patron receiver=r;// 消息接收者
		System.out.println(r.getName()+"的消息已发送");
		return true;
	}

}
