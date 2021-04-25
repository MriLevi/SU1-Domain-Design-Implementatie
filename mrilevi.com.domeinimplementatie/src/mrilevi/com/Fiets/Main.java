package mrilevi.com.Fiets;

public class Main {
    public static void main(String[] args) {
        Fiets f1 = new Fiets("Snelle batavus", 1555.0);
        Fiets f2 = new Fiets("Langzame batavus", 699.0);
        System.out.println(f1);
        System.out.println(f2);
        Ebike e1 = new Ebike("Elektrische Snelle Batavus", 2399.0, "Dikke accu", "snelle motor v2");
        Ebike e2 = new Ebike("Elektrische langzame batavus", 1399.0, "Dunne accu", "Langzame motor v1");
        System.out.println(e1);
        System.out.println(e2);
        Klant k1 = new Klant("Erik de Wit", 700.0);
        Klant k2 = new Klant("Klaas de Jong", 2500.0);
        System.out.println(k1);
        System.out.println(k2);
        Verkoper vk1 = new Verkoper("Henkie Fietsman");
        Verkoper vk2 = new Verkoper("Mohammed Abdul");
        System.out.println(vk1);
        System.out.println(vk2);
        Service sv1 = new Service("Banden plakken", 25.0);
        Service sv2 = new Service("Algemene checkup", 99.0);
        Service sv3 = new Service("Ebike checkup", 149.0);
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        Aankoop ak1 = new Aankoop(k1, vk1, f1, null, null);


    }
}
