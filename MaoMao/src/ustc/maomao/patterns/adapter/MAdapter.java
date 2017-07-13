package ustc.maomao.patterns.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import ustc.maomao.patterns.support.MenuItem;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         将List<Item>类型数据转换至目标类型List<HashMap<String,String>>的适配器类型
 *      
 */
public class MAdapter implements MList {
	
	private MData mData;
	
	public MAdapter(MData data){
		mData=data;
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.adapter.MList#getData()
	 */
	@Override
	public List<HashMap<String, String>> getData() {
		List<MenuItem> dataSource=mData.getMenuItems();
		List<HashMap<String,String>> data=new ArrayList<HashMap<String,String>>();
		for(MenuItem item:dataSource){
			HashMap<String,String> element=new HashMap<String,String>();
			element.put("mType", String.valueOf(item.getmType()));
			element.put("mName", item.getmName());
			element.put("mPrice", String.valueOf(item.getmPrice()));
			data.add(element);
		}
		return data;
	}

}
