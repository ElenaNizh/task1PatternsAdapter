public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Вычисление с помощью класса Calculator:\nРезультат возведение в степень: "
                + calculator.newFormula().
                addOperand(3).
                addOperand(4).
                calculate(Calculator.Operation.POW)
                .result());

        System.out.println();
        //Ints intsCalc = new IntsCalculator(new Calculator());
        Ints intsCalc = new IntsCalculator();
        System.out.println("Вычисления с помощью класса-адаптера IntsCalculator: ");
        System.out.println("Результат суммы: " + intsCalc.sum(2, 2));
        System.out.println("Результат суммы: " + intsCalc.sum(10, 22));
        System.out.println("Результат умножения: " + intsCalc.mult(5, 6));
        System.out.println("Результат возведения в степень: " + intsCalc.pow(2, 10));
        System.out.println("Результат деления: " + intsCalc.div(8, 6));
        System.out.println("Результат вычитания: " + intsCalc.sub(12, 2));
    }
}
