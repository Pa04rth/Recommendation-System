//The DataPreprocessor class is designed to implement
//the Chain of Responsibility pattern. This pattern allows multiple
//  objects to handle a request, with each object having the 
// opportunity to process the request or pass it on to the next 
// object in the chain

//using abstract class has several benifits -
//1. It can be used as a base class for all sub modules
//2-Define a interface
//3-It can be used to define a common interface for all the classes
//Abstract Method-ensures that all subclasses provide a specific implementation for the preprocess() method.

public abstract class DataPreprocessor {
    protected DataPreprocessor nextPreprocessor;

    public abstract void preprocess(String data);

    public void setNext(DataPreprocessor nextPreprocessor) {
        this.nextPreprocessor = nextPreprocessor;
    }

}
