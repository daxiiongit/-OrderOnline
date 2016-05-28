package com.sunyanxiong.ssm.page;

/**
 * Description: 数据分页
 * <p>
 * Created by daxiongit on 2016/5/28 0028.
 */
public class Page {

    private Integer pageIndex = 0;
    private Integer totalCount = 0;
    private Integer pageCount = 0;
    private Integer pageSize = 5;
    private Integer currentPage = 1;
    private Integer prePage = 1;
    private Integer nextPage = 1;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageCount() {

        if (totalCount % pageSize == 0){
            pageCount = totalCount / pageSize;
        }else{
            pageCount = (totalCount / pageSize) + 1;
        }

        return  pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPrePage() {

        if ((currentPage - 1) > 0){
            prePage = currentPage - 1;
        }else{
            prePage = 1;
        }

        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage() {

        if ((currentPage + 1) < pageCount){
            nextPage = currentPage + 1;
        }else{
            nextPage = pageCount;
        }
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getPageIndex() {
        pageIndex = (currentPage - 1) * pageSize;
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
}
