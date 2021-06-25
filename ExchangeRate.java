import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ExchangeRate {
    public static Double exchangeRate(String from, String to){
        String[] fromArr = from.split(" ");
        String[] toArr = to.split(" ");
        int fromIndex = 0;
        int toIndex = 0;
        boolean toFinished = false;
        boolean fromFinished = false;
        Double fromCourse = null;
        Double toCourse = null;
        if (from.equals("ლარი")){
            fromCourse = 1.0;
            fromFinished = true;
        }
        if (to.equals("ლარი")){
            toCourse = 1.0;
            toFinished = true;
        }
        try {
            URL url = new URL("http://www.nbg.ge/rss.php");
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                if (toFinished && fromFinished) break;
                String curr = sc.next().replaceAll("<[^>]*>", "");
                if (fromIndex == fromArr.length){
                    fromCourse = Double.parseDouble(curr);
                    fromFinished = true;
                }
                if (toIndex == toArr.length){
                    toCourse = Double.parseDouble(curr);
                    toFinished = true;
                }
                if (!fromFinished && fromArr[fromIndex].equals(curr)){
                    fromIndex++;
                }else{
                    fromIndex = 0;
                }
                if (!toFinished && toArr[toIndex].equals(curr)){
                    toIndex++;
                }else{
                    toIndex = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (toArr != null && fromArr != null){
            return fromCourse/toCourse;
        }
        return null;
    }

    public static void main(String[] args) {
        Double x = exchangeRate("აშშ დოლარი", "ლარი");
        System.out.println(x);
    }
}
