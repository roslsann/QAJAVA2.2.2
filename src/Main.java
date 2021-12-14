public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.2;
        double height = 1.82;
        double Bmi = service.calculate(weight, height);
        System.out.println(Bmi);
    }
}