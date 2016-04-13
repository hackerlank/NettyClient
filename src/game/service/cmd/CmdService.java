package game.service.cmd;

import game.entity.Cmd;

public interface CmdService {
	
	Cmd convertCmd(String originContent) throws CmdException;
}
