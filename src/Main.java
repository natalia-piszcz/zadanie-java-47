import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Product[] products = new Product[2];
        int index = 0;

        FileReader fileReader = new FileReader("C:\\Users\\natal\\IdeaProjects\\DOM zadanie-java-47\\src\\produkty.csv");
        BufferedReader bfr = new BufferedReader(fileReader);
        String line= null;
        while((line = bfr.readLine()) != null) {
            String[] product = line.split(";");
            products [index++] = new Product(product[0], product[1], Double.parseDouble(product[2]));
        }
        bfr.close();


            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }

        }
    }
