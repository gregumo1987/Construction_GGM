public class Application {

public static void main(String[] args) {
Building b1 = new Building("Gaines House", "123 Main Street | Louisiville Kentucky 401010", 2540, "Residential",
"R1");
Business bu1 = new Business("Gaines Business", "246 BU Street | Nevada Texas 2010202", 1890, "Business", "B1",
12);
Apartment a1 = new Apartment("Gaines Apartments", "121 Louis St | Louisiville Kentucky 401010", 12000,
"Apartments", "A1", 40, 80, true, 36, 680, true);
SingleFamilyHome sf1 = new SingleFamilyHome("Gaines Single Houses",
"121 Louis St | Louisiville Kentucky 401010", 1800, "SingleFamilyHouse", "SF1", 4, 3, true, true);


System.out.println("********Building Details********\n" + b1.displayData()+"\n");

System.out.println("********Business Building Details********\n" + bu1.toString()+"\n");

System.out.println("********Apartment Details********\n" + a1.displayData()+"\n");

System.out.println("********SingleFamilyHome Details********\n" + sf1.displayData()+"\n");
}

}
