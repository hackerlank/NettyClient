package game.module.cmd.service;

import game.entity.Cmd;

public interface CmdService {
	Cmd getCmd();
	
	boolean checkCmd(Cmd cmd);
}
