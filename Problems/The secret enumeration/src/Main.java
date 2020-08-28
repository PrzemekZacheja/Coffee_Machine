
public class Main {

    public static void main(String[] args) {
        Secret[] secret = Secret.values();
        int count = 0;
        for (Secret sec : secret) {
            if (sec.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);

    }
}

//At least two constants start with STAR
//enum Secret {
//    STAR, CRASH, START, // ...
//}
