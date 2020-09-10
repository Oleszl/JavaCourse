package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Commodity {
    private String name;
    private double height;
    private double width;
    private double weight;



    ArrayList<Commodity> arrayList = new ArrayList<>();

    public Commodity(String name, double height, double width, double weight) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Commodity() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n" +"Commodity{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight + +
                '}' ;
    }

    public void addItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a name: ");
        name=scanner.nextLine();
        System.out.println("Input a height: ");
        height=scanner.nextDouble();
        System.out.println("Input a width: ");
        width=scanner.nextDouble();
        System.out.println("Input a weight: ");
        weight=scanner.nextDouble();
        Commodity commodity = new Commodity(name,height,width,weight);
        arrayList.add(commodity);
    }

    public void removeItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Item index what you want to delete: ");
        int index =scanner.nextInt();
        arrayList.remove(index);
    }

    public void replaceItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Item index what you want to replace: ");
        int index =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input a new name: ");
        name=scanner.nextLine();
        System.out.println("Input a new height: ");
        height=scanner.nextDouble();
        System.out.println("Input a new width: ");
        width=scanner.nextDouble();
        System.out.println("Input a new weight: ");
        weight=scanner.nextDouble();
        Commodity commodity = new Commodity(name,height,width,weight);
        arrayList.set(index,commodity);

    }

    public void nameSort(){
        arrayList.sort(new NameComparator());
        System.out.println(arrayList);
    }
    public void heightSort(){
        arrayList.sort(new HeightComparator());
        System.out.println(arrayList);
    }
    public void widthSort(){
        arrayList.sort(new WidthComparator());
        System.out.println(arrayList);
    }
    public void weightSort(){
        arrayList.sort(new WeightComparator());
        System.out.println(arrayList);
    }

    public void printItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Item index what you want to print: ");
        int index =scanner.nextInt();
        System.out.println( arrayList.get(index) );

    }

public void showAllList(){
    System.out.println(arrayList);
}
    public void exit(){
        System.exit(1);
    }
}
