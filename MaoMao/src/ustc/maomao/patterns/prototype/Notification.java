/**
 * 
 */
package ustc.maomao.patterns.prototype;

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
 *         COS系统通知对象类型（通知标题，通知内容，尾注等）
 *      
 */
public class Notification implements Cloneable{
        private String title;
        private String content;
        private NotificationFooter footer;
        
        public Notification(){
        	footer=new NotificationFooter();
        	//initialize footer
        }
        
		/* 克隆Notification对象（浅拷贝--shallow copy，共享footer）
		 * @see java.lang.Object#clone()
		 */
		@Override
		protected Notification clone()  {
			// TODO Auto-generated method stub
			try {
				return (Notification)super.clone();
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
		 * @param title the title to set
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
		 * @param content the content to set
		 */
		public void setContent(String content) {
			this.content = content;
		}
		/**
		 * @return the footer
		 */
		public NotificationFooter getFooter() {
			return footer;
		}
		        
}
