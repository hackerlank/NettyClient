package game.service.ui;

import game.ui.base.UI;

public class UIServiceImpl implements UIService {
	@Override
	public void start(UI ui) {
		ui.initData();
		ui.show();
		ui.start();
	}
	
	
}
