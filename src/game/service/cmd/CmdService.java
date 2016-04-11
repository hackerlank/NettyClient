package game.service.cmd;

import game.entity.Cmd;
import game.ui.CmdException;

public interface CmdService {
	Cmd getCmd() throws CmdException;
}
