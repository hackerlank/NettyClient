package game.service.cmd;

import game.entity.Cmd;

public interface CmdService {
	Cmd getCmd() throws CmdException;
}
