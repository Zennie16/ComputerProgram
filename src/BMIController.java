
import java.util.Scanner;



class BMIController {
    private final BMIModel model;
    private final BMIView view;

    public BMIController(BMIModel model, BMIView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performNormalCalculator();
                    break;
                case 2:
                    performBMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }

    private void performNormalCalculator() {
        // Implement the normal calculator logic here
        // Similar to your previous code
    }

    private void performBMICalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        model.setWeight(weight);
        model.setHeight(height);

        double bmi = model.calculateBMI();

        view.displayBMIStatus(bmi);
    }
}

