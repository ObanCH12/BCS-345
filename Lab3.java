package lab3;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Lab3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        int size = 11;
        Rectangle[] steps = new Rectangle[size];
        
        Rectangle greytile = new Rectangle(320, 250, 60, 30);
        greytile.setFill(Color.LIGHTGREY);
        
        Rectangle[] doors = new Rectangle[2];
        for(int i = 0; i < 2; i++){
            doors[i] = new Rectangle(165 + (i*295), 327.5, 75, 122);
            doors[i].setFill(Color.WHITE);
            doors[i].setStroke(Color.BLACK);
        }
        Rectangle bigdoor = new Rectangle(312.5, 310.5, 75, 139);
        bigdoor.setFill(Color.WHITE);
        bigdoor.setStroke(Color.BLACK);
        
        Rectangle building = new Rectangle(510, 370, Color.FIREBRICK);
        building.setX(95);
        building.setY(182);
        building.setStroke(Color.BLACK);
        
        Rectangle grass = new Rectangle(700, 500, Color.LIMEGREEN);
        grass.setY(300);
        
        Rectangle topRct = new Rectangle(510, 35,Color.WHITE);
        topRct.setX(95);
        topRct.setY(182);
        topRct.setStroke(Color.BLACK);
        
        Rectangle[] columns = new Rectangle[4];
        Rectangle[] columnbtm = new Rectangle[4];
        
        Circle[][] colcrcle = new Circle[4][2];
        
        Polygon roof = new Polygon(55,182, 645,182, 350,50);
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);
        
        Rectangle graystep1 = new Rectangle(55, 5, Color.LIGHTGREY);
        Rectangle graystep2 = new Rectangle(55, 5, Color.LIGHTGREY);
        graystep1.setY(450);
        graystep1.setX(95);
        graystep2.setY(450);
        graystep2.setX(550);
        graystep2.setStroke(Color.BLACK);
        graystep1.setStroke(Color.BLACK);
        
        Group gp = new Group(grass, building, graystep1, graystep2, topRct, roof, greytile, bigdoor);
        for (int  i = 0; i < size; i++){
            steps[i] = new Rectangle​( 600 - (i*20), 10, Color.LIGHTGREY);
            steps[i].setX(50 + (i * 10));
            steps[i].setY(550 - (i*10));
            steps[i].setStroke(Color.BLACK);
            gp.getChildren().add(steps[i]);
        }
        for (int  i = 0; i < 4; i++){
            columns[i] = new Rectangle​( 40, 230, Color.WHITE);
            columns[i].setX(110 + (i * 146));
            columns[i].setY(217);
            columns[i].setStroke(Color.BLACK);
            gp.getChildren().add(columns[i]);
        }
        for (int  i = 0; i < 4; i++){
            columnbtm[i] = new Rectangle​( 50, 13, Color.WHITE);
            columnbtm[i].setX(105 + (i * 146));
            columnbtm[i].setY(437);
            columnbtm[i].setStroke(Color.BLACK);
            gp.getChildren().add(columnbtm[i]);
        }
        for (int  i = 0; i < 4; i++){
                colcrcle[i][0] = new Circle(110+(i*146), 232, 15);
                colcrcle[i][0].setFill(Color.WHITE);
                colcrcle[i][0].setStroke(Color.BLACK);
                gp.getChildren().add(colcrcle[i][0]);
        }
        for (int  i = 0; i < 4; i++){
                colcrcle[i][1] = new Circle(150+(i*146), 232, 15);
                colcrcle[i][1].setFill(Color.WHITE);
                colcrcle[i][1].setStroke(Color.BLACK);
                gp.getChildren().add(colcrcle[i][1]);
        }
        for(int i = 0; i < 2; i++){
            gp.getChildren().add(doors[i]);
        }
        
        Rectangle[][] windows = new Rectangle[3][10];
        for(int i = 0; i < 10; i++){
            if(i == 0){
                windows[0][i] = new Rectangle(180, 332.5, 15, 15);
            
            }
            else if (i < 5){
                windows[0][i] = new Rectangle(180, 352.5 + ((i-1)*25), 15, 20);   
            }
            else if(i == 5){
                windows[0][i] = new Rectangle(210, 332.5, 15, 15);
            }
            else if (i > 5){
                windows[0][i] = new Rectangle(210, 352.5 + ((i-6)*25), 15, 20);   
            }
            gp.getChildren().add(windows[0][i]);
        }
        for(int i = 0; i < 10; i++){
            if(i == 0){
                windows[1][i] = new Rectangle(328, 332.5, 15, 15);
            
            }
            else if (i < 5){
                windows[1][i] = new Rectangle(328, 352.5 + ((i-1)*25), 15, 20);   
            }
            else if(i == 5){
                windows[1][i] = new Rectangle(358, 332.5, 15, 15);
            }
            else if (i > 5){
                windows[1][i] = new Rectangle(358, 352.5 + ((i-6)*25), 15, 20);   
            }
            gp.getChildren().add(windows[1][i]);
        }
        for(int i = 0; i < 10; i++){
            if(i == 0){
                windows[2][i] = new Rectangle(475, 332.5, 15, 15);
            
            }
            else if (i < 5){
                windows[2][i] = new Rectangle(475, 352.5 + ((i-1)*25), 15, 20);   
            }
            else if(i == 5){
                windows[2][i] = new Rectangle(505, 332.5, 15, 15);
            }
            else if (i > 5){
                windows[2][i] = new Rectangle(505, 352.5 + ((i-6)*25), 15, 20);   
            }
            gp.getChildren().add(windows[2][i]);
        }
        Scene sn = new Scene(gp, 700, 600, Color.LIGHTBLUE);
        stage.setScene(sn);
        stage.setTitle("A House");
        stage.show();

        
    }
}
