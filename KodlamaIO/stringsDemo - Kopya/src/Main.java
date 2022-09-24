public class Main {
    public static void main(String[] args) {


        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);


/* System.out.println("Eleman sayısı : "+mesaj.lenght());
 System.out.println("5. eleman : "+mesaj.charAt(4));
 System.out.println(mesaj.concat(" Yaşasın!"));
 System.out.println(mesaj.startWith("B"));
//B ile başlıyorsa true döndürür
 System.out.println(mesaj.endWith("."));
//. ile bitiyorsa true döndürür

char[] karakterler = new char[5];
mesaj.getChars(0,5,karakterler,0);
System.out.println(karkaterler);
System.out.println(mesaj.indexOf('a'));
System.out.println(mesaj.lastIndexOf('e')); */


        String yeniMesaj= mesaj.replace('','-')
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
//mesajın 2. indexinden başla
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split("")){
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase());
//harfleri küçültür

        System.out.println(mesaj.toUpperCase());
//harfleri büyütür

        System.out.println(mesaj.trem);
//başındaki ve sonundaki boşlukları atar
    }
}