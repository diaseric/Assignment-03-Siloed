public class Main {

    public static void main(String[] args) {



     // heights
     double h1 = 72;
     double h2 = 19;
     double h3 = 50;
     double h4 = 67;
     double h5 = 16;
     double h6 = 53;
     double h7 = 69;
     double h8 = 30;
     double h9 = 52;
     double h10 = 40;
     double h11 = 31;
     double h12 = 75;

     //diameters
     double d1 = 22;
     double d2 = 18;
     double d3 = 13;
     double d4 = 16;
     double d5 = 14;
     double d6 = 23;
     double d7 = 22;
     double d8 = 22;
     double d9 = 23;
     double d10 = 16;
     double d11 = 18;
     double d12 = 23;

     //radii
     double r1 = d1/2;
     double r2 = d2/2;
     double r3 = d3/2;
     double r4 = d4/2;
     double r5 = d5/2;
     double r6 = d6/2;
     double r7 = d7/2;
     double r8 = d8/2;
     double r9 = d9/2;
     double r10 = d10/2;
     double r11 = d11/2;
     double r12 = d12/2;

     //volumes
     double v1 = 3.14*h1*r1*r1;
     double v2 = 3.14*h2*r2*r2;
     double v3 = 3.14*h3*r3*r3;
     double v4 = 3.14*h4*r4*r4;
     double v5 = 3.14*h5*r5*r5;
     double v6 = 3.14*h6*r6*r6;
     double v7 = 3.14*h7*r7*r7;
     double v8 = 3.14*h8*r8*r8;
     double v9 = 3.14*h9*r9*r9;
     double v10 = 3.14*h10*r10*r10;
     double v11 = 3.14*h11*r11*r11;
     double v12 = 3.14*h12*r12*r12;

     //sumOfVolumes and hence amount of water available during drought
     double sumOfVolumes = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 + v10 + v11 + v12;

     int population = 37640;

     double AmtWaterToBeUsedPerDayPerPerson = (sumOfVolumes/28)/population;

     double normalAmtPerPersonDaily = .246;

     double amtToBeSavedPerPerson = normalAmtPerPersonDaily - AmtWaterToBeUsedPerDayPerPerson;

     double gallonsSaved = amtToBeSavedPerPerson*65/.246;

     System.out.println("During this 28 day period of drought, each person MUST save " + gallonsSaved + " gallons of water each day.");








    }
}
