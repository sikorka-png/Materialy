import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class Tmp2 {
    public static void main(String[] args) {
        File file = new File("wilk.txt");
        Ssak[] stada = null;
        try {
            if (!file.createNewFile()) {
                stada = zaladuj("wilk.txt");
            } else {
                Wilk wilk1 = new Wilk("zaki", (short) 2020, false, "tron", 3);
                Ssak[] szczenieta = {new Ssak("paweł", (short) 2021, true)};
                Wadera wadera1 = new Wadera("Kill", (short) 2018, false, szczenieta.length, szczenieta);
                Wilk wilk2 = new Wilk("roki", (short) 2021, false, "egzon", 4);
                Ssak[] szczenieta2 = {new Ssak("huskar", (short) 2021, true),
                        new Ssak("iglon", (short) 2020, true)};
                Wadera wadera2 = new Wadera("lina", (short) 2014, false, szczenieta2.length, szczenieta2);
                stada = new Ssak[]{wilk1, wadera1, wilk2, wadera2};
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                for (Ssak ssak : stada) {
                    ssak.zapisz(fileOutputStream);
                }
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Ssak ssak : stada) {
            System.out.println(ssak.przedstawSie());
        }
    }

    public static boolean czyLiczba(String a) {
        String regex = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regex, a);
    }

    public static Ssak[] zaladuj(String sciezka) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(sciezka));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
        String odczytanaLinia;
        Ssak[] stada = new Ssak[0];
        while ((odczytanaLinia = reader.readLine()) != null) {
            Ssak[] tmp = new Ssak[stada.length + 1];
            for (int i = 0; i < stada.length; i++) {
                tmp[i] = stada[i];
            }
            Ssak ssak;
            String[] dane = odczytanaLinia.substring(0, odczytanaLinia.length() - 1).split(",");
            if (czyLiczba(dane[3])) {
                int iloscDzieci = Integer.parseInt(dane[3]);
                String[] daneDzieci = odczytanaLinia.substring(odczytanaLinia.indexOf(",[") + 2, odczytanaLinia.length() - 2).split(";");
                Ssak[] dzieci = new Ssak[iloscDzieci];
                for (int i = 0, counter = 0; i < daneDzieci.length; i++) {
                    String[] daneDziecka = daneDzieci[i].split(",");
                    dzieci[counter++] = new Ssak(daneDziecka[0], Short.parseShort(daneDziecka[1]), Boolean.parseBoolean(daneDziecka[2]));
                }
                ssak = new Wadera(dane[0], Short.parseShort(dane[1]), Boolean.parseBoolean(dane[2]), iloscDzieci, dzieci);

            } else {
                ssak = new Wilk(dane[0], Short.parseShort(dane[1]), Boolean.parseBoolean(dane[2]), dane[3], Integer.parseInt(dane[4]));
            }
            tmp[tmp.length - 1] = ssak;
            stada = tmp;
        }
        fileInputStream.close();
        return stada;
    }
}

class Ssak {
    private String imie;
    private short rokUrodzenia;
    private boolean mlody;

    public Ssak(String imie, short rokUrodzenia, boolean mlody) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.mlody = mlody;
    }


    public String przedstawSie() {

        return imie + "," + rokUrodzenia + "," + mlody + ";";
    }

    public void zapisz(FileOutputStream fileOutputStream) {
        try {
            byte[] arr = (this.przedstawSie() + "\n").getBytes();
            fileOutputStream.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return imie + "," + rokUrodzenia + "," + mlody;
    }
}

class Wadera extends Ssak {
    private int iloscSzczeniat;
    private Ssak[] szczenieta;

    public Wadera(String imie, short rokUrodzenia, boolean mlody, int iloscSzczeniat, Ssak[] szczenieta) {
        super(imie, rokUrodzenia, mlody);
        this.iloscSzczeniat = iloscSzczeniat;
        this.szczenieta = szczenieta;
    }

    @Override
    public String przedstawSie() {
        String informacjeOSzczenietach = "[";
        for (Ssak ssak : szczenieta) {
            informacjeOSzczenietach += ssak.przedstawSie();
        }
        informacjeOSzczenietach += "]";
        return super.toString() + "," + iloscSzczeniat + "," + informacjeOSzczenietach + ";";
    }
}

class Wilk extends Ssak {
    private String nazwaStada;
    private int pozycja;

    public Wilk(String imie, short rokUrodzenia, boolean mlody, String nazwaStada, int pozycja) {
        super(imie, rokUrodzenia, mlody);
        this.nazwaStada = nazwaStada;
        this.pozycja = pozycja;
    }

    @Override
    public String przedstawSie() {

        return super.toString() + "," + nazwaStada + "," + pozycja + ";";
    }
}
