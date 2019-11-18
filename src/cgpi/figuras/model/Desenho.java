package cgpi.figuras.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vitor.alves
 */
public class Desenho {

    private final List<Reta> retas;

    private final List<Circulo> circulos;

    private final List<Ponto> pontos;

    private final List<Retangulo> retangulos;

    private final List<Poligano> poliganos;


    public Desenho() {
        this.retas = new ArrayList<>();
        this.circulos = new ArrayList<>();
        pontos = new ArrayList<>();
        retangulos = new ArrayList<>();
        poliganos = new ArrayList<>();
    }

    public List<Reta> getRetas() {
        return retas;
    }

    public List<Circulo> getCirculos() {
        return circulos;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public List<Retangulo> getRetangulos() {
        return retangulos;
    }

    public void addReta(Reta reta) {
        this.retas.add(reta);
    }

    public void addCirculo(Circulo circulo) {
        this.circulos.add(circulo);
    }

    public void addPonto(Ponto ponto) {
        this.pontos.add(ponto);
    }

    public void addRetangulo(Retangulo retangulo) {
        this.retangulos.add(retangulo);
    }

    public void addPoligano(Poligano poligano) {
        this.poliganos.add(poligano);
    }

    public void addPontos(List<Ponto> pontos) {
        this.pontos.addAll(pontos);
    }

    public void addRetas(List<Reta> retas) {
        this.retas.addAll(retas);
    }

    public void addCirculos(List<Circulo> circulos) {
        this.circulos.addAll(circulos);
    }

    public void addRetangulos(List<Retangulo> retangulos) {
        this.retangulos.addAll(retangulos);
    }

    public void addPoliganos(List<Poligano> poliganos) {
        this.poliganos.addAll(poliganos);
    }



    public void removePonto(){this.pontos.remove(this.pontos.size()-1);};

    public void removeReta(){this.retas.remove(this.retas.size()-1);};

    public void removeRatangulo(){this.retangulos.remove(this.retangulos.size()-1);};

    public void removeCirculo(){this.circulos.remove(this.circulos.size()-1);};

    public void limpe() {
        retas.clear();
        circulos.clear();
        pontos.clear();
        retangulos.clear();
        poliganos.clear();
    }

    public List<Poligano> getPoliganos() {
        return this.poliganos;
    }
}
