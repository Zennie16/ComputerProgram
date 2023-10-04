/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Main {
    public static void main(String[] args) {
        BMIModel bmiModel = new BMIModel();
        BMIView bmiView = new BMIView();

        BMIController controller = new BMIController(bmiModel, bmiView);

        controller.run();
    }
}