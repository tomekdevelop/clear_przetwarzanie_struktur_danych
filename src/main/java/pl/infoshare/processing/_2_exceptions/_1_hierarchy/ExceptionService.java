package pl.infoshare.processing._2_exceptions._1_hierarchy;

public class ExceptionService {

    public void checked() throws SomeCheckedException{
        throw new SomeCheckedException();
    }

    public void runtime() {
        throw new SomeRuntimeException();
    }
}