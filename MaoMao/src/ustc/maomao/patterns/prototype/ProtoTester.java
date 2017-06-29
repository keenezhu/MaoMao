
package ustc.maomao.patterns.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ustc.maomao.patterns.support.NotificationSender;
import ustc.maomao.patterns.support.PatternTester;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         原型模式测试器
 * 
 */
public class ProtoTester implements PatternTester {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		List<HashMap<String, String>> dataSource = new ArrayList<HashMap<String, String>>();
		// 构造测试通知的数据源
		for (int i = 0; i < 100; i++) {

			HashMap<String, String> data = new HashMap<String, String>();
			if ((i % 3) == 0) {
				data.put("title", "order gernerated");
				data.put("content", "noti content");
			} else {
				data.put("title", "order finished");
				data.put("content", "noti content");
			}
			dataSource.add(data);
		}
		// 使用通知发送器发送通知
		NotificationSender ns = new NotificationSender(NotificationProtoManager.getNotificationProto("order"));

		for (HashMap<String, String> data : dataSource) {
			ns.sendNotification(data.get("title"), data.get("content"));
		}

	}

}
