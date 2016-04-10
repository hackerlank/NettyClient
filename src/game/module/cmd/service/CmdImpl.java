package game.module.cmd.service;

import java.util.Scanner;

import game.entity.Cmd;

public class CmdImpl implements CmdService{

	private Scanner in = new Scanner(System.in);
	@Override
	public Cmd getCmd() {
		Cmd cmd = new Cmd();
		String context = in.nextLine();
		cmd.setOrigin(context);
		
		return cmd;
	}
	
	@Override
	public boolean checkCmd(Cmd cmd) {
		//TODO 
		if(true){
			return true;
		}
		return false;
	}

}
