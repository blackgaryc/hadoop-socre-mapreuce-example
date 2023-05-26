package org.example;

public class SimpleConvertFactory {
    public static SimpleConvert getInstance(){
        return new ScoreConvert();
    }
}
