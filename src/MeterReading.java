public class MeterReading {
//    args[0]=First Reading / args[1]=Second Reading / args[2]=UnitRate --- gas
//    args[3]=First Reading / args[4]=Second Reading / args[5]=UnitRate --- electric
    public static void main (String[] args){
        double FirstReading = Double.parseDouble (args[0]);
        double SecondReading = Double.parseDouble (args[1]);
        double KWH1 = (SecondReading - FirstReading);
        double UnitRate1 = Double.parseDouble(args[2]);

        double FirstReading2 = Double.parseDouble(args[3]);
        double SecondReading2 = Double.parseDouble(args[4]);
        double KWH2 = (SecondReading2 - FirstReading2);
        double UnitRate2 = Double.parseDouble(args[5]);

        System.out.println("You have used " + KWH1 + " Killer Watt Hours ( kWh ) of electricity since your last meter reading.");
        System.out.println("The cost of this is £" + KWH1 * UnitRate1 / 100);

        System.out.println("You have used " + KWH2 + " Killer Watt Hours ( kWh ) of Gas since your last meter reading.");
        System.out.println("The cost of this is £" + KWH2 * UnitRate2 / 100);
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
//        System.out.println(args[4]);
//        System.out.println(args[5]);
    }


}


// function meterReading(firstMeterReading, secondMeterReading, unitRate )
// let KWH = secondMeterReading - firstMeterReading
// let result = KWH x unitRate
// console.log (result)