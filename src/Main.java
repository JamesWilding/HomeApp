import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.util.*;
import java.util.Scanner;
//
//        washing-machines
//                tumble-dryers
//                fridge-freezers
//                cookers
//                tv
//                xbox-series-x
//                playstation-5
//                laptop

public class Main {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        String test;
//
//        test = myObj.nextLine();
//        System.out.println(test);
////        System.out.println(args[0]);
//
//        if (test.equals("test")){
//            System.out.println("Scanner true");
//        }else{
//            System.out.println("Scanner false");
//        }
//        if (args[0].equals("test")){
//            System.out.println("Args true");
//        }else{
//            System.out.println("Args false");
//        }


//        Appliances listOfStuff1 = new Appliances("washing-machines");
//        Appliances listOfStuff2 = new Appliances("tumble-dryers");
//        Appliances listOfStuff3 = new Appliances("fridge-freezers");
//        Appliances listOfStuff4 = new Appliances("cookers");
//        Appliances listOfStuff5 = new Appliances("tv");
//        Appliances listOfStuff6 = new Appliances("xbox-Series-x");
//        Appliances listOfStuff7 = new Appliances("playstation-5");
//        Appliances listOfStuff8 = new Appliances("laptop");
//
//        Appliances[] itemHolder = {listOfStuff1, listOfStuff2, listOfStuff3, listOfStuff4, listOfStuff5, listOfStuff6,listOfStuff7,listOfStuff8};
//
//        Appliances infoOfStuff1 = new Appliances("test 1");
//        Appliances infoOfStuff2 = new Appliances("test 2");
//        Appliances infoOfStuff3 = new Appliances("test 3");
//        Appliances infoOfStuff4 = new Appliances("test 4");
//        Appliances infoOfStuff5 = new Appliances("test 5");
//        Appliances infoOfStuff6 = new Appliances("test 6");
//        Appliances infoOfStuff7 = new Appliances("test 7");
//        Appliances infoOfStuff8 = new Appliances("test 8");
//
//        Appliances [] infoHolder = {infoOfStuff1, infoOfStuff2, infoOfStuff3, infoOfStuff4, infoOfStuff5, infoOfStuff6, infoOfStuff7, infoOfStuff8};
//
//        System.out.println(itemHolder[0]);
//        System.out.println(infoHolder[0]);

// need a for loop
//        for (int i=0; i<itemHolder.length;i++) {
//            if (itemHolder[i].name.equals(args[0])) {
//                for(int j=0; j<infoHolder.length;j++) {
//                    if (infoHolder[j].equals(itemHolder[i])){
//                        System.out.println(itemHolder[i].name);
//                        System.out.println(infoHolder[j].name);
//                    }
//                }
//;
//            }
//        }


//        String [] Appliances = {
//                "washing-machines",
//                "tumble-dryers",
//                "fridge-freezers",
//                "cookers",
//                "tv",
//                "xbox-series-x",
//                "playstation-5",
//                "laptop",
//        };
//
//        List<String> list = Arrays.asList(Appliances);
//
//        String [] AppDescription = {
//                "washing stuff",
//                "tumble stuff",
//                "fridge stuff",
//                "cookers stuff",
//                "tv stuff",
//                "xbox stuff",
//                "playstation stuff",
//                "laptop stuff",
//
//        };
//
////        this will display the list of items in the array - args[0] = list
//        if (args[0].equals("list")) {
//            for (String s : list) {
//                System.out.println(s + " ");
//            }
//        }
////        args[0] = item / args[1] = item within list
//        if (args[0].equals("item")){
//            for(int i = 0; i < Appliances.length; i++) {
//                if (Appliances[i].equals(args[1])) {
//                    System.out.println(Appliances[i]);
//                    int index = Appliances.indexOf("a");
//                }
//            }
//        }


        ArrayList<String> arrlist = new ArrayList<String>(10);

        arrlist.add("washing_machines");
        arrlist.add("tumble_dryers");
        arrlist.add("fridge_freezers");
        arrlist.add("gas_cooker");
        arrlist.add("electric_cooker");
        arrlist.add("tv");
        arrlist.add("xbox_series_x");
        arrlist.add("playstation_5");
        arrlist.add("laptop");

        ArrayList<String> deslist = new ArrayList<String>(10);

        deslist.add("The_appliance_average_cost_of_doing_270_washes_is_around_£91.80");
        deslist.add("The_appliance_average_cost_of_drying_270_times_is_around_£648.00");
        deslist.add("The_the_appliance_average_cost_is_around_£79.00_per_year");
        deslist.add("The_appliance_average_cost_of_cooking_223_times_is_around_£24.40");
        deslist.add("The_appliance_average_cost_of_cooking_223_times_is_around_£65.87");
        deslist.add("The_appliance_average_yearly_cost_is_around_£30.44");
        deslist.add("The_appliance_average_yearly_cost_is_around_£25.00");
        deslist.add("The_appliance_average_yearly_cost_is_around_£20.00");
        deslist.add("The_appliance_average_yearly_cost_is_around_£182.50");


        if (args[0].equals("list")) {
            for (String value : arrlist) {
                System.out.println(value);
            }
        }

        if (args[0].equals("item")) {
            String appInput = args[1];
            int arrListIndex = arrlist.indexOf(appInput);
            System.out.println(args[1]);
            System.out.println(deslist.get(arrListIndex));


        }

// need to create public classes from the if statements

    }


}


