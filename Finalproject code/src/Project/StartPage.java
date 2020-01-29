package Project;

import java.awt.EventQueue;

import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class StartPage {

	private JFrame frmDisplayText;
    private JTextArea textArea;
    private JTextField txtFileParsingResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage window = new StartPage();
					window.frmDisplayText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDisplayText = new JFrame();
		frmDisplayText.setBackground(Color.ORANGE);
		frmDisplayText.setTitle("Display Text");
		frmDisplayText.setBounds(100, 100, 800, 800);
		frmDisplayText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDisplayText.getContentPane().setLayout(null);

		 JOptionPane.showMessageDialog(null, "SHOWING PARSED DATA"); 
	    textArea = new JTextArea();
		textArea.setBounds(10, 53, 488, 534);
		frmDisplayText.getContentPane().add(textArea);
		
		JButton btnModereachability = new JButton("SELECT MODE");
		btnModereachability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SelectMode();
			}
		});
		btnModereachability.setBounds(563, 430, 194, 49);
		frmDisplayText.getContentPane().add(btnModereachability);
		String s = "";
		int count=0;
		XmlParsing parse = new XmlParsing();
		List<State> list= parse.xmlParseData();
		for(State t : list) {
			count++;
			s+=t.name;
			s+="\n";
		}
		
		//textArea.setText("Total no of states:"+count+"\n");
		textArea.setText("Total no of states:"+count+"\n"+"The states are listed below"+"\n"+s);
		
		txtFileParsingResult = new JTextField();
		txtFileParsingResult.setText("FILE PARSING RESULT");
		txtFileParsingResult.setBounds(186, 11, 159, 31);
		frmDisplayText.getContentPane().add(txtFileParsingResult);
		txtFileParsingResult.setColumns(10);
	}
}

