import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNew = new JButton("btn text");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JFrame newFrame = new JFrame();
				newFrame.setVisible(true);
			}
		});
		btnNew.setBounds(57, 123, 157, 45);
		frame.getContentPane().add(btnNew);
		
		JFormattedTextField ClickMeYou = new JFormattedTextField();
		ClickMeYou.setEditable(false);
		ClickMeYou.setHorizontalAlignment(SwingConstants.CENTER);
		ClickMeYou.setText("click me you bitch!!!!!!");
		ClickMeYou.setBounds(57, 50, 157, 45);
		frame.getContentPane().add(ClickMeYou);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setIndeterminate(true);
		progressBar.setValue(69);
		progressBar.setBounds(10, 209, 448, 21);
		frame.getContentPane().add(progressBar);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("New button");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		menuBar.add(btnNewButton_4);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		menuBar.add(mntmNewMenuItem);
		
		JFrame frame = new JFrame ("Frame2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
