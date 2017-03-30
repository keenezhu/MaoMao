/**
 * 
 */
package ustc.maomao.patterns.prototype;

import java.awt.Image;

/**
 * @author keene C. zhu
 * 
 *         该代码遵循Apache License Version 2.0, January
 *         2004。详细见http://www.apache.org/licenses/
 * 
 *         Copyright {2015-2017} {keene C. zhu}
 * 
 *         designed by keene, implemented by {coder name}
 * 
 *         COS系统通知的尾注（公司logo，联系地址等）
 *      
 */
public class NotificationFooter {
       private Image cosLogo;
       private String cosAddr;
       private String cosTel;
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
