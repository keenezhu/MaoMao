
package ustc.maomao.patterns.prototype;

import java.awt.Image;


/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         COS系统通知的尾注（公司logo，联系地址等）
 *      
 */
public class NotificationFooter {
	
       private Image cosLogo;
       private String cosAddr;
       private String cosTel;
       private Image background;
       
	/**
	 * @return the background
	 */
	public Image getBackground() {
		return background;
	}
	/**
	 * @param background the background to set
	 */
	public void setBackground(Image background) {
		this.background = background;
	}
	/**
	 * @return the cosLogo
	 */
	public Image getCosLogo() {
		return cosLogo;
	}
	/**
	 * @param cosLogo the cosLogo to set
	 */
	public void setCosLogo(Image cosLogo) {
		this.cosLogo = cosLogo;
	}
	/**
	 * @return the cosAddr
	 */
	public String getCosAddr() {
		return cosAddr;
	}
	/**
	 * @param cosAddr the cosAddr to set
	 */
	public void setCosAddr(String cosAddr) {
		this.cosAddr = cosAddr;
	}
	/**
	 * @return the cosTel
	 */
	public String getCosTel() {
		return cosTel;
	}
	/**
	 * @param cosTel the cosTel to set
	 */
	public void setCosTel(String cosTel) {
		this.cosTel = cosTel;
	}
       
}
