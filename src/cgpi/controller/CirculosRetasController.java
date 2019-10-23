package cgpi.controller;


import cgpi.Drawing.CirculosRetasDrawing;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * @author Douglas.Santos
 */
public class CirculosRetasController extends AbstractController {


    @FXML
    private Canvas canvas;

    @FXML
    private Button clearButton;

    @FXML
    private Button drawButton;


    //private Drawing drawing;

    public Canvas getCanvas() {
        return this.canvas;
    }

    public GraphicsContext getGraphicsContext() {
        return this.canvas.getGraphicsContext2D();
    }

    //public Drawing getDrawing() {return this.drawing;}

    //public void setDrawing(Drawing drawing) {this.drawing = drawing;}


    /**
     * Limpa o canvas
     */
    @FXML
    public void clearCanvas() {
        this.canvas.getGraphicsContext2D().clearRect(0, 0,
                this.canvas.getWidth(), this.canvas.getHeight());
    }

    /**
     * Desenha a figura
     */
    //@FXML
    //public abstract void desenheFigura();

    //@FXML
    //public abstract void setDrawingContext(Event event);

    protected void setDrawVisibility(boolean isVisible) {
        this.drawButton.setVisible(isVisible);
    }

    @FXML
    public void draw(){
        CirculosRetasDrawing cr = new CirculosRetasDrawing();
        cr.draw(getGraphicsContext());
    }

}