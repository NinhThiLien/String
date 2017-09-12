package com.string.stringbuffer;

public class Test {
    public static String concatWithString(){
        String t ="java";
        for(int i=0;i<10000;i++){
            t = t+"Tpoint";
        }
        return t;
    }

    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append("Tpoint");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       /* StringBuffer s = new StringBuffer("Hello ");
        s.append("Viet Nam");
        System.out.println(s);

        //insert :chen chuoi moi vao vi tri duoc chi dinh
        s.insert(6,"Ha Noi ");
        System.out.println(s);

        //replace : thay the chuoi moi vao vi tri chi dinh
        s.replace(6,12,"Nam Dinh");
        System.out.println(s);

        //delete :xoa cac ki tu o vi tri duoc chi dinh
        s.delete(6,15);
        System.out.println(s);

        //reverse():dao nguoc cac ki tu trong chuoi
        s.reverse();
        System.out.println(s);

        //capacity()
        StringBuffer s2 = new StringBuffer();
        System.out.println(s2.capacity());//default 16
        s2.append("Hello");
        System.out.println(s2.capacity());//now 16
        s2.append("Ha Noi Viet Nam");
        System.out.println(s2.capacity());//now (16*2)+2 = 34 hay (oldcapacity *2)+2

        //ensureCapacity(): dam bao rang capacity it nhat bang 1 so da cho
        s2.ensureCapacity(10);//now no change
        System.out.println(s2.capacity());//now 34
        s2.ensureCapacity(50);
        System.out.println(s2.capacity());//now 34*2+2 = 70*/

        //Test String & StringBuffer & StringBuilder
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with StringBuffer:"+(System.currentTimeMillis()-startTime+"ms"));

        //String and StringBuffer hashcode Test
        System.out.println("Hashcode test of String: ");
        String str ="java";
        System.out.println(str.hashCode());
        str =str+"tpoint";
        System.out.println(str.hashCode());

        System.out.println("HashCode test of StringBuffer: ");
        StringBuffer sb =new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("tpoint");
        System.out.println(sb.hashCode());
    }
}
