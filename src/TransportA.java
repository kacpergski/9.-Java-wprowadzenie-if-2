import java.sql.SQLOutput;

public class TransportA {


    public static void main(String[] args) {
        double distance = 1000001;
        int pieszo = 300, rower = 2700, samochód = 1000000, samolot = 1000000;

            if (distance <= pieszo){
            System.out.println("Najlepiej pójdź pieszo");
            }
            else if (distance <= rower){
            System.out.println("Najlepiej pojedź rowerem");
            }
            else if (distance <= samochód){
            System.out.println("Najlepiej pojedź samochodem");
            }
            else if (distance > samolot){
            System.out.println("Najlepiej poleć samolotem");
             }
        }
    }