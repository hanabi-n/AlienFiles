/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alienfiles.MainMenu;


import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class FXMLMainMenu {
    @FXML
    private AnchorPane MainPane1;

    @FXML
    private FontAwesomeIconView SearchIcon;

    @FXML
    private JFXTextField SearchMainPane1;

    @FXML
    private Button Popular;

    @FXML
    private Button All;

    @FXML
    private Button NewMessage;

    @FXML
    private Button CreateaAnArticle;

    @FXML
    private AnchorPane MainPane2;

    @FXML
    private ScrollBar ScrollBarMainPane2;

    @FXML
    private AnchorPane TopCommunities;

    @FXML
    private AnchorPane MainPaneCommunities;

    @FXML
    private Label LabelCommunities;

    @FXML
    private JFXTextField SearchCommunitites;

    @FXML
    private ScrollBar ScrollBarCommunities;

    @FXML
    private VBox VBoxCommunities;

    public void initialize(URL url, ResourceBundle rb) {
            System.out.println(ScrollBarCommunities.getValue() +
                    ScrollBarCommunities.getMin()+ "\n" +
                    ScrollBarCommunities.getMax()+"\n"+ "\n");  
        
        ScrollBarCommunities.valueProperty().addListener(event -> {
            VBoxCommunities.setTranslateY(20 + ScrollBarCommunities.getValue());
            SearchCommunitites.setTranslateY(20 + ScrollBarCommunities.getValue());
            LabelCommunities.setTranslateY(20 + ScrollBarCommunities.getValue());
        });
    }  
}
