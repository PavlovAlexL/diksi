package site.palex;



/*
“K2”

“K2\SK1”

“K2\SK1\SSK2”

“K2\SK1\SSK1”

“K1”

“K1\SK2”

“K1\SK1”

“K1\SK1\SSK2”

“K1\SK1\SSK1”
 */

import java.util.*;

public class Diksi {

    public static void main(String[] args) {
        String[] array = {"K1\\SK1", "K1\\SK2", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        phase1(array);




        //for(String s : array) System.out.println(s);
        }


    public static void phase1(String[] array){
        List<String> list = Arrays.asList(array);
        String[] temp;
        for(int i = 0; i < list.size(); i++){
            temp = list.get(i).split("\\\\");



        }


    }


    public static void phase2(String[] array){  //Сортируем
        Map<String, Double> map = new HashMap<>();
        for(String s : array){
                }

    }



    public static Double getCost(String string){    //Присваеваем цену пути для сортировки
        String[] temp = string.split("\\D");
        Double result = 0.0;
        for (int i = 0, count = 0; i < temp.length; i++){
            if (temp[i].equals("")) continue;
            if (count == 0){
                result = Double.parseDouble(temp[i]);
                count++;
                continue;
            }else{
                result = result - (Double.parseDouble(temp[i]) / 10);
            }
        }
        return result;
    }










}
