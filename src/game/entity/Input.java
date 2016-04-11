package game.entity;

import java.util.Scanner;

public class Input {
	private static Scanner _instance = null;

	private Input() {
	}

	public static Scanner input() {
		if (_instance == null) {
			_instance = new Scanner(System.in);
		}
		return _instance;
	}
	
	public static void destoryInstance(){
		if(_instance!=null){
			_instance.close();
			_instance = null;
		}
	}
}
