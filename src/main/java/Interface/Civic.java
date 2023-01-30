package Interface;

// bir interface i bir classin parenti yapmak icin implement key word kullaniriz
// java parentlar class oldugunda multiple parente musade etmez. Ama biz bazen ihtiyac duyariz.
// bu durumda java interface dedigi yeni yapi olusturdu. Interface CLASSI degildir bu
//Bu yapi sayesinde bir class icin coklu interface parent olusturabiliriz.
// interface ler cockrete metod iceremezler. Dolayisi ile
// interface deki hersey child classlar icin mecburudur
// bu yuzden interfacelere to do list denir

// coklu interaface parentlarin herbirinin icine ayni isimli metodlar koyabilirz

public class Civic  implements Ac,Engine,Security {
    public static void main(String[] args) {

    }
    @Override
    public void cool() {
        System.out.println("civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Engine run super");
    }
}
