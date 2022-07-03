import java.nio.file.FileSystemNotFoundException;

public class Exemple {
    double i;
@Test( param1 = 12, param2 = 12)
    public void test(int a, int b){
if(a>b) {
    i = a + b;
}else if(a<b){
    i = a - b;
}else{
    i=Math.sqrt(a) + Math.sqrt(b);
}

    }
    public void show() {
        System.out.println("this :" + i);
    }
}
