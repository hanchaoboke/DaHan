package HomeWorkOne;

/**
 * @author HanChao
 * @date 2020-03-09 20:31
 * 描述信息：This class named Book means teaching material
 */
public class Book {
    private String title;
    private int pageNum = 200;

    // setting ang getting methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum >= 200) {
            this.pageNum = pageNum;
        } else {
            System.out.println("error: enter a wrong pageNum");
        }
    }

    // detail metheds
    public void detail() {
        System.out.println("book title is " + getTitle());
        System.out.println("book pageNum is " + getPageNum());
    }

}
