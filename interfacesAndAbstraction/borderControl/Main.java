package interfacesAndAbstraction.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Identifiable> identifiableList = new ArrayList<>();
        while (!"End".equals(input)) {
           String[] tokens = input.split("\\s+");
           if(tokens.length==3){
               identifiableList.add(new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2] ));
           }else{
               identifiableList.add(new Robot(tokens[1],tokens[0]));
           }


            input = scanner.nextLine();
        }
        String postfixId = scanner.nextLine();
        for (Identifiable identifiable : identifiableList) {
            if(identifiable.getId().endsWith(postfixId)){
                System.out.println(identifiable.getId());
            }
        }
    }
}
