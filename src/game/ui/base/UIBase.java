package game.ui.base;

import java.util.Map;

import game.entity.Cmd;
import game.service.cmd.CmdException;
import game.service.cmd.CmdService;

/**
 * 界面适配器
 * 
 * @author wcy 2016年4月11日
 *
 */
public class UIBase implements UI {

	protected CmdService cmdService;

	public void setCmdService(CmdService cmdService) {
		this.cmdService = cmdService;
	}

	@Override
	public void initData() {

	}

	@Override
	public void show() {

	}

	@Override
	public void start() {
		while (true) {
			Cmd cmd = null;
			try {
				cmd = cmdService.getCmd();
				String type = cmd.getType();
				String action = cmd.getAction();
				Map<String,String> paramMap = cmd.getParamMap();
			} catch (CmdException e) {
				e.printStackTrace();
				continue;
			}
		}
	}

}
