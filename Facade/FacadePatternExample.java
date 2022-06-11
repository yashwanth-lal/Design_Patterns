package Facade;

import Facade.FacadeDemo;

class FacadePatternExample {

    public static void main(String[] args) {
        System.out.println();
        FacadeDemo.generateReports("AnyConverter", "jpg");
        FacadeDemo.generateReports("AnyConverter", "doc");
        FacadeDemo.generateReports("iLovePdf", "jpg");
        FacadeDemo.generateReports("iLovePdf", "doc");
    }

}