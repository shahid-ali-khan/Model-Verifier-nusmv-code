package Project;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

//Edited by Shahid on 18-01-2020;
public class SwingAdminGui {

	SwingAdminGui() {
		
//		try {
//			FileWriter wr = new FileWriter("Testfile.smv",true);
//			
//			FileReader reader = new FileReader("samplefile.txt");
//		int data = reader.read();
//		
//		while(data!=-1) {
//			
//			wr.write(data);
//			data = reader.read();
//			
//		}
//		
//		wr.close();
//		reader.close();
//		
//	} 
//	
//	
//	catch (IOException e)
//	{
//		
//		e.printStackTrace();
//	}
		
		JFrame frame = new JFrame("Application");
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	    frame.setLayout(new GridLayout(10,10));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JCheckBox aCheckBox1admin_login = new JCheckBox("AdminDashboard to LoginPage");
		JCheckBox aCheckBox2admin_course = new JCheckBox("AdminDashboard to CoursePage");
		JCheckBox aCheckBox3admin_cpp = new JCheckBox("AdminDashboar to CPP");
		JCheckBox aCheckBox4admin_dbms = new JCheckBox("AdminDashboard to DBMS");
		JCheckBox aCheckBox5admin_profile = new JCheckBox("AdminDashboard to ProfilePage");
		JCheckBox aCheckBox6admin_edit = new JCheckBox("AdminDashboard to EditPage");
		JCheckBox aCheckBox7admin_pref = new JCheckBox("AdminDashboard_PreferencePage");
		JCheckBox aCheckBox8admin_change = new JCheckBox("AdminDashboard to ChangePassword");
		JCheckBox aCheckBox9admin_perm = new JCheckBox("AdminDashboard to Permission");
		JCheckBox aCheckBox10course_login = new JCheckBox("CoursePage to LoginPage");
		JCheckBox aCheckBox11course_cpp = new JCheckBox("CoursePage to CPP");
		JCheckBox aCheckBox12course_dbms = new JCheckBox("CoursePage to DBMS");
		JCheckBox aCheckBox13course_admin = new JCheckBox("CoursePage to AdminDashboard ");
		JCheckBox aCheckBox14course_edit = new JCheckBox("CoursePage to EditPage");
		JCheckBox aCheckBox15course_pref = new JCheckBox("CoursePage to PreferencePage");
		JCheckBox aCheckBox16course_changepass = new JCheckBox("CoursePage to ChangePassword");
		JCheckBox aCheckBox17course_perm = new JCheckBox("CoursePage to Permission");
		JCheckBox aCheckBox18pref_perm = new JCheckBox("PreferencePage to PermissionPage ");
		
		JCheckBox aCheckBox19pref_changepass = new JCheckBox("PreferencePage to ChangePassword");
		JCheckBox aCheckBox20profile_edit = new JCheckBox("ProfilePage to EditPage");
		JCheckBox aCheckBox21profile_login = new JCheckBox("ProfilePage to LoginPage");
		JCheckBox aCheckBox22profile_admin = new JCheckBox("ProfilePage to AdminDashboard");
		JCheckBox aCheckBox23profile_course = new JCheckBox("ProfilePage to CoursePage");
		JCheckBox aCheckBox24profile_cpp = new JCheckBox("ProfilePage to CPP");
		JCheckBox aCheckBox25profile_dbms = new JCheckBox("ProfilePage to DBMS");
		JCheckBox aCheckBox26profile_pref = new JCheckBox("ProfilePage to PreferencePage");
		JCheckBox aCheckBox27profile_changepass = new JCheckBox("ProfilePage to ChangePassword");
		JCheckBox aCheckBox28profile_perm = new JCheckBox("ProfilePage to Permission");
		JCheckBox aCheckBox29login_admin = new JCheckBox("LoginPage to AdminDashboard");
		JCheckBox aCheckBox30login_course = new JCheckBox("LoginPage to CoursePage");
		JCheckBox aCheckBox31login_cpp = new JCheckBox("LoginPage to CPP");
		JCheckBox aCheckBox32login_dbms = new JCheckBox("LoginPage to DBMS");
		JCheckBox aCheckBox33login_profile = new JCheckBox("LoginPage to ProfilePage");
		JCheckBox aCheckBox34login_edit = new JCheckBox("LoginPage to EditPage");
		JCheckBox aCheckBox35login_pref = new JCheckBox("LoginPage to PreferencePage");
		JCheckBox aCheckBox36login_changepass = new JCheckBox("LoginPage to ChangePassword");
		JCheckBox aCheckBox37login_perm = new JCheckBox("LoginPage to Permission");
		JCheckBox aCheckBox38edit_login = new JCheckBox("EditPage to LoginPage ");
		JCheckBox aCheckBox39edit_admin = new JCheckBox("EditPage to AdminDaschboard");
		JCheckBox aCheckBox40edit_course = new JCheckBox("EditPage to CoursePage");
		JCheckBox aCheckBox41edit_cpp = new JCheckBox("EditPage to CPP");
		JCheckBox aCheckBox42edit_dbms = new JCheckBox("EditPage to DBMS");
		JCheckBox aCheckBox43edit_profile = new JCheckBox("EditPage to ProfilePage");
		JCheckBox aCheckBox44edit_pref = new JCheckBox("EditPage to PreferencePage");
		JCheckBox aCheckBox45edit_changepass = new JCheckBox("EditPage to ChangePassword");
		JCheckBox aCheckBox46edit_perm = new JCheckBox("EditPage to Permission");
		JCheckBox aCheckBoxlogin_user = new JCheckBox("Loginpage to UserDashboard");
		  JCheckBox aCheckBoxlogin_course = new JCheckBox("LoginPage to CourseOverview");
		  JCheckBox aCheckBoxlogin_grades = new JCheckBox("LoginPage to Grades");
		  JCheckBox aCheckBox7login_prefer = new JCheckBox("LoginPage to Preference");
		 
		  JCheckBox aCheckBox8user_course = new JCheckBox("UserDashboard to CourseOverview");
		  JCheckBox aCheckBox9user_grades = new JCheckBox("UserDashboard to Grades"); 
		  JCheckBox  aCheckBox10user_prefer = new JCheckBox("UserDashboard to Preference");
		  JCheckBox aCheckBox11user_loginpage = new JCheckBox("UserDashboard to LoginPage"); 
		  JCheckBox aCheckBox12user_profile = new JCheckBox("UserDashboard to Profile"); 
		  JCheckBox aCheckBox13userdash_useredit = new JCheckBox("UserDashboard to UserEditProfile");
		  JCheckBox aCheckBox14profile_useredit = new JCheckBox("Profile to UserEditProfile");
		  JCheckBox aCheckBox15preference_login = new JCheckBox("Preference to LoginPage"); 
		  JCheckBox aCheckBox16preference_userdash = new JCheckBox("Preference to UserDashboard"); 
		  JCheckBox  aCheckBox17preferece_course = new JCheckBox("Preference to CourseOverview"); 
		  JCheckBox aCheckBox18preferece_grades = new JCheckBox("Preference to Grades");
		  JCheckBox aCheckBox19grades_loginpage = new JCheckBox("Grades to LoginPage"); 
		  JCheckBox aCheckBox20grades_userdashboard = new JCheckBox("Grades to UserDashboard"); 
		  JCheckBox aCheckBox21grades_courseoverview = new JCheckBox("Grades to CourseOverview"); 
		  JCheckBox aCheckBox22grades_preference = new JCheckBox("Grades to Preference");
		  JCheckBox aCheckBox23courseoverview_grades = new JCheckBox("CourseOverview to Grades");
		  JCheckBox aCheckBox24courseoverview_preference = new JCheckBox("CourseOverview to Preference");
		  JCheckBox aCheckBox25courseoverview_loginpage = new JCheckBox("CourseOverview to LoginPage");
		  JCheckBox aCheckBox26courseoverview_userdashboard = new JCheckBox("CourseOverview to UserDashboard");
		  JButton Verify = new JButton("Verify property");
		  

			  Verify.addActionListener(new ActionListener(){  
			        public void actionPerformed(ActionEvent e){  
			          
			        	try {
			        		Runtime.getRuntime().exec("cmd.exe /c start cmd /k \" nusmv mainsmv.smv \"");						} catch (IOException e1) {
							
							e1.printStackTrace();
						}

							
							

			        	
			        }  

			        });
		    
  
		  
  
  
  frame.add(Verify);
  
  frame.add(aCheckBoxlogin_user);
  frame.add(aCheckBoxlogin_course);
  frame.add(aCheckBoxlogin_grades);
  frame.add(aCheckBox7login_prefer);
  frame.add(aCheckBox8user_course );
  frame.add(aCheckBox9user_grades);
  frame.add(aCheckBox10user_prefer);
  frame.add(aCheckBox11user_loginpage);
  frame.add(aCheckBox12user_profile);
  frame.add(aCheckBox13userdash_useredit);
  frame.add(aCheckBox14profile_useredit);
  frame.add(aCheckBox15preference_login);
  frame.add(aCheckBox16preference_userdash);
  frame.add(aCheckBox17preferece_course);
  frame.add(aCheckBox18preferece_grades);
  frame.add(aCheckBox19grades_loginpage);
  frame.add(aCheckBox20grades_userdashboard);
  frame.add(aCheckBox21grades_courseoverview);
  frame.add(aCheckBox22grades_preference);
  frame.add(aCheckBox23courseoverview_grades);
  frame.add(aCheckBox24courseoverview_preference);
  frame.add(aCheckBox25courseoverview_loginpage);
  frame.add(aCheckBox26courseoverview_userdashboard);
  
		
		
		  
		  frame.add(aCheckBox1admin_login);
		  frame.add(aCheckBox2admin_course);
		  frame.add(aCheckBox3admin_cpp);
		  frame.add(aCheckBox4admin_dbms);
		  frame.add(aCheckBox5admin_profile);
		  frame.add(aCheckBox6admin_edit);
		  frame.add(aCheckBox7admin_pref);
		  frame.add(aCheckBox8admin_change);
		  frame.add(aCheckBox9admin_perm);
		  frame.add(aCheckBox10course_login);
		  frame.add(aCheckBox11course_cpp);
		  frame.add(aCheckBox12course_dbms);
		  frame.add(aCheckBox13course_admin);
		  frame.add(aCheckBox14course_edit);
		  frame.add(aCheckBox15course_pref);
		  frame.add(aCheckBox16course_changepass);
		  frame.add(aCheckBox17course_perm );
		  frame.add(aCheckBox18pref_perm);
		  frame.add(aCheckBox19pref_changepass);
		  frame.add(aCheckBox20profile_edit);
		  frame.add(aCheckBox21profile_login);
		  frame.add(aCheckBox22profile_admin);
		  frame.add(aCheckBox23profile_course);
		  frame.add(aCheckBox24profile_cpp);
		  frame.add(aCheckBox25profile_dbms);
		  frame.add(aCheckBox26profile_pref);
		  frame.add(aCheckBox27profile_changepass);
		  frame.add(aCheckBox28profile_perm);
		  frame.add(aCheckBox29login_admin);
		  frame.add(aCheckBox30login_course);
		  frame.add(aCheckBox31login_cpp);
		  frame.add(aCheckBox32login_dbms);
		  frame.add(aCheckBox33login_profile);
		  frame.add(aCheckBox34login_edit);
		  frame.add(aCheckBox35login_pref);
		  frame.add(aCheckBox36login_changepass);
		  frame.add(aCheckBox37login_perm);
		  frame.add(aCheckBox38edit_login);
		  frame.add(aCheckBox39edit_admin);
		  frame.add(aCheckBox40edit_course);
		  frame.add(aCheckBox41edit_cpp);
		  frame.add(aCheckBox42edit_dbms);
		  frame.add(aCheckBox43edit_profile);
		  frame.add(aCheckBox44edit_pref);
		  frame.add(aCheckBox45edit_changepass);
		  frame.add(aCheckBox46edit_perm);
		 
		  
		    
		    ActionListener admin_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=LoginPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    
		    ActionListener admin_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	try {
		        		
		        		FileWriter wr = new FileWriter("Testfile.smv",true);
		        	 wr.append("SPEC "+"\n"
		        	 		+ "AG((Page=AdminDashboard))->EF(Page=CoursePage))");
		        	 wr.close();
		        	}
		        	
		        	catch(Exception ex) {
		        		
		        		
		        	 ex.printStackTrace();	
		        	}
		        	 
		         }
		    
		      }
		    };
		    ActionListener admin_cpp = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=CPP))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_dbms = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=DBMS))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_profile = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=ProfilePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_edit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=EditPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_pref = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=PreferencePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_change = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=ChangePassword))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener admin_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=AdminDashboard))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=LoginPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_cpp = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=CPP))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_dbms = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=DBMS))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_admin = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=AdminDashboard))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_edit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=EditPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_pref = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=PreferencePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_changepass = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=ChangePassword))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener course_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=CoursePage))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener pref_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=Preference))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener pref_changepass = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=Preference))->EF(Page=ChangePassword))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_edit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=EditProfile))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=LoginPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_admin = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=LoginPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=CoursePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_cpp = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=CPP))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_dbms = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=DBMS))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_pref = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=PreferencePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_changepass= new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC " +"");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener profile_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=ProfilePage))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_admin = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=AdminDashboard))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=CoursePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_cpp = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=CPP))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_dbms = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=DBMS))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_profile = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=ProfilePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_edit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=EditPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_pref = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=PreferencePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_changepass = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=ChangePassword))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener login_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=LoginPage))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=LoginPage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_admin = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=AdminDashboard))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=CoursePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_cpp = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=CPP))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_dbms = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=DBMS))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_profile = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=ProfilePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_pref = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=PreferencePage))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_changepass = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=ChangePassword))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener edit_perm = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.append("SPEC "+"\n" +"AG((Page=EditPage))->EF(Page=Permission))");
		         	 wr.close();
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    ActionListener acheckboxloginuser = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		        	 
		        	 try {
		         		
		         		FileWriter wr = new FileWriter("Testfile.smv",true);
		         	 wr.write("SPEC "+"\n" +"(AG((Page=LoginPage))->EF(Page=UserDashboard))");
		         }
		           catch(Exception ex){
		        	  
		        	   ex.printStackTrace();
		           
		           } 
		           }
		      }
		    };
		    
		    
		    ActionListener login_course1 = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	try {
		        		
		        		FileWriter wr = new FileWriter("Testfile.smv",true);
		        	 wr.write("SPEC "+"\n"
		        	 		+ "AG((Page=LoginPage))->EF(Page=CourseOverview))");
		        	 wr.close();
		        	}
		        	
		        	catch(Exception ex) {
		        		
		        		
		        	 ex.printStackTrace();	
		        	}
		        	 
		         }
		    
		      }
		    };
		    
		    ActionListener login_grades = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.write("SPEC"+"\n"+"AG((Page=LoginPage))->EF(Page=Grades))");
			        			
					} catch (IOException e) {
						
						e.printStackTrace();
					} 	 
		         }
		        
		      }
		    };
		    
		    ActionListener login_preference = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+"AG((Page=LoginPage))->EF(Page=Preference))");
					} 
		        	 
		        	 catch (IOException e) 
		        	 
		        	 {
						
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        
		      }
		    };
		    
		    ActionListener user_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n" + "AG((Page=UserDashboard))->EF(Page=CourseOverview))");
					} catch (IOException e) {
						
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		       
		      }
		    };
		    
		    ActionListener user_grades = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC" +"\n"+ 
								"AG((Page=UserDashboard))->EF(Page=Grades))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    ActionListener user_prefer = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n" + 
								"AG((Page=UserDashboard))->EF(Page=Preference))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		       
		      }
		    };
		    
		    ActionListener user_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=UserDashboard))->EF(Page=LoginPage))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener user_profile = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+" AG((Page=UserDashboard))->EF(Page=Profile))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        
		      }
		    };
		    
		    
		    ActionListener userdash_useredit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n" +" AG((Page=UserDashboard))->EF(Page=UserProfileEdit))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        
		      }
		    };
		    
		    
		    ActionListener profile_useredit = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+"AG((Page=Profile))->EF(Page=UserProfileEdit))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    
		    ActionListener courseoverview_grades = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=CourseOverview))->EF(Page=Grades))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener courseoverview_preference = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=CourseOverview))->EF(Page=Preference))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener courseoverview_loginpage = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+"AG((Page=CourseOverview))->EF(Page=LoginPage))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    
		    ActionListener courseoverview_userdashboard = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=CourseOverview))->EF(Page=UserDashboard))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    
		    
		    ActionListener preferencepage_login = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Preference))->EF(Page=LoginPage))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    
		    
		    
		    ActionListener preference_userdash = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Preference))->EF(Page=UserDashboard))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener preferece_course = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+" AG((Page=Preference))->EF(Page=CourseOverview))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener preferece_grades = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Preference))->EF(Page=Grades))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener grades_loginpage = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Grades))->EF(Page=LoginPage))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    ActionListener grades_userdashboard = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+"AG((Page=Grades))->EF(Page=UserDashboard))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
	
		      }
		    };
		    
		    
		    ActionListener grades_courseoverview = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Grades))->EF(Page=CourseOverview))");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        // abstractButton.setText(newLabel);
		      }
		    };
		    
		    
		    
		    ActionListener grades_preference = new ActionListener()
		    {
		      public void actionPerformed(ActionEvent actionEvent) 
		      {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		         if(selected==true) {
		    
		        	 try {
						FileWriter writer = new FileWriter("Testfile.smv",true);
						writer.append("SPEC"+"\n"+" AG((Page=Grades))->EF(Page=Preference))");
					} catch (IOException e) {
						
						e.printStackTrace();
					} 
		        	
		        	 
		         }
		        
		      }
		    };
		    
		    
		    
		    
		   
		    aCheckBoxlogin_user.addActionListener(acheckboxloginuser);
		    aCheckBoxlogin_course.addActionListener(login_course);
		    aCheckBoxlogin_grades.addActionListener(login_grades);
		    aCheckBox7login_prefer.addActionListener(login_preference);
		    aCheckBox8user_course.addActionListener(user_course);
		    aCheckBox9user_grades.addActionListener(user_grades);
		    aCheckBox10user_prefer.addActionListener(user_prefer);
		    aCheckBox11user_loginpage.addActionListener(user_login);
		    aCheckBox12user_profile.addActionListener(user_profile);
		    aCheckBox13userdash_useredit.addActionListener(userdash_useredit);
		    
		    
		    aCheckBox14profile_useredit .addActionListener(profile_useredit);
		    
		    
		    
		    aCheckBox15preference_login.addActionListener(preferencepage_login);
		    aCheckBox16preference_userdash.addActionListener(preference_userdash);
		    aCheckBox17preferece_course.addActionListener(preferece_course);
		    aCheckBox18preferece_grades.addActionListener(preferece_grades);
		    
		    
		    
		    
		    
		    aCheckBox19grades_loginpage.addActionListener(grades_loginpage);
		    aCheckBox20grades_userdashboard.addActionListener(grades_userdashboard);
		    aCheckBox21grades_courseoverview.addActionListener(grades_courseoverview);
		    aCheckBox22grades_preference.addActionListener(grades_preference);
		    
		    
		    
		    
		    aCheckBox23courseoverview_grades.addActionListener(courseoverview_grades);
		    aCheckBox24courseoverview_preference.addActionListener(courseoverview_preference);
		    aCheckBox25courseoverview_loginpage.addActionListener(courseoverview_loginpage);
		    aCheckBox26courseoverview_userdashboard.addActionListener(courseoverview_userdashboard);
		    
		    
		    aCheckBox1admin_login.addActionListener(admin_login);
		    aCheckBox2admin_course.addActionListener(admin_course);
		    aCheckBox3admin_cpp.addActionListener(admin_cpp);
		    aCheckBox4admin_dbms.addActionListener(admin_dbms);
		    aCheckBox5admin_profile.addActionListener(admin_profile);
		    aCheckBox6admin_edit.addActionListener(admin_edit);
		    aCheckBox7admin_pref.addActionListener(admin_pref);
		    aCheckBox8admin_change.addActionListener(admin_change);
		    aCheckBox9admin_perm.addActionListener(admin_perm);
		    aCheckBox10course_login.addActionListener(course_login);
		    aCheckBox11course_cpp.addActionListener(course_cpp);
		    aCheckBox12course_dbms.addActionListener(course_dbms);
		    aCheckBox13course_admin.addActionListener(course_admin);
		    aCheckBox14course_edit.addActionListener(course_edit);
		    aCheckBox15course_pref.addActionListener(course_pref);
		    aCheckBox16course_changepass.addActionListener(course_changepass);
		    aCheckBox17course_perm.addActionListener(course_perm);
		    aCheckBox18pref_perm.addActionListener(pref_perm);
		    aCheckBox19pref_changepass.addActionListener(pref_changepass);
		    aCheckBox20profile_edit.addActionListener(profile_edit);
		    aCheckBox21profile_login.addActionListener(profile_login);
		    aCheckBox22profile_admin.addActionListener(profile_admin);
		    aCheckBox23profile_course.addActionListener(profile_course);
		    aCheckBox24profile_cpp.addActionListener(profile_cpp);
		    aCheckBox25profile_dbms.addActionListener(profile_dbms);
		    aCheckBox26profile_pref.addActionListener(profile_pref);
		    aCheckBox27profile_changepass.addActionListener(profile_changepass);
		    aCheckBox28profile_perm.addActionListener(profile_perm);
		    aCheckBox29login_admin.addActionListener(login_admin);
		    aCheckBox30login_course.addActionListener(login_course);
		    aCheckBox31login_cpp.addActionListener(login_cpp);
		    aCheckBox32login_dbms.addActionListener(login_dbms);
		    aCheckBox33login_profile.addActionListener(login_profile);
		    aCheckBox34login_edit.addActionListener(login_edit);
		    aCheckBox35login_pref.addActionListener(login_pref);
		    aCheckBox36login_changepass.addActionListener(login_changepass);
		    aCheckBox37login_perm.addActionListener(login_perm);
		    aCheckBox38edit_login.addActionListener(edit_login);
		    aCheckBox39edit_admin.addActionListener(edit_admin);
		    aCheckBox40edit_course.addActionListener(edit_course);
		    aCheckBox41edit_cpp.addActionListener(edit_cpp);
		    aCheckBox42edit_dbms.addActionListener(edit_dbms);
		    aCheckBox43edit_profile.addActionListener(edit_profile);
		    aCheckBox44edit_pref.addActionListener(edit_pref);
		    aCheckBox45edit_changepass.addActionListener(edit_changepass);
		    aCheckBox46edit_perm.addActionListener(edit_perm);

	}

}
