public class Questão2 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        //1º parte
        while(number <= 100){
            sum = sum + number;
            number = number + 1;
        }

        //2ºparte
        int sum = 0;
        int number = 1;

        while(true){
            sum += number;
            number = number + 1;

            if(sum > 1000000){
                break;
            }

        }
    }
}
