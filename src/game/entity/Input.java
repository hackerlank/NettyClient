package game.entity;

import game.cache.OriginCmdCache;
import game.handler.InputHandler;
import game.service.cmd.CmdException;
import game.service.cmd.CmdService;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Input extends JFrame {

	private InputHandler inputHandler = null;

	public void setInputHandler(InputHandler inputHandler) {
		this.inputHandler = inputHandler;
	}

	public void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private JTextField text;
	private int cmdIndex = -1;

	public Input() {
		this.setResizable(false);

		int width = 300;
		int height = 60;
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(dimension.width / 2 - width / 2, dimension.height / 2 - height / 2, width, height);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

		this.setTitle("Game CMD");
		this.add(this.getJTextField());

		text.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					String content = text.getText().trim();
					if (content == null || content.equals("")) {
						return;
					}
					text.setText("");
					OriginCmdCache.addOriginCmdAtFirst(content);
					inputHandler.getCmd(content);
					System.out.println(content);
					cmdIndex = -1;

				}

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					List<String> list = OriginCmdCache.getOriginCmdList();
					if (list.size() == 0) {
						return;
					}
					if (cmdIndex + 1 >= list.size()) {
						cmdIndex = list.size() - 1;
					} else {
						cmdIndex++;
					}

					String context = list.get(cmdIndex);
					text.setText(context);
				}

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					List<String> list = OriginCmdCache.getOriginCmdList();
					if (list.size() == 0) {
						return;
					}
					if (cmdIndex <= 0) {
						cmdIndex = 0;
					} else {
						cmdIndex--;
					}
					String context = list.get(cmdIndex);
					text.setText(context);
				}
			}
		});
	}

	private JTextField getJTextField() {
		if (text == null) {
			text = new JTextField();
			text.setColumns(25);
			text.setEditable(true);
			text.setBounds(0, 0, 160, 20);
		}
		return text;
	}
}
