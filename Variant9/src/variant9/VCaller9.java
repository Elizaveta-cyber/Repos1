/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variant9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author oam
 */
public class VCaller9
{

    private TreeSet<String> strings;

    public VCaller9()
    { 
    }

    /*
     * Метод должен извлечь из коллекции strings все строки, содержащие заданную подстроку s,
     * и вернуть в виде списка строк.
     */
    public ArrayList<String> getSubs(TreeSet<String> strings,String s)
    {   //strings = new TreeSet<>();
        
        ArrayList<String> res = new ArrayList<>();
        
         
        for (String Str:strings)
        {  
            if (Str.contains(s))
            {
                res.add(Str);
            }
        }
        return res;
    }
    

    /*
     * Метод добавляет в strings строки из list и возвращает true,
     * если хотя бы одна строка была добавлена
     */
    public boolean addMore(ArrayList<String> list)
    {
        boolean flag = false;
        strings = new TreeSet<>();
        for (int i = 0; i < list.size(); i++)// идем до конца массива
        {
            String s = list.get(i);// инициализация строк значениями листа
            if (strings.isEmpty()) // если strings пустой ,то
            {
                strings.add(s); // добавляем в него строку
            }
            else System.out.checkError();
        }
        if (strings.isEmpty() == false)
        {
            flag = true;
        }
        return flag;
    }
}
