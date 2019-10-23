package cgpi.Drawing;

import cgpi.primitivos.AlgoritmosCirculos;
import cgpi.primitivos.AlgoritmosRetas;
import cgpi.primitivos.CirculoGr;
import cgpi.primitivos.RetaGr;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CirculosRetasDrawing {

    /**
     *  Desenha circulos e retas no {@param graphicsContext}
     *
     * @param graphicsContext
     */
    //@Override
    public void draw(GraphicsContext graphicsContext) {
        int x = 250;
        int y = 250;

        DesenharCirculo(x, y, graphicsContext);
        DesenharCirculo(x - 50, y, graphicsContext);
        DesenharCirculo(x + 50, y, graphicsContext);
        DesenharCirculo(x - 25, y + 40, graphicsContext);
        DesenharCirculo(x + 25, y + 40, graphicsContext);
        DesenharCirculo(x - 25, y - 50, graphicsContext);
        DesenharCirculo(x + 25, y - 50, graphicsContext);


        DesenharLinha(graphicsContext, x - 75, y + 45, x + 75, y + 45);
        DesenharLinha(graphicsContext, x - 75, y - 45, x + 75, y - 45);
        DesenharLinha(graphicsContext, x - 75, y - 45, x - 75, y + 45);
        DesenharLinha(graphicsContext, x + 75, y - 45, x + 75, y + 45);

        DesenharLinha(graphicsContext, x, y - 95, x, y + 85);
        DesenharLinha(graphicsContext, x - 75, y - 45, x + 75, y + 45);
        DesenharLinha(graphicsContext, x + 75, y - 45, x - 75, y + 45);
        DesenharLinha(graphicsContext, x - 50, y - 5, x + 50, y - 5);

        DesenharLinha(graphicsContext, x - 75, y - 45, x, y + 85);
        DesenharLinha(graphicsContext, x, y + 85, x + 75, y - 45);
        DesenharLinha(graphicsContext, x - 75, y + 45, x, y - 95);
        DesenharLinha(graphicsContext, x + 75, y + 45, x, y - 95);

        DesenharLinha(graphicsContext, x - 75, y - 45, x, y - 95);
        DesenharLinha(graphicsContext, x + 75, y - 45, x, y - 95);
        DesenharLinha(graphicsContext, x - 75, y + 45, x, y + 85);
        DesenharLinha(graphicsContext, x + 75, y + 45, x, y + 85);
    }


    public void DesenharCirculo(int x, int y, GraphicsContext graphicsContext) {
        CirculoGr.desenhar(graphicsContext, x, y, 50, Color.GREEN, "", 2, AlgoritmosCirculos.STROKELINE);
    }

    public void DesenharLinha(GraphicsContext graphicsContext, int x0, int y0, int x1, int y1) {
        RetaGr.desenhar(graphicsContext, x0, y0, x1, y1, "", Color.RED, 1, AlgoritmosRetas.MIDPOINT);
    }
}
