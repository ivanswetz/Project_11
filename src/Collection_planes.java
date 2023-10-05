import java.io.PrintWriter;
import java.util.Scanner;

public class Collection_planes {

    static Scanner scan = new Scanner(System.in);
    private int count = 1;
    public plane[] plane_garage = new plane[count];
    //METHODS
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
//    public plane[] getArr(){
//        return plane_garage;
//    }
    public void add(plane newObj){
        plane_garage[getCount() - 1] = newObj;
        setCount(count++);
    }
    public void printOne(int i){
        System.out.println(plane_garage[i].model);
        System.out.println(plane_garage[i].year);
        System.out.println(plane_garage[i].price);
        System.out.println(plane_garage[i].getVIN());
    }
    public void print(){
        for (int i = 1; i< plane_garage.length + 1; i++){
            System.out.println("#" + i);
            printOne(i);
            System.out.println("----------------------");
        }
    }
    public void findModel(){
        String s;
        System.out.println("Enter model: ");
        s = scan.nextLine();
        System.out.println("Here's what we found: ");
        for (int i = 0; i < plane_garage.length; i++){
            if(plane_garage[i].model.contains(s)){
                printOne(i);
            }
        }
    }
    public void findYear(){
        int s;
        System.out.println("Enter year: ");
        s = scan.nextInt();
        System.out.println("Here's what we found: ");
        for (int i = 0; i < plane_garage.length; i++){
            if(s == plane_garage[i].year){
                printOne(i);
            }
        }
    }
    public void sort(){
        int temp;
        for (int i = 0; i < plane_garage.length; i++){
            for (int j = 0; j < plane_garage.length - 1; j++){
                if(plane_garage[i].year > plane_garage[i+1].year){
                    temp = plane_garage[i+1].year;
                    plane_garage[i+1].year = plane_garage[i].year;
                    plane_garage[i].year = temp;
                }
            }
        }
    }
    public plane[] removePlane(int del){
        int j = 0;
        plane[] temp = new plane[count--];
        for(int i = 0; i < plane_garage.length; i++) {
            if (i != del) {
                temp[j] = plane_garage[i];
                j++;
            } else {
                continue;
            }
        }
        return temp;
    }
    public void saveToFile(plane[] arr){

    }
}
