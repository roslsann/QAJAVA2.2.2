public class BmiService {
    public double calculate(double weight, double height) {

        double Bmi = weight / (height * height);

        return Bmi;
    }
}
