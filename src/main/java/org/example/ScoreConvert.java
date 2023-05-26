package org.example;

public class ScoreConvert implements SimpleConvert<Double,String>{
    public String convert(Double value) {
        if (value<65){
            return "0";
        }
        int score = (int)(value-60)/5 * 5;
        return String.valueOf(score/10.0);
    }
}
