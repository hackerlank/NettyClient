package game.ui;

import game.entity.Cmd;
import game.module.cmd.service.CmdService;

public class UIMain extends UIAdapter {
	
	private CmdService cmdService;
	
	public void setCmdService(CmdService cmdService){
		this.cmdService = cmdService;
	}
	public UIMain() {
		// TODO Auto-generated constructor stub
		System.out.println("this is myGame,welcome!");
	}
	
	public void start(){
		while(true){
			Cmd cmd = cmdService.getCmd();
			
		}
	}

	

}
