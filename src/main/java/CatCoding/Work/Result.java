package CatCoding.Work;

public class Result {
    public static void main(String[] args) {
        Employee[] empl = new Employee[9];
        empl[0] = new Manager();
        empl[1] = new Manager();
        empl[2] = new Manager();
        empl[3] = new Agent(10000);
        empl[4] = new Agent(4000);
        empl[5] = new Agent(9000);
        empl[6]= new Worker(140);
        empl[7]= new Worker(130);
        empl[8]= new Worker(120);
        int numb = 1;
        for (int i = 0; i < 9; i++,numb++) {
            System.out.println("Зарплата "+numb+" рабочего "+empl[i].salary()+" USD");
        }


    }
}
