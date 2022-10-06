public class Main {
    public static void main(String[] args) {
//        EmailLogger logger =new EmailLogger();
//        logger.Log("Log mesajı");
//
//        DatabaseLogger databaseLogger =new DatabaseLogger() ;
//        databaseLogger.Log("mesaj");
//
//
//        // BaseLogger türünde bir array yapıyoruz, extends ettiğimiz için yapabiliyoruz...
//        BaseLogger[] loggers =new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger2:loggers){
//            logger2.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}