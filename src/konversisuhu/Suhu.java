package konversisuhu;

public class Suhu {
    double hasil;
    
    public double toCelcius(double value, String from ){
        switch(from){
            case "Fahrenheit":
                hasil = (value-32) / 1.8d;
                break;
            case "Reamur":
                hasil = value / 0.8d;
                break;
            case "Kelvin":
                hasil = value - 273.15d;
                break;
            case "Newton":
                hasil = (100d*value) / 33d;
                break;
            case "Romer":
                hasil = (40d*(value - 7.5d)) / 21d;
                break;
            case "Rankine":
                hasil = (value-491.67d) / 1.8d;
                break;
            case "Delisle":
                hasil = 100d - (value*1.5d);
                break;
        }
        return hasil;
    }
    
    double toKelvin(double C){
        return (C + 273.15d);
    }

    double toFahrenheit(double C){
        return (C * 1.8d + 32d);
    }
    
    double toRankine(double C){
        return (C * 1.8d + 491.67d);
    }
    
    double toDelisle(double C){
        return ((100d-C) * 1.5d);
    }
    
    double toNewton(double C){
        return (C*(33d/100d));
    }
    
    double toReamur(double C){
        return (C * 0.8d);
    }
    
    double toRomer(double C){
        return (C*21d/40d + 7.5d);
    }
    
}
