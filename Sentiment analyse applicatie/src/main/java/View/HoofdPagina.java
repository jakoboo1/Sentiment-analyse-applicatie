package View;

import Controller.Controller;
import Model.Model;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HoofdPagina {


        public HoofdPagina(Stage stage,String zin) {

            ImageView imageView = new ImageView();
            Label label = new Label("");
            Button buttonAnalyse = new Button("Analyseer");

            buttonAnalyse.setStyle("-fx-background-color: #FF0088");
            buttonAnalyse.setPrefSize(200,50);


            VBox vBox = new VBox(50);
            vBox.setAlignment(Pos.CENTER);
            vBox.setStyle("-fx-background-color: #36454F");
            vBox.getChildren().addAll(imageView,label,buttonAnalyse);

            //Tijdens het nakijken moet dit mogelijk worden veranderd naar de lokale path.
            Image image = new Image("C:\\Users\\jakub\\OneDrive\\Bureaublad\\School\\Leerjaar 2\\stage\\Herkansing bp5\\Herkansing bp5\\Sentiment analyse applicatie\\src\\main\\java\\coin.png");
            imageView.setImage(image);

            Scene hoofdscherm = new Scene(vBox,1000,1000);

            Controller controller = new Controller();
            controller.draaienY(imageView);


            buttonAnalyse.setOnAction(actionEvent -> {

                ResultaatScene resultaatScene = new ResultaatScene(stage,label);
                Model model = new Model();

                model.analyseer(zin,label);
            });


            stage.setScene(hoofdscherm);
            stage.show();

        }


    }

