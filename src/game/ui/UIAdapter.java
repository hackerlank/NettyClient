package game.ui;

import game.entity.Cmd;
import game.service.cmd.CmdService;

/**
 * 界面适配器
 * 
 * @author wcy 2016年4月11日
 *
 */
public class UIAdapter implements BaseUI {

	protected CmdService cmdService;

	public void setCmdService(CmdService cmdService) {
		this.cmdService = cmdService;
	}

	@Override
	public void initData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		while (true) {
			Cmd cmd = null;
			try {
				cmd = cmdService.getCmd();
			} catch (CmdException e) {
				e.printStackTrace();
				continue;
			}
		}
	}

}
