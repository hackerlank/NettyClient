package game.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 命令格式
 * 
 * @author wcy 2016年4月11日
 *
 */
public class Cmd {
	/**类型*/
	private String type;
	/**动作*/
	private String action;
	/**参数*/
	private Map<String, Object> paramMap = new HashMap<>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void addParams(String key, Object value) {
		paramMap.put(key, value);
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

}
