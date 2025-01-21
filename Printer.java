public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex ;

    public int addToner(int tonerAmount) {
        int tmpAmount = tonerLevel + tonerAmount ;
        if (tmpAmount > 100 || tonerAmount < 0) {
            tmpAmount = -1 ;
        }
        tonerLevel += tonerAmount;
        return tmpAmount ;
    }
    public int printPages(int pages){
        int tmppages = (duplex)?(int)(Math.round(Math.ceil(pages/2.0))):pages;
        pagesPrinted += tmppages ;
        return  tmppages ;
    }
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>100 || tonerLevel<0)?-1:tonerLevel;
        this.pagesPrinted = 0 ;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
