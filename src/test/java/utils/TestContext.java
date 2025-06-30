package utils;
import configs.ConfigLoader;
import java.util.HashMap;
import java.util.Map;

public class TestContext {
	public Base base;  //public as not getter and setter methods
	//public ConfigLoader configLoader;
	public PageObjectManager pageObjectManager;
	private final Map<String, Object> contextData = new HashMap<String,Object>();

	public TestContext() {
		base = new Base(); 
		//configLoader = base.getConfigs();		
		pageObjectManager = new PageObjectManager(base.getConfigs(), base.getDriver());	
		
	}

    public void set(String key, Object value) {

		contextData.put(key,value);
	}	
    
	public Object get(String key) {
		return contextData.get(key);
	}
	public <T> T get(String key, Class<T> type) {
		return type.cast(contextData.get(key));
	}
	public void clear() {
		contextData.clear();
	}
}