package main.model;

public interface IModel2ViewAdapter {

    /**
     * No-op "null" adapter
     * See the web page on the Null Object Design Pattern at http://cnx.org/content/m17227/latest/
     */
    public static final IModel2ViewAdapter NULL_OBJECT = new IModel2ViewAdapter() {

    };
}
