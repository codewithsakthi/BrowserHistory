import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> visitedPages;
    int currIndex;
    int historySize;
    BrowserHistory(String homepage){
        visitedPages = new ArrayList<>();
        visitedPages.add(homepage);
        currIndex = 0;
        historySize = 1;
    }
    public void visitPage(String url){
        currIndex++;
        if(currIndex <= visitedPages.size()-1)
            visitedPages.set(currIndex,url);
        else
            visitedPages.add(currIndex,url);
        historySize = currIndex + 1;
        System.out.println(url+" is visited");
    }
    public String forward(int no){
        currIndex = Math.min(historySize-1,currIndex+no);
        return visitedPages.get(currIndex);
    }

    public  String backword(int no){
        currIndex = Math.max(0,currIndex-no);
        return visitedPages.get(currIndex);
    }
}
