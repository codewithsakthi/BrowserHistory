public class Main {
    public static void main(String[] args) {
        BrowserHistory tab = new BrowserHistory("home");
        tab.visitPage("google");
        tab.visitPage("youtube");
        System.out.println(tab.backword(8));
        System.out.println(tab.forward(8));
        System.out.println(tab.backword(2));
        tab.visitPage("linkedIn");
        System.out.println(tab.backword(2));
        System.out.println(tab.forward(3));

    }
}