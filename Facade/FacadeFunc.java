package Facade;

import java.sql.Driver;

 class FacadeDemo {
    public static void generateReports(String application,String file) {
        Driver driver = null;
        switch(application) {
            case "AnyConverter":
                driver = AnyConverter.generateAnyConverterDrivers();
                switch(file) {
                    case "jpg":
                        AnyConverter.generateDoc(file, driver);
                        break;
                    case "doc":
                        AnyConverter.generateJpg(file, driver);
                        break;
                }
                break;
            case "iLovePdf":
                driver = ILovePdf.generateILovePdfDrivers();
                switch(file) {
                    case "jpg":
                        ILovePdf.generateDoc(file, driver);
                        break;
                    case "doc":
                        ILovePdf.generateJpg(file, driver);
                        break;
                }
        }
    }
}
