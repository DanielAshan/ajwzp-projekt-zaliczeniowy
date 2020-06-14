package com.notepad;

import java.io.*;
import java.util.Properties;

public class PropertiesHandler {

    String propertiesFileName = "config.properties";
    Properties prop = new Properties();
    int windowSizeWidth;
    int windowSizeHeight;
    int windowPositionX;
    int windowPositionY;

    public PropertiesHandler()
    {
        try (FileInputStream input = new FileInputStream(this.propertiesFileName))
        {
            this.prop.load(input);
            this.windowSizeWidth = Integer.parseInt(prop.getProperty("window.size.width"));
            this.windowSizeHeight = Integer.parseInt(prop.getProperty("window.size.height"));
            this.windowPositionX = Integer.parseInt(prop.getProperty("window.position.x"));
            this.windowPositionY = Integer.parseInt(prop.getProperty("window.position.y"));
            input.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public int getWindowWidth() {
        return this.windowSizeWidth;
    }

    public int getWindowHeight() {
        return this.windowSizeHeight;
    }

    public int getWindowPositionX() {
        return this.windowPositionX;
    }

    public int getWindowPositionY() {
        return this.windowPositionY;
    }

    public void setWindowWidth(int width) {
        this.windowSizeWidth = width;
    }
    public void setWindowHeight(int height) {
        this.windowSizeHeight = height;
    }

    public void setWindowPositionX(int x) {
        this.windowPositionX = x;
    }

    public void setWindowPositionY(int y) {
        this.windowPositionY = y;
    }

    public void saveProperties() {
        try (FileOutputStream output = new FileOutputStream(this.propertiesFileName))
        {
            this.prop.setProperty("window.size.width", "" + this.windowSizeWidth);
            this.prop.setProperty("window.size.height", "" + this.windowSizeHeight);
            this.prop.setProperty("window.position.x", "" + this.windowPositionX);
            this.prop.setProperty("window.position.y", "" + this.windowPositionY);
            this.prop.store(output, null);
            output.close();
            System.out.println(this.prop);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
