package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {

    public void serialize(Employee employee){

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.bin"))) {

            objectOutputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deserialize(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.bin"))) {

          Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void serializeList(List<Employee> employee){

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employeeList.bin"))) {

            objectOutputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void deserializeList(){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employeeList.bin"))) {

            ArrayList<Employee>  employee= (ArrayList<Employee>) objectInputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
