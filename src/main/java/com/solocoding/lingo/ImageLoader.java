/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solocoding.lingo;


import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageLoader {

    public static Icon loadImage(String imagePath) throws IOException {
        InputStream inputStream = ImageLoader.class.getClassLoader().getResourceAsStream(imagePath);
//ImageLoader.class.
        if (inputStream == null) {
            throw new IOException("Image not found: " + imagePath);
        }

        ///Image image = ImageIO.read(inputStream);
         ImageIcon icon = new ImageIcon(ImageIO.read(inputStream));

        inputStream.close();

        return icon;
    }
}
