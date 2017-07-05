package ustc.maomao.patterns.builder;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.support.MenuItem;
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
 *         {usage}
 *      
 */
public class BuilderTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		List<MenuItem> dataSource=new ArrayList<MenuItem>();		
		for(int i=0;i<10;i++){
			MenuItem item=new MenuItem();
			item.setmType(i);
			item.setmName("MenuItem"+i);
			item.setmPrice(i*1.5f);
			dataSource.add(item);
		}
		
		BuilderDirector director=new BuilderDirector();
		
		
		JSONBuilder jsonBuilder=new JSONBuilder();
		
		director.setBuilder(jsonBuilder);
		director.construct( dataSource);		
		
		XMLBuilder xmlBuilder=new XMLBuilder();
		director.setBuilder(xmlBuilder);
		director.construct(dataSource);
		
		System.out.println(jsonBuilder.getJsonText().getText());
		System.out.println("--------分割线--------------");
		System.out.println(xmlBuilder.getXMLText().getText());
		
		
	}

}
