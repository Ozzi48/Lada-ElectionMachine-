import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frame;
	private JTable table;
	private JComboBox comboBox;
	private JTextField textField_group;
	private JTextField textField_lastname;
	private JTextField textField_firstname;
	private JTextField textField_id;

private void initialize() {
		frame.setBounds(100, 100, 1050, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblUserName = new JLabel("First name:");
		lblUserName.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 18));
		lblUserName.setBounds(26, 201, 110, 38);
		frame.getContentPane().add(lblUserName);

		JLabel lblUserId_1_1 = new JLabel("Last name:");
		lblUserId_1_1.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 18));
		lblUserId_1_1.setBounds(26, 238, 110, 38);
		frame.getContentPane().add(lblUserId_1_1);

		JLabel lblUserId_1_1_1 = new JLabel("Class group:");
		lblUserId_1_1_1.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 18));
		lblUserId_1_1_1.setBounds(26, 275, 110, 38);
		frame.getContentPane().add(lblUserId_1_1_1);

		textField_lastname = new JTextField();
		textField_lastname.setColumns(10);
		textField_lastname.setBounds(140, 238, 243, 30);
		frame.getContentPane().add(textField_lastname);

		textField_firstname = new JTextField();
		textField_firstname.setColumns(10);
		textField_firstname.setBounds(140, 201, 243, 30);
		frame.getContentPane().add(textField_firstname);

		textField_id = new JTextField();
		textField_id.setEnabled(false);
		textField_id.setColumns(10);
		textField_id.setBounds(341, 539, -8, -8);
		frame.getContentPane().add(textField_id);

		textField_group = new JTextField();
		textField_group.setBounds(90, 523, -16, -8);
		frame.getContentPane().add(textField_group);
		textField_group.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(453, 67, 547, 486);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setToolTipText("");
		table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"First Name", "Last Name", "Group", "Result"
			}
		));
		JButton btnAddUser = new JButton("ADD user");
		btnAddUser.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 16));
		btnAddUser.setBounds(17, 333, 132, 48);
		frame.getContentPane().add(btnAddUser);
		JButton btnEditUser = new JButton("Edit user");
		btnEditUser.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 16));
		btnEditUser.setBounds(159, 333, 132, 48);
		frame.getContentPane().add(btnEditUser);

		JButton btnRemoveUser = new JButton("remove user");
		btnRemoveUser.setFont(new Font("Soup of Justice (cyrillic by shurupkin)", Font.PLAIN, 16));
		btnRemoveUser.setBounds(301, 333, 132, 48);
		frame.getContentPane().add(btnRemoveUser);
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "CA00CH45-3001", "YH00BM47-3004", "KV00CP21-3001"}));
		comboBox.setBounds(146, 280, 233, 30);
		frame.getContentPane().add(comboBox);

	}

}