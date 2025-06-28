import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class OOP_JavaFX_Scholem extends Application {

    @Override
    public void start(Stage primaryStage) {

        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color: AD3D27;");

        Menu fileMenu = new Menu("File");

        Menu editMenu = new Menu("Edit");

        Menu themeMenu = new Menu("Theme");

        Menu helpMenu = new Menu("Help");

        menuBar.getMenus().addAll(fileMenu, editMenu, themeMenu, helpMenu);

        VBox imageBox = new VBox();
        imageBox.setSpacing(10);
        imageBox.setPrefSize(130, 560);
        imageBox.setAlignment(Pos.TOP_CENTER);
        imageBox.setPadding(new Insets(10, 5, 0, 10));
        imageBox.setStyle("-fx-background-color: #AD8027;");

        VBox imageContainer = new VBox();
        imageContainer.setPrefSize(120, 120);
        imageContainer.setStyle("-fx-background-color: #FFFFFF;");

        ImageView imageView = new ImageView();
        Image image = new Image("icons8-user-96.png");
        imageView.setImage(image);
        imageView.setFitHeight(94);
        imageView.setFitWidth(94);
        imageView.setPreserveRatio(true);

        imageContainer.getChildren().add(imageView);
        imageBox.getChildren().add(imageContainer);

        TableView<Student> tableView = new TableView<>();

        String[] headers = {"ID", "First Name", "Last Name", "Department", "Major", "Email"};

        TableColumn<Student, Integer> idCol = new TableColumn<>(headers[0]);
        TableColumn<Student, String> firstNameCol = new TableColumn<>(headers[1]);
        TableColumn<Student, String> lastNameCol = new TableColumn<>(headers[2]);
        TableColumn<Student, String> departmentCol = new TableColumn<>(headers[3]);
        TableColumn<Student, String> majorCol = new TableColumn<>(headers[4]);
        TableColumn<Student, String> emailCol = new TableColumn<>(headers[5]);

        idCol.setPrefWidth(40);
        idCol.setResizable(false);
        firstNameCol.setPrefWidth(120);
        firstNameCol.setResizable(false);
        lastNameCol.setPrefWidth(90);
        lastNameCol.setResizable(false);
        departmentCol.setPrefWidth(120);
        departmentCol.setResizable(false);
        majorCol.setPrefWidth(90);
        majorCol.setResizable(false);
        emailCol.setPrefWidth(80);
        emailCol.setResizable(false);


        tableView.getColumns().addAll(idCol, firstNameCol, lastNameCol, departmentCol, majorCol, emailCol);

        VBox formPane = new VBox(6);
        formPane.setPrefSize(215, 620);
        formPane.setAlignment(Pos.CENTER);
        formPane.setPadding(new Insets(5));
        formPane.setSpacing(35);
        formPane.setStyle("-fx-background-color: #61D415;");

        VBox formContainer = new VBox();
        formContainer.setSpacing(6);
        formContainer.setAlignment(Pos.TOP_CENTER);

        String[] prompts = {"First Name", "Last Name", "Department", "Major", "Email", "imageURL"};

        for(String prompt : prompts) {
            TextField field = new TextField();
            field.setPromptText(prompt);
            field.setScaleX(1);
            field.setFont(new Font(12));
            formContainer.getChildren().add(field);
        }

        formPane.getChildren().add(formContainer);

        VBox buttonBox = new VBox(16);
        buttonBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonBox.setPrefSize(200, 300);

        String[] buttonLabels = {"Clear", "Add", "Delete", "Edit"};
        for(String buttonLabel : buttonLabels) {
            Button button = new Button(buttonLabel);
            button.setPrefSize(200, 45);
            button.setFont(new Font(16));
            button.setStyle("-fx-background-radius: 10; -fx-background-color: #AD8027;");
            buttonBox.getChildren().add(button);
        }

        formPane.getChildren().add(buttonBox);

        HBox bottomGray = new HBox();
        bottomGray.setPrefSize(814,30);
        bottomGray.setStyle("-fx-background-color: #999999;");

        HBox bottomBrown = new HBox();
        bottomBrown.setPrefSize(814,7);
        bottomBrown.setStyle("-fx-background-color: #AD8027;");

        VBox bottomBox = new VBox(bottomGray, bottomBrown);

        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(tableView);
        root.setBottom(bottomBox);
        root.setLeft(imageBox);
        root.setRight(formPane);

        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add("style.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("OOP JavaFX Scholem");
        primaryStage.show();
    }

}
