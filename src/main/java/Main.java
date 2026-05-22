public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //Применр из условия: Рост 1.87 м., Вес 98 кг.
        double height = 1.87;
        int weight = 98;

        int bmi = service.calculate(height,weight);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
