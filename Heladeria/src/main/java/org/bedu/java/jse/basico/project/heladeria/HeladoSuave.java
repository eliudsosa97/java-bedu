package org.bedu.java.jse.basico.project.heladeria;

public class HeladoSuave implements Helado{
    @Override
    public String getDescription() {
        return "Helado Suave";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
