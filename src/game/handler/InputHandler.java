package game.handler;

import game.entity.Cmd;
import game.service.cmd.CmdException;
import game.service.cmd.CmdService;

import java.util.Map;

/**
 * 
 * @author wcy 2016年4月13日
 *
 */
public class InputHandler {
	private CmdService cmdService;

	public void setCmdService(CmdService cmdService) {
		this.cmdService = cmdService;
	}

	public void getCmd(String content) {
		try {
			Cmd cmd = cmdService.convertCmd(content);
			String type = cmd.getType();
			String action = cmd.getAction();
			Map<String, Object> paramMap = cmd.getParamMap();
		} catch (CmdException e1) {
			e1.printStackTrace();
		}
	}
}
