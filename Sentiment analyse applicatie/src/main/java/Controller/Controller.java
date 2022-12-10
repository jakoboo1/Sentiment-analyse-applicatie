package Controller;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller {

    //@author: https://www.youtube.com/watch?v=UdGiuDDi7Rg
    public void draaienY(ImageView imageView) {

        RotateTransition draaiAnimatie = new RotateTransition();
        draaiAnimatie.setNode(imageView);
        draaiAnimatie.setDuration(Duration.millis(2500));
        draaiAnimatie.setCycleCount(TranslateTransition.INDEFINITE);
        draaiAnimatie.setInterpolator(Interpolator.LINEAR);
        draaiAnimatie.setByAngle(360);
        draaiAnimatie.setAxis(Rotate.Y_AXIS);
        draaiAnimatie.play();

    }

    //@author: https://www.youtube.com/watch?v=UdGiuDDi7Rg
    public void draaienX(ImageView imageView) {

        RotateTransition draaiAnimatie = new RotateTransition();
        draaiAnimatie.setNode(imageView);
        draaiAnimatie.setDuration(Duration.millis(2500));
        draaiAnimatie.setCycleCount(TranslateTransition.INDEFINITE);
        draaiAnimatie.setInterpolator(Interpolator.LINEAR);
        draaiAnimatie.setByAngle(360);
        draaiAnimatie.setAxis(Rotate.X_AXIS);
        draaiAnimatie.play();

    }
}
