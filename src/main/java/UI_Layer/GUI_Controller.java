package UI_Layer;
import BusinessLogicLayer.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.logging.FileHandler;

import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class GUI_Controller {
	
	  @FXML
	    private Button userlogIn;
	    @FXML
	    private Button adminLogin;
	    @FXML
	    private Button userloginButton;
	    @FXML
	    private Button weddingbutton1;
	    @FXML
	    private Button customizedbutton;
	    @FXML
	    private Button SignINbutton;
	    @FXML
	    private Button signupbutton;

	    @FXML
	    private TextField mynamefield;

	    @FXML
	    private TextField mycnicfield;

	    @FXML
	    private TextField myemailfield;

	    @FXML
	    private TextField myphonnumberfield;

	    @FXML
	    private TextField myadressfield;
	    @FXML
	    private TextField mypaswordfield;
	    @FXML
	    private Button mehndibutton;
	    @FXML
	    private Button indoorbutn;

	    @FXML
	    private Button outdoorbtn;
	    @FXML
	    private Button l3;

	    @FXML
	    private Button l4;

	    @FXML
	    private Button c1;

	    @FXML
	    private Button l2;
	    @FXML
	    private Button homebutton;

	    @FXML
	    private Button bookeventbuuton1;

	    @FXML
	    private Button eventtypebutton1;

	    @FXML
	    private Button aboutus1;

	    @FXML
	    private Button myprofile;

	    @FXML
	    void cusprofilepage(ActionEvent event) {

	    }

	    @FXML
	    void gotoaboutus(ActionEvent event) {

	    }

	    @FXML
	    void gotoeventtypes1(ActionEvent event) {

	    }
	    @FXML
	    private Button proceedtopay;
	    @FXML
	    private TextField cdnumber;

	    @FXML
	    private TextField digcvc;

	    @FXML
	    private DatePicker cardExpdate;

	    @FXML
	    private Button paynow;

	    @FXML
	    private Label bcm;

	    @FXML
	    private Label bcm1;

	    @FXML
	    private Label bcm11;

	    @FXML
	    private Label bcm12;
	    int temp1;
	    int temp2;
	    int temp3;
	    int temp4;
	    int TC1;
	    int TC2;
	    String S;
	    /////////////////////////////////////Dash Board 
	    // home page 
	    @FXML
	    void homepageeventtypes(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void homepagelogout(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    // categories page
	    @FXML
	    void home1(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void logout1(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  
	    
	    @FXML
	    void eventtype1(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @FXML
	    void bookevent1(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    	//// wedding Page 1
	    @FXML
	    void back2(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void bookevent2(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    		
	    }

	  
	    @FXML
	    void eventtype2(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home2(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //customized page 1
	    @FXML
	    void back3(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("weddingpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent3(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype3(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home3(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    ///customized page 2 ............Indoor outdoor
	    @FXML
	    void back4(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent4(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype4(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home4(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    ///customized page 3............lightning 
	
	    @FXML
	    void back5(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage1 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent5(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype5(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home5(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    // ///customized page 4...........lightning 
	
	    @FXML
	    void back6(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage3.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage1 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent6(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype6(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home6(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    // // ///customized page 5...........Staff
	
	    @FXML
	    void back7(ActionEvent event) {
	    	
	    	if(pagelocation==1)
	    	{
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage4.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage1 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	}
	    	else if(pagelocation==2){
	    		try {
			    	Stage stage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("themedpage12.fxml"));
					Scene scene =  new Scene(root);
					stage = (Stage)((Node)event.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.setTitle("customizedpage1 page");
					stage.show();

			    } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    		
	    	}
	    	else if(pagelocation==3){
	    		try {
			    	Stage stage = new Stage();
					Parent root = FXMLLoader.load(getClass().getResource("themedpage11.fxml"));
					Scene scene =  new Scene(root);
					stage = (Stage)((Node)event.getSource()).getScene().getWindow();
					stage.setScene(scene);
					stage.setTitle("customizedpage1 page");
					stage.show();

			    } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
	    	}
	    	
	    }
	    

	 

	    @FXML
	    void bookevent7(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype7(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home7(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    // // ///customized page 6...........Staff
		
	    @FXML
	    void back88(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage1 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent8(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype8(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home8(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
  // // ///customized page 7...........Staff
		
	    @FXML
	    void back9(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage6.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent9(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype9(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home9(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
 // // ///customized page 8...........Staff
	    @FXML
	    void bookevent10(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype10(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home10(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
 // // ///payment page ..........Staff
		
	    @FXML
	    void back11(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage8.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent11(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype11(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home11(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //////////////themedpage1 part dashboard
	    
	    @FXML
	    void back12(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("weddingpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent12(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype12(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home12(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //// themed indoor 
	    @FXML
	    void back13(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("themedpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent13(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype13(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home13(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    // themed out door
	    @FXML
	    void back14(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("themedpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6 page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	 

	    @FXML
	    void bookevent14(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Categories page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	   

	    @FXML
	    void eventtype14(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("eventTypes.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("event Types page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void home14(ActionEvent event) {
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home  page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //////////////////////////////////////////themed part
	    @FXML
	    void themedpage1(ActionEvent event) {
	    	Sitting_Charges=50000;
	    	try {
	    	Stage stage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("themedpage1.fxml"));
			Scene scene =  new Scene(root);
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.setTitle("themed page");
			stage.show();

	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	    @FXML
	    void gardentheme(ActionEvent event) {
	    	pagelocation=2;
	    	Sitting_Charges=50000;
	    	Function="Garden Theme";
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("gardentheme");
	    
	    }

	    @FXML
	    void mountainstheme(ActionEvent event) {
	    	Function="Mountains Theme";
	    	pagelocation=2;
	    	Sitting_Charges=50000;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("mountainstheme");
	    	
	    }

	    @FXML
	    void redvelvettheme(ActionEvent event) {
	    	Function="Red Velvet Theme";
	    	Sitting_Charges=50000;
	    	pagelocation=2;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("redvelvettheme");
	    }

	    @FXML
	    void seaviewtheme(ActionEvent event) {
	    	Function="Sea View Theme";
	    	Sitting_Charges=50000;
	    	pagelocation=2;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("seaviewtheme");
	    }
	    @FXML
	    void classicweddingtheme(ActionEvent event) {
	    	pagelocation=3;
	    	Function="Classic Wedding Theme";
	    	System.out.println("classicweddingtheme");
	    	Sitting_Charges=50000;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("classicweddingtheme");
	    }

	    @FXML
	    void fairytaletheme(ActionEvent event) {
	    	Function="Fairy Tale Theme";
	    	Sitting_Charges=50000;
	    	pagelocation=3;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("fairytaletheme");
	    }

	    @FXML
	    void hampshireweddingtheme(ActionEvent event) {
	    	Function="Hampshire Wedding Theme";
	    	Sitting_Charges=50000;
	    	pagelocation=3;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("hampshireweddingtheme");
	    }

	    @FXML
	    void libertywarehousetheme(ActionEvent event) {
	    	Function="Liberty WareHouse Theme";
	    	Sitting_Charges=50000;
	    	pagelocation=3;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println("libertywarehousetheme");
	    }

	    
	    @FXML
	    void themedpage11(ActionEvent event) {
	    	custorThem="Themed";
	    	Place="In Door";
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("themedpage11.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("indoor themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void themedpage12(ActionEvent event) {
	    	Place="Out Door";
	    	custorThem="Themed";
	    	try {
		    	Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("themedpage12.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("themed page");
				stage.show();

		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    //////////////////////////////////
	    @FXML
	    void paynowfn(ActionEvent event) {
	    
	    	//bcm1.setText("*");
	    	System.out.println(date);
	    	if(digcvc.getText().isEmpty()) {
	    		bcm11.setText("*");
	    		temp1=1;
	    		
	    	}
	    	if(!(digcvc.getText().isEmpty())) {
	    		// starting
	    		TC1=1;
	    		S=digcvc.getText().toString();
	    		System.out.println(S.length());
	    		System.out.println(S);
	    		System.out.println("sss");
	    		if(S.length()==3)
	    		{
	    			//bcm11.setText(" ");
	    			for(int i=0;i<S.length();i++) {
	   	    		 
	   	    		 if((S.charAt(i)=='0'||S.charAt(i)=='1'||S.charAt(i)=='2'||S.charAt(i)=='3'||S.charAt(i)=='4'||S.charAt(i)=='5'||S.charAt(i)=='6'||S.charAt(i)=='7'||S.charAt(i)=='8'||S.charAt(i)=='9')&&TC1==1) { 
	   	    			 	TC1=1;
	   	    		    } 
	   	    		 else {
	   	    			 TC1=0; 
	   	    		 }
	    			}
	    			
		    		temp1=0;
	    		}
	    		 if(temp1!=0 || TC1==0) {
	    		bcm11.setText("*");
	    		temp1=1;
	    		
	    		}
	    		 else {
	    			 bcm11.setText(" ");
	 	    		 
	    		 }
	    	}
	    	// ending 
	    	//temp1=digcvc.getText();
	    	// starting
	    	TC2=1;
	    	if(cdnumber.getText().isEmpty()) {
	    		bcm1.setText("*");
	    		temp2=1;
	    		
	    	}
	    	if(!(cdnumber.getText().isEmpty())) {
	    		S=cdnumber.getText().toString();
	    		System.out.println(UName);
	    		System.out.println("UName");
	    		if(S.length()==9)
	    		{  ////
	    			//bcm1.setText(" ");
	    			//bcm11.setText(" ");
	    			for(int i=0;i<S.length();i++) {
	   	    		 
	   	    		 if((S.charAt(i)=='0'||S.charAt(i)=='1'||S.charAt(i)=='2'||S.charAt(i)=='3'||S.charAt(i)=='4'||S.charAt(i)=='5'||S.charAt(i)=='6'||S.charAt(i)=='7'||S.charAt(i)=='8'||S.charAt(i)=='9')&&TC2==1) { 
	   	    			 	TC2=1;
	   	    		    } 
	   	    		 else {
	   	    			 TC2=0; 
	   	    		 }
	    			}
	    			
		    		//temp1=0;
		    		temp2=0;
	    		}
	    	 if(temp2!=0 || TC2==0) {
	    		bcm1.setText("*");
	    		temp2=1;
	    		}
	    	 else {
	    		 bcm1.setText(" "); 
	    	 }
	    		
	    	 
	    	}
	    	
	    	
	    	//ending 
	    	
	    	//temp1=digcvc.getText();
	    	if(cardExpdate.getValue() == null) {
	    		bcm12.setText("*");
	    		temp3=1;
	    		
	    	}
	    	if(!(cardExpdate.getValue() == null)) {
	    		bcm12.setText(" ");
	    		temp3=0;
	    	}
	    	
	    	if(temp2==0 && temp1==0 && temp3==0 &&TC1==1) {
	    		// inserting/saving data of customers orders
	    		CustomerOrders myObj1 = new CustomerOrders();
 	    		myObj1.InserCustorder(UName, eventtype, Function, Place, String.valueOf(Lightning_Charges), String.valueOf(Sitting_Charges),String.valueOf(Staff_Charges),String.valueOf(totalPrice),date,custorThem);
 	    		
	    	bcm.setText("Your Order Has been Placed");
	    	//FOODCHARGES=TOTALPRICE
		    // totalPrice,Staff,Staff_Charges,UName,eventtype,Function,Place,Light,Lightning_Charges,Sitting_Charges,TP;

	    	//LocalDate date = eventdate.getValue();
	         //System.err.println("Selected date: " + date);
	    	//System.out.println(date);
	    	
	    }
	    }
	    @FXML
	    private Label eventType;
	    @FXML
	    void LOGOUTFN(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Welcome");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    @FXML
	    void proceedtopayfn(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("paymentPage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("paymentpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	System.out.println(Staff);
	    	System.out.println(Staff_Charges);
	    }
	    @FXML
	    void gotouserloginToCategories(ActionEvent event) { 
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("Categories.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  

	    String FLAG = "0";
	    String Name;
	    String CNIC;
	    String Email;
	    String PhoneNo;
	    String Adress;
	    String Pswd;
	    @FXML
	    private Label nameemptylabel=new Label();
	    @FXML
	    private Label pswdemptylabel1;
	    int space;
	    int tempcheck;
	    @FXML
	    void fromsignuptToUsersignIN(ActionEvent event) {
	 
	    	
    	         //Retrieving data
    			Name=mynamefield.getText();
    	    	System.out.println(Name);
    	  
 	    		Email=myemailfield.getText();
 	    		System.out.println(Email);
 	    		
 	    		PhoneNo=myphonnumberfield.getText();
 	    		System.out.println(PhoneNo);
 	    		
 	    		Adress=myadressfield.getText();
 	    		System.out.println(Adress);

 	    		Pswd=mypaswordfield.getText();
 	    		System.out.println(Pswd);
 	
 	    		CNIC=mycnicfield.getText();
 	    		System.out.println(CNIC);
 
 	    		
 	    		FLAG="1";
 	    		if(mynamefield.getText().isEmpty()) {
 	    			
 	    			System.out.println("Empty");
 	    			nameemptylabel.setText("*");
 	    			tempcheck=1;
 		    		
 		    	}
 		    	if(!(mynamefield.getText().isEmpty())) {
 		    		//S=mynamefield.getText().toString();
 		    		System.out.println("NotEmpty");
 		    		nameemptylabel.setText(" ");
 		    		tempcheck=0;
 		    		}
 		    	if(mypaswordfield.getText().isEmpty()) {
 	    			
 	    			System.out.println("Empty mypaswordfield");
 	    			pswdemptylabel1.setText("*");
 	    			temp1=1;
 		    		
 		    	}
 		    	if(!(mypaswordfield.getText().isEmpty())) {
 		    		//S=mynamefield.getText().toString();
 		    		System.out.println("NotEmpty mypaswordfield");
 		    		pswdemptylabel1.setText(" ");
 		    		temp1=0;
 		    		}
 		    	space=0;
 		    	for(int i=0;i<Name.length();i++) {
 		    		 
 		    		 if(Name.charAt(i)==' ') { 
 		    			 	space=1;
 		    		    } 
 		    		  }
 		    	if(space==1) {
 		    		nameemptylabel.setText("Remove Space From User Name");

 		    	}
 		    	
 	    		if(tempcheck==0 && temp1==0 &&space==0) {
	    	try {
	    		UserInfo myObj = new UserInfo();
 	    		myObj.InserCustData(Name, CNIC, Email, PhoneNo, Adress, Pswd);
	    		
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("USERLOGIN.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("User Login page");
				stage.show();
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	    		}
 	    		
 	    		else {
 	    			
 	    			System.out.println("Empty Required Fields");
 	    		}
 	    		
	    	
	    }
	    @FXML
	    void mehndibuttonfun(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	    }
	    @FXML
	    void SignINPage(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("USERsignUp.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("USER Sign Up page");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    @FXML
	    void UserLoginPage(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("USERLOGIN.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("User Login page");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 if( FLAG.equals("1")) {
	    		 System.out.println("Account Created Sucessfully");
	    		 IncorrectPassword.setText("Account Created Sucessfully");
	    	 }
	    }
	    @FXML
	    private Button signupbackbutton1;
	    @FXML
	    void fromsignuptbackToUsersignIN(ActionEvent event) {
	    
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("USERLOGIN.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("User Login page");
				stage.show();
				if( FLAG.equals("1")) {
		    		 System.out.println("In Correct Password");
		    		 IncorrectPassword.setText("Account Created Sucessfully");
		    	 }

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	    }

	    
	    @FXML
	    void adminLoginPage(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("AdminLogIn.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("Admin Login page");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @FXML
	    private PasswordField enterdPasword;

	    @FXML
	    private TextField EnterdName;
	    // declaring variables to extract name and password entered for log in  
	    public static String UName;
	    public static int pagelocation;
	    String Pwdd;
	    int temp;
	    @FXML
	    void userloginToCategories(ActionEvent event) {
	    	
	    }
	 //customized page 1 
	    public static String eventtype;
	    @FXML
	    private Label IncorrectPassword;
	    @FXML
	    void weddingbutPage(ActionEvent event) {
	    	System.out.println("weddingbutPage");
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("weddingpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("wedding page 1 page");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	eventtype="Wedding";
	    }
	    

	    @FXML
	    private Button dholkibtn;

	    @FXML
	    private Button baratbutn;

	    @FXML
	    private Button mayonbtn;

	    @FXML
	    private Button receptionbtn;

	    @FXML
	    private Button mehndibtn;

	    @FXML
	    private Button shalimabtn;

	    @FXML
	    private Button nikkahbtn;
	    	///	 customized page 1
	    @FXML
	    void userlogintohomepage(ActionEvent event) {
	    	System.out.println("homepage2");
	    	UName=EnterdName.getText();
	    	Pwdd=enterdPasword.getText();
	    	System.out.println("eeeeeeeeee");
	    	UserInfo myObj1 = new UserInfo();
	    	temp=myObj1.checkingLogIn(UName,Pwdd);
	    	 System.out.println("returnValues" + temp); 
	    	 String temps=String.valueOf(temp);
	    	 if(temps.equals("3"))
	    	 {
	    	try {
	    		
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("home page");
				stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				e.printStackTrace();
			}
	    	
	    	System.out.println(UName);
	    	System.out.println(Pwdd);
	    	 }
	    	 else {
	    		 System.out.println("In Correct Password");
	    		 IncorrectPassword.setText("Wrong Username/Password");
	    		 
	    	 }
	    	 System.out.println("Flag"+FLAG);
	    	 if( FLAG.equals("1")) {
	    		 System.out.println("In Correct Password");
	    		 IncorrectPassword.setText("Account Created Sucessfully");
	    	 }
	    }

	   public static String Function;
	    @FXML
	    void baratbutnfn(ActionEvent event) {
	    	Function="Barat";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    @FXML
	    void dholkifn(ActionEvent event) {
	    	Function="Dholki";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    @FXML
	    void mayonfn(ActionEvent event) {
	    	Function="Mayon";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    

	    @FXML
	    void mehndifn(ActionEvent event) {
	    	Function="Mehndi";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    @FXML
	    void nikkahfn(ActionEvent event) {
	    	Function="Nikkah";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    @FXML
	    void receptionfn(ActionEvent event) {
	    	Function="Reception";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }

	    @FXML
	    void shalimafn(ActionEvent event) {
	    	Function="Shalima";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage2.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage2");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Function);
	    }
	    ///customized page 2
	  
	   public static String Place;
	   public static String custorThem;
	    @FXML
	    void indoorfun(ActionEvent event) {
	    	Place="InDoor";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage3.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage3");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Place);
	    }

	    @FXML
	    void outdoorfunc(ActionEvent event) {
	    	Place="OutDoor";
	    	custorThem="Customized";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage3.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage3");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Place);
	    }

	    ///////////// customized page 3

	    	public static String Light;
	    	public static int Lightning_Charges;
	    @FXML
	    void c1f(ActionEvent event) {
	    	Light="Candles";
	    	Lightning_Charges=4000;
	    	System.out.println("in customized page 4");
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage4.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage4");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Light);
	    	System.out.println(Lightning_Charges);
	    }

	    @FXML
	    void l2f(ActionEvent event) {
	    	Light="Lanterns";
	    	Lightning_Charges=6000;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage4.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage4");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Light);
	    	System.out.println(Lightning_Charges);
	    }

	    @FXML
	    void l3f(ActionEvent event) {
	    	Light="chandeliers";
	    	Lightning_Charges=10000;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage4.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage4");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Light);
	    	System.out.println(Lightning_Charges);
	    }

	    @FXML
	    void l4f(ActionEvent event) {
	    	Light="Mason Jar Lamps";
	    	Lightning_Charges=8000;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage4.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage4");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Light);
	    	System.out.println(Lightning_Charges);
	    }
	    	//////customized page 4
	    
	    @FXML
	    private Button sittingbtn1;

	    @FXML
	    private Button sittingbtn3;

	    @FXML
	    private Button sittingbtn2;

	    @FXML
	    private Button sittingbtn4;
	    public static int Sitting_Charges;

	    @FXML
	    void sittingbtn1f(ActionEvent event) {
	    	pagelocation=1;
	    	Sitting_Charges=10000;
	    	try {///
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Sitting_Charges);
	    }

	    @FXML
	    void sittingbtn2f(ActionEvent event) {
	    	pagelocation=1;
	    	Sitting_Charges=25000;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Sitting_Charges);
	    }

	    @FXML
	    void sittingbtn3f(ActionEvent event) {
	    	Sitting_Charges=20000;
	    	pagelocation=1;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Sitting_Charges);
	    }

	    @FXML
	    void sittingbtn4f(ActionEvent event) {
	    	pagelocation=1;
	    	Sitting_Charges=15000;
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage5.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage5");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Sitting_Charges);
	    }
	    

	    
	    //// customized page 5s
	    
	    @FXML
	    private Button malebtn;

	    @FXML
	    private Button femalebtn;

	    @FXML
	    private Button bothmaleandfemale;

	    public static String Staff;
	    public static int Staff_Charges;
	    @FXML
	    void bothmaleandfemalefn(ActionEvent event) {
	    	Staff="Both Male and Female";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage6.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Staff_Charges=10000;
	    	System.out.println(Staff);
	    	System.out.println(Staff_Charges);
	    }
	    @FXML
	    private Button nextbtn;
// customized page 6
	    @FXML
	    private CheckBox soupbtn;

	    @FXML
	    private CheckBox friesbtn;

	    @FXML
	    private CheckBox saladbtn;

	    @FXML
	    private CheckBox coldrinkbtn;

	    @FXML
	    private CheckBox ChickenPulaobtn;

	    @FXML
	    private CheckBox MuttonQormabtn;

	    @FXML
	    private CheckBox Nanbtn;

	    @FXML
	    private CheckBox chickenbotitikka;

	    @FXML
	    private CheckBox SeekhKababbtn;

	    @FXML
	    private CheckBox Muttonkunnabtn;

	    @FXML
	    private CheckBox kheerbtn;

	    @FXML
	    private CheckBox firnibtn;

	    @FXML
	    private CheckBox fruittrifflebtn;

	    @FXML
	    private CheckBox BonelessChickenjalferazibtn;

	    @FXML
	    private CheckBox MuttonBriyani;

	    @FXML
	    private CheckBox gajarHalwabtn;

	    @FXML
	    private CheckBox Chickensteamroastbtn;

	    @FXML
	    private CheckBox MuttonBadamiKormabtn;

	    @FXML
	    private CheckBox KulfiFaloodabtn;

	    @FXML
	    private CheckBox greentebtn;

	    @FXML
	    private CheckBox wholeLambRoastbtn;

	    @FXML
	    private CheckBox Muttonjalfarezibtn;

	    @FXML
	    private CheckBox Raitabtn;
	    public static int totalPrice;

	    int BSC;
	    @FXML
	    void BonelessChickenjalferazifn(ActionEvent event) {
	    	if(BonelessChickenjalferazibtn.isSelected()) {
	    		BSC=500;
	    		
	    	}
	    	else {
	    		BSC=0;
	    	}
	    	
	    }
	    int CP;
	    @FXML
	    void ChickenPulaofn(ActionEvent event) {
	    	if(ChickenPulaobtn.isSelected()) {
	    		CP=500;
	    	}
	    	else {
	    		CP=0;
	    	}
	    }
	    int CSR;
	    @FXML
	    void Chickensteamroastfn(ActionEvent event) {
	    	if(Chickensteamroastbtn.isSelected()) {
	    		CSR=500;
	    	}
	    	else {
	    		CSR=0;
	    	}
	    }
	    int KF;
	    @FXML
	    void KulfiFaloodafn(ActionEvent event) {
	    	if(KulfiFaloodabtn.isSelected()) {
	    		KF=300;
	    	}
	    	else {
	    		KF=0;
	    	}
	    }
	    int MBK;
	    @FXML
	    void MuttonBadamiKormafn(ActionEvent event) {
	    	if(MuttonBadamiKormabtn.isSelected()) {
	    		MBK=500;
	    	}
	    	else {
	    		MBK=0;
	    	}
	    }
	    int MB;
	    @FXML
	    void MuttonBriyanifn(ActionEvent event) {
	    	if(MuttonBriyani.isSelected()) {
	    		MB=500;
	    	}
	    	else {
	    		MB=0;
	    	}
	    }
	    int MQ;
	    @FXML
	    void MuttonQormafn(ActionEvent event) {
	    	if(MuttonQormabtn.isSelected()) {
	    		MQ=500;
	    	}
	    	else {
	    		MQ=0;
	    	}
	    }
	    int MJF;
	    @FXML
	    void Muttonjalfarezifn(ActionEvent event) {
	    	if(Muttonjalfarezibtn.isSelected()) {
	    		MJF=500;
	    	}
	    	else {
	    		MJF=0;
	    	}
	    }
	    int MK;
	    @FXML
	    void Muttonkunnafn(ActionEvent event) {
	    	if(Muttonkunnabtn.isSelected()) {
	    		MK=500;
	    	}
	    	else {
	    		MK=0;
	    	}
	    }
	    int NN;
	    @FXML
	    void Nanfn(ActionEvent event) {
	    	if(Nanbtn.isSelected()) {
	    		NN=500;
	    	}
	    	else {
	    		NN=0;
	    	}
	    }
	    int RB;
	    @FXML
	    void Raitafn(ActionEvent event) {
	    	if(Raitabtn.isSelected()) {
	    		RB=100;
	    	}
	    	else {
	    		RB=0;
	    	}
	    }
	    int SKB;
	    @FXML
	    void SeekhKababfn(ActionEvent event) {
	    	if(SeekhKababbtn.isSelected()) {
	    		SKB=500;
	    	}
	    	else {
	    		SKB=0;
	    	}
	    }

	    int CBT;
	    @FXML
	    void chickenbotitikkafn(ActionEvent event) {
	    	if(chickenbotitikka.isSelected()) {
	    		CBT=500;
	    	}
	    	else {
	    		CBT=0;
	    	}
	    }
	    int CD;
	    @FXML
	    void coldrinkfn(ActionEvent event) {
	    	if(coldrinkbtn.isSelected()) {
	    		CD=100;
	    	}
	    	else {
	    		CD=0;
	    	}
	    }
	    int FN;
	    @FXML
	    void firnifn(ActionEvent event) {
	    	if(firnibtn.isSelected()) {
	    		FN=300;
	    	}
	    	else {
	    		FN=0;
	    	}
	    }
	    int F;
	    @FXML
	    void friesfn(ActionEvent event) {
	    	if(friesbtn.isSelected()) {
	    		F=100;
	    	}
	    	else {
	    		F=0;
	    	}
	    }
	    int FTF;
	    @FXML
	    void fruittrifflefn(ActionEvent event) {
	    	if(fruittrifflebtn.isSelected()) {
	    		FTF=300;
	    	}
	    	else {
	    		FTF=0;
	    	}
	    }
	    int GH;
	    @FXML
	    void gajarHalwafn(ActionEvent event) {
	    	if(gajarHalwabtn.isSelected()) {
	    		GH=300;
	    	}
	    	else {
	    		GH=0;
	    	}
	    }
	    int GT;
	    @FXML
	    void greenteafn(ActionEvent event) {
	    	if(greentebtn.isSelected()) {
	    		GT=100;
	    	}
	    	else {
	    		GT=0;
	    	}
	    }
	    int KFN;
	    @FXML
	    void kheerfn(ActionEvent event) {
	    	if(kheerbtn.isSelected()) {
	    		KFN=300;
	    	}
	    	else {
	    		KFN=0;
	    	}
	    }

	  
	    int Sld;
	    @FXML
	    void saladfn(ActionEvent event) {
	    	if(saladbtn.isSelected()) {
	    		Sld=100;
	    	}
	    	else {
	    		Sld=0;
	    	}
	    }

	    int SF;
	    @FXML
	    void soupfn(ActionEvent event) {
	    	if(soupbtn.isSelected()) {
	    		SF=100;
	    	}
	    	else {
	    		SF=0;
	    	}
	    }
	    
	    int WLR;
	    @FXML
	    void wholeLambRoastfn(ActionEvent event) {
	    	if(wholeLambRoastbtn.isSelected()) {
	    		WLR=500;
	    	}
	    	else {
	    		WLR=0;
	    	}
	    }
	    public static int TP;
	    public static int tp1;
	    @FXML
	    private Label totalpersons;
	    int nums;
	    @FXML
	    void nextbtnfn(ActionEvent event) {
	    	nums=1;
	    	System.out.println("hello WORLD");
	    	
	    	Totalpersons=numberPersons.getText();
	    	System.out.println("Totalpersons");
	    	if(!(numberPersons.getText().isEmpty())) {
	    		tp1=2;
	    	for(int i=0;i<Totalpersons.length();i++) {
	    		 
	    		 if((Totalpersons.charAt(i)=='0'||Totalpersons.charAt(i)=='1'||Totalpersons.charAt(i)=='2'||Totalpersons.charAt(i)=='3'||Totalpersons.charAt(i)=='4'||Totalpersons.charAt(i)=='5'||Totalpersons.charAt(i)=='6'||Totalpersons.charAt(i)=='7'||Totalpersons.charAt(i)=='8'||Totalpersons.charAt(i)=='9')&&nums==1) { 
	    			 	nums=1;
	    		    } 
	    		 else {
	    			 nums=0; 
	    			 System.out.println("wrong enterd");
	    		 }
	    		 
	    		  }
	    	}
	    	
	    	if(nums==0 || (numberPersons.getText().isEmpty()) ) {
	    		totalpersons.setText("*");
	    		System.out.println("Invalid NUmber renterd");
	    	}
	    	if(nums==1 && tp1==2) {
	    
	    	try {
	    		TP=Integer.parseInt(Totalpersons);
		    	totalPrice=WLR*TP+SF*TP+Sld*TP+KFN*TP+GT*TP+GH*TP+FTF*TP+F*TP+FN*TP+CD*TP+BSC*TP+CP*TP+CSR*TP+KF*TP+MBK*TP+MB*TP+MQ*TP+MJF*TP+MK*TP+NN*TP+RB*TP+SKB*TP+CBT*TP;
		    	System.out.println(totalPrice);
		    	
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage7.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage7");
				stage.show();
				maineventlabel.setText("Wedding");
				//LocalDate date = eventdate.getValue(); // input from your date picker
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}  }
	    	
	    }


	    @FXML
	    void femalebtnfn(ActionEvent event) {
	    	Staff="Female";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage6.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Staff_Charges=7000;
	    	System.out.println(Staff);
	    	System.out.println(Staff_Charges);
	    }

	    @FXML
	    void malebtnfn(ActionEvent event) {
	    	Staff="Male";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage6.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage6");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Staff_Charges=7000;
	    	System.out.println(Staff);
	    	System.out.println(Staff_Charges);
	    }
///////////////customized page 7
	   
	    @FXML
	    private Button nextTobill;
	    @FXML
	    private TextField numberPersons;

	    String Totalpersons;
	    @FXML
	    private Label selectdatelabel;
	    
	    @FXML
	    private DatePicker eventdate;
	    public static String date;
	  
	    @FXML
	    private Label eventPlace;

	    @FXML
	    private Label hallcharges;

	    @FXML
	    private Label staffcharges;

	    @FXML
	    private Label totalcharges;

	    @FXML
	    private Label foodcharges;

	    @FXML
	    private Label lightcharges;

	    @FXML
	    private Label maineventlabel= new Label();
	    @FXML
	    private Label temp34 = new Label();
	    @FXML
	    void back8(ActionEvent event) {
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage7.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customizedpage7");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    @FXML
	    private Label date1;

	    @FXML
	    private Label planname;
	    @FXML
	    void refreshbill(ActionEvent event) {
	    	System.out.println("refreshbill");
	    	maineventlabel.setText("Wedding");
	    	eventPlace.setText(Place);
			//hallcharges.setText(Function);
			//Lightning_Charges
	    	planname.setText(Function);
			staffcharges.setText(Integer.toString(Staff_Charges));
			foodcharges.setText(Integer.toString(totalPrice));
			lightcharges.setText(Integer.toString(Lightning_Charges));
			totalcharges.setText(Integer.toString(Lightning_Charges+Staff_Charges+totalPrice+Sitting_Charges));
			maineventlabel.setText("Wedding");
			eventType.setText(custorThem); 
			eventPlace.setText(Place);
			date1.setText(date);
			hallcharges.setText(Integer.toString(Sitting_Charges));
	    }
	    @FXML
	    void nextTobillfn(ActionEvent event) {
	    	System.out.println("in next to bill function ");
	    	maineventlabel.setText("Wedding");
	    	if(eventdate.getValue() != null) {
	    		
	    	try {
	    		//maineventlabel.setText("Wedding");
	    		 date =  eventdate.getValue().toString();
				System.out.println("eventDate");
		    	System.out.println(date);
		    	System.out.println(Function);
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedPage8.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customized page 8 ");
			//	System.out.println(Function);
				//temp34.setText("*"); 
				//eventPlace.setText(Place);
				//hallcharges.setText(Function);
				//Lightning_Charges
				//staffcharges.setText(Integer.toString(Staff_Charges));
				//foodcharges.setText(Integer.toString(totalPrice));
				//lightcharges.setText(Integer.toString(Lightning_Charges));
				//totalcharges.setText(Function);
				//maineventlabel.setText("Wedding");
				stage.show();
				
				//String t="Wedding";
				//eventType.setText(Function); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	}
	    	else {
	    		System.out.println("Before Setting Text");
	    		selectdatelabel.setText("*");
	    		System.out.println("After Setting Text");
	    		
	    	}
	    	
	    
	    }

	  ////////////// Wedding page 1
	    String Type;
	    @FXML
	    void customizedpage(ActionEvent event) {
	    	Type="Customized";
	    	try {
				Stage stage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("customizedpage1.fxml"));
				Scene scene =  new Scene(root);
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				stage.setScene(scene);
				stage.setTitle("customized page 1 page");
				stage.show();


			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(Type);
	    }
	    
	    
	    
	    
}
