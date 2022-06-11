package Facade;

import java.sql.Driver;

 class AnyConverter {
    public static Driver generateAnyConverterDrivers() {
        return null;
    }

    public static void generateDoc(String file, Driver driver) {
        System.out.println("Generating Doc file through AnyConverter application");
    }

    public static void generateJpg(String file, Driver driver) {
        System.out.println("Generating JPG file through AnyConverter application");
    }
}
class ILovePdf {
    public static Driver generateILovePdfDrivers() {
        return null;
    }

    public static void generateDoc(String file, Driver driver) {
        System.out.println("Generating Doc file through ILovePdf application");
    }

    public static void generateJpg(String file, Driver driver) {
        System.out.println("Generating JPG file through ILovePdf application");
    }
}

//public class FacadeDemo {
//    public static void generateReports(String explorer,String file) {
//        Driver driver = null;
//        switch(explorer) {
//            case "AnyConverter":
//                driver = AnyConverter.generateAnyConverterDrivers();
//                switch(file) {
//                    case "jpg":
//                        AnyConverter.generateDoc(file, driver);
//                        break;
//                    case "doc":
//                        AnyConverter.generateJpg(file, driver);
//                        break;
//                }
//                break;
//            case "iLovePdf":
//                driver = ILovePdf.generateILovePdfDrivers();
//                switch(file) {
//                    case "jpg":
//                        ILovePdf.generateDoc(file, driver);
//                        break;
//                    case "doc":
//                        ILovePdf.generateJpg(file, driver);
//                        break;
//                }
//        }
//    }
//}


//class FacadePatternExample {
//
//    public static void main(String[] args) {
//        FacadeDemo.generateReports("AnyConverter", "jpg");
//        FacadeDemo.generateReports("AnyConverter", "doc");
//        FacadeDemo.generateReports("iLovePdf", "jpg");
//        FacadeDemo.generateReports("iLovePdf", "doc");
//    }
//
//}
