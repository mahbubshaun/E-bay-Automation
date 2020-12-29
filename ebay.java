import java.awt.Color;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultEditorKit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.JProgressBar;
import org.apache.commons.io.FileUtils;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ebay{

	private JFrame frame;
	protected static ChromeDriver driver2;
	protected static ChromeOptions options2;
    public static JTextArea text;
    public static String path;
    
    public static ChromeOptions options;
    
    public static WebDriver driver;
    
  
    
    public static String l;
    
    public static String ip;
   // static SheetsQuickstart sp = new SheetsQuickstart();
    public static String port;
    
    public static String user;
    
    public static String passw;
    public static ArrayList<String> ar = new ArrayList<String>();
    public static ArrayList<String> ar3 = new ArrayList<String>();
    public static int off;
    
    public static String addr;
    public static String l_cat;
    public static String country;
    public static boolean ex;
	public static String city;
	public static String state;
	protected static int p;
    
    public static String page_n;
    public static boolean re_p;
    public static int total;
    
    public static int p_w ;
    private static JTextField txtProxypacketstreamio;
    
    public static int sa;
    
    public static boolean pr;
    private static JTextField txtTestingaccountahnahadafg;

    public static int gi;
    public static JTextField textField;
    public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	
	 public static JTextField textField_4;
	
	public static JComboBox comboBox;
	
	public static String url;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					try{
						Connection myConn =null;
						
				        Statement myStmt=null;
				        ResultSet myRs=null;
				  
				        String dburl="jdbc:mysql://database-1.cuzswbxyyf4l.us-east-2.rds.amazonaws.com:3306/bots";
				        String user="root";
				        String pass="Hacershaun1";
					 myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
			           myStmt=(Statement) myConn.createStatement();
			           String sql ="Select license from bot_v where bot_name='ferdinandloebel'";
			           myRs= myStmt.executeQuery(sql);
			           
			           if((myRs.next()))
			           {
			        	   String li = myRs.getString("license");
			        	   if(li.equals("true")){
			        		   ebay window = new ebay();
								window.frame.setVisible(true);
								gi=0;
			        	   }
			        	   else{
			        		   JOptionPane.showMessageDialog(null, "NO internet connection or something is not right..");
			        	   }
			           }
			           
			           myConn.close();
			           myStmt.close();
			           
			           myRs.close();
			           
					}catch(Exception b)
					{
					 b.printStackTrace();
					}
					pr=false;
					JFileChooser fr = new JFileChooser();
				     FileSystemView fw = fr.getFileSystemView();
				     
				     String path = new File(".").getCanonicalPath();
				     
						System.out.println("Application path is: "+path);
						System.setProperty("webdriver.chrome.driver",""+path+"\\chromedriver\\chromedriver.exe");
						
						 ChromeOptions options2 = new ChromeOptions();
							options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
							options2.setExperimentalOption("useAutomationExtension", false);
						//	options2.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
		                    options2.addArguments("--disable-blink-features=AutomationControlled");
		                    options2.setCapability("requireWindowFocus", true);
		                    options2.addArguments("--ignore-certificate-error");
		                    options2.addArguments("start-maximized");
		                    
		                    options2.addArguments("--user-data-dir="+path+"\\ebay");
		               //    options2.addArguments("window-size=1366,768");
                            
                        //    options2.setExperimentalOption("prefs", prefs4); 
                            
		                           driver2 = new ChromeDriver(options2);
				     
				     
				     
				     
				 
				     
				     /*
				     re (fw.getDefaultDirectory()+"\\fdd\\sc10.png");
				     
				     Document document = new Document();
						PdfWriter.getInstance(document, new FileOutputStream(fw.getDefaultDirectory()+"\\fddex.pdf"));
						
						document.open();
						Image image = Image.getInstance(fw.getDefaultDirectory()+"\\cropped\\Square.png");
						
						//Image image = new Image(ImageDataFactory.create(""));
					//	image.scaleToFit(document.getPageSize());
						
						image.scaleAbsolute(PageSize.A4);
						image.setAbsolutePosition(0, 0);

					//	document.setPageSize(image);
					    document.add(image);
					    document.newPage();
				     
					    document.close();
					    */
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ebay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 645, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EBAY  AUTOMATION SOFTWARE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(146, 27, 367, 27);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {

			 String value1 = comboBox.getSelectedItem().toString();
				 
			//	path=textField.getText();
			 /*
				String key = textField_2.getText().toLowerCase();
				
				String text =key;
				String[] time = text.split ( "," );
	     for(int j=0;j<time.length;j++)
	     {
	    	 ar.add(time[j].trim());
	     }
				
	     String co ="Riesige 423 qm Wohn- / Nutzfläche in Unternehmer-Villa in Spenge house";
	     co = co.toLowerCase();
	    if(co.contains(ar.get(1)))
	     
	     {
	    	 System.out.println("Text detected");
	     }
	    else{
	    	
	    	 System.out.println(ar.get(1).toString()+" Text not detected");
	    }
	    */
				if(textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || value1.equals("SELECT"))
				{
					JOptionPane.showMessageDialog(null,"Please insert KEYWORDS, MESSAGE , NUMBER OF MESSAGE IN HOUR");	
					
				}
				else
				{
					
					
					   url = driver2.getCurrentUrl();
					   String key = textField_2.getText().toLowerCase();
						
						String text =key;
						String[] time = text.split ( "," );
			     for(int j=0;j<time.length;j++)
			     {
			    	 ar.add(time[j].trim());
			     }
				rebeet();
				
				JOptionPane.showMessageDialog(null,"Bot started!");
				}
			
			}});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
		lblNewLabel_1.setBounds(10, 427, 612, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 510, 612, 103);
		frame.getContentPane().add(scrollPane);
		 text = new JTextArea();
		 DefaultCaret caret = (DefaultCaret) text.getCaret();
		 caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		 text.setBackground(Color.GRAY);
		 text.setEditable(false);
			text.setLineWrap(true);
		       text.setWrapStyleWord(true);
		       text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		       scrollPane.setViewportView(text);
		
		JLabel lblRealTimeLog = new JLabel("REALTIME LOG");
		lblRealTimeLog.setForeground(Color.WHITE);
		lblRealTimeLog.setBackground(Color.YELLOW);
		lblRealTimeLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRealTimeLog.setHorizontalAlignment(SwingConstants.CENTER);
		lblRealTimeLog.setBounds(10, 485, 639, 14);
		frame.getContentPane().add(lblRealTimeLog);
		
		JLabel lblV = new JLabel("V 2");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblV.setBounds(10, 19, 60, 19);
		frame.getContentPane().add(lblV);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			
				
					 
					 try{
					 Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
					 }catch(Exception hg)
					 {
						 
					 }
					
				 System.exit(0);
				 
				
			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 61, 123, 47);
		
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("images/button (29).png")));
		
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("PROXY");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(181, 224, 291, 27);
	//	frame.getContentPane().add(lblNewLabel_4);
		
		txtProxypacketstreamio = new JTextField();
		txtProxypacketstreamio.setBackground(Color.GRAY);
		txtProxypacketstreamio.setBounds(181, 262, 291, 20);
		//frame.getContentPane().add(txtProxypacketstreamio);
		txtProxypacketstreamio.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("LOGIN");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(181, 83, 291, 27);
	//	frame.getContentPane().add(lblNewLabel_7);
		
		txtTestingaccountahnahadafg = new JTextField();
		txtTestingaccountahnahadafg.setText("info@seofreelancer.ch:yWX93fdT6nPLv5x");
		txtTestingaccountahnahadafg.setForeground(Color.YELLOW);
		txtTestingaccountahnahadafg.setBackground(Color.GRAY);
		txtTestingaccountahnahadafg.setBounds(181, 121, 298, 20);
	//	frame.getContentPane().add(txtTestingaccountahnahadafg);
		txtTestingaccountahnahadafg.setColumns(10);
		
		JLabel lblRefreshingDelayIn = new JLabel("DELAY IN SECONDS");
		lblRefreshingDelayIn.setForeground(Color.WHITE);
		lblRefreshingDelayIn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRefreshingDelayIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefreshingDelayIn.setBounds(146, 159, 367, 14);
		frame.getContentPane().add(lblRefreshingDelayIn);
		
		textField = new JTextField();
		textField.setText("5");
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(146, 184, 104, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("10");
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(403, 184, 110, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMessage = new JLabel("MESSAGE TEXT");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMessage.setBounds(146, 215, 367, 14);
		frame.getContentPane().add(lblMessage);
		
		JLabel lblKeyword = new JLabel("KEYWORDS TO AVOID");
		lblKeyword.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeyword.setForeground(Color.WHITE);
		lblKeyword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblKeyword.setBounds(156, 65, 367, 14);
		frame.getContentPane().add(lblKeyword);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(146, 101, 372, 31);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		   
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(146, 244, 367, 80);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		JPopupMenu menu2 = new JPopupMenu();
        Action cut2 = new DefaultEditorKit.PasteAction();
        cut2.putValue(Action.NAME, "PASTE");
        cut2.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control V"));
        menu2.add( cut2 );
        textField_3.setComponentPopupMenu( menu2 );
        textField_2.setComponentPopupMenu( menu2 );
        
        JLabel lblSelectNumberOf = new JLabel("SELECT TOTAL MESSAGE  IN HOUR");
        lblSelectNumberOf.setHorizontalAlignment(SwingConstants.CENTER);
        lblSelectNumberOf.setForeground(Color.WHITE);
        lblSelectNumberOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblSelectNumberOf.setBounds(146, 344, 367, 14);
        frame.getContentPane().add(lblSelectNumberOf);
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "10", "20", "30", "40", "50", "60", "70", "80", "100"}));
        comboBox.setBounds(146, 378, 367, 27);
        frame.getContentPane().add(comboBox);
        
        textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textField_4.setColumns(10);
        textField_4.setBackground(Color.LIGHT_GRAY);
        textField_4.setBounds(10, 624, 612, 24);
        frame.getContentPane().add(textField_4);
		JCheckBox chckbxNewCheckBox = new JCheckBox("USE PROXY?");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

	       		JCheckBox  chckbxNewCheckBox = (JCheckBox) e.getSource();

                // The item affected by the event.
                Object item = e.getItem();

              

                if (e.getStateChange() == ItemEvent.SELECTED) {
                	//textField.setText(item.toString());
                	
                	System.out.println("checked");
                	
                	//  sp.SaveProp("AUTO_START", "true");
					pr=true;
                	
                }

                if (e.getStateChange() == ItemEvent.DESELECTED) {
                  //  textArea.setText(item.toString() + " deselected.");
                	
                	System.out.println("not checked");
              //  	sp.SaveProp("AUTO_START", "false");
              pr=false;
                }
				
			
			}
		});
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(506, 261, 116, 23);
	//	frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
				String path = new File(".").getCanonicalPath();
				System.out.println("Application path is: "+path);
			//	System.setProperty("webdriver.chrome.driver",""+path+"\\chromedriver\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
				
				ChromeOptions options2 = new ChromeOptions();
				options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				options2.setExperimentalOption("useAutomationExtension", false);
			//	options2.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
                options2.addArguments("--disable-blink-features=AutomationControlled");
                options2.setCapability("requireWindowFocus", true);
                options2.addArguments("--ignore-certificate-errors");
                
               
                JFileChooser fr = new JFileChooser();
			     FileSystemView fw = fr.getFileSystemView();
			     
			     File direc = fw.getDefaultDirectory();
			     System.out.println(fw.getDefaultDirectory());
                options2.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\googlemap");
                
      //          options2.addArguments("user-data-dir="+path+"\\googlemap");
                
             //   capabilities.setCapability(ChromeOptions.CAPABILITY, options);
               driver2 = new ChromeDriver(options2);
               
               driver2.get("https://stackoverflow.com/users/signup?ssrc=head&returnurl=%2fusers%2fstory%2fcurrent");
               
               
               
               driver2.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/button[1]")).click();
               
				}catch(Exception hh)
				{
					hh.printStackTrace();
				}
				
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(489, 55, 172, 43);
	//	frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("images/configure.png")));
		
		
		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(0, -13, 617, 592);
	//	frame.getContentPane().add(label);
		
		 ImageIcon img =new ImageIcon(getClass().getResource("images/f.png"));
	        
	       
	        
	        frame.setIconImage(img.getImage());
	        
	        label.setIcon(new ImageIcon(getClass().getResource("images/ps.jpg")));
	}
	public static void rebeet(){
		SwingWorker<Void,Void> email = new SwingWorker<Void,Void>()
				{

					private int s;
					private int i;
					private String db_user;
					private String db_pass;
					private int tot;
				
			

					@Override
					protected Void doInBackground() throws Exception {
					
						
						
				//		System.out.println("row called : "+rowa+ " and browser :"+a);
						try{
						
							  WebDriverWait wait = new WebDriverWait(driver2,30);
			                    
			                    
			                    WebDriverWait wait1 = new WebDriverWait(driver2,60);
								
								WebDriverWait wait2 = new WebDriverWait(driver2,20);
								
								
						
								
								
						Random r = new Random();
						  int low = Integer.parseInt(textField.getText());
							 int high = Integer.parseInt(textField_1.getText());;
							 
						int	waitA   = r.nextInt(high-low) + low;
						
						Thread.sleep(waitA*1000);
						
						//check if link test & description contains the keyword
						String main=driver2.getWindowHandle();
						   JavascriptExecutor jse = (JavascriptExecutor)driver2;
						   
						   Actions m = new Actions(driver2);
						
						    
						    driver2.get(url);
						   String value1 = comboBox.getSelectedItem().toString();
						   tot = Integer.parseInt(value1);
						   for(int y=0;y<10;y++)
						   {
							//  driver2.get(url);
							   if(tot > 0)
							   {
						   List<WebElement> cat = driver2.findElements(By.xpath("//li[contains(@class,'lazyload-item')]//article//div[@class='aditem-main']"));	
							
							 Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
								
							 String t2 = String.valueOf(timestamp2);
							
							 String	st ="["+t2+"] Total listing found: "+cat.size();
							update(st);
						for(int i=0;i<cat.size();i++)
						{
						m.moveToElement(cat.get(i)).build().perform();
							Thread.sleep(1000);
							 timestamp2 = new Timestamp(System.currentTimeMillis());
								
							 t2 = String.valueOf(timestamp2);
							
							 	st ="["+t2+"] Checking if keyword found or not";
							 	update(st);
							 	/*
							 	 low = Integer.parseInt(textField.getText());
								  high = Integer.parseInt(textField_1.getText());;
								 
								waitA   = r.nextInt(high-low) + low;
								Thread.sleep(waitA*1000);
					 	       */
							 	Thread.sleep(2*1000);
							WebElement link_t = driver2.findElement(By.xpath("(//li[contains(@class,'lazyload-item')]//article//div[@class='aditem-main']//a)["+(i+1)+"]"));
							
							WebElement link_des = driver2.findElement(By.xpath("((//li[contains(@class,'lazyload-item')]//article//div[@class='aditem-main'])["+(i+1)+"]//p)[1]"));
							String link_t_s = link_t.getText().toLowerCase();
							String link_des_s = link_des.getText().toLowerCase();
							
						
							pr = false;
				     
				    for(int t=0;t<ar.size();t++)
				    {
				    	if(link_t_s.contains(ar.get(t)) || link_des_s.contains(ar.get(t)))
						{
				    		pr=true;
						}
				    }

							if(pr==false)
							{
								Thread.sleep(1000);
								 timestamp2 = new Timestamp(System.currentTimeMillis());
									
								 t2 = String.valueOf(timestamp2);
								
								 	st ="["+t2+"] Keyword not found, clicking the listing";
								 	update(st);
								 	
								String href = link_t.getAttribute("href");
								String hyperlink = href;
					        	 
					        	 String a = "window.open('"+hyperlink+"','_blank');";
									((JavascriptExecutor)driver2).executeScript(a);
					 	  //      driver.get("https://www.deepl.com/translator");
					 	        
					 	        Thread.sleep(1000);
					 	        
					 	       for (String window2 : driver2.getWindowHandles()) {

									 
									 
									 driver2.switchTo().window(window2);
									

								 }
					 	      low = Integer.parseInt(textField.getText());
								  high = Integer.parseInt(textField_1.getText());;
								 
								waitA   = r.nextInt(high-low) + low;
					 	       Thread.sleep(waitA);
					 	       
					 	      for (int j=0; j<100; j++){ 
								   try {
								    Thread.sleep(1000);
								    }catch (InterruptedException e) {} 
								   //To check page ready state.
								   if (jse.executeScript("return document.readyState").toString().equals("complete")){ 
									   System.out.println("page loaded ");
								    break; 
								   }   
								  }
					 	      
					 	   
					 	      
					 	 	WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='viewad-contact-button']")));
					 	 	element1.click();
					 	   timestamp2 = new Timestamp(System.currentTimeMillis());
							
							 t2 = String.valueOf(timestamp2);
							
							 	st ="["+t2+"] Sending message";
							 	update(st);
							 	
					 	 	low = Integer.parseInt(textField.getText());
							  high = Integer.parseInt(textField_1.getText());;
							 
							waitA   = r.nextInt(high-low) + low;
							Thread.sleep(waitA*1000);
					 	   
					 	
					 			  
					 		WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@name='message' and @class='viewad-contact-message'])[1]")));
							
					 		element2.sendKeys(textField_3.getText());
					 		low = Integer.parseInt(textField.getText());
							  high = Integer.parseInt(textField_1.getText());;
							 
							waitA   = r.nextInt(high-low) + low;
							
					 		Thread.sleep(waitA*1000);
					 		
					 		
					 				
					 	WebElement element3 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit' and contains(@class,'button viewad-contact-submit taller')])[1]")));		
					 	 	
					 	element3.click();
					 	tot--;
					 	low = Integer.parseInt(textField.getText());
						  high = Integer.parseInt(textField_1.getText());;
						 
						waitA   = r.nextInt(high-low) + low;
						
						Thread.sleep(waitA*1000);
				 		
				 		driver2.switchTo().window(main);
				 		 String parent=driver2.getWindowHandle();
						 
							// This will return the number of windows opened by Webdriver and will return Set of St//rings
							Set<String>s1=driver2.getWindowHandles();
							 
							// Now we will iterate using Iterator
							java.util.Iterator<String> I1 = s1.iterator();
							
							 
							while(I1.hasNext())
							{
							 
							   String child_window=I1.next();
							 
							// Here we will compare if parent window is not equal to child window then we            will close
							 
							if(!parent.equals(child_window))
							{
							driver2.switchTo().window(child_window);
							 
							System.out.println(driver2.switchTo().window(child_window).getTitle());
							 
							driver2.close();
							}
							 
							}
							// once all pop up closed now switch to parent window
							driver2.switchTo().window(parent);
							
							
					 	
							}
						}
						
						try{
						WebElement element5 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='srchrslt-pagination']/div/div[2]/a")));		
				 	 	
					 	element5.click();
					 	
					 	low = Integer.parseInt(textField.getText());
						  high = Integer.parseInt(textField_1.getText());;
						 
						waitA   = r.nextInt(high-low) + low;
						
						Thread.sleep(waitA*1000);
				 		
				 		
					 	  for (int j=0; j<100; j++){ 
							   try {
							    Thread.sleep(1000);
							    }catch (InterruptedException e) {} 
							   //To check page ready state.
							   if (jse.executeScript("return document.readyState").toString().equals("complete")){ 
								   System.out.println("page loaded ");
							    break; 
							   }   
							  }
					 	y=0;
						}catch(Exception hg)
						{
							  timestamp2 = new Timestamp(System.currentTimeMillis());
								
								 t2 = String.valueOf(timestamp2);
								
								 	st ="["+t2+"] End of page , bot is now stopped";
								 	update(st);
								 	 AnnoyingBeep(1);
								 	
							break;
						}
							   }else{
								   Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
									
									 String t2 = String.valueOf(timestamp2);
									
									 String	st ="["+t2+"] Total number of messages have been sent out. Bot is now waiting ";
									update(st);
									 AnnoyingBeep(1);
							   }
						}
					  
						}catch(Exception y)
						{
							y.printStackTrace();
							
							
							
						
				           
							
							 StringWriter sw = new StringWriter();
							 y.printStackTrace(new PrintWriter(sw));
					            String exceptionAsString = sw.toString();
					            System.out.println(exceptionAsString);
						 JOptionPane.showMessageDialog(null, ""+exceptionAsString+"",
							      "ERROR!", JOptionPane.ERROR_MESSAGE);
							      
					//	 driver2.close();
						// driver2.quit();
						// Thread.sleep(10000);
					//	 rebeet();
						}
						
						
							return null;
					}
			
				};
				email.execute();
				
	}
	
	private static void update(String st) {
		
		text.append("\n"+st);

		text.update(text.getGraphics());
		
		text.repaint();
}
	  public static void exist( )  {
		   	 ex=true;
		   	

		 	}
	  
	  public static void allarr(ArrayList<String> ar2 )  {
		   	 
for(int y=0;y<ar2.size();y++)
{
	ar.add(ar2.get(y));
//	System.out.println(ar2.get(y));
}
		 	}
	  
	  /*
	  public static void pdf_s(){
			SwingWorker<Void,Void> email = new SwingWorker<Void,Void>()
					{

						

						@Override
						protected Void doInBackground() throws Exception {
							
							
							Timestamp  timestamp2 = new Timestamp(System.currentTimeMillis());
								
							String  t2 = String.valueOf(timestamp2);
							
								String st = "["+t2+"] Saving will start in 10 seconds ";
								
								
								
							update(st);
							 JFileChooser fr = new JFileChooser();
						     FileSystemView fw = fr.getFileSystemView();
						     
						     File direc = fw.getDefaultDirectory();
						     System.out.println(fw.getDefaultDirectory());
						     
						    
					         
					                // if the file didnt accept the renaming operation
					                System.out.println("file is opened");
					                try {
					                	String processName = "fddex.pdf";
					                    Runtime rt = Runtime.getRuntime();
					                    // For Windows OS...
					                    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
					                        rt.exec("taskkill /T /F /IM " + processName);
					                        //rt.exec("taskkill /T /F /PID " + Long.parseLong(processName)); // Supply the PID value as string
					                        //rt.exec("taskkill /F /FI \"WINDOWTITLE eq " + processName + "\" /T"); // Supply the window title bar text.
					                        // If you want to kill only a single instance of the 
					                        // named process then get its PID value and use:
					                        // "taskkill /T /F /PID PID_Value"  OR you can provide
					                        // the window title and use:
					                        // "taskkill /F /FI \"WINDOWTITLE eq " + processName + "\" /T"
					                    }
					                    // For OSX And Linux OS's...
					                    else {
					                        rt.exec("sudo killall -9 '" + processName + "'");
					                        //rt.exec("kill -9 " + Long.parseLong(processName)); // Supply the PID value as string
					                        // If you want to kill only a single instance of the 
					                        // named process then get its PID value and use:
					                        // "kill -9 PID_Value"
					                    }
					                    rt.freeMemory();
					               
					                } 
					                catch (IOException | SecurityException | IllegalArgumentException ex) {
					                    ex.printStackTrace();
					                }
					               
					            
						     
							  Document document = new Document();
								PdfWriter.getInstance(document, new FileOutputStream(fw.getDefaultDirectory()+"\\fddex.pdf"));
							try
							{
								
								//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='pdfemb-page-count'])[1]")));
								 
								
							 String page_s = driver2.findElement(By.xpath("(//span[@class='pdfemb-page-count'])[1]")).getText();
	       int page = Integer.parseInt(page_s);
	       progressBar.setMaximum(page);
	       progressBar.update(progressBar.getGraphics());
	      
			
			JavascriptExecutor js = (JavascriptExecutor)driver2;
			
			  File theDir = new File(fw.getDefaultDirectory()+"\\fdd");

				 // if the directory does not exist, create it
				 if (!theDir.exists()) {
				     System.out.println("creating directory: " + theDir.getName());
				     boolean result = false;

				     try{
				         theDir.mkdir();
				         result = true;
				     } 
				     catch(SecurityException se){
				         //handle it
				     }        
				     if(result) {    
				         System.out.println("DIR created");  
				        
						 
				     }
				 }
				 
				 theDir = new File(fw.getDefaultDirectory()+"\\cropped");

				 // if the directory does not exist, create it
				 if (!theDir.exists()) {
				     System.out.println("creating directory: " + theDir.getName());
				     boolean result = false;

				     try{
				         theDir.mkdir();
				         result = true;
				     } 
				     catch(SecurityException se){
				         //handle it
				     }        
				     if(result) {    
				         System.out.println("DIR created");  
				        
						 
				     }
				 }
				 /*
				 try{
				 Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver2, driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]")));
			     ImageIO.write(fpScreenshot.getImage(),"PNG",new File(fw.getDefaultDirectory()+"///FullPageScreenshot.png"));
				 }catch(Exception fh)
				 {
					 fh.printStackTrace();
				 }
				 */
	  /*
				 js.executeScript(" document.querySelector('body > header').remove();");
			    	
		    	 
		    	 js.executeScript(" document.querySelector('#wrapper-38').remove();");
		    	 
		    	 
		    	 js.executeScript(" document.querySelector('#wrapper-41').remove();");
		    	 
		    	 
		    	 
		    	 
		    	 js.executeScript("document.querySelector('#wrapper-42').remove();");
		    	 
		    	 
		    	 js.executeScript("document.querySelector('body > footer').remove();");
		    	 
		    	 
		    	 
			     Thread.sleep(10000);
			     
			     
			     for(int i=1;i<=page;i++)
	        {
			    	 
			    	
	        	/*
	        	BufferedImage images = Shutterbug.shootPage(driver2, ScrollStrategy.WHOLE_PAGE).getImage();
	            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	            ImageIO.write(images, "png", outputStream);
	            */
	        	
			    //	 Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver2,driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div["+i+"]//canvas")));
			      //   ImageIO.write(screenshot.getImage(),"PNG",new File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".jpg"));
			       
			    	 
			    /*
			    	 
			    	 try{
						 Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver2);
					     ImageIO.write(fpScreenshot.getImage(),"PNG",new File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png"));
						 }catch(Exception fh)
						 {
							 fh.printStackTrace();
						 }
						 
			    	 /*
			    	 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			         Rectangle screenRectangle = new Rectangle(screenSize);
			         Robot robot = new Robot();
			         BufferedImage imageSS = robot.createScreenCapture(screenRectangle);
			         ImageIO.write(imageSS, "png", new File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png"));
			    	 
			    	 */
	        //	 File imgCap2 = ((TakesScreenshot)driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div["+i+"]//div"))).getScreenshotAs(OutputType.FILE);
	    		   
	    		//   FileUtils.copyFile(imgCap2, new File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png"));
	    		   
	    		  /*
					document.open();
					
					
					
					re (fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png");
					
			        
			      
			        
					Image image = Image.getInstance(fw.getDefaultDirectory()+"\\cropped\\Square.png");
					
					//Image image = new Image(ImageDataFactory.create(""));
				//	image.scaleToFit(document.getPageSize());
					

					image.scaleAbsolute(PageSize.A4);
					image.setAbsolutePosition(0, 0);
					
				    document.add(image);
				    document.newPage();
				   
				    
				    
				    driver2.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/article/div[1]/div/div[3]/button[2]")).click();
				   
				    Thread.sleep(2000);
				    
				    js.executeScript("window.scrollTo(0, 0);");
				   
				    
				    Random r = new Random(); 
				  int  low = 3000;
					 int high = 5000;
					 
				int	waitA   = r.nextInt(high-low) + low;
				
				Thread.sleep(waitA);
				
				
				 timestamp2 = new Timestamp(System.currentTimeMillis());
					
				  t2 = String.valueOf(timestamp2);
				
					st ="["+t2+"] Page "+(i)+" has been saved";
				update(st);
				progressBar.setValue(i);
				 progressBar.update(progressBar.getGraphics());
	        }
			     
			 Timestamp    timestamp3 = new Timestamp(System.currentTimeMillis());
					
				 String t3 = String.valueOf(timestamp3);
				
					String st1 ="["+t3+"] All the pages have been saved , check the output in computer's Documnent directly named fddex.pdf";
				update(st1);
				
				progressBar.setMaximum(page);
				progressBar.update(progressBar.getGraphics());
				progressBar.setValue(page);
				progressBar.update(progressBar.getGraphics());
	        document.close();	
							}catch(Exception fg)
							{
								try{
								document.close();	
								}catch(Exception fh)
								{
									
								}
								fg.printStackTrace();
								StringWriter sw = new StringWriter();
								fg.printStackTrace(new PrintWriter(sw));
						            String exceptionAsString = sw.toString();
						            System.out.println(exceptionAsString);
							 JOptionPane.showMessageDialog(null, ""+exceptionAsString+"",
								      "ERROR!", JOptionPane.ERROR_MESSAGE);
							}
							
							
								return null;
						}
				
					};
					email.execute();
					
		}
	  */
	    public static BufferedImage crop(double amount,String ima) throws IOException {
	        BufferedImage originalImage = ImageIO.read(new File(ima));
	        int height = originalImage.getHeight();
	        int width = originalImage.getWidth();

	        int targetWidth = (int)(width * amount);
	        
	    //    int targetWidth = 528;
	        
	        int targetHeight = (int)(height * amount);
	        
	  //      int targetHeight = 623;
	        
	        System.out.println(targetWidth+"*"+targetHeight);
	        // Coordinates of the image's middle
	        int xc = (width - targetWidth) / 2;
	        int yc = (height - targetHeight) / 2;

	        // Crop
	        BufferedImage croppedImage = originalImage.getSubimage(
	                        xc, 
	                        yc,
	                        targetWidth, // widht
	                        targetHeight // height
	        );
	        JFileChooser fr = new JFileChooser();
		     FileSystemView fw = fr.getFileSystemView();
		     
		     File direc = fw.getDefaultDirectory();
		  //   System.out.println(fw.getDefaultDirectory());
		     java.awt.Image imgSmall = croppedImage.getScaledInstance(
		                targetWidth, targetHeight, java.awt.Image.SCALE_SMOOTH);
		     
		     
		     BufferedImage bufferedImage = convertToBufferedImage(imgSmall);
		    
	        ImageIO.write(croppedImage, "png", new File(fw.getDefaultDirectory()+"\\cropped\\Square.png"));
	        
	      
	        return croppedImage;
	    }
	    
	    public static void re (String im_path ) throws IOException
	    {
	    	
		     
	    	 crop(0.7950,im_path);
		     //  System.out.println(crop.getWidth() + "x" + crop.getHeight());
		        
		      
		        
	    }
	    public static BufferedImage convertToBufferedImage( java.awt.Image image)
	    {
	        BufferedImage newImage = new BufferedImage(
	            image.getWidth(null), image.getHeight(null),
	            BufferedImage.TYPE_INT_ARGB);
	        Graphics2D g = newImage.createGraphics();
	        g.drawImage(image, 0, 0, null);
	        g.dispose();
	        return newImage;
	    }
	    
		 private static int hour2;
		  static Toolkit toolkit;
		    static Timer timer;
		  
		    
		  static ebay sts = new ebay();
		 
		 
		
	
		//  public JTextField textField_1;
		
		
		
		  

		  public static void AnnoyingBeep(int ha) {
			    //	 hour2= (int) ha;
			    	ha = ha*3600;
			    	hour2 = ha;
				toolkit = Toolkit.getDefaultToolkit();
			        timer = new Timer();
			        timer.schedule(sts.new RemindTask(),
				               0,        //initial delay
				               1*1000);  //subsequent rate  3600000
			    }
			   
			//price_comparison f = new price_comparison(); 
			    class RemindTask extends TimerTask {
				int numWarningBeeps = hour2;
				
				//System.out.println(numWarningBeeps);
			        public void run() {
			        	//System.out.println(numWarningBeeps);
			        	
				    if (numWarningBeeps > 0) {
				    //    toolkit.beep();
				    	
				    int	hours = numWarningBeeps / 3600;
				    int	minutes = (numWarningBeeps % 3600) / 60;
				    int	seconds = numWarningBeeps % 60;

				    String	timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
				        
				        textField_4.setText( "Time Remaining : "+timeString );
				        
				        textField_4.getGraphics();
				     //   f.price_comparison1(textField_12, numWarningBeeps);
				//	System.out.println("Beep!");
					numWarningBeeps--;
				    } else {
				     //   toolkit.beep(); 
		textField_4.setText(0+ " seconds remaining,checking page again!" );
				        
						textField_4.getGraphics();
					
						rebeet();
						
			           //     System.out.println("Time's up!");
			            //    numWarningBeeps = hour2;
			       
				        timer.cancel(); //Not necessary because we call System.exit
				    //   System.exit(0);   //Stops the AWT thread (and everything else)
				    }
			        
			        	
			        }

					
			    }
}


