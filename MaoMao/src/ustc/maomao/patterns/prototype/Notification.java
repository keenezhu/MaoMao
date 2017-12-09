
package ustc.maomao.patterns.prototype;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         COS系统通知原型对象类型（包含域通知标题，通知内容，尾注等）
 * 
 */
public class Notification implements Cloneable {

	private String title;
	private String content;

	private NotificationFooter footer;

	Notification(NotificationFooter foot) {
		footer = foot;
	}

	/*
	 * 克隆Notification对象（浅拷贝--shallow copy，共享footer）
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Notification clone() {
		// TODO Auto-generated method stub
		try {
			return (Notification) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
