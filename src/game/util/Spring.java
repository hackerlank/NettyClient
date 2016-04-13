package game.util;

import game.entity.Input;
import game.handler.InputHandler;
import game.service.cmd.CmdService;
import game.service.cmd.CmdServiceImpl;
import game.service.ui.UIService;
import game.service.ui.UIServiceImpl;
import game.ui.UILogin;

public class Spring {
	/*===========================Entity================================*/
	public static InputHandler inputHandler = new InputHandler();
	
	/*=============================================================*/
	
	/*===========================UI================================*/
	public static Input input = new Input();
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
		
		/*===========================Entity================================*/
		inputHandler.setCmdService(cmdService);
		
		/*=============================================================*/
		
		/*========================Service==============================*/
		
		/*=============================================================*/
		
	}
	static{
		initClassRelation();
	}
}
