package com.nowcoder.community.entity;

/**
 *  pagination
 */
public class Page {

    // current page
    private int current = 1;

    // show records
    private int limit = 10;

    // total records
    private int rows;

    // query path
    private String path;


    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * get the first record of the current page
     * @return
     */
    public int getOffset() {
        // current*limit - limit
        return (current - 1) * limit;
    }

    /**
     * get total pages
     * @return
     */
    public int getTotal() {
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

/**
 * get the start page
 * @return
 */

        public int getFrom() {
            int from = current - 2;
            return from < 1 ? 1 : from;
        }

        /**
         * get the end page
         * @return
         */
        public int getTo() {
            int to = current + 2;
            int total = getTotal();
            return to > total ? total : to;
        }

        /**
         * get the previous page
         * @return
         */
        public int getPrevious() {
            return current - 1 < 1 ? 1 : current - 1;

        }
    }



