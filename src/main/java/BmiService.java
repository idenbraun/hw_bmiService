public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        //Формула BMI: вес / (рост * рост)
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        //Целое число
        int bmiIndex = (int) bmi;
        //Ответ
        return bmiIndex;
    }
}
