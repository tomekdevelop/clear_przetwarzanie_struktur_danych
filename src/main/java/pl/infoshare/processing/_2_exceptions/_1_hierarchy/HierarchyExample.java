package pl.infoshare.processing._2_exceptions._1_hierarchy;

public class HierarchyExample {

    public static void main(String[] args) {

        ExceptionService exceptionService = new ExceptionService();

        try {
            exceptionService.checked();
        } catch (SomeCheckedException e) {
            e.printStackTrace();
        }

        exceptionService.runtime();
    }
}
