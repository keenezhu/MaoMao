package ustc.maomao.patterns.proxy;

import java.util.Random;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜单项图片代理
 *      
 */
public class MenuImageProxy implements MenuImage {
	
	private RealMenuImage subject;//目标菜单项图片
	private ImageUpdater callback;//回调接口对象
	
	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.proxy.MenuImage#show()
	 */
	@Override
	public void show(ImageUpdater updater) {
		callback=updater;
		if(subject==null){
        System.out.println("显示菜单项代理图片");
        new Thread(new LazyLoadingTask()).start();        
		}else{
			subject.show(callback);
		}
	}
	
	/**
	 * 延迟加载目标菜单项图片任务
	 *      
	 */
	class LazyLoadingTask implements Runnable{

		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Random r=new Random();
			try {
				Thread.sleep(r.nextInt(10)*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			subject=new RealMenuImage();
			subject.show(callback);
		}
		
	}

}
