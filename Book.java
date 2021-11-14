package productobject;

public class Book extends ProductObject4 {
    protected String pageCount;
            
    public Book(String type, String tittle, String pageCount){
        this.pageCount = pageCount;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }
}
