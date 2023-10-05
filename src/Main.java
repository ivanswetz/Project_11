
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Collection_planes garage = new Collection_planes();
            while (true){
                System.out.println("What do you want to do?");
                System.out.println("1 - Add a plane \n 2 - Print one plane details \n 3 - Print full info \n 4 - Find plane by Model \n " +
                        "5 - Find plane by a year \n 6 - Remove plane from the list \n 7 - Sort by Year");
                int choice = scan.nextInt();
                switch (choice){
                    case 1:
                        plane NewObj = new plane();
                        scan.nextLine();
                        System.out.println("Enter model: ");
                        NewObj.model = scan.nextLine();
                        System.out.println("Enter year: ");
                        NewObj.year = scan.nextInt();
                        System.out.println("Enter price: ");
                        NewObj.price = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter VIN: ");
                        NewObj.setVIN(scan.nextLine());
                        garage.add(NewObj);
                        break;
                    case 2:
                        System.out.println("Enter number of plane: ");
                        int num = scan.nextInt();
                        while (true){
                            if(num > garage.getCount() - 1 || num < garage.getCount()){
                                System.out.println("Out of bounds, try again");
                                num = scan.nextInt();
                            }
                            else {
                                break;
                            }
                        }
                        garage.printOne(num);
                        break;
                    case 3:
                        garage.print();
                        break;
                    case 4:
                        garage.findModel();
                        break;
                    case 5:
                        garage.findYear();
                        break;
                    case 6:
                        System.out.println("Enter number of plane that you want to delete: ");
                        int i = scan.nextInt();
                        while (true){
                            if(i > garage.getCount() || i < garage.getCount()){
                                System.out.println("Out of bounds, try again");
                                i = scan.nextInt();
                            }
                            else {
                                break;
                            }
                        }
                        garage.plane_garage = garage.removePlane(i);
                        break;
                    case 7:
                        garage.sort();
                        break;
                    default:
                        System.out.println("Wrong num");
                        break;
                }
            }
        }
    }