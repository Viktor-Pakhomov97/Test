package CatCoding.PhoneHW;

public class TestPhone {
    public static void main(String[] args) {
        /**
        Phone p1 = new Phone();
        p1.setModel("Motorola");
        p1.setNumber("38 067 567 34 56");
        p1.setWeight(167.3);
        System.out.println(p1.getModel()+" "+"numb: "+p1.getNumber()+" "+"Weight: "+p1.getWeight());
        p1.receiveCall("Aльфредо");
        p1.getNumber("38 097 813 56 78");
        Phone p2 = new Phone();
        p2.setModel("Samsung");
        p2.setNumber("380 98 535 34 87");
        p2.setWeight(100.3);
        System.out.println(p2.getModel()+" "+"numb: "+p2.getNumber()+" "+"Weight: "+p2.getWeight());
        p2.receiveCall("Стефан");
        p2.getNumber("38 096 845 56 78");
        Phone p3 = new Phone();
        p3.setModel("Iphone");
        p3.setNumber("38 065 673 85 61");
        p3.setWeight(200.3);
        System.out.println(p3.getModel()+" "+"numb: "+p3.getNumber()+" "+"Weight: "+p3.getWeight());
        p3.receiveCall("Лариса");
        p3.getNumber("38 093 813 91 78");
         */
        Phone p1 = new Phone("38 093 813 91 78","Iphone",200.3);
        Phone p11 = new Phone("38 093 813 91 78","Iphone");
        System.out.println(p1+"\n"+p11);
        p1.receiveCall("Aльфредо");
        p1.getNumber("38 097 813 56 78");
        Phone p2 = new Phone("38 098 535 34 87","Samsung",100.3);
        Phone p22 = new Phone("38 098 535 34 87","Samsung");
        System.out.println(p2+"\n"+p22);
        p2.receiveCall("Стефан");
        p2.getNumber("38 096 845 56 78");
        Phone p3 = new Phone("38 067 567 34 56","Motorola",167.3);
        Phone p33 = new Phone("38 067 567 34 56","Motorola");
        System.out.println(p3+"\n"+p33);
        p3.receiveCall("Лариса");
        p3.getNumber("38 093 813 91 78");
        p3.sendMessage("098 765 23 12", new String[]{"74848294949"});
    }
}
