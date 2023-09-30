package example02;

public class ClassTest {
    public static void main(String[] args) {
        createTable();
    }
    public static void createTable(){
        Table table1=new Table(1.5F,0.5F,1F,"课桌");
        Table table2 = new Table(1.5F, 0.5F, 1F, "课桌");
        System.out.println(table1==table2);

        long creditCardNumber = 1234567890123456L;
        System.out.println(creditCardNumber);

    }
}
