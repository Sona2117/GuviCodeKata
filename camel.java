/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class camel {
    public static void main(String[] args){
        System.out.println(func("vinay krishna"));
    }
    public static String func(String input) {
    StringBuilder str = new StringBuilder();
    boolean camelcase = true;

    for (char c : input.toCharArray()) {
        if (Character.isSpaceChar(c)) {
            camelcase = true;
        } else if (camelcase) {
            c = Character.toTitleCase(c);
            camelcase = false;
        }

        str.append(c);
    }

    return str.toString();
}
}

