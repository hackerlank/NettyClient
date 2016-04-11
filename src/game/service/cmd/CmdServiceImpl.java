package game.service.cmd;

import game.cache.OriginCmdCache;
import game.entity.Cmd;
import game.entity.Input;
import game.ui.CmdException;

public class CmdServiceImpl implements CmdService {

	@Override
	public Cmd getCmd() throws CmdException {

		String originContent = Input.input().nextLine();

		OriginCmdCache.addOriginCmd(originContent);
		Cmd cmd = this.convertCmd(originContent);

		return cmd;
	}

	private Cmd convertCmd(String originContent) throws CmdException {

		Cmd cmd = null;
		try {
			String[] array = originContent.split(" ");
			String type = array[0];
			String action = array[1];
			int len = array.length;
			Cmd tempCmd = new Cmd();
			tempCmd.setType(type);
			tempCmd.setAction(action);

			for (int i = 2; i < len; i += 2) {
				String key = array[i];
				String value = array[i + 1];
				tempCmd.addParams(key, value);
			}

			cmd = tempCmd;

		} catch (Exception e) {
			throw new CmdException();
		}
		
		return cmd;
	}

}
