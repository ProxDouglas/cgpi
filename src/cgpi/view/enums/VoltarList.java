package cgpi.controller;

import cgpi.figuras.model.Desenho;
import cgpi.view.enums.DrawType;
import cgpi.vtec.events.AbstractDesenhoEvent;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;


public class VoltarList {

    private List<DrawType> drawtype;

    public VoltarList(){
        this.drawtype = new ArrayList<>();
    }



    public void novoDesenho(DrawType drawType) {

        switch (drawType){
            case PONTO:
                this.drawtype.add(drawType);
                break;
            case RETA:
                this.drawtype.add(drawType);
                break;
            case CIRCULO:
                this.drawtype.add(drawType);
                break;
            case RETANGULO:
                this.drawtype.add(drawType);
                break;
        }
    }

    void voltar(Desenho desenho){
        DrawType type;
        type = this.drawtype.get(this.drawtype.size()-1);
        this.drawtype.remove(this.drawtype.size()-1);
        switch (type){
            case PONTO:
                desenho.removePonto();
                break;
            case RETA:
                desenho.removeReta();
                break;
            case CIRCULO:
                desenho.removeCirculo();
                break;
            case RETANGULO:
                desenho.removeRatangulo();
                break;
        }
    }

    void limparVoltar(){
        this.drawtype.removeAll(drawtype);
    }
}
