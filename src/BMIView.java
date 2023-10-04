/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class BMIView {
    public void displayBMIStatus(double bmi) {
        String status;
        if (bmi < 19) {
            status = "Under-standard";
        } else if (bmi < 25) {
            status = "Standard";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);
    }

    public void displayMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Normal calculator");
        System.out.println("2. BMI calculator");
        System.out.println("3. Exit");
    }
}
