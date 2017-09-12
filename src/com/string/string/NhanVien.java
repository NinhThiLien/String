package com.string.string;

public class NhanVien {
    int manv;
    String name;
    String diachi;
    NhanVien(int manv,String name,String diachi){
        this.manv = manv;
        this.name= name;
        this.diachi=diachi;
    }
    public String toString(){
        return manv + name +diachi;
    }
    public static void main(String args[]){
        NhanVien nv1= new NhanVien(111," Ninh ","Nam Dinh");
        NhanVien nv2 = new NhanVien(222," Lien ","Ha Nam");
        System.out.println(nv1);//compiler writes here nv1.toString()
        System.out.println(nv2);//compiler writes here nv2.toString()
    }
}
