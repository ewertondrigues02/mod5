import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> toyota = new ArrayList<>();

        Car yaris = new Yaris(112.0, "com versões Automáticas ou manual", "rodas 17 de liga leve em todas as verões", "Freios ABS em todas as versões", "Iluminação em Led a partir do ano 2013 de fabricação");
        Car corola = new Corolla(168.0, "com versões Automáticas ou manual", "rodas 18 de liga leve em todas as verões", "Freios ABS em todas as versões", "Iluminação em Led a partir do ano 2011 de fabricação");
        Car camry = new Camry(186.0, "com versões Automáticas ou manual", "rodas 18 de liga leve em todas as verões", "Freios ABS em todas as versões", "Iluminação em Led a partir do ano 2011 de fabricação");
        Car rav4 = new Rav4(230.0, "com versões Automáticas ou manual", "rodas 20 de liga leve em todas as verões", "Freios ABS em todas as versões", "Iluminação em Led a partir do ano 2010 de fabricação");
        Car hilux = new Hilux(253.0, "com versões Automáticas ou manual", "rodas 21 de liga leve em todas as verões", "Freios ABS em todas as versões", "Iluminação em Led a partir do ano 2010 de fabricação");

        Collections.addAll(toyota, yaris, corola, camry, rav4, hilux);

        System.out.println(yaris);
        System.out.println(corola);
        System.out.println(camry);
        System.out.println(rav4);
        System.out.println(hilux);


    }
}