package game.util;

import game.service.cmd.CmdService;
import game.service.cmd.CmdServiceImpl;
import game.service.ui.UIService;
import game.service.ui.UIServiceImpl;
import game.ui.UILogin;

public class Spring {
	
	/*===========================UI================================*/
	public static UILogin uiLogin = new UILogin();
	
	/*=============================================================*/
	
	/*========================Service==============================*/
	public static CmdService cmdService = new CmdServiceImpl();
	public static UIService uiService = new UIServiceImpl();
	/*=============================================================*/
	
	

	private static void initClassRelation() {
		/*===========================UI================================*/
		uiLogin.setCmdService(cmdService);		
		/*=============================================================*/
		
		/*========================Service==============================*/
		
		/*=============================================================*/
		
	}
	static{
		initClassRelation();
	}
}
