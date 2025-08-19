package com.balitechy.spacewar.main.view.sprite;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public final class SpritesImageLoader {

    private final String path;
    private BufferedImage sheet;

    public SpritesImageLoader(String path) {
        this.path = path;
    }

    /** Carga la hoja de sprites desde src/main/resources */
    public BufferedImage loadImage() throws IOException {
        if (sheet == null) {
            try (InputStream in = Thread.currentThread()
                                        .getContextClassLoader()
                                        .getResourceAsStream(path)) {
                if (in == null) {
                    throw new IllegalArgumentException("No se encontró recurso: " + path);
                }
                sheet = ImageIO.read(in);
            }
        }
        return sheet;
    }

    /** Devuelve una subimagen de la hoja (x, y, ancho, alto) */
    public BufferedImage getImage(int x, int y, int width, int height) {
        if (sheet == null) {
            throw new IllegalStateException("Primero debes llamar a loadImage()");
        }
        return sheet.getSubimage(x, y, width, height);
    }
    
    public static Image load(String path){
        return new ImageIcon(SpritesImageLoader.class.getResource(path)).getImage();
    }

}
