package clickcopy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private VBox rootLayout;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setMinHeight(170);
        primaryStage.setMinWidth(640);
        this.primaryStage.setTitle("Click&Copy");

        initRootLayout();

        showFields();

    }

    /**
     * Инициализация корневого узла.
     */
    public void initRootLayout() {
        rootLayout = new VBox();
        rootLayout.setPrefSize(640, 170);

        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Создание и отображение основных областей окна.
     */
    public void showFields() {
        HBox upBox = new HBox(),
                middleBox = new HBox(),
                downBox = new HBox();

        Label firLab = new Label("1"),
                secLab = new Label("2"),
                thLab = new Label("3");
        firLab.setPrefSize(200, 30);
        firLab.setAlignment(Pos.CENTER);
        secLab.setPrefSize(200, 30);
        secLab.setAlignment(Pos.CENTER);
        secLab.setPadding(new Insets(0, 10, 0, 10));
        thLab.setPrefSize(200, 30);
        thLab.setAlignment(Pos.CENTER);

        upBox.setPadding(new Insets(10));
        upBox.setAlignment(Pos.CENTER_LEFT);
        upBox.getChildren().addAll(firLab, secLab, thLab);
        HBox.setMargin(secLab, new Insets(0, 10, 0, 10));

        TextField firField = new TextField(),
                secField = new TextField(),
                thField = new TextField();
        firField.setPrefSize(200, 30);
        secField.setPrefSize(200, 30);
        secField.setPadding(new Insets(0, 10, 0, 10));
        thField.setPrefSize(200, 30);

        middleBox.setPadding(new Insets(10));
        middleBox.setAlignment(Pos.CENTER);
        middleBox.getChildren().addAll(firField, secField, thField);
        HBox.setMargin(secField, new Insets(0, 10, 0, 10));

        Button text1to2 = new Button("Копировать 1 в 2"),
                text2to3 = new Button("Копировать 2 в 3");
        text1to2.setPrefSize(200, 30);
        text2to3.setPrefSize(200, 30);
        text2to3.setPadding(new Insets(0, 10, 0, 10));

        downBox.setPadding(new Insets(10));
        downBox.setAlignment(Pos.CENTER_LEFT);
        downBox.getChildren().addAll(text1to2, text2to3);
        HBox.setMargin(text2to3, new Insets(0, 10, 0, 10));

        Label lab = new Label("БГУИР - Знания и стиль жизни");
        lab.setAlignment(Pos.CENTER);
        HBox LBox = new HBox();
        LBox.setAlignment(Pos.CENTER);
        LBox.setPadding(new Insets(10));
        LBox.getChildren().add(lab);

        rootLayout.getChildren().addAll(LBox, upBox, middleBox, downBox);

        Controller controller = new Controller();
        controller.initController(firField, secField, thField, text1to2, text2to3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
