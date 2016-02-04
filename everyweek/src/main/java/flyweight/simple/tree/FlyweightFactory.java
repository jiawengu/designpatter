package flyweight.simple.tree;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	public Map<Integer, YangTree> map;
	private static FlyweightFactory flyweightFactory;
	private FlyweightFactory(){
		map = new HashMap<Integer, YangTree>();
	}
	
	public YangTree creatTree(int height){
		YangTree yang = map.get(height);
		if(yang != null){
			return yang;
		}else{
			yang = new YangTree();
			yang.setHeight(height);
			map.put(height, yang);
			return yang;
		}
	}
	
	public static FlyweightFactory genInstance(){
		if(flyweightFactory == null){
			syncInit();
		}
		return flyweightFactory;
	}

	private static synchronized void syncInit() {
		if(flyweightFactory == null){
			flyweightFactory = new FlyweightFactory();
		}
	}
}
