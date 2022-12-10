package View;

import Controller.Controller;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ResultaatScene {

    public ResultaatScene(Stage stage, Label label) {


        ImageView imageView = new ImageView();

        Button button = new Button("Ga terug");
        button.setStyle("-fx-background-color: #FF0088");
        button.setPrefSize(200,50);


        VBox vBox = new VBox(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: #36454F");
        vBox.getChildren().addAll(imageView,label,button);

        Image image = new Image("C:\\Users\\jakub\\OneDrive\\Bureaublad\\test\\sentiment-analysis-main\\src\\main\\java\\example\\sentimentanalysis\\coin.png");
        imageView.setImage(image);

        label.setTextFill(Color.WHITE);
        label.setStyle("-fx-font: 32 arial;");

        Scene resultaatScene = new Scene(vBox,1000,1000);

        Controller controller = new Controller();
        controller.draaienX(imageView);


        button.setOnAction(actionEvent -> {
            HoofdPagina hoofdpagina = new HoofdPagina(stage,null);
        });


//        stackPane.getChildren().addAll(imageView,label,button);
        stage.setScene(resultaatScene);
        stage.show();

    }

}
