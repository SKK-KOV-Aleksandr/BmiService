public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 186;
        double BodyMassIndex = service.calculate(weight, height);
        System.out.format("Индекс массы тела %.2f", BodyMassIndex);
    }
}