/**
 * 
 */
/**
 * @author AIM
 *
 */
package game.cache;

import java.util.ArrayList;
import java.util.List;

import game.entity.Cmd;

/**
 * ����洢��
 * 
 * @author AIM
 *
 */
public class CmdCache {
	private static List<Cmd> cmdList = new ArrayList<>();

	public static void pushCmd(Cmd cmd) {
		cmdList.add(cmd);
	}

	public static List<Cmd> getAllCmd() {
		return cmdList;
	}
}